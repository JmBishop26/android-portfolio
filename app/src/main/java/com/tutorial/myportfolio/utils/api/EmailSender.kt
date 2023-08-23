package com.tutorial.myportfolio.utils.api

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.RequestBody.Companion.toRequestBody

class EmailSender (private val name: String?, private val email: String?, private val message: String?){

    private val client = OkHttpClient()
    data class ApiResponse(val success: Boolean, val message: String)

    suspend fun sendMessage(): ApiResponse = withContext(Dispatchers.IO){
        try {
            if(name != null && email != null && message != null){
                    val apiUrl = "https://portfolio-jmbishop26.vercel.app/api/contacts"
                    val requestData = """{
                        "name": "$name",
                        "email": "$email",
                        "message": "$message"
                    }"""

                    val mediaType = "application/json".toMediaType()
                    val requestBody = requestData.toRequestBody(mediaType)

                    val request = Request.Builder()
                        .url(apiUrl)
                        .post(requestBody)
                        .build()

                    val response = client.newCall(request).execute()

                    if (response.isSuccessful) {
                        return@withContext ApiResponse(true, "Email sent successfully")
                    } else {
                        return@withContext ApiResponse(false, "Failed to send email")
                    }
                } else {
                return@withContext ApiResponse(false, "Incomplete information")
                }
        }catch(e: Exception){
            return@withContext ApiResponse(false, "An error occurred: $e")
        }
    }
}