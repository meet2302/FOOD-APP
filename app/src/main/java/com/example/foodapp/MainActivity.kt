package com.example.foodapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private  val img = arrayOf(R.drawable.a1,R.drawable.a2,R.drawable.a3
        ,R.drawable.a4,R.drawable.a5,R.drawable.a6)

    private val texts = arrayOf("FRENCH FRIES", "DABELI",
        "SANDWICH",
        "BURGER","KACHORI","VADA-PAV")

    private val desc = arrayOf("Pari-Pari",
        "Zambo","Karnavati-Special",
        "Veggie Cheese Burger","Lilava",
        "Spicy")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = CustomAdapter(img,texts,desc)
    }
}