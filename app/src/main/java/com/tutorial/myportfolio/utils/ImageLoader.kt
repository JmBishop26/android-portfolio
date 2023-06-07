package com.tutorial.myportfolio.utils

import android.annotation.SuppressLint
import android.content.Context
import android.widget.ImageView
import com.bumptech.glide.Glide

class ImageLoader(private val context: Context) {

    companion object {
        @SuppressLint("StaticFieldLeak")
        @Volatile
        private var instance: ImageLoader? = null

        fun getInstance(context: Context): ImageLoader =
            instance ?: synchronized(this) {
                instance ?: ImageLoader(context).also { instance = it }
            }
    }

    fun loader( image:Int, imageContainer: ImageView){
        Glide.with(context)
            .load(image)
            .into(imageContainer)
    }
}