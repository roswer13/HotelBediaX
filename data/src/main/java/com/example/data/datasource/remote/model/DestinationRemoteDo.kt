package com.example.data.datasource.remote.model

import com.google.gson.annotations.SerializedName
import java.util.Date

data class DestinationRemoteDo(
    @SerializedName("id") val id: Int,
    @SerializedName("name") val name: String,
    @SerializedName("description") val description: String,
    @SerializedName("country") val country: String,
    @SerializedName("countyCode") val countyCode: String,
    @SerializedName("type") val type: DestinationType,
    @SerializedName("lastModify") val lastModify: Date
)

enum class DestinationType {
    COUNTRY,
    CITY,
}