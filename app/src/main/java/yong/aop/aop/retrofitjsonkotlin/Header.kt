package yong.aop.aop.retrofitjsonkotlin


import com.google.gson.annotations.SerializedName

data class Header(
    @SerializedName("currentPage")
    val currentPage: Int? = 0,
    @SerializedName("firstItem")
    val firstItem: Int? = 0,
    @SerializedName("itemsPerPage")
    val itemsPerPage: String? = "",
    @SerializedName("lastItem")
    val lastItem: Int? = 0,
    @SerializedName("numberOfItems")
    val numberOfItems: Int? = 0,
    @SerializedName("numberOfPages")
    val numberOfPages: Int? = 0,
    @SerializedName("sort")
    val sort: String? = ""
)