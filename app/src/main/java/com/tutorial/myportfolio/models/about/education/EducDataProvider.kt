package com.tutorial.myportfolio.models.about.education

class EducDataProvider {

    val educ = ArrayList<Education>()

    init {
        educ.add(
            Education(
                1,
                "Tertiary",
                "Bachelor of Science in Information Technology",
                "Polytechnic University of the Philippines",
                "June 2019 - present"
            )
        )
        educ.add(
            Education(
                2,
                "Secondary (Senior High School)",
                "Science, Technology, Engineering, and Mathematics",
                "Central Colleges of the Philippines",
                "June 2017 - April 2019"
            )
        )
        educ.add(
            Education(
                3,
                "Secondary (Junior High School)",
                "",
                "Quirino High School",
                "June 2013 - April 2017"
            )
        )
        educ.add(
            Education(
                4,
                "Elementary",
                "",
                "Pura V. Kalaw Elementary School",
                "June 2007 - April 2013"
            )
        )
    }

    fun showEducation(): ArrayList<Education>{
        return educ
    }
}