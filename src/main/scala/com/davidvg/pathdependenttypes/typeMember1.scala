package com.davidvg.pathdependenttypes.typemember1

import scala.util.Random

class Authenticator {
  type ApiKey = String // type member

  private val rand = new Random // value member

  def generateKey: ApiKey = rand.nextString(32)
}

object App {
  val auth = new Authenticator

  val key1: auth.ApiKey = auth.generateKey

  val key2: Authenticator#ApiKey = auth.generateKey
}
