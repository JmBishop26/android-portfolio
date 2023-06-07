package com.tutorial.myportfolio.view

import android.content.res.Resources
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.google.android.material.tabs.TabLayoutMediator
import com.tutorial.myportfolio.R
import com.tutorial.myportfolio.databinding.FragmentAboutBinding
import com.tutorial.myportfolio.view.adapters.tabs.AboutPageAdapter
//import com.tutorial.myportfolio.viewmodel.AboutViewModel

class AboutFragment : Fragment() {

//    private val model: AboutViewModel by viewModels()
    private lateinit var binding : FragmentAboutBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAboutBinding.inflate(inflater, container, false)

        binding.linkBack.setOnClickListener {
            findNavController().navigate(R.id.action_aboutFragment_to_profileFragment)
        }

        binding.aboutViewpager.adapter = AboutPageAdapter(this)
        TabLayoutMediator(binding.aboutTab, binding.aboutViewpager){ tab, index ->
            when(index){
                0->{
                    tab.text = "Self"
                    tab.icon = ContextCompat.getDrawable(requireContext(), R.drawable.icon_person)
                }
                1->{
                    tab.text = "Skills"
                    tab.icon = ContextCompat.getDrawable(requireContext(), R.drawable.icon_work)
                }
                2->{
                    tab.text = "Experiences"
                    tab.icon = ContextCompat.getDrawable(requireContext(), R.drawable.icon_work)
                }
                3->{
                    tab.text = "Education"
                    tab.icon = ContextCompat.getDrawable(requireContext(), R.drawable.icon_education)
                }
                4->{
                    tab.text = "Hobbies"
                    tab.icon = ContextCompat.getDrawable(requireContext(), R.drawable.icon_hobby)
                }
                else -> {throw Resources.NotFoundException("Fragment not found: $index")}
            }

        }.attach()



        return binding.root
    }


}