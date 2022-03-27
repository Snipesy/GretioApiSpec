package com.surrealdev.gretio.mpp.net.spojo.wca

import com.surrealdev.gretio.mpp.net.spojo.GeneralResponse
import com.surrealdev.gretio.mpp.net.spojo.MESSAGE_ID_WARNING_CAUTION_ADVISORY
import com.surrealdev.gretio.mpp.net.spojo.RCO_OKAY
import kotlinx.serialization.Required

class WarningCautionAdvisoryClearResponse(
    val success: Boolean,
    override val cseq: Int? = null
): GeneralResponse() {
    @Required
    override val id: Int = MESSAGE_ID_WARNING_CAUTION_ADVISORY

    @Required
    override val rco: Int = RCO_OKAY
}