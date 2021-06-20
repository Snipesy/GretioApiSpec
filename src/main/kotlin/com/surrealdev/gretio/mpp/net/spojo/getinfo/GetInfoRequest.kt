package com.surrealdev.gretio.mpp.net.spojo.getinfo

import com.surrealdev.gretio.mpp.net.spojo.GeneralRequest
import com.surrealdev.gretio.mpp.net.spojo.MESSAGE_ID_GETINFO
import kotlinx.serialization.Required

/**
 * Base for a get pid request
 */
class GetInfoRequest(
    val what: List<Long>? = null,
    override val cseq: Int? = null
) : GeneralRequest() {

    @Required
    override val id: Int = MESSAGE_ID_GETINFO
}