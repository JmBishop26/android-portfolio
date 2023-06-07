package com.tutorial.myportfolio.view

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.tutorial.myportfolio.R
import com.tutorial.myportfolio.databinding.FragmentSplashBinding
import com.tutorial.myportfolio.utils.ImageLoader


class SplashFragment : Fragment() {
    private lateinit var binding : FragmentSplashBinding
    private val handler = Handler(Looper.getMainLooper())
    private lateinit var imgLoader : ImageLoader

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentSplashBinding.inflate(inflater, container, false)

        imgLoader = ImageLoader.getInstance(requireContext())
        imgLoader.loader(R.drawable.img_welcome, binding.welcomeImage)

        handler.postDelayed({
            findNavController().navigate(R.id.action_splashFragment_to_profileFragment)
        }, 2000)

        return binding.root
    }

}


