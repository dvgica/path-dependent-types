package com.davidvg.pathdependenttypes.abstracttypemember7

import com.davidvg.pathdependenttypes.abstracttypemember6._
import java.time.Instant

case class ApiKey(key: String, createdOn: Instant) extends Credential

class ApiKeyAuthenticator extends Authenticator {
  type C = ApiKey

  override def authenticate(key: ApiKey): Boolean = ???
}
