package com.surrealdev.gretio.mpp.net.spojo.passThru

import com.surrealdev.gretio.mpp.net.spojo.GeneralResponse
import com.surrealdev.gretio.mpp.net.spojo.MESSAGE_ID_BEGIN_PT_SESSION
import com.surrealdev.gretio.mpp.net.spojo.RCO_OKAY
import kotlinx.serialization.Required
import kotlinx.serialization.Serializable

@Serializable
class BeginPassThruSessionResponse(
    override val cseq: Int? = null,
    val result: Boolean

) : GeneralResponse() {

    @Required
    override val id: Int = MESSAGE_ID_BEGIN_PT_SESSION

    @Required
    override val rco: Int
        get() = RCO_OKAY
}