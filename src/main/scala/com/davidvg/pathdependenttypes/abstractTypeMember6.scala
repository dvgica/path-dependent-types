package com.davidvg.pathdependenttypes.abstracttypemember6

import java.time.Instant
import java.time.Duration

trait Credential {
  def createdOn: Instant
}

trait Authenticator {
  type C <: Credential

  def authenticate(credential: Credential): Boolean

  def expired(credential: Credential): Boolean = {
    Duration.between(credential.createdOn, Instant.now).toDays < 90
  }
}
