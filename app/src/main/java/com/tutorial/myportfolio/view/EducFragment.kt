package com.tutorial.myportfolio.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.tutorial.myportfolio.viewmodel.EducViewModel
import com.tutorial.myportfolio.databinding.FragmentEducBinding
import com.tutorial.myportfolio.view.adapters.about.education.EducationAdapter

class EducFragment : Fragment() {
//
//    companion object {
//        fun newInstance() = EducFragment()
//    }

    private val model: EducViewModel by viewModels()
    private lateinit var binding : FragmentEducBinding
    private lateinit var educAdapter : EducationAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentEducBinding.inflate(layoutInflater, container, false)

        binding.recyclerAboutEduc.layoutManager = LinearLayoutManager(requireContext())
        educAdapter = EducationAdapter(ArrayList())
        binding.recyclerAboutEduc.adapter = educAdapter

        model.educData.observe(viewLifecycleOwner, Observer { educ ->
            educAdapter.updateEducInfo(educ)
        })

        return binding.root
    }

//    override fun onActivityCreated(savedInstanceState: Bundle?) {
//        super.onActivityCreated(savedInstanceState)
//        viewModel = ViewModelProvider(this).get(EducViewModel::class.java)
//        // TODO: Use the ViewModel
//    }

}