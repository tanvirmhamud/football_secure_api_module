package com.example.spors_api.Http

import android.util.Log
import okhttp3.OkHttpClient
import okhttp3.Request
import java.lang.annotation.Native
import java.net.URL


class HttpHelp {
    var client: OkHttpClient = OkHttpClient()
     fun getRequest(sUrl: String, token: String): String? {

        var result: String? = null
        try {
            // Create URL
            val url = URL(sUrl)
            // Build request
            val request = Request.Builder().header("ab", token).url(url).build()
            // Execute request
            val response = client.newCall(request).execute()
            result = response.body?.string()
        }
        catch(err:Error) {
            print("Error when executing get request: "+err.localizedMessage)
        }
        return result
    }


}