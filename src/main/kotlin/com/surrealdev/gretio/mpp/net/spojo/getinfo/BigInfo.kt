package com.surrealdev.gretio.mpp.net.spojo.getinfo

import com.surrealdev.gretio.mpp.net.spojo.pid.PidDescriber
import com.surrealdev.gretio.mpp.net.spojo.pid.PidValue
import kotlinx.serialization.Serializable


/**
 * Big Info contains anything you need to know about some info (like units).
 */
@Serializable
class BigInfo(
    val describer: PidDescriber?,
    val up: PidValue? = null
)