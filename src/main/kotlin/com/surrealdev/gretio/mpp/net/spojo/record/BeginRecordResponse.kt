package com.surrealdev.gretio.mpp.net.spojo.record

import com.surrealdev.gretio.mpp.net.spojo.GeneralResponse
import com.surrealdev.gretio.mpp.net.spojo.MESSAGE_ID_BEGIN_RECORD
import com.surrealdev.gretio.mpp.net.spojo.RCO_OKAY
import kotlinx.serialization.Required
import kotlinx.serialization.Serializable

@Serializable
class BeginRecordResponse(
    val succes: Boolean? = null,
    val sessionId: String? = null,
    override val cseq: Int? = null
) : GeneralResponse() {
    @Required
    override val rco: Int = RCO_OKAY

    @Required
    override val id: Int = MESSAGE_ID_BEGIN_RECORD
}