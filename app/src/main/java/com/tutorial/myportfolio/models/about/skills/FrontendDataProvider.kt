package com.tutorial.myportfolio.models.about.skills

import com.tutorial.myportfolio.R

class FrontendDataProvider {

    val frontEnd = arrayListOf<Skills>()

    init{
        frontEnd.add(
            Skills(
               1,
               "HTML5",
                R.drawable.icon_html5
            )
        )
        frontEnd.add(
            Skills(
                2,
                "CSS3",
                R.drawable.icon_css3
            )
        )
        frontEnd.add(
            Skills(
                3,
                "Bootstrap",
                R.drawable.icon_bootstrap
            )
        )
        frontEnd.add(
            Skills(
                4,
                "JQuery",
                R.drawable.icon_jquery
            )
        )
        frontEnd.add(
            Skills(
                5,
                "JavaScript",
                R.drawable.icon_javascript
            )
        )
        frontEnd.add(
            Skills(
                6,
                "Next.JS",
                R.drawable.icon_next
            )
        )
        frontEnd.add(
            Skills(
                7,
                "Sass",
                R.drawable.icon_sass
            )
        )
        frontEnd.add(
            Skills(
                8,
                "Semantic UI",
                R.drawable.icon_semantic_ui
            )
        )
    }

    fun showFrontend(): ArrayList<Skills>{
        return frontEnd
    }

}