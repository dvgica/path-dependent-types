package com.davidvg.pathdependenttypes.motivatingExample9

import com.davidvg.pathdependenttypes.motivatingExample7._
import akka.http.scaladsl.model.{HttpRequest, HttpResponse, StatusCodes}

trait CredentialController {
  def createNewCredential(
      creationRepository: CredentialRepository
    )(request: HttpRequest,
      renderMethod: creationRepository.Credential => HttpResponse
    ): HttpResponse = {
    val username = extractUsername(request)
    val authenticationRepository = new ApiKeyRepository(username)

    val apiKey = extractApiKey(request, authenticationRepository)

    if (authenticationRepository.authenticate(apiKey)) {
      val newCredential = creationRepository.generateAndStore
      renderMethod(newCredential)
    } else {
      HttpResponse(StatusCodes.Forbidden)
    }
  }

  private def extractUsername(request: HttpRequest): Username = ???
  private def extractApiKey(
      request: HttpRequest,
      repository: ApiKeyRepository
    ): repository.Credential = ???
}
