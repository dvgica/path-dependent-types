package com.davidvg.pathdependenttypes.motivatingExample6

import com.davidvg.pathdependenttypes.motivatingExample5._

object App {
  val alice = Username("alice")
  val bob = Username("bob")

  val aliceKeys = new ApiKeyRepository(alice)
  val bobKeys = new ApiKeyRepository(bob)

  val alicesKey = aliceKeys.generateKey
  val bobsKey = bobKeys.generateKey

  // aliceKeys.authenticateKey(bobsKey)
  // type mismatch;
  //  found   : bobKeys.username.ApiKey
  //  required: aliceKeys.username.ApiKey
}
