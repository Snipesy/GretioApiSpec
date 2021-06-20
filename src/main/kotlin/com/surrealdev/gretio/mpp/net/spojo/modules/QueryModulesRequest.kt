package com.surrealdev.gretio.mpp.net.spojo.modules

import com.surrealdev.gretio.mpp.net.spojo.GeneralRequest
import com.surrealdev.gretio.mpp.net.spojo.MESSAGE_ID_QUERY_MODULES
import kotlinx.serialization.Required
import kotlinx.serialization.Serializable

@Serializable
class QueryModulesRequest(override val cseq: Int? = null) : GeneralRequest() {
    @Required
    override val id: Int = MESSAGE_ID_QUERY_MODULES
}