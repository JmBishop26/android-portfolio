package com.tutorial.myportfolio.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.tutorial.myportfolio.models.projects.Project
import com.tutorial.myportfolio.models.projects.ProjectDataProvider

class ProjectsViewModel : ViewModel() {

    val projectData : MutableLiveData<ArrayList<Project>> = MutableLiveData()
    init {
        projectData.value = ProjectDataProvider().showProjects()
    }
}