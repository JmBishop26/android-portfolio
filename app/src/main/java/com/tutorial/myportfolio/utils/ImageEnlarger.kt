package com.tutorial.myportfolio.utils

import android.annotation.SuppressLint
import android.content.Context
import android.view.View
import android.widget.ImageView

class ImageEnlarger(private val context: Context) {

    companion object {
        @SuppressLint("StaticFieldLeak")
        @Volatile
        private var instance: ImageEnlarger? = null

        fun getInstance(context: Context): ImageEnlarger =
            instance ?: synchronized(this) {
                instance ?: ImageEnlarger(context).also { instance = it }
            }
    }

    fun imgEnlarge(imgClicked: ImageView, imgShowed: ImageView){
        imgClicked.setOnClickListener {
            imgShowed.visibility = View.VISIBLE
        }
    }
    fun imgClose(imgShowed: ImageView){
        imgShowed.setOnClickListener {
            imgShowed.visibility = View.GONE
        }
    }
}