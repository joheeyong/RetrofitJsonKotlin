package yong.aop.aop.retrofitjsonkotlin


import com.google.gson.annotations.SerializedName

data class Post(
    @SerializedName("body")
    var body: String? = "",
    @SerializedName("id")
    val id: Int? = 0,
    @SerializedName("title")
    var title: String? = "",
    @SerializedName("userId")
    val userId: Int? = 0

)