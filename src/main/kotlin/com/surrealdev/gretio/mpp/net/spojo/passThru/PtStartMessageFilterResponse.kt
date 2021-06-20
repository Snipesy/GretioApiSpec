package com.surrealdev.gretio.mpp.net.spojo.passThru

import com.surrealdev.gretio.mpp.net.spojo.MESSAGE_ID_PT_START_MESSAGE_FILTER
import kotlinx.serialization.Required
import kotlinx.serialization.Serializable

@Serializable
class PtStartMessageFilterResponse(
    override val passThruResult: Int,
    val channelId: Int,
    override val cseq: Int? = null
) : PtResponse() {
    @Required
    override val id: Int = MESSAGE_ID_PT_START_MESSAGE_FILTER
}