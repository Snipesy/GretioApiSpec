package com.surrealdev.gretio.mpp.net.spojo.passThru

import com.surrealdev.gretio.mpp.net.spojo.GeneralRequest
import com.surrealdev.gretio.mpp.net.spojo.MESSAGE_ID_PT_CONNECT
import kotlinx.serialization.Required
import kotlinx.serialization.Serializable

/**
 * @param protocolId - id for protocol
 * @see J2534Protocol
 *
 * @param flags - flags for protocol
 * @see J2534ConnectFlags
 */
@Serializable
class PtConnectRequest(
    // noo need for device id
    val protocolId: Int,
    val flags: Int = 0,
    val baudRate: Int,
    override val cseq: Int? = null
) : GeneralRequest() {
    @Required
    override val id: Int = MESSAGE_ID_PT_CONNECT
}