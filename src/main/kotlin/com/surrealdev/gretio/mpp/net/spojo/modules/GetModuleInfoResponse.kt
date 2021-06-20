package com.surrealdev.gretio.mpp.net.spojo.modules

import com.surrealdev.gretio.mpp.net.spojo.GeneralResponse
import com.surrealdev.gretio.mpp.net.spojo.MESSAGE_ID_GET_MODULE_INFO
import com.surrealdev.gretio.mpp.net.spojo.RCO_OKAY
import kotlinx.serialization.Required
import kotlinx.serialization.Serializable


@Serializable
class GetModuleInfoResponse(override val cseq: Int? = null) : GeneralResponse() {
    var moduleName: String = ""
    var info: List<ModuleInfo> = ArrayList<ModuleInfo>()

    @Required
    override val id: Int = MESSAGE_ID_GET_MODULE_INFO

    @Required
    override val rco: Int = RCO_OKAY
}