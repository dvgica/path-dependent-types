package com.davidvg.pathdependenttypes.pathDependentTypes2

import com.davidvg.pathdependenttypes.pathDependentTypes1._

object App {
  val weakAuthConfig = new Authentication(4)
  val strongAuthConfig = new Authentication(16)

  val weakApiKey = weakAuthConfig.ApiKey("abcd")
  val strongApiKey = strongAuthConfig.ApiKey("abcdefghijklmnop")

  weakAuthConfig.knownKeys += weakApiKey
  strongAuthConfig.knownKeys += strongApiKey

  // strongAuthConfig.knownKeys += weakApiKey
  // type mismatch:
  //   found: weakAuthConfig.ApiKey
  //   required: strongAuthConfig.ApiKey
}
