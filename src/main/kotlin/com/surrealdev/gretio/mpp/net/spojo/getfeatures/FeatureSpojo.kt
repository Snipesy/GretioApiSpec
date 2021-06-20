package com.surrealdev.gretio.mpp.net.spojo.getfeatures

import kotlinx.serialization.Serializable

/**
 * Describes a 'feature'.
 */
@Serializable
open class FeatureSpojoUnsafe {
    var id: Long = -1
    var desc: String? = ""
    var target: String? = ""
    var units: String? = ""
    var short: String? = ""
    var long: String? = ""
    var accessLevel: Int? = -1

    fun toSafe(): FeatureSpojo {
        return FeatureSpojo().apply {
            id = this@FeatureSpojoUnsafe.id
            desc = this@FeatureSpojoUnsafe.desc ?: ""
            target = this@FeatureSpojoUnsafe.target ?: ""
            units = this@FeatureSpojoUnsafe.units ?: ""
            short = this@FeatureSpojoUnsafe.short ?: ""
            long = this@FeatureSpojoUnsafe.long ?: ""
            accessLevel = this@FeatureSpojoUnsafe.accessLevel ?: -1
        }
    }
}


@Serializable
class FeatureSpojo {
    var id: Long = -1
    var desc: String = ""
    var target: String = ""
    var units: String = ""
    var short: String = ""
    var long: String = ""
    var accessLevel: Int = -1
}