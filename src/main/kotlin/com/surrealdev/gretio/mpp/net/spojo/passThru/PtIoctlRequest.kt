package com.surrealdev.gretio.mpp.net.spojo.passThru

import com.surrealdev.gretio.mpp.net.spojo.GeneralRequest
import com.surrealdev.gretio.mpp.net.spojo.MESSAGE_ID_PT_IOCTL
import kotlinx.serialization.Required
import kotlinx.serialization.Serializable

@Serializable
class PtIoctlRequest(
    // noo need for device id
    @Required val handleId: Long,
    @Required val ioctlId: Long,
    // value present will depent on ioctlId
    val configList: List<Pair<Long, Long>>? = null, // optional SCONFIG_LIST List
    val ptMsg: PtMessage? = null, // optional pt message
    val miscByteData: String? = null, // optional Misc byte data encoded as hex string
    override val cseq: Int? = null
) : GeneralRequest() {
    @Required
    override val id: Int = MESSAGE_ID_PT_IOCTL
}