package com.surrealdev.gretio.mpp.net.spojo.record

import com.surrealdev.gretio.mpp.net.spojo.GeneralRequest
import com.surrealdev.gretio.mpp.net.spojo.MESSAGE_ID_GET_ACTIVE_RECORDS
import kotlinx.serialization.Required
import kotlinx.serialization.Serializable

@Serializable
class GetActiveRecordRequest(
    override val cseq: Int? = null
) : GeneralRequest() {
    @Required
    override val id: Int = MESSAGE_ID_GET_ACTIVE_RECORDS
}