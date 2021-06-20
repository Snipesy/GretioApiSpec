package com.surrealdev.gretio.mpp.net.spojo.subscribeinfo

import com.surrealdev.gretio.mpp.net.spojo.GeneralRequest
import com.surrealdev.gretio.mpp.net.spojo.MESSAGE_ID_SUBSCRIBEINFO
import kotlinx.serialization.Required
import kotlinx.serialization.Serializable


@Serializable
class SubscribeRequest(
    val subTo: Long?,
    val unsub: Boolean = false,
    override val cseq: Int? = null
) : GeneralRequest() {

    @Required
    override val id: Int = MESSAGE_ID_SUBSCRIBEINFO
}