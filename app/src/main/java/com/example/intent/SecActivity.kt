package com.example.intent

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_second.*

class SecActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

         btn_secActivity.setOnClickListener{
             finish()
             //this will simply activate the button in second activity
             //and this button will be used to return to the main activity
         }

        btn_thirdAct.setOnClickListener{
            Intent(this,ThirdActivity::class.java).also{
                startActivity(it)
            }
        }
    }
}