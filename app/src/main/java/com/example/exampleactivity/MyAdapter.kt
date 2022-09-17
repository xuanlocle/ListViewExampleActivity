package com.example.exampleactivity

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView


class MyAdapter(private val mContext: Context,
                private val data: List<Pair<Int, String>>) : BaseAdapter() {
    override fun getCount(): Int {
        return data.size
    }

    override fun getItem(position: Int): Pair<Int, String> {
        return data[position]
    }

    override fun getItemId(position: Int): Long {
        return 0L;
    }

    override fun getView(position: Int, convertView: View?, viewGroup: ViewGroup?): View {

        //inflate view
        val vi = LayoutInflater.from(mContext)
        val v = vi.inflate(R.layout.my_line_fruit, null)

        //get data
        val data: Pair<Int, String> = getItem(position)

        //populate adapter view
        val imageView = v.findViewById<ImageView>(R.id.imageView)
        val textView = v.findViewById<TextView>(R.id.textView)

        //set data for view
        imageView.setImageResource(data.first)
        textView.setText(data.second)

        return v
    }

}
