package com.tutorial.myportfolio.models.about.skills

import com.tutorial.myportfolio.R

class BackendDataProvider {

    val backend = arrayListOf<Skills>()

    init {
        backend.add(
            Skills(
                1,
                "PHP",
                R.drawable.icon_php
            )
        )
        backend.add(
            Skills(
                2,
                "Python Flask",
                R.drawable.icon_flask
            )
        )
        backend.add(
            Skills(
                3,
                "JavaScript",
                R.drawable.icon_javascript
            )
        )
        backend.add(
            Skills(
                4,
                "MySQL",
                R.drawable.icon_mysql
            )
        )
        backend.add(
            Skills(
                5,
                "MongoDB",
                R.drawable.icon_mongodb
            )
        )
    }

    fun showBackend():ArrayList<Skills> {
        return backend
    }
}