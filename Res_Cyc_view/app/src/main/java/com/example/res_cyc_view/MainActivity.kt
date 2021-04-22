 package com.example.res_cyc_view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private var nameList = mutableListOf<String>()
    private var descList = mutableListOf<String>()
    private var imageList = mutableListOf<Int>()



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setValues()

      var res_view :RecyclerView=  findViewById<RecyclerView>(R.id.rv_resView)

        res_view.layoutManager =LinearLayoutManager(this)
        res_view.adapter=RecycAdapter(nameList,descList,imageList)
     }

    private  fun addItems(name :String ,desc:String , image_id :Int){

        nameList.add(name)
        descList.add(desc)
        imageList.add(image_id)


    }

    private fun setValues(){

        for(i in 1..50){
            addItems("Name $i","Description $i",R.mipmap.ic_launcher_round)
        }

    }
}