package yong.aop.aop.retrofitjsonkotlin


import com.google.gson.annotations.SerializedName

data class Listt<t>(
    @SerializedName("item")
    val item: List<t> = listOf()
)