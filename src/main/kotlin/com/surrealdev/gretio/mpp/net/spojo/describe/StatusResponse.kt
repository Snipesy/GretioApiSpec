package com.surrealdev.gretio.mpp.net.spojo.describe

import com.surrealdev.gretio.mpp.net.spojo.GeneralResponse
import com.surrealdev.gretio.mpp.net.spojo.MESSAGE_ID_STATUS
import com.surrealdev.gretio.mpp.net.spojo.RCO_OKAY
import kotlinx.serialization.Required
import kotlinx.serialization.Serializable

@Serializable
class StatusResponse(
    var status: ServerStatus?, override val cseq: Int?
) : GeneralResponse() {

    @Required
    override val id: Int = MESSAGE_ID_STATUS

    @Required
    override val rco: Int = RCO_OKAY
}