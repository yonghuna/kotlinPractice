package com.example.kotlinpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast

class ImageInsideActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_inside)

        val getData = intent.getStringExtra("data")

        val memberImage = findViewById<ImageView>(R.id.dd)

        if(getData == "1"){
            memberImage.setImageResource(R.drawable.cat)
        }
        if(getData == "2"){
            memberImage.setImageResource(R.drawable.dog3)
        }
        if(getData == "3"){
            memberImage.setImageResource(R.drawable.cat)
        }
        if(getData == "5"){
            memberImage.setImageResource(R.drawable.cat)
        }
        if(getData == "6"){
            memberImage.setImageResource(R.drawable.cat)
        }
        if(getData == "7"){
            memberImage.setImageResource(R.drawable.cat)
        }
        if(getData == "8"){
            memberImage.setImageResource(R.drawable.cat)
        }
        if(getData == "9"){
            memberImage.setImageResource(R.drawable.cat)
        }





    }
}