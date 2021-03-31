package com.framework.techchallengefrwk.models

import com.google.gson.annotations.SerializedName

data class AlbunsData (
    @SerializedName("albumId")
    var albumId: String,
    @SerializedName("url")
    var url: String,
    @SerializedName("thumbnailUrl")
    var thumbnailUrl: String
)