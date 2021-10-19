package yong.aop.aop.retrofitjsonkotlin


import com.google.gson.annotations.SerializedName

data class Market(
    @SerializedName("domeggook")
    val domeggook: String? = "",
    @SerializedName("supply")
    val supply: String? = ""
)