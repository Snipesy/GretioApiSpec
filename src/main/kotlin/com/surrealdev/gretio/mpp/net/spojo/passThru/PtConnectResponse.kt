package com.surrealdev.gretio.mpp.net.spojo.passThru

import com.surrealdev.gretio.mpp.net.spojo.MESSAGE_ID_PT_CONNECT
import kotlinx.serialization.Required
import kotlinx.serialization.Serializable

/**
 *
 * @param passThruResult
 * @see J2534Error
 *
 * @param pChannelId - new channel id
 */
@Serializable
class PtConnectResponse(
    override val passThruResult: Int,
    val pChannelId: Int,
    override val cseq: Int?,
) : PtResponse() {
    @Required
    override val id: Int = MESSAGE_ID_PT_CONNECT
}