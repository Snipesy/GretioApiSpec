package com.surrealdev.gretio.mpp.net.spojo.passThru

import com.surrealdev.gretio.mpp.net.spojo.GeneralRequest
import com.surrealdev.gretio.mpp.net.spojo.MESSAGE_ID_PT_STOP_PERIODIC
import kotlinx.serialization.Required
import kotlinx.serialization.Serializable

@Serializable
class PtStopPeriodicRequest(
    val channelId: Int,
    val msgId: Int,
    override val cseq: Int? = null
) : GeneralRequest() {
    @Required
    override val id: Int = MESSAGE_ID_PT_STOP_PERIODIC
}