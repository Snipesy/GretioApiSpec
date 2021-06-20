package com.surrealdev.gretio.mpp.net.spojo.passThru

import com.surrealdev.gretio.mpp.misc.formatf
import com.surrealdev.gretio.mpp.misc.getTimeMillis
import kotlinx.serialization.Required
import kotlinx.serialization.Serializable

@Serializable
data class PtMessage(
    val header: String,
    val data: String,
    val protocolId: Int,
    val timeStamp: Long,
    @Required val rxFlag: Int = 0,
    @Required val txFlag: Int = 0,
    @Required val extraDataIndex: Int = (header.length + data.length) / 2
) {

    // By convention indicator extra data index is 0
    fun txIndication(): PtMessage =
        PtMessage(header, "", protocolId, getTimeMillis(), 0b1001, txFlag, 0)

    fun loopback(): PtMessage =
        PtMessage(
            header,
            data,
            protocolId,
            getTimeMillis(),
            0b001,
            txFlag,
            (header.length + data.length) / 2
        )

    fun rxStartIndication(): PtMessage =
        PtMessage(header, "", protocolId, getTimeMillis(), 0b001, txFlag, 0)


    fun format11bitHeader(): String {
        return formatf("%03x", header.take(8).toULong(16)).toUpperCase()
    }

    fun format29bitHeader(): String {
        return formatf("%08x", header.take(8).toULong(16)).toUpperCase()
    }


}