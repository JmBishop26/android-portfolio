package com.tutorial.myportfolio.models.projects

import com.tutorial.myportfolio.R

class ProjectDataProvider {

    private val projects = arrayListOf<Project>()

    init {
        projects.add(
            Project(
                1,
                "Juan Dela Cook",
                "Cookbook Budgetting System",
                "A web-based application that provide recipe recommendations based on user's provided budget.",
                R.drawable.img_jdc,
                "HTML, Bootstrap, PHP, JQuery, Python, MySQL",
                "",
                "https://jdc-capstone.com/"
            )
        )
        projects.add(
            Project(
                2,
                "JM Obispo",
                "Portfolio Website",
        "A portfolio website crafted with Next.js, powered by Semantic UI for a sleek and intuitive UI, enhanced with Sass and brought to life using Framer Motion.",
                R.drawable.img_myweb,
                "Next.JS, Semantic UI, Sass, Framer Motion",
                "https://github.com/JmBishop26/portfolio",
                "https://portfolio-phi-blond-17.vercel.app/"
            )
        )

        projects.add(
            Project(
                3,
                "SPTS",
                "Educational Management System",
                "An application that monitors academic progress through graphs and allows parents to view their child's performance.",
                R.drawable.img_spts,
                "Java, Java Swing, MySQL, JFreeChart",
                "https://github.com/JmBishop26/AppDevProject",
                ""
            )
        )
        projects.add(
            Project(
                4,
                "Technovation",
                "Cashier and Inventory System",
                "An application designed to streamline and simplify retail operations, and monitor computer parts stocks realtime.",
                R.drawable.img_technovation,
                "Java, Java Swing, MySQL",
                "https://github.com/JmBishop26/IASProject",
                ""
            )
        )
        projects.add(
            Project(
                5,
                "Pet-O-Care",
                "Pet Hotel Booking System",
                "A web-based pet hotel booking system that also provide a small e-commerce where users can buy pet products for their fur babies.",
                R.drawable.img_petocare,
                "HTML5, CSS3, PHP, MySQL",
                "https://github.com/JmBishop26/petocare",
                ""
            )
        )
        projects.add(
            Project(
                6,
                "Pet-O-Care 2.0",
                "Pet Hotel Booking System",
                "The Next.JS version of my web-based pet hotel booking system that also provide a small e-commerce where users can buy pet products for their fur babies.",
                R.drawable.img_petocare2,
                "Next.JS, Semantic UI, Sass, MongoDB",
                "",
                ""
            )
        )
    }

    fun showProjects(): ArrayList<Project> {
        return projects
    }



}