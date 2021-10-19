package yong.aop.aop.retrofitjsonkotlin


import com.google.gson.annotations.SerializedName

data class Deli(
    @SerializedName("add")
    val add: String? = "",
    @SerializedName("fee")
    val fee: Int? = 0,
    @SerializedName("fromOversea")
    val fromOversea: String? = "",
    @SerializedName("who")
    val who: String? = ""
)