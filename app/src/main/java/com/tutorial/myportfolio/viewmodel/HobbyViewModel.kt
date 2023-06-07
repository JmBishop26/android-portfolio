package com.tutorial.myportfolio.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.tutorial.myportfolio.models.about.hobby.Hobbies
import com.tutorial.myportfolio.models.about.hobby.HobbiesDataProvider

class HobbyViewModel : ViewModel() {
    val hobbyData: MutableLiveData<ArrayList<Hobbies>> = MutableLiveData()
    init {
        hobbyData.value = HobbiesDataProvider().showHobbies()
    }
}