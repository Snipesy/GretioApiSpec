package com.surrealdev.gretio.mpp.net.spojo.passThru

import com.surrealdev.gretio.mpp.net.spojo.GeneralRequest
import com.surrealdev.gretio.mpp.net.spojo.MESSAGE_ID_PT_START_MESSAGE_FILTER
import kotlinx.serialization.Required
import kotlinx.serialization.Serializable

@Serializable
class PtStartMessageFilterRequest(
    val channelId: Int,
    val filterType: Int,
    val maskMsg: PtMessage,
    val patternMsg: PtMessage,
    val flowControlMessage: PtMessage? = null,
    override val cseq: Int? = null
) : GeneralRequest() {
    @Required
    override val id: Int = MESSAGE_ID_PT_START_MESSAGE_FILTER
}