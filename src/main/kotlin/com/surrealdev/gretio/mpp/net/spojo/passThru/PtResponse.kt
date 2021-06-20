package com.surrealdev.gretio.mpp.net.spojo.passThru

import com.surrealdev.gretio.mpp.net.spojo.GeneralResponse
import com.surrealdev.gretio.mpp.net.spojo.RCO_OKAY
import kotlinx.serialization.Required
import kotlinx.serialization.Serializable


@Serializable
abstract class PtResponse : GeneralResponse() {

    @Required
    abstract val passThruResult: Int

    @Required
    override val rco: Int = RCO_OKAY
}

@Serializable
class PtGeneralResponse(
    override val passThruResult: Int,
    override val id: Int,
    override val cseq: Int?
) : PtResponse() {

}