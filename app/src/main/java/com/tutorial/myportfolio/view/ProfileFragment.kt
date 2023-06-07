package com.tutorial.myportfolio.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.tutorial.myportfolio.R
import com.tutorial.myportfolio.databinding.FragmentProfileBinding
import com.tutorial.myportfolio.utils.ImageLoader

class ProfileFragment : Fragment() {
    private lateinit var binding : FragmentProfileBinding
    private lateinit var imgLoader : ImageLoader

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentProfileBinding.inflate(inflater, container, false)

        imgLoader = ImageLoader.getInstance(requireContext())
        imgLoader.loader(R.drawable.img_pfp, binding.profileImg)
        imgLoader.loader(R.drawable.icon_work, binding.iconProject)
        imgLoader.loader(R.drawable.icon_person, binding.iconAboutMe)
        imgLoader.loader(R.drawable.icon_xmark, binding.iconContacts)

        binding.linkToProject.setOnClickListener{
            findNavController().navigate(R.id.action_profileFragment_to_projectsFragment)
        }

        binding.linkToAbout.setOnClickListener{
            findNavController().navigate(R.id.action_profileFragment_to_aboutFragment)
        }

        BottomSheetBehavior.from(binding.bottomSheet).apply {
            peekHeight = 350
            this.state = BottomSheetBehavior.STATE_COLLAPSED
        }

        return binding.root
    }
}