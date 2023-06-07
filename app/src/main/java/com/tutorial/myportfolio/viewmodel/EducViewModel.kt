package com.tutorial.myportfolio.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.tutorial.myportfolio.models.about.education.EducDataProvider
import com.tutorial.myportfolio.models.about.education.Education

class EducViewModel : ViewModel() {
    val educData : MutableLiveData<ArrayList<Education>> = MutableLiveData()
    init {
        educData.value = EducDataProvider().showEducation()
    }
}