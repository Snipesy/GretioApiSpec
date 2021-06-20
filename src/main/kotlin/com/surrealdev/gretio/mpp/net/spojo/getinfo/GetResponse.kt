package com.surrealdev.gretio.mpp.net.spojo.getinfo

import com.surrealdev.gretio.mpp.net.spojo.GeneralResponse
import com.surrealdev.gretio.mpp.net.spojo.MESSAGE_ID_GETINFO
import com.surrealdev.gretio.mpp.net.spojo.RCO_OKAY
import kotlinx.serialization.Required
import kotlinx.serialization.Serializable

/**
 * Base for a get response
 */
@Serializable
class GetResponse(
    val inf: BigInfo?,
    override val cseq: Int?
) : GeneralResponse() {

    @Required
    override val id: Int = MESSAGE_ID_GETINFO

    @Required
    override val rco: Int = RCO_OKAY
}