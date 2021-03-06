package com.framework.techchallengefrwk.models

import com.google.gson.annotations.SerializedName

data class BaseData(
    @SerializedName("id")
    var id: String,
    @SerializedName("title")
    var title: String,
    @SerializedName("userId")
    var userId: String
)
