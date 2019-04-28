package com.davidvg.pathdependenttypes.abstracttypemember3

import com.davidvg.pathdependenttypes.abstracttypemember1._

case class Password(password: String)

class PasswordAuthenticator extends Authenticator {
  type Credential = Password
  // class PasswordAuthenticator needs to be abstract,
  // since method authenticate in trait Authenticator of type
  // (credential: PasswordAuthenticator.this.Credential)Boolean
  // is not defined

  // (Note that Authenticator.this.Credential does not match
  // com.davidvg.pathdependenttypes.abstracttypemember3.Password)

  override def authenticate(password: Password): Boolean = ???
}
