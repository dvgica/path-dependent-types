package com.davidvg.pathdependenttypes.abstracttypemember5

trait Authenticator {
  type Credential

  def authenticate(credential: Credential): Boolean

  def expired(credential: Credential): Boolean = ???
}
