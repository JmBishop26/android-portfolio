package com.tutorial.myportfolio.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.tutorial.myportfolio.R
import com.tutorial.myportfolio.viewmodel.ProjectsViewModel
import com.tutorial.myportfolio.databinding.FragmentProjectsBinding
import com.tutorial.myportfolio.view.adapters.projects.ProjectsAdapter

class ProjectsFragment : Fragment(){

    private lateinit var binding: FragmentProjectsBinding
    private val model : ProjectsViewModel by viewModels()
    private lateinit var projectsAdapter: ProjectsAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentProjectsBinding.inflate(inflater, container, false)

        binding.linkBack.setOnClickListener {
            findNavController().navigate(R.id.action_projectsFragment_to_profileFragment)
        }

        projectsAdapter = ProjectsAdapter(ArrayList(), this)
        binding.recyclerProjects.adapter = projectsAdapter
        binding.recyclerProjects.layoutManager = LinearLayoutManager(requireContext())

        model.projectData.observe(viewLifecycleOwner, Observer { projects ->
            projectsAdapter.updateProjects(projects)
        })


        return binding.root
    }


}

