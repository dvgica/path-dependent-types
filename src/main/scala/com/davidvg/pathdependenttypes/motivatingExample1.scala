package com.davidvg.pathdependenttypes.motivatingExample1

import scala.util.Random

case class Username(name: String)

case class ApiKey(key: String)

class ApiKeyRepository(username: Username) {
  private val keyStore = scala.collection.mutable.Set[ApiKey]()

  def authenticateKey(apiKey: ApiKey): Boolean = keyStore.contains(apiKey)

  def generateKey: ApiKey = {
    val key = ApiKey(Random.nextString(32))
    keyStore.add(key)
    key
  }

}
