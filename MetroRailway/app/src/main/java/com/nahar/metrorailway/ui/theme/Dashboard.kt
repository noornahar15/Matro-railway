package com.nahar.metrorailway.ui.theme

import android.os.Bundle
import android.widget.LinearLayout
import com.nahar.metrorailway.R
import androidx.activity.ComponentActivity

class Dashboard : ComponentActivity() {
     lateinit var ticketLayoutId: LinearLayout
     override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

         init()
    }

    private fun init(){
        ticketLayoutId = findViewById(R.id.ticketLayoutId)
    }
}

