package com.surrealdev.gretio.mpp.net.spojo.modules

import com.surrealdev.gretio.mpp.net.spojo.GeneralResponse
import com.surrealdev.gretio.mpp.net.spojo.MESSAGE_ID_RETURN_MODULE_TO_NORMAL
import com.surrealdev.gretio.mpp.net.spojo.RCO_OKAY
import kotlinx.serialization.Required
import kotlinx.serialization.Serializable

@Serializable
class ReturnModuleToNormalResponse(override val cseq: Int? = null, var success: Boolean = false) :
    GeneralResponse() {
    @Required
    override val id: Int = MESSAGE_ID_RETURN_MODULE_TO_NORMAL

    @Required
    override val rco: Int = RCO_OKAY
}