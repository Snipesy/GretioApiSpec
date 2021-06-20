package com.surrealdev.gretio.mpp.net.spojo.getfeatures

import com.surrealdev.gretio.mpp.net.spojo.GeneralResponse
import com.surrealdev.gretio.mpp.net.spojo.MESSAGE_ID_GET_SUPPORTED_FEATURES
import com.surrealdev.gretio.mpp.net.spojo.RCO_OKAY
import kotlinx.serialization.Required
import kotlinx.serialization.Serializable

/**
 * Base for a get response
 */
@Serializable
class FeaturesSupportedResponse(
    val featureSpojo: List<FeatureSpojoUnsafe>?,
    override val cseq: Int? = null
) : GeneralResponse() {

    @Required
    override val id: Int = MESSAGE_ID_GET_SUPPORTED_FEATURES

    @Required
    override val rco: Int = RCO_OKAY
}