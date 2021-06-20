package com.surrealdev.gretio.mpp.net.spojo

import kotlinx.serialization.Serializable

/**
 * Base for a request
 */

@Serializable
abstract class GeneralRequest : WebSocketMessage() {
    final override val t: Int = MESSAGE_TYPE_REQUEST
}