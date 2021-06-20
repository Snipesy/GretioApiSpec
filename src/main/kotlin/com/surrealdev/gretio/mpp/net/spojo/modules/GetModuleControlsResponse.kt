package com.surrealdev.gretio.mpp.net.spojo.modules

import com.surrealdev.gretio.mpp.net.spojo.GeneralResponse
import com.surrealdev.gretio.mpp.net.spojo.MESSAGE_ID_GET_MODULE_CONTROLS
import com.surrealdev.gretio.mpp.net.spojo.RCO_OKAY
import kotlinx.serialization.Required
import kotlinx.serialization.Serializable

@Serializable
class GetModuleControlsResponse(override val cseq: Int? = null) : GeneralResponse() {
    var moduleName: String = ""
    var controls: ModuleControls? = null

    @Required
    override val id: Int = MESSAGE_ID_GET_MODULE_CONTROLS

    @Required
    override val rco: Int = RCO_OKAY
}