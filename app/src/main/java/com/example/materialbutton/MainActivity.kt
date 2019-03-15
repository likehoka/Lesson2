package com.example.materialbutton

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageView = imageView
        val btnImageClick = btnImage
        var status = true
        btnImageClick.setOnClickListener {
            if (status == true) {
                Picasso.get().load(R.drawable.myandroid1).into(imageView)
                status = false
            }
            else {
                Picasso.get().load(R.drawable.myandroid).into(imageView)
                status = true
            }
        }
    }
}
