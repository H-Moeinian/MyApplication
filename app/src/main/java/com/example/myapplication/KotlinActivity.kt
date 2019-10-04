package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_kotlin.*

class KotlinActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin)
        val list =ArrayList<String>()
        list.add("ali")
        list.add("qoli")
        list.add("sara")
        list.add("aida")
        val adapter = KotlinRecyclerAdapter(list)
        recyclerKotlin.adapter = adapter
        recyclerKotlin.layoutManager = LinearLayoutManager(this,RecyclerView.VERTICAL,false)

    }
}
