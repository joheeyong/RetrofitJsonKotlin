package yong.aop.aop.retrofitjsonkotlin

import retrofit2.Call
import retrofit2.http.GET


interface RetrofitAPI {
    @GET("?ver=4.0&mode=getItemList&aid=129f27444e69c7d4d582d254e4a7444f&market=dome&sz=5&om=json")
    fun getData(): Call<yongi>

}