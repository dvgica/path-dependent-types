package com.davidvg.pathdependenttypes.typealias3

object Authentication {
  type ApiKey = String

  def authenticate(apiKey: ApiKey): Boolean = ???

  val notAnApiKey: String = "not-an-api-key"

  authenticate(notAnApiKey) // compiles!
}
