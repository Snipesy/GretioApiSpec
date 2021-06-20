package com.surrealdev.gretio.mpp.net.spojo.subscribeinfo

import com.surrealdev.gretio.mpp.net.spojo.*
import com.surrealdev.gretio.mpp.net.spojo.pid.PidValue
import kotlinx.serialization.Required
import kotlinx.serialization.Serializable


/**
 * Unsolicited message from server about their subscription.
 *
 * @param is the list of pid updates
 * @param pidClose is the list of any pids that have closes and will not be updated
 */

@Serializable
class SubscribeUnsolicited(
    val pidList: List<PidValue>?,
    val pidClose: List<Long>? = null,
    override val cseq: Int? = null
) : GeneralUnsolicited() {


    @Required
    override val id: Int = MESSAGE_ID_SUBSCRIBEINFO

}
