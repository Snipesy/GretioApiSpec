package com.surrealdev.gretio.mpp.net.spojo.passThru

import com.surrealdev.gretio.mpp.net.spojo.GeneralRequest
import com.surrealdev.gretio.mpp.net.spojo.MESSAGE_ID_PT_START_PERIODIC
import kotlinx.serialization.Required
import kotlinx.serialization.Serializable


@Serializable
class PtStartPeriodicRequest(
    val channelId: Int,
    val msg: PtMessage,
    val timeInterval: Long,
    override val cseq: Int? = null
) : GeneralRequest() {
    @Required
    override val id: Int = MESSAGE_ID_PT_START_PERIODIC
}