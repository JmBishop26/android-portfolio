package com.tutorial.myportfolio.viewmodel

import android.content.Context
import android.widget.Toast
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.tutorial.myportfolio.utils.api.EmailSender
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class ContactViewModel : ViewModel() {
    var name: MutableLiveData<String> = MutableLiveData()
    var email: MutableLiveData<String> = MutableLiveData()
    var message: MutableLiveData<String> = MutableLiveData()

    fun getValues(context: Context, name: String?, email: String?, message: String?) {
        viewModelScope.launch {
            val sender = EmailSender(name, email, message)
            val res = sender.sendMessage()

            withContext(Dispatchers.Main) {
                Toast.makeText(context, res.message, Toast.LENGTH_SHORT).show()
            }
        }
    }
}