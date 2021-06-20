package com.surrealdev.gretio.mpp.net.spojo.modules

import kotlinx.serialization.Serializable

enum class DTC_TYPE {
    ACTIVE,
    HISTORY,
    NONE
}

@Serializable
class DTC(
    var name: String = "",
    var fullName: String = "",
    var type: DTC_TYPE? = DTC_TYPE.NONE,
    var dtcText: String? = null,
    var extra: String? = null
) {
    // applicable freeze frames for this dtc if exists
    val freezeFrames = ArrayList<Int>()
}