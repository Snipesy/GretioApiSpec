package com.surrealdev.gretio.mpp.net.spojo.describe

import com.surrealdev.gretio.mpp.net.spojo.GeneralRequest
import com.surrealdev.gretio.mpp.net.spojo.MESSAGE_ID_STATUS
import kotlinx.serialization.Required
import kotlinx.serialization.Serializable


/**
 * Base for a status request.
 */
@Serializable
class StatusRequest(override var cseq: Int?) : GeneralRequest() {

    @Required
    override val id: Int = MESSAGE_ID_STATUS
}