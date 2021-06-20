package com.surrealdev.gretio.mpp.net.spojo

import kotlinx.serialization.Required
import kotlinx.serialization.Serializable

/**
 * Created by hooge on 7/13/2017.
 * Really just a generic web socket message.
 *
 * Example,
 * {"messageId":2}
 */
@Serializable
abstract class WebSocketMessage {

    @Required
    abstract val id: Int

    @Required
    abstract val t: Int

    abstract val cseq: Int?
}