package com.surrealdev.gretio.mpp.net.spojo.wca

import com.surrealdev.gretio.mpp.net.spojo.GeneralUnsolicited
import com.surrealdev.gretio.mpp.net.spojo.MESSAGE_ID_WARNING_CAUTION_ADVISORY
import kotlinx.serialization.Required

/**
 * Warning, Caution, or Advisory update event. Send on Change for any currently registered WCA.
 * All Authenticated Clients receive all WCAs. It is client's responsibility to filter.
 *
 * WCAs should be managed on the server. The same WCA may have multiple types (Warning, Caution, Advisory)
 * The client may display all types or display only the highest level (WARNING > CAUTION > ADVISORY).
 *
 * Whenever a WCA is set (W, C, or A flag set to 1) the corresponding CLEAR flag will be set to 0.
 * The CLEAR flags will not return to 1 until an explicit [WarningCautionAdvisoryClearRequest] is
 * sent. A CLEAR flag will remain set to 1 after a ClearRequest until the corresponding WCA flag
 * returns to 0. After this if the WCA flag is set to 1 again the CLEAR flag will return to 0.
 *
 * WCAs are for vehicle warnings. Gretio and other server issues/warnings will be sent via
 * [com.surrealdev.gretio.mpp.net.spojo.LongJobStatusUpdate].
 */
class WcaUpdateUnsolicited (
    val wcaId: Long, // WCA ID
    val wcaBitFlags: Int,
    val message: String,
    val constraint: String?, // optional message indicating what constraint was exceeded
    val relevantData: List<Long>?, // optional list of features (PIDS) which may be relevant
    override val cseq: Int? = null
        ):  GeneralUnsolicited() {
    @Required
    override val id: Int = MESSAGE_ID_WARNING_CAUTION_ADVISORY
}


object WarningCautionAdvisoryLevels {

    // Bit Flags
    val ADVISORY = 0b1
    val CAUTION = 0b10
    val WARNING = 0b100

    val ADVISORY_CLEAR = 0b1000
    val CAUTION_CLEAR =  0b10000
    val WARNING_CLEAR =  0b100000
}