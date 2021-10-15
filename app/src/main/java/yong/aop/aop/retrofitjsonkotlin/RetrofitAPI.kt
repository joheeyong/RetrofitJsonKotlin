package yong.aop.aop.retrofitjsonkotlin

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

public interface RetrofitAPI {
    @GET("/posts")
    fun getData(@Query("userId") id: String?
    ): Call<List<Post>>

}