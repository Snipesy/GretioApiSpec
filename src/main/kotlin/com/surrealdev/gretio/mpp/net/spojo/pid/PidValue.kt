package com.surrealdev.gretio.mpp.net.spojo.pid

import kotlinx.serialization.Serializable

/**
 * Little info contains the id and value. Thats it.
 */
@Serializable
class PidValue(
    val id: Long,
    val its: String?
)