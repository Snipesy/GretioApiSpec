package com.surrealdev.gretio.mpp.net.spojo.passThru

import com.surrealdev.gretio.mpp.net.spojo.MESSAGE_ID_PT_SET_PROG_VOLTAGE
import kotlinx.serialization.Required
import kotlinx.serialization.Serializable

@Serializable
class PtSetProgVoltageResponse(
    override val passThruResult: Int,
    val pinNumber: Int,
    val voltage: Long,
    override val cseq: Int? = null
) : PtResponse() {
    @Required
    override val id: Int = MESSAGE_ID_PT_SET_PROG_VOLTAGE
}