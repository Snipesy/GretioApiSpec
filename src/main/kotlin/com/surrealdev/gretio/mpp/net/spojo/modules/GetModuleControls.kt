package com.surrealdev.gretio.mpp.net.spojo.modules

import com.surrealdev.gretio.mpp.net.spojo.GeneralRequest
import com.surrealdev.gretio.mpp.net.spojo.MESSAGE_ID_GET_MODULE_CONTROLS
import kotlinx.serialization.Required
import kotlinx.serialization.Serializable

@Serializable
class GetModuleControls(
    override val cseq: Int? = null,
    var moduleName: String = ""
) : GeneralRequest() {

    @Required
    override val id: Int = MESSAGE_ID_GET_MODULE_CONTROLS
}