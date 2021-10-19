package yong.aop.aop.retrofitjsonkotlin

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.util.*

class RecyclerAdapter : RecyclerView.Adapter<RecyclerAdapter.ItemViewHolder>() {

    var dataList = ArrayList<Itemm>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item, parent, false)
        return ItemViewHolder(view)
    }

    override fun onBindViewHolder(itemViewHolder: ItemViewHolder, position: Int) {
        itemViewHolder.onBind(dataList[position])
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    fun addItem(Item:Itemm) {
        dataList.add(Item)
    }

    class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val textView1: TextView
        private val textView2: TextView
        fun onBind(item: Itemm) {
            textView1.setText(item.price)
//            textView2.setText(yong.aop.aop.retrofitjsonkotlin.Item.body)
        }

        init {
            textView1 = itemView.findViewById(R.id.textView1)
            textView2 = itemView.findViewById(R.id.textView2)
        }
    }
}