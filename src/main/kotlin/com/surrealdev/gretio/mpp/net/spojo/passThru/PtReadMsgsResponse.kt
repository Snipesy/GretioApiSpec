package com.surrealdev.gretio.mpp.net.spojo.passThru

import com.surrealdev.gretio.mpp.net.spojo.MESSAGE_ID_PT_READ_MSGS
import kotlinx.serialization.Required
import kotlinx.serialization.Serializable

@Serializable
class PtReadMsgsResponse(
    override val passThruResult: Int,
    val msgs: List<PtMessage>,
    override val cseq: Int? = null
) : PtResponse() {
    @Required
    override val id: Int = MESSAGE_ID_PT_READ_MSGS
}