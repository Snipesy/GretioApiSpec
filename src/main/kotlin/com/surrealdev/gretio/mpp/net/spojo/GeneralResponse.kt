package com.surrealdev.gretio.mpp.net.spojo

import kotlinx.serialization.Required
import kotlinx.serialization.Serializable


/**
 * Created by hooge on 7/14/2017.
 *
 * All Solicited Server Responses will inherit from the General Server Response
 *
 * It is kept geeneric for ease of use.
 */
@Serializable
abstract class GeneralResponse : WebSocketMessage() {
    @Required
    final override val t: Int = MESSAGE_TYPE_RESPONSE

    @Required
    abstract val rco: Int
}

@Serializable
class NoContentResponse(override val id: Int, override val cseq: Int?) : GeneralResponse() {

    @Required
    override val rco: Int = RCO_OKAY_NO_CONTENT

}

@Serializable
class ServiceLockedResponse(override val id: Int, override val cseq: Int?) : GeneralResponse() {

    @Required
    override val rco: Int = RCO_SERVICE_LOCKED

}

@Serializable
class UnknownServiceResponse(override val id: Int, override val cseq: Int?) : GeneralResponse() {

    @Required
    override val rco: Int = 401

}


@Serializable
class GeneralOkayResponse(override val id: Int, override val cseq: Int?) : GeneralResponse() {

    @Required
    override val rco: Int = RCO_OKAY

}

@Serializable
class InvalidOrMissingArgumentsResponse(override val id: Int, override val cseq: Int?) :
    GeneralResponse() {

    @Required
    override val rco: Int = RCO_MISSING_OR_INVALID_ARGUMENTS

}

@Serializable
class InvalidServiceResponse(override val id: Int, override val cseq: Int?) : GeneralResponse() {

    @Required
    override val rco: Int = RCO_UNKNOWN_OR_NOT_IMPLEMENTED_SERVICE

}