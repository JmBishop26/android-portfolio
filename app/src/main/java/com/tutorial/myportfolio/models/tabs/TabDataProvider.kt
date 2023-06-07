package com.tutorial.myportfolio.models.tabs

import com.tutorial.myportfolio.R

class TabDataProvider {

    private val tabs = arrayListOf<Tabs>()

    init {
        tabs.add(
            Tabs(
                1,
                R.drawable.icon_person,
                "Me"
            )
        )
        tabs.add(
            Tabs(
                2,
                R.drawable.icon_work,
                "Experiences"
            )
        )
        tabs.add(
            Tabs(
                3,
                R.drawable.icon_education,
                "Education"
            )
        )
        tabs.add(
            Tabs(
                4,
                R.drawable.icon_hobby,
                "Hobbies"
            )
        )
    }

    fun showTabs(): ArrayList<Tabs> {
        return tabs
    }

}