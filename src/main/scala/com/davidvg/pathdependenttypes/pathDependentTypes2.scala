package com.davidvg.pathdependenttypes.pathDependentTypes2

import com.davidvg.pathdependenttypes.pathDependentTypes1._

object App {
  val weakAuthentication = new Authentication(4)
  val strongAuthentication = new Authentication(16)

  val weakApiKey = weakAuthentication.ApiKey("abcd")
  val strongApiKey = strongAuthentication.ApiKey("abcdefghijklmnop")

  weakAuthentication.knownKeys += weakApiKey
  strongAuthentication.knownKeys += strongApiKey

  // strongAuthConfig.knownKeys += weakApiKey
  // type mismatch:
  //   found: weakAuthConfig.ApiKey
  //   required: strongAuthConfig.ApiKey
}
