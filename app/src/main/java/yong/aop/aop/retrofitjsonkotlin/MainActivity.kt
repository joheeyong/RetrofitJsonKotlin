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
import java.lang.String

class MainActivity : AppCompatActivity() {
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


//        getData();
        reto()

    }

    private fun reto() {
        val retrofit = Retrofit.Builder()
            .baseUrl("https://jsonplaceholder.typicode.com")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        val retrofitAPI = retrofit.create(RetrofitAPI::class.java)
        retrofitAPI.getData("1").enqueue(object : Callback<List<Post>> {
            override fun onResponse(call: Call<List<Post>>, response: Response<List<Post>>) {
                if (response.isSuccessful) {
                    var data= response.body() as MutableList<Post>
                    for(i in i until data.size step 1){
                        val post = Post()
                        post.title=(String.valueOf(data[i].title))
                        post.body=(String.valueOf(data[i].body))
                        adapter!!.addItem(post)
                        adapter!!.notifyDataSetChanged()
//                        Log.d("TEST", data[i].getBody())
                    }
                }
            }

            override fun onFailure(call: Call<List<Post>>, t: Throwable) {
                t.printStackTrace()
                Log.d("TEST", "실패")
            }
        })
    }
}