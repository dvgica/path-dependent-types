package com.davidvg.pathdependenttypes.renderImplExample

import com.davidvg.pathdependenttypes.motivatingExample7._
import com.davidvg.pathdependenttypes.motivatingExample10._
import akka.http.scaladsl.model.{
  HttpRequest,
  HttpResponse,
  StatusCodes
}
//
object App {
  def extractUsername(request: HttpRequest): Username = ???

  val theRequest = HttpRequest()

  val controller = new CredentialController {}

  val username = extractUsername(theRequest)
  val creationRepository = new ApiKeyRepository(username)

  val render = (cred: creationRepository.Credential) =>
    HttpResponse(
      StatusCodes.OK,
      entity = s"New Credential: ${cred.key}"
  )

  val response =
    controller.createNewCredential(username, creationRepository)(
      HttpRequest(),
      render
    )
}

trait CredentialController {
  def createNewCredential(
      username: Username,
      creationRepository: CredentialRepository
    )(request: HttpRequest,
      render: creationRepository.Credential => HttpResponse
    ): HttpResponse = {
    val authenticationRepository = new ApiKeyRepository(username)

    val apiKey = extractApiKey(request, authenticationRepository)

    if (authenticationRepository.authenticate(apiKey)) {
      val newCredential = creationRepository.generateAndStore
      render(newCredential)
    } else {
      HttpResponse(StatusCodes.Forbidden)
    }
  }

  private def extractApiKey(
      request: HttpRequest,
      repository: ApiKeyRepository
    ): repository.Credential = ???
}
