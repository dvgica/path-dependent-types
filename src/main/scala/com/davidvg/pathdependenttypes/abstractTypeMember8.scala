package com.davidvg.pathdependenttypes.abstracttypemember8

import com.davidvg.pathdependenttypes.abstracttypemember6._
import com.davidvg.pathdependenttypes.abstracttypemember7._
import java.time.Instant

object App {
  val apiKeyAuthenticator = new ApiKeyAuthenticator

  val apiKey: apiKeyAuthenticator.C =
    ApiKey("VERY-SECRET", Instant.now())

  def printCreatedOn1(c: Authenticator#C) = println(c.createdOn)

  def printCreatedOn2(c: ApiKeyAuthenticator#C) =
    println(s"key: ${c.key} created on: ${c.createdOn}")

  def printCreatedOn3(c: apiKeyAuthenticator.C) =
    println(s"key: ${c.key} created on: ${c.createdOn}");

  printCreatedOn1(apiKey) // 2019-04-29T00:24:55.921Z
  printCreatedOn2(apiKey) // key: VERY-SECRET created on: 2019-04-29T00:24:55.921Z
  printCreatedOn3(apiKey) // key: VERY-SECRET created on: 2019-04-29T00:24:55.921Z
}
