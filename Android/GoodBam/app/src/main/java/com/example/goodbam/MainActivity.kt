package com.example.goodbam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.HandlerThread
import kotlinx.android.synthetic.main.activity_start.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)

//        button.setOnClickListener{
//            val intent = Intent(this,LoginPageActivity::class.java)
//            startActivity(intent)
//            overridePendingTransition(R.anim.fadein,R.anim.fadeout)
//        }
        val intent = Intent(this,LoginPageActivity::class.java)

        val handler = Handler()
        handler.postDelayed({
            startActivity(intent)}
            , 3000L)

        handler.postDelayed({
            overridePendingTransition(R.anim.fadein,R.anim.fadeout)}
            , 3000L)

    }
}