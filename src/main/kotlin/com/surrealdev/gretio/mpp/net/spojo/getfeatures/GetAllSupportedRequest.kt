package com.surrealdev.gretio.mpp.net.spojo.getfeatures

import com.surrealdev.gretio.mpp.net.spojo.GeneralRequest
import com.surrealdev.gretio.mpp.net.spojo.MESSAGE_ID_GET_SUPPORTED_FEATURES
import kotlinx.serialization.Required
import kotlinx.serialization.Serializable


/**
 * Base for a get pid request
 */
@Serializable
class GetAllSupportedRequest(override val cseq: Int? = null, val short: Boolean = false) :
    GeneralRequest() {

    @Required
    override val id: Int = MESSAGE_ID_GET_SUPPORTED_FEATURES

}
