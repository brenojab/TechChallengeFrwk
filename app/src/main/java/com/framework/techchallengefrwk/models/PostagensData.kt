package com.framework.techchallengefrwk.models

import com.google.gson.annotations.SerializedName

class PostagensData(
    @SerializedName("id")
    var id: String,
    @SerializedName("title")
    var title: String,
    @SerializedName("userId")
    var userId: String,
    @SerializedName("body")
    var body: String
)