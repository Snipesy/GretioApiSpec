package com.surrealdev.gretio.mpp.net.spojo.passThru

import com.surrealdev.gretio.mpp.net.spojo.GeneralRequest
import com.surrealdev.gretio.mpp.net.spojo.MESSAGE_ID_PT_SET_PROG_VOLTAGE
import kotlinx.serialization.Required
import kotlinx.serialization.Serializable

@Serializable
class PtSetProgVoltageRequest(
    val pinNumber: Int,
    val voltage: Long,
    override val cseq: Int? = null
) : GeneralRequest() {
    @Required
    override val id: Int = MESSAGE_ID_PT_SET_PROG_VOLTAGE
}