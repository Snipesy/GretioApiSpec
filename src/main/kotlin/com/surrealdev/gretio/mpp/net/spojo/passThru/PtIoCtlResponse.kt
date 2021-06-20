package com.surrealdev.gretio.mpp.net.spojo.passThru

import com.surrealdev.gretio.mpp.net.spojo.MESSAGE_ID_PT_IOCTL
import kotlinx.serialization.Required
import kotlinx.serialization.Serializable

@Serializable
class PtIoCtlResponse(
    override val passThruResult: Int,
    val extraData: Int, // extra data, 0 if not needed
    override val cseq: Int? = null
) : PtResponse() {
    @Required
    override val id: Int = MESSAGE_ID_PT_IOCTL
}