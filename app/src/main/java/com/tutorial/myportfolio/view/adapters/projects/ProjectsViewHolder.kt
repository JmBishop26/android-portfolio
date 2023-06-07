package com.tutorial.myportfolio.view.adapters.projects

import androidx.recyclerview.widget.RecyclerView
import com.tutorial.myportfolio.databinding.CardProjectsBinding
import com.tutorial.myportfolio.models.projects.Project
import com.tutorial.myportfolio.utils.ImageLoader

class ProjectsViewHolder(val binding: CardProjectsBinding) :
    RecyclerView.ViewHolder(binding.root) {

    private lateinit var imageLoader: ImageLoader

    fun bind(project: Project) {
        imageLoader = ImageLoader.getInstance(binding.root.context)
        binding.project = project
        imageLoader.loader(project.image, binding.projImage)
        binding.executePendingBindings()
    }
}