package com.surrealdev.gretio.mpp.net.spojo.pid

import kotlinx.serialization.Serializable

/**
 * Full description of a PID
 */
@Serializable
class PidDescriber {
    var name: String = ""
    var id: Long = -1
    var format: String = ""
    var optimalMin: Int = 0
    var optimalMax: Int = 100
    var scale: Int = 2
}