package com.davidvg.pathdependenttypes.motivatingExample4

import com.davidvg.pathdependenttypes.motivatingExample3._

object App {
  val aliceKeys = new ApiKeyRepository[Alice]
  val bobKeys = new ApiKeyRepository[Bob]

  val alicesKey = aliceKeys.generateKey
  val bobsKey = bobKeys.generateKey

  // aliceKeys.authenticateKey(bobsKey)
  // type mismatch;
  //   found: ApiKey[Bob]
  //   required: ApiKey[Alice]
}
