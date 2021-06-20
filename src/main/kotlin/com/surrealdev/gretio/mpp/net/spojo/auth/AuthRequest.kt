package com.surrealdev.gretio.mpp.net.spojo.auth

import com.surrealdev.gretio.mpp.net.spojo.GeneralRequest
import com.surrealdev.gretio.mpp.net.spojo.MESSAGE_ID_AUTH
import kotlinx.serialization.Required
import kotlinx.serialization.Serializable


@Serializable
open class AuthRequest(
    val token: String = "", val requestNewToken: Boolean = false,
    override var cseq: Int? = null
) : GeneralRequest() {

    @Required
    override val id: Int = MESSAGE_ID_AUTH
}