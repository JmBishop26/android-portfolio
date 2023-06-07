package com.tutorial.myportfolio.models.about.hobby

import com.tutorial.myportfolio.R

class HobbiesDataProvider {

    val hobby = ArrayList<Hobbies>()

    init{
        hobby.add(
            Hobbies(
                1,
                "Movies",
                R.drawable.img_movies
            )
        )
        hobby.add(
            Hobbies(
                2,
                "Music",
                R.drawable.img_spotify
            )
        )
        hobby.add(
            Hobbies(
                3,
                "Gaming",
                R.drawable.img_gaming
            )
        )
        hobby.add(
            Hobbies(
                4,
                "Basketball",
                R.drawable.img_basketball
            )
        )
        hobby.add(
            Hobbies(
                5,
                "Table Tennis",
                R.drawable.img_table_tennis
            )
        )
    }

    fun showHobbies():ArrayList<Hobbies>{
        return hobby
    }
}