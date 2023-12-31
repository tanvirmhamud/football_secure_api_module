package com.example.football_secure_api

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.spors_api.Http.api
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    override  fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        CoroutineScope(Dispatchers.IO).launch {
            liveshow()
        }
    }


    suspend fun liveshow() {
        var livedata = api(this).getfixturematchbydate("2022-10-05");
        Log.d("live data", "liveshow: ${livedata}")
    }
}