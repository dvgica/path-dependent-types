package com.davidvg.pathdependenttypes.motivatingExample7

import scala.util.Random

case class Username(name: String) {
  case class ApiKey(key: String)
  case class Pin(pin: String)
}

trait CredentialRepository {
  type Credential

  private val credentialStore = scala.collection.mutable.Set[Credential]()

  def authenticate(credential: Credential): Boolean = credentialStore.contains(credential)

  def generateAndStore: Credential = {
    val credential = generate
    credentialStore.add(credential)
    credential
  }

  def generate: Credential
}

class PinRepository(val username: Username) extends CredentialRepository {
  type Credential = username.Pin

  override def generate: username.Pin = {
    username.Pin(Random.nextInt(10000).formatted("%04d"))
  }
}

class ApiKeyRepository(val username: Username) extends CredentialRepository {
  type Credential = username.ApiKey

  override def generate: username.ApiKey = {
    username.ApiKey(Random.nextString(32))
  }
}
