package com.tutorial.myportfolio.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.tutorial.myportfolio.viewmodel.ExperiencesViewModel
import com.tutorial.myportfolio.databinding.FragmentExperiencesBinding
import com.tutorial.myportfolio.view.adapters.about.experience.ExperienceAdapter

class ExpFragment : Fragment() {

    companion object {
        fun newInstance() = ExpFragment()
    }

    private val model: ExperiencesViewModel by viewModels()
    private lateinit var binding: FragmentExperiencesBinding
    private lateinit var expAdapter: ExperienceAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentExperiencesBinding.inflate(layoutInflater, container, false)

        expAdapter = ExperienceAdapter(ArrayList())
        binding.recyclerAboutExp.adapter = expAdapter
        binding.recyclerAboutExp.layoutManager = LinearLayoutManager(requireContext())

        model.expData.observe(viewLifecycleOwner, Observer { exp->
            expAdapter.updateExpInfo(exp)
        })

        return binding.root
    }

//    override fun onActivityCreated(savedInstanceState: Bundle?) {
//        super.onActivityCreated(savedInstanceState)
//        viewModel = ViewModelProvider(this).get(ExperiencesViewModel::class.java)
//        // TODO: Use the ViewModel
//    }

}