package com.tutorial.myportfolio.models.about.self

import com.tutorial.myportfolio.R

class SelfDataProvider {
    private val selfInfo= arrayListOf<Self>()

    init {
        selfInfo.add(
            Self(
                1,
                "Polytechnic University of the Philippines",
                R.drawable.icon_univ
            )
        )
        selfInfo.add(
            Self(
                2,
                "Quezon City, Philippines",
                R.drawable.icon_location
            )
        )
        selfInfo.add(
            Self(
                3,
                "johnmichael.obispo@gmail.com",
                R.drawable.icon_email
            )
        )
        selfInfo.add(
            Self(
                4,
                "+(63) 977-473-0369",
                R.drawable.icon_phone
            )
        )
        selfInfo.add(
            Self(
                5,
                "March 26, 2001",
                R.drawable.icon_cake
            )
        )
    }

    fun showSelfInfo(): ArrayList<Self> {
        return selfInfo
    }
}