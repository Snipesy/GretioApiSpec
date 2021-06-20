package com.surrealdev.gretio.mpp.net.spojo.passThru

import com.surrealdev.gretio.mpp.net.spojo.MESSAGE_ID_PT_START_PERIODIC
import kotlinx.serialization.Required
import kotlinx.serialization.Serializable

@Serializable
class PtStartPeriodicResponse(
    override val passThruResult: Int,
    val msgId: Int,
    override val cseq: Int? = null
) : PtResponse() {
    @Required
    override val id: Int = MESSAGE_ID_PT_START_PERIODIC
}