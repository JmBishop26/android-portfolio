package com.tutorial.myportfolio.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.tutorial.myportfolio.models.about.skills.BackendDataProvider
import com.tutorial.myportfolio.models.about.skills.FrontendDataProvider
import com.tutorial.myportfolio.models.about.skills.Skills

class SkillViewModel : ViewModel() {
    val frontEndData : MutableLiveData<ArrayList<Skills>> = MutableLiveData()
    val backEndData : MutableLiveData<ArrayList<Skills>> = MutableLiveData()
    init {
        frontEndData.value = FrontendDataProvider().showFrontend()
        backEndData.value = BackendDataProvider().showBackend()
    }
}