package com.surrealdev.gretio.mpp.net.spojo.subscribeinfo

import com.surrealdev.gretio.mpp.net.spojo.GeneralResponse
import com.surrealdev.gretio.mpp.net.spojo.MESSAGE_ID_SUBSCRIBEINFO
import com.surrealdev.gretio.mpp.net.spojo.RCO_OKAY
import com.surrealdev.gretio.mpp.net.spojo.getfeatures.FeatureSpojo
import com.surrealdev.gretio.mpp.net.spojo.pid.PidDescriber
import kotlinx.serialization.Required
import kotlinx.serialization.Serializable


@Serializable
class SubscribeResponse(
    val inf: PidDescriber? = null,
    val feat: FeatureSpojo? = null,
    override val cseq: Int? = null
) : GeneralResponse() {

    @Required
    override val id: Int = MESSAGE_ID_SUBSCRIBEINFO

    @Required
    override val rco: Int = RCO_OKAY
}