package com.example.exampleactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity(), AdapterView.OnItemClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //populate view
        val listView = findViewById<ListView>(R.id.listView)
        //tao data
        val data = listOf<Pair<Int, String>>(
            Pair(R.drawable.ic_launcher_foreground, "Banana"),
            Pair(R.drawable.ic_launcher_foreground, "Apple"),
            Pair(R.drawable.ic_launcher_foreground, "Coconut"),
            Pair(R.drawable.ic_launcher_foreground, "Melon"),
            Pair(R.drawable.ic_launcher_foreground, "Lemon"),
            Pair(R.drawable.ic_launcher_foreground, "Kiwi"),
            Pair(R.drawable.ic_launcher_foreground, "Grape"),
            Pair(R.drawable.ic_launcher_foreground, "Mint"),
        )
        val adapter = MyAdapter(this, data)

        //set adapter
        listView.adapter = adapter
        //set event
        listView.onItemClickListener = this
    }

    override fun onItemClick(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
        Toast.makeText(this@MainActivity,
            "Clicked position: $p2", Toast.LENGTH_SHORT).show()
        //another action
    }
}