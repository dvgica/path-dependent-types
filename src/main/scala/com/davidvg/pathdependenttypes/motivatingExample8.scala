package com.davidvg.pathdependenttypes.motivatingExample8

import com.davidvg.pathdependenttypes.motivatingExample7._

object App {
  val alice = Username("alice")
  val bob = Username("bob")

  val alicePins = new PinRepository(alice)
  val bobPins = new PinRepository(bob)

  val alicesPin = alicePins.generateAndStore
  val bobsPin = bobPins.generateAndStore

  // alicePins.authenticate(bobsPin)
  // type mismatch;
  //  found   : bobPins.username.Pin
  //  required: alicePins.username.Pin
}
