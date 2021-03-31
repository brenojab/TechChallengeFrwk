package com.framework.techchallengefrwk.models

import com.google.gson.annotations.SerializedName

data class ServiceData(
    @SerializedName("serviceName")
    val serviceName: String
)