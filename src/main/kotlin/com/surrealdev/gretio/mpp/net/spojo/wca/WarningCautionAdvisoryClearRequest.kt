package com.surrealdev.gretio.mpp.net.spojo.wca

import com.surrealdev.gretio.mpp.net.spojo.GeneralRequest
import com.surrealdev.gretio.mpp.net.spojo.MESSAGE_ID_WARNING_CAUTION_ADVISORY
import kotlinx.serialization.Required

/**
 * Requests to clear WCAs. When a WCA is cleared the WCA_CLEAR flags will be set to 1.
 * The WCA Flags are not affected.
 */
class WarningCautionAdvisoryClearRequest(
    val onlyClear: List<Long>?, // optional list of WCA ids to clear. If null all are cleared
    val wcaTypesToClear: Int, // BITWISE TYPES TO CLEAR
    override val cseq: Int? = null
): GeneralRequest() {
    @Required
    override val id: Int = MESSAGE_ID_WARNING_CAUTION_ADVISORY
}