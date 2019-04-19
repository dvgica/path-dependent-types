package com.davidvg.pathdependenttypes.motivatingExample3

import scala.util.Random

sealed trait Username {
  def name: String
}
case class Alice() extends Username {
  override val name = "Alice"
}
case class Bob() extends Username {
  override val name = "Bob"
}

case class ApiKey[U <: Username](key: String)

class ApiKeyRepository[U <: Username] {
  private val keyStore = scala.collection.mutable.Set[ApiKey[U]]()

  def authenticateKey(apiKey: ApiKey[U]): Boolean = keyStore.contains(apiKey)

  def generateKey: ApiKey[U] = {
    val key = ApiKey[U](Random.nextString(32))
    keyStore.add(key)
    key
  }

}
