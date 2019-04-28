package com.davidvg.pathdependenttypes.pathDependentTypes1

class Authenticator(requiredKeyLength: Int) {
  case class ApiKey(key: String) {
    require(key.length >= requiredKeyLength)
  }

  val knownKeys = scala.collection.mutable.Set[ApiKey]()

  def authenticate(apiKey: ApiKey): Boolean = {
    knownKeys.contains(apiKey)
  }
}
