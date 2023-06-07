package com.tutorial.myportfolio.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.tutorial.myportfolio.models.about.self.Self
import com.tutorial.myportfolio.models.about.self.SelfDataProvider

class SelfViewModel : ViewModel() {
    val selfData : MutableLiveData<ArrayList<Self>> = MutableLiveData()
    init {
        selfData.value = SelfDataProvider().showSelfInfo()
    }
}