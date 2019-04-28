package com.davidvg.pathdependenttypes.motivatingExample9

import com.davidvg.pathdependenttypes.motivatingExample7._
import akka.http.scaladsl.model.{
  HttpRequest,
  HttpResponse,
  StatusCodes
}

trait CredentialController {
  def createNewCredential(
      creationRepository: CredentialRepository
    )(request: HttpRequest,
      render: creationRepository.Credential => HttpResponse
    ): HttpResponse
}
