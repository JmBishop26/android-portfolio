package com.tutorial.myportfolio.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.tutorial.myportfolio.databinding.FragmentSkillBinding
import com.tutorial.myportfolio.view.adapters.about.skills.BackEndSkillAdapter
import com.tutorial.myportfolio.view.adapters.about.skills.FrontEndSkillAdapter
import com.tutorial.myportfolio.viewmodel.SkillViewModel

class SkillFragment : Fragment() {

//    companion object {
//        fun newInstance() = SkillFragment()
//    }

    private val model: SkillViewModel by viewModels()
    private lateinit var binding:FragmentSkillBinding
    private lateinit var frontEndAdapter: FrontEndSkillAdapter
    private lateinit var backEndAdapter: BackEndSkillAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentSkillBinding.inflate(layoutInflater, container, false)

        frontEndAdapter = FrontEndSkillAdapter(ArrayList())
        backEndAdapter = BackEndSkillAdapter(ArrayList())
        binding.recyclerAboutSkillFrontend.adapter = frontEndAdapter
        binding.recyclerAboutSkilLBackend.adapter = backEndAdapter

        binding.recyclerAboutSkillFrontend.layoutManager = GridLayoutManager(requireContext(), 4, LinearLayoutManager.VERTICAL, false)

        binding.recyclerAboutSkilLBackend.layoutManager = GridLayoutManager(requireContext(), 4, LinearLayoutManager.VERTICAL, false)

        model.frontEndData.observe(viewLifecycleOwner, Observer{front->
            frontEndAdapter.updateSkillInfo(front)
        })
        model.backEndData.observe(viewLifecycleOwner, Observer{back->
            backEndAdapter.updateSkillInfo(back)
        })

        return binding.root
    }

//    override fun onActivityCreated(savedInstanceState: Bundle?) {
//        super.onActivityCreated(savedInstanceState)
//        viewModel = ViewModelProvider(this).get(SkillViewModel::class.java)
//
//    }

}