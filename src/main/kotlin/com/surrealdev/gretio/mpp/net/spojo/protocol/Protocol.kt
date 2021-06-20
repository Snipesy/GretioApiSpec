package com.surrealdev.gretio.mpp.net.spojo.protocol

import kotlinx.serialization.Serializable


/**
 * Data class for protcol
 */
@Serializable
open class Protocol(
    val recieveProtocol: String // // Desired recieved format (ex... "JSON" or "MsgPack")
)