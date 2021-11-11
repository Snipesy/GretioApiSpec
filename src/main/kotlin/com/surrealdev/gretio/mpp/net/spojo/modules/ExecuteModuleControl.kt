package com.surrealdev.gretio.mpp.net.spojo.modules

import com.surrealdev.gretio.mpp.net.spojo.GeneralRequest
import com.surrealdev.gretio.mpp.net.spojo.MESSAGE_ID_EXECUTE_MODULE_CONTROLS
import kotlinx.serialization.Required
import kotlinx.serialization.Serializable

@Serializable
class ExecuteModuleControl(
    override val cseq: Int? = null,
    var moduleName: String = "",
    var groupId: Int = -1,
    var controlName: String = "",
    var stateName: String = "",
    var optionalParam: String = ""
) : GeneralRequest() {

    @Required
    override val id: Int = MESSAGE_ID_EXECUTE_MODULE_CONTROLS
}
