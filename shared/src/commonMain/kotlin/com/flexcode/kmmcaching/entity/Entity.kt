package com.flexcode.kmmcaching.entity

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class Quotes(
    @SerialName("id")
    var id: String,
    @SerialName("author")
    var author: String,
    @SerialName("en")
    var en: String
)




