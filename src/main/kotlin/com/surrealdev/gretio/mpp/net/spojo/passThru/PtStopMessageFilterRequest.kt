package com.surrealdev.gretio.mpp.net.spojo.passThru

import com.surrealdev.gretio.mpp.net.spojo.GeneralRequest
import com.surrealdev.gretio.mpp.net.spojo.MESSAGE_ID_PT_STOP_MESSAGE_FILTER
import kotlinx.serialization.Required
import kotlinx.serialization.Serializable

@Serializable
class PtStopMessageFilterRequest(
    val channelId: Int,
    val filterId: Int,
    override val cseq: Int? = null
) : GeneralRequest() {
    @Required
    override val id: Int = MESSAGE_ID_PT_STOP_MESSAGE_FILTER
}