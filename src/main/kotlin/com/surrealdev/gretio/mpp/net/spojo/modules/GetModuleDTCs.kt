package com.surrealdev.gretio.mpp.net.spojo.modules

import com.surrealdev.gretio.mpp.net.spojo.GeneralRequest
import com.surrealdev.gretio.mpp.net.spojo.MESSAGE_ID_GET_MODULE_DTCS
import kotlinx.serialization.Required
import kotlinx.serialization.Serializable

@Serializable
class GetModuleDTCs(
    override val cseq: Int? = null,
    var moduleName: String = "",
    var getTests: Boolean = false,
    var pins: List<DTC>? = null // optional pins of dtcs
) : GeneralRequest() {

    @Required
    override val id: Int = MESSAGE_ID_GET_MODULE_DTCS
}