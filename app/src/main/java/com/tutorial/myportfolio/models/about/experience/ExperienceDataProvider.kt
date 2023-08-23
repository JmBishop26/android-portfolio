package com.tutorial.myportfolio.models.about.experience

class ExperienceDataProvider {

    private val experiences = arrayListOf<Experience>()

    init {
        experiences.add(
            Experience(
                1,
                "Programmer Intern",
                "Intern",
                "Zynappse Corporation",
                "February 2019 - March 2019",
                "Learned and developed applications for the web and android applications using the technology stack of the company. Experienced doing Quality Assurance jobs"
            )
        )
        experiences.add(
            Experience(
                2,
                "IT Support Assistant",
                "Intern",
                "Sutherland Philippines",
                "February 2019 - March 2019",
                "Configured BIOS, updated softwares, cloned data of computers, and assisted in the company’s data center."
            )
        )
    }

    fun showExperiences():ArrayList<Experience>{
        return experiences
    }

}