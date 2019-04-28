package com.davidvg.pathdependenttypes.abstracttypemember2

import com.davidvg.pathdependenttypes.abstracttypemember1._

case class ApiKey(key: String)
case class Pin(pin: String)

class ApiKeyAuthenticator extends Authenticator {
  type Credential = ApiKey

  override def authenticate(key: ApiKey): Boolean = ???
}

class PinAuthenticator extends Authenticator {
  type Credential = Pin

  override def authenticate(pin: Credential): Boolean = ???
}
