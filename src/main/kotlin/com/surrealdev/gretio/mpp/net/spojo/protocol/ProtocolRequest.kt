package com.surrealdev.gretio.mpp.net.spojo.protocol

import com.surrealdev.gretio.mpp.net.spojo.GeneralRequest
import com.surrealdev.gretio.mpp.net.spojo.MESSAGE_ID_PROTOCOL
import kotlinx.serialization.Required
import kotlinx.serialization.Serializable

/**
 * This POJO represnts a request to CONFIGURE the protocol.
 *
 * This is simply a request to change the protocol. The server has the final say on what protocol it will use,
 * and will include that in its response.
 *
 * The response will always be in the requested recieve format (unless that recieve format is not supported).
 */
@Serializable
class ProtocolRequest(
    val protocol: Protocol?,
    override val cseq: Int? = null
) : GeneralRequest() {
    @Required
    override val id: Int = MESSAGE_ID_PROTOCOL
}