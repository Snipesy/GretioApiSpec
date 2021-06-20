package com.surrealdev.gretio.mpp.net.spojo.protocol

import com.surrealdev.gretio.mpp.net.spojo.GeneralResponse
import com.surrealdev.gretio.mpp.net.spojo.MESSAGE_ID_PROTOCOL
import com.surrealdev.gretio.mpp.net.spojo.RCO_OKAY
import kotlinx.serialization.Required
import kotlinx.serialization.Serializable

/**
 * POJO for response to a request
 */
@Serializable
class ProtocolResponse(
    val protocol: Protocol?,
    override val cseq: Int? = null

) : GeneralResponse() {
    @Required
    override val id: Int = MESSAGE_ID_PROTOCOL

    @Required
    override val rco: Int = RCO_OKAY
}