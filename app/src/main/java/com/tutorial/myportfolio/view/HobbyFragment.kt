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
import com.tutorial.myportfolio.viewmodel.HobbyViewModel
import com.tutorial.myportfolio.databinding.FragmentHobbyBinding
import com.tutorial.myportfolio.view.adapters.about.hobbies.HobbiesAdapter

class HobbyFragment : Fragment() {

//    companion object {
//        fun newInstance() = HobbyFragment()
//    }

    private val model: HobbyViewModel by viewModels()
    private lateinit var binding: FragmentHobbyBinding
    private lateinit var hobbyAdapter : HobbiesAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHobbyBinding.inflate(layoutInflater, container, false)

        hobbyAdapter = HobbiesAdapter(ArrayList())
        binding.recyclerAboutHobby.layoutManager = GridLayoutManager(requireContext(), 2, LinearLayoutManager.VERTICAL, false)
        binding.recyclerAboutHobby.adapter = hobbyAdapter


        model.hobbyData.observe(viewLifecycleOwner, Observer { hobby ->
            hobbyAdapter.updateHobbyInfo(hobby)
        })

        return binding.root
    }

//    override fun onActivityCreated(savedInstanceState: Bundle?) {
//        super.onActivityCreated(savedInstanceState)
//        viewModel = ViewModelProvider(this).get(HobbyViewModel::class.java)
//        // TODO: Use the ViewModel
//    }

}