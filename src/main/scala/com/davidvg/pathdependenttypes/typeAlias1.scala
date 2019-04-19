package com.davidvg.pathdependenttypes.typealias1

object Authentication {
  type ApiKey = String

  def generateKey: ApiKey = ???

  def authenticate(apiKey: ApiKey): Boolean = ???
}

object App {
  val key: Authentication.ApiKey = Authentication.generateKey
}
