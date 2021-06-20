package com.surrealdev.gretio.mpp.net.spojo.passThru

import com.surrealdev.gretio.mpp.net.spojo.MESSAGE_ID_PT_DISCONNECT
import kotlinx.serialization.Required
import kotlinx.serialization.Serializable

@Serializable
class PtDisconnectResponse(
    override val passThruResult: Int,
    val channelId: Int,
    override val cseq: Int? = null
) : PtResponse() {
    @Required
    override val id: Int = MESSAGE_ID_PT_DISCONNECT

}