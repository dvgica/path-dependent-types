package com.davidvg.pathdependenttypes.pathDependentTypes2

import com.davidvg.pathdependenttypes.pathDependentTypes1._

object App {
  val weakAuthenticator = new Authenticator(4)
  val strongAuthenticator = new Authenticator(16)

  val weakApiKey = weakAuthenticator.ApiKey("abcd")
  val strongApiKey = strongAuthenticator.ApiKey("abcdefghijklmnop")

  weakAuthenticator.knownKeys += weakApiKey
  strongAuthenticator.knownKeys += strongApiKey

  // strongAuthenticator.knownKeys += weakApiKey
  // type mismatch:
  //   found: weakAuthenticator.ApiKey
  //   required: strongAuthenticator.ApiKey
}
