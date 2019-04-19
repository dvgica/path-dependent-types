package com.davidvg.pathdependenttypes.typealias2

import scala.util.Random

object Authentication {
  type ApiKey = String

  type CredentialGenerator[T] = () => T

  type ApiKeyGenerator = CredentialGenerator[ApiKey]

  val apiKeyGenerator: ApiKeyGenerator = () => Random.nextString(64)
}
