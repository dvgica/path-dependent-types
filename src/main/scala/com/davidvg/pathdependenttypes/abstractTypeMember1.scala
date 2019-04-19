package com.davidvg.pathdependenttypes.abstracttypemember1

trait Authenticator {
  type Credential

  def authenticate(credential: Credential): Boolean
}
