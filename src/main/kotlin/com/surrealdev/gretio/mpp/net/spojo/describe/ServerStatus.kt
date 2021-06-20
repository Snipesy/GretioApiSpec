package com.surrealdev.gretio.mpp.net.spojo.describe

import kotlinx.serialization.Serializable


/**
 * Contains values to be thrown into a json message
 */
@Serializable
class ServerStatus {
    var connected: Boolean? = null // If the server considers itself 'ready' for requests
    var listenPort: Int? = null
}