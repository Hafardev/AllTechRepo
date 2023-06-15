package com.example.data.entityModel

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class GetOfflineDataMock(
    @SerializedName("serviceName") @Expose var serviceName: String? = null,
    @SerializedName("amount") @Expose var amount: String? = null,
    @SerializedName("persianDateTime") @Expose var persianDateTime: String? = null
)