package com.tutorial.myportfolio.models.projects

import java.io.Serializable

data class Project(
    val id: Int,
    val name: String,
    val category: String,
    val description: String,
    val image: Int,
    val techs: String,
    val github: String,
    val liveLink: String
):Serializable
