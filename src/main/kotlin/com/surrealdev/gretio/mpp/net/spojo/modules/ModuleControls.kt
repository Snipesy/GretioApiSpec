package com.surrealdev.gretio.mpp.net.spojo.modules

import kotlinx.serialization.Serializable

@Serializable
class ModuleControls(
    var moduleName: String = "",
    var groups: List<ControlGroup> = ArrayList()
)

@Serializable
class ControlGroup(var controlGroupName: String = "", var controlGroupId: Int = -1, var controls: List<Control> = ArrayList())

@Serializable
class Control(
    val controlName: String = "",
    val contralWarning: String = "",
    var states: List<ControlState> = ArrayList(),
    var hasExtraInfo: Boolean = false
)

@Serializable
class ControlEntry(val control: ControlGroup, val regexCodes: List<String>)

@Serializable
class ControlState(
    var stateName: String = "",
    var param: String = "",
    var offset: Float = 0f
)
