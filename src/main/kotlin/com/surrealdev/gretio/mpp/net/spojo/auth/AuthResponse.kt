package com.surrealdev.gretio.mpp.net.spojo.auth

import com.surrealdev.gretio.mpp.net.spojo.GeneralResponse
import com.surrealdev.gretio.mpp.net.spojo.MESSAGE_ID_AUTH
import com.surrealdev.gretio.mpp.net.spojo.RCO_OKAY
import kotlinx.serialization.Required
import kotlinx.serialization.Serializable

@Serializable
open class AuthResponse(
    @Required val authResult: Boolean = false,
    val challengeCode: String? = null,
    val token: String? = null, override val cseq: Int? = null
) : GeneralResponse() {

    @Required
    override val id: Int = MESSAGE_ID_AUTH

    @Required
    override val rco: Int = RCO_OKAY

}