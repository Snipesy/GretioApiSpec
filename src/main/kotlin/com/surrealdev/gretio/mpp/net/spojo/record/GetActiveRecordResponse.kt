package com.surrealdev.gretio.mpp.net.spojo.record

import com.surrealdev.gretio.mpp.net.spojo.GeneralResponse
import com.surrealdev.gretio.mpp.net.spojo.MESSAGE_ID_GET_ACTIVE_RECORDS
import com.surrealdev.gretio.mpp.net.spojo.RCO_OKAY
import kotlinx.serialization.Required
import kotlinx.serialization.Serializable

@Serializable
class GetActiveRecordResponse(override val cseq: Int? = null, var activeRecords: List<String>?) :
    GeneralResponse() {
    @Required
    override val id: Int = MESSAGE_ID_GET_ACTIVE_RECORDS

    @Required
    override val rco: Int = RCO_OKAY
}