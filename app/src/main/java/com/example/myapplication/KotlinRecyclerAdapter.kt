package com.example.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.recycler_item.view.*

class KotlinRecyclerAdapter(val list:List<String>) : RecyclerView.Adapter<KotlinRecyclerAdapter.RecyclerViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.recycler_item,parent,false)
        return RecyclerViewHolder(v)
    }

    override fun getItemCount(): Int {
    return list.size
    }

    override fun onBindViewHolder(holder: RecyclerViewHolder, position: Int) {
holder.onBind(list[position])    }

    class RecyclerViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        fun onBind(s: String) {
             itemView.txtItem.text = s

        }

    }
}