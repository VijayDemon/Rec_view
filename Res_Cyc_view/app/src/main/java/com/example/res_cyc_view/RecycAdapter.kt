package com.example.res_cyc_view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class RecycAdapter (private  var titles :List<String> ,
private var detail :List<String> , private  var images :List<Int>):
        RecyclerView.Adapter<RecycAdapter.ViewHolder>(){

        inner class ViewHolder(itemView : View)
        : RecyclerView.ViewHolder(itemView){
            val itemName :TextView = itemView.findViewById(R.id.textView)
            val itemDesc : TextView = itemView.findViewById(R.id.textView2)
            val itenImage : ImageView = itemView.findViewById(R.id.imageView2)

            init {
                itemView.setOnClickListener{v :View ->

                    val position :Int = adapterPosition
                    Toast.makeText(itemView.context, "Clicked ...!", Toast.LENGTH_SHORT).show()

                }
            }

         }



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val v = LayoutInflater.from(parent.context).inflate(R.layout.recycler_view_item,parent,false)
        return  ViewHolder(v)


    }

    override fun getItemCount(): Int {
     return  titles.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

    holder.itemName.text =titles[position]
    holder.itemDesc.text = detail[position]
    holder.itenImage.setImageResource(images[position])


    }

}

