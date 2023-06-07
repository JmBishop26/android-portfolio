
package com.tutorial.myportfolio.view.adapters.projects

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.fragment.NavHostFragment.Companion.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.tutorial.myportfolio.R
import com.tutorial.myportfolio.databinding.CardProjectsBinding
import com.tutorial.myportfolio.models.projects.Project
import com.tutorial.myportfolio.view.ProjectsFragment

//class ProjectsAdapter{
//
//}
class ProjectsAdapter(private val projects: ArrayList<Project>, private val fragment: ProjectsFragment) :
    RecyclerView.Adapter<ProjectsViewHolder>() {

    fun updateProjects(newProjects: ArrayList<Project>) {
        projects.clear()
        projects.addAll(newProjects)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProjectsViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = CardProjectsBinding.inflate(inflater, parent, false)
        return ProjectsViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ProjectsViewHolder, position: Int) {
        val project = projects[position]
        holder.bind(project)
        holder.binding.projectCard.setOnClickListener{
            val clickedProject = projects[position]
            val bundle = Bundle()
            bundle.putSerializable("project", clickedProject)
            findNavController(fragment).navigate(R.id.action_projectsFragment_to_projectDetailsFragment, bundle)
        }
    }

    override fun getItemCount(): Int {
        return projects.size
    }

}
