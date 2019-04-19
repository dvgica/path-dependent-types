package com.davidvg.pathdependenttypes.motivatingExample5

import scala.util.Random

case class Username(name: String) {
  case class ApiKey(key: String)
}

class ApiKeyRepository(val username: Username) {

  private val keyStore = scala.collection.mutable.Set[username.ApiKey]()

  def authenticateKey(apiKey: username.ApiKey): Boolean = keyStore.contains(apiKey)

  def generateKey: username.ApiKey = {
    val key = username.ApiKey(Random.nextString(32))
    keyStore.add(key)
    key
  }

}
