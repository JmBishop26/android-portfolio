package com.tutorial.myportfolio.models.about.experience

class ExperienceDataProvider {

    private val experiences = arrayListOf<Experience>()

    init {
        experiences.add(
            Experience(
                1,
                "Personalized Internet Ads Assessor",
                "Independent Contractor",
                "TELUS International",
                "July 2021 - February 2022",
                "Assessed the quality of Google Advertisements appearing in user’s search results."
            )
        )
        experiences.add(
            Experience(
                2,
                "Social Worker Assistant",
                "Summer Job Employee",
                "SIKAP BUHAY (Quezon City Hall)",
                "April 2019 - May 2019",
                "Assisted people who come to our office to apply for small business support."
            )
        )
        experiences.add(
            Experience(
                3,
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