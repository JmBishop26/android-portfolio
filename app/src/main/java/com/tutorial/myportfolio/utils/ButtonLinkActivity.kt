package com.tutorial.myportfolio.utils

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.widget.ImageButton

class ButtonLinkActivity(private val context: Context) {


    companion object {
        @SuppressLint("StaticFieldLeak")
        @Volatile
        private var instance: ButtonLinkActivity? = null

        fun getInstance(context: Context): ButtonLinkActivity =
            instance ?: synchronized(this) {
                instance ?: ButtonLinkActivity(context).also { instance = it }
            }
    }

    fun btnActivity(button: ImageButton, link: String){
        if(link.isEmpty()){
            button.isEnabled = false
            button.alpha = 0.5f
        }else{
            button.setOnClickListener{
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(link))
                context.startActivity(intent)
            }
        }
    }

}