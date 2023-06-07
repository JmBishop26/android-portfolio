package com.tutorial.myportfolio.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.tutorial.myportfolio.models.tabs.TabDataProvider
import com.tutorial.myportfolio.models.tabs.Tabs

class AboutViewModel : ViewModel() {
    val tabsData : MutableLiveData<ArrayList<Tabs>> = MutableLiveData()
    init {
        tabsData.value = TabDataProvider().showTabs()
    }
}