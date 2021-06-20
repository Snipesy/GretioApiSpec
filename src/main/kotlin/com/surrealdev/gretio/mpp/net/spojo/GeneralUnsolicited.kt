package com.surrealdev.gretio.mpp.net.spojo

import kotlinx.serialization.Required
import kotlinx.serialization.Serializable

/**
 * Base for a general unsolicited
 */
@Serializable
abstract class GeneralUnsolicited : WebSocketMessage() {

    @Required
    final override val t: Int = MESSAGE_TYPE_UNSOLICITED
}