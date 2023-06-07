package com.tutorial.myportfolio.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.tutorial.myportfolio.models.about.experience.Experience
import com.tutorial.myportfolio.models.about.experience.ExperienceDataProvider

class ExperiencesViewModel : ViewModel() {
    val expData : MutableLiveData<ArrayList<Experience>> = MutableLiveData()

    init {
        expData.value = ExperienceDataProvider().showExperiences()
    }
}