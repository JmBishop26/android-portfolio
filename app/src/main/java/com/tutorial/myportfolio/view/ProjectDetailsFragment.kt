package com.tutorial.myportfolio.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.tutorial.myportfolio.R
import com.tutorial.myportfolio.databinding.FragmentProjectDetailsBinding
import com.tutorial.myportfolio.models.projects.Project
import com.tutorial.myportfolio.utils.ButtonLinkActivity
import com.tutorial.myportfolio.utils.ImageLoader

class ProjectDetailsFragment : Fragment() {

//    private val model: ProjectDetailsViewModel by viewModels()
    private lateinit var binding : FragmentProjectDetailsBinding
    private lateinit var project: Project
    private lateinit var imgLoader: ImageLoader
    private lateinit var btnLink: ButtonLinkActivity

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            project= it.getSerializable("project") as Project
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentProjectDetailsBinding.inflate(layoutInflater, container, false)
        imgLoader = ImageLoader.getInstance(binding.root.context)
        binding.project = project
        btnLink = ButtonLinkActivity.getInstance(binding.root.context)

        imgLoader.loader(project.image, binding.projImage)

        binding.linkBack.setOnClickListener{
            findNavController().navigate(R.id.action_projectDetailsFragment_to_projectsFragment2)
        }

        btnLink.btnActivity(binding.projLinkGithub, project.github)
        btnLink.btnActivity(binding.projLinkExternal, project.liveLink)

        return binding.root
    }

}

