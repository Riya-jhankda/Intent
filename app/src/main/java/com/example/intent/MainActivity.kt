package com.example.intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_openActivity.setOnClickListener{
            Intent(this,SecActivity::class.java).also{
                startActivity(it)
                //from here we wants to go back to the second Activity
            }
        }

    }
}