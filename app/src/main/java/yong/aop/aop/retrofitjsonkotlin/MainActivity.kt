package yong.aop.aop.retrofitjsonkotlin

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class MainActivity : AppCompatActivity() {
    var str1=""
    private var adapter: RecyclerAdapter? = null
    var i = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView1 = findViewById<View>(R.id.recyclerView1) as RecyclerView
        val linearLayoutManager = LinearLayoutManager(this)
        recyclerView1.layoutManager = linearLayoutManager

        adapter = RecyclerAdapter()
        recyclerView1.adapter = adapter

        reto()

    }

    private fun reto() {
        val retrofit = Retrofit.Builder()
            .baseUrl("https://domeggook.com/ssl/api/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        val retrofitAPI = retrofit.create(RetrofitAPI::class.java)
        retrofitAPI.getData().enqueue(object : Callback<yongi> {
            override fun onResponse(call: Call<yongi>, response: Response<yongi>) {
                if (response.isSuccessful) {
                    Log.d("TEST", response.body().toString())
//                    str1= response.body().toString()
//                    str1 = str1.substring(0, str1.indexOf(" "))
//                    Log.d("TEST", str1)
//                    var data= response.body() as MutableList<yongi>
////                                        for(i in i until data.size step 1){
//                    itemm.price=
//                        yong.title=(data[i].title)
//                        yong.price=(String.valueOf(data[i].price))
//                        adapter!!.addItem(item)
//                        adapter!!.notifyDataSetChanged()
//                        Log.d("TEST", data[i].getBody())
//                    }
                }else{
                    Log.d("TEST", "ddddddddddddzzzzzzzzzz" )
                }
            }

            override fun onFailure(call: Call<yongi>, t: Throwable) {
                Log.d("TEST", "실패")
            }

        })
    }
}