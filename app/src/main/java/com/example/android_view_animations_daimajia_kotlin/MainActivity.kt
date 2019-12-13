package com.example.android_view_animations_daimajia_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView: TextView = findViewById(R.id.TextView)
        val render = Render(this)
        render.setAnimation(Bounce().InDown(textView))
        render.setDuration(2000)
        render.start()

    }

}
