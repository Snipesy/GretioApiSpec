package com.surrealdev.gretio.mpp.net.spojo.passThru

import com.surrealdev.gretio.mpp.net.spojo.GeneralRequest
import com.surrealdev.gretio.mpp.net.spojo.MESSAGE_ID_BEGIN_PT_SESSION
import kotlinx.serialization.Required
import kotlinx.serialization.Serializable

@Serializable
class BeginPassThruSessionRequest(override val cseq: Int? = null) : GeneralRequest() {

    @Required
    override val id: Int = MESSAGE_ID_BEGIN_PT_SESSION
}