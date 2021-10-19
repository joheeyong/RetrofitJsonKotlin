package yong.aop.aop.retrofitjsonkotlin


import com.google.gson.annotations.SerializedName

data class Domeggook(
//    @SerializedName("header")
//    val header: Header? = Header(),
    @SerializedName("list")
    val list: Listt<Itemm>? = Listt()
)