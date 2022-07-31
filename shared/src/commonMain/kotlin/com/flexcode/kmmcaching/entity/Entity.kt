package com.flexcode.kmmcaching.entity

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Characters(
    @SerialName("results")
    var results: List<Results>

)

@Serializable
data class Quotes(
    @SerialName("id")
    var id: String,
    @SerialName("author")
    var author: String,
    @SerialName("en")
    var en: String
)

@Serializable
data class Results(
    @SerialName("id")
    var id: Int,
    @SerialName("name")
    var name: String,
    @SerialName("status")
    var status: String,
    @SerialName("species")
    var species: String,
    @SerialName("type")
    var type: String?,
    @SerialName("gender")
    var gender: String,
//    @SerialName("origin")
//    var origin: Origin,
//    @SerialName("location")
//    var location: Location,
    @SerialName("image")
    var image: String,
    @SerialName("url")
    var url: String
)


/*@Serializable
data class Location (
    @SerialName("name" )
    var name : String,
    @SerialName("url"  )
    var url  : String

)

@Serializable
data class Origin (
    @SerialName("name" )
    var name : String,
    @SerialName("url"  )
    var url  : String?

)*/




