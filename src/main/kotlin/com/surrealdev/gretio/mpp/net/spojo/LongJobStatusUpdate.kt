package com.surrealdev.gretio.mpp.net.spojo

import kotlinx.serialization.Required
import kotlinx.serialization.Serializable


/**
 * Unsolicited message from server about their subscription.
 *
 * @param is the list of pid updates
 * @param pidClose is the list of any pids that have closes and will not be updated
 */

@Serializable
class LongJobStatusUpdate(
    val jobActive: Boolean? = null,
    val message: String? = null,
    val jobError: Boolean? = null,
    override val cseq: Int? = null
) :
    GeneralUnsolicited() {

    @Required
    override val id: Int = MESSAGE_ID_NET_JOB_STATUS
}
