package com.surrealdev.gretio.mpp.net.spojo.passThru

import com.surrealdev.gretio.mpp.net.spojo.GeneralRequest
import com.surrealdev.gretio.mpp.net.spojo.MESSAGE_ID_PT_READ_MSGS
import kotlinx.serialization.Required
import kotlinx.serialization.Serializable

@Serializable
class PtReadMsgsRequest(
    val channelId: Int,
    val numMsgs: Int,
    val timeout: Long,
    override val cseq: Int? = null
) : GeneralRequest() {
    @Required
    override val id: Int = MESSAGE_ID_PT_READ_MSGS
}