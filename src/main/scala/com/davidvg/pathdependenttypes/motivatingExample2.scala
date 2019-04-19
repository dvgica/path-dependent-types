package com.davidvg.pathdependenttypes.motivatingExample2

import com.davidvg.pathdependenttypes.motivatingExample1._

object App {
  val alice = Username("alice")
  val bob = Username("bob")

  val aliceKeys = new ApiKeyRepository(alice)
  val bobKeys = new ApiKeyRepository(bob)

  val alicesKey = aliceKeys.generateKey
  val bobsKey = bobKeys.generateKey

  aliceKeys.authenticateKey(bobsKey) // oops!
}
