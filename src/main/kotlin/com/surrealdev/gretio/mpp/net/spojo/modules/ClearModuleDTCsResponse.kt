package com.surrealdev.gretio.mpp.net.spojo.modules

import com.surrealdev.gretio.mpp.net.spojo.GeneralResponse
import com.surrealdev.gretio.mpp.net.spojo.MESSAGE_ID_CLEAR_MODULE_DTCS
import com.surrealdev.gretio.mpp.net.spojo.RCO_OKAY
import kotlinx.serialization.Required
import kotlinx.serialization.Serializable

@Serializable
class ClearModuleDTCsResponse(
    override val cseq: Int? = null,
    var success: Boolean = false,
    var msg: String = ""
) : GeneralResponse() {

    @Required
    override val id: Int = MESSAGE_ID_CLEAR_MODULE_DTCS

    @Required
    override val rco: Int = RCO_OKAY
}