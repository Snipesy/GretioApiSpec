package com.surrealdev.gretio.mpp.net.spojo.modules

import com.surrealdev.gretio.mpp.net.spojo.GeneralResponse
import com.surrealdev.gretio.mpp.net.spojo.MESSAGE_ID_EXECUTE_MODULE_CONTROLS
import com.surrealdev.gretio.mpp.net.spojo.RCO_OKAY
import kotlinx.serialization.Required
import kotlinx.serialization.Serializable

@Serializable
class ExecuteModuleControlResponse(override val cseq: Int? = null) : GeneralResponse() {
    var moduleName: String = ""
    var success: Boolean = false
    var msg: String = ""

    @Required
    override val id: Int = MESSAGE_ID_EXECUTE_MODULE_CONTROLS

    @Required
    override val rco: Int = RCO_OKAY
}