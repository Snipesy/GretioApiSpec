package com.surrealdev.gretio.mpp.net.spojo.modules

import kotlinx.serialization.Serializable

@Serializable
class ModuleInfo(
    val tag: String = "",
    val desc: String = "",
    val hasControls: Boolean = false
)