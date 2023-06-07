package com.tutorial.myportfolio.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.tutorial.myportfolio.R
import com.tutorial.myportfolio.viewmodel.SelfViewModel
import com.tutorial.myportfolio.databinding.FragmentSelfBinding
import com.tutorial.myportfolio.utils.ImageEnlarger
import com.tutorial.myportfolio.utils.ImageLoader
import com.tutorial.myportfolio.view.adapters.about.self.SelfAdapter

class SelfFragment : Fragment() {

//    companion object {
//        fun newInstance() = SelfFragment()
//    }

    private lateinit var binding : FragmentSelfBinding
    private val model: SelfViewModel by viewModels()
    private lateinit var selfAdapter : SelfAdapter
    private lateinit var imgLoader: ImageLoader
    private lateinit var imgEnlarge: ImageEnlarger

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSelfBinding.inflate(layoutInflater, container, false)

        imgLoader = ImageLoader.getInstance(binding.root.context)
        imgLoader.loader(R.drawable.img_pfp2, binding.circlePfp)

        imgEnlarge = ImageEnlarger.getInstance(binding.root.context)
        imgEnlarge.imgEnlarge(binding.circlePfp, binding.imgEnlarged)
        imgEnlarge.imgClose(binding.imgEnlarged)


        selfAdapter = SelfAdapter(ArrayList())
        binding.recyclerAboutSelf.adapter = selfAdapter
        binding.recyclerAboutSelf.layoutManager = LinearLayoutManager(requireContext())

        model.selfData.observe(viewLifecycleOwner, Observer{ selfInfo ->
            selfAdapter.updateSelfInfo(selfInfo)
        })

        return binding.root
    }

//    override fun onActivityCreated(savedInstanceState: Bundle?) {
//        super.onActivityCreated(savedInstanceState)
//        viewModel = ViewModelProvider(this).get(SelfViewModel::class.java)
//        // TODO: Use the ViewModel
//    }

}