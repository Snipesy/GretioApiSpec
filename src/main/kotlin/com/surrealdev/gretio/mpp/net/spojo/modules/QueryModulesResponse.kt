package com.surrealdev.gretio.mpp.net.spojo.modules

import com.surrealdev.gretio.mpp.net.spojo.GeneralResponse
import com.surrealdev.gretio.mpp.net.spojo.MESSAGE_ID_QUERY_MODULES
import com.surrealdev.gretio.mpp.net.spojo.RCO_OKAY
import kotlinx.serialization.Required
import kotlinx.serialization.Serializable

@Serializable
class QueryModulesResponse(override val cseq: Int? = null) : GeneralResponse() {

    var modules: List<Module>? = null

    @Required
    override val id: Int = MESSAGE_ID_QUERY_MODULES

    @Required
    override val rco: Int = RCO_OKAY
}