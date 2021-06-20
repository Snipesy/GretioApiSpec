package com.surrealdev.gretio.mpp.net.spojo.record

import com.surrealdev.gretio.mpp.net.spojo.GeneralResponse
import com.surrealdev.gretio.mpp.net.spojo.MESSAGE_ID_END_RECORD
import com.surrealdev.gretio.mpp.net.spojo.RCO_OKAY
import kotlinx.serialization.Required
import kotlinx.serialization.Serializable

@Serializable
class EndRecordResponse(
    override val cseq: Int? = null,
    var success: Boolean = false,
    var msg: String = ""
) : GeneralResponse() {
    @Required
    override val rco: Int = RCO_OKAY

    @Required
    override val id: Int = MESSAGE_ID_END_RECORD
}