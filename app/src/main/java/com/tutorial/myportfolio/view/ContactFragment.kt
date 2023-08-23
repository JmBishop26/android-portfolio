package com.tutorial.myportfolio.view

//import android.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.tutorial.myportfolio.R
import com.tutorial.myportfolio.databinding.FragmentContactBinding
import com.tutorial.myportfolio.viewmodel.ContactViewModel

class ContactFragment : Fragment() {

    private val viewModel: ContactViewModel by viewModels()
    private lateinit var binding: FragmentContactBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentContactBinding.inflate(inflater, container, false)

        binding.lifecycleOwner = this
        binding.contact = viewModel

        binding.btnSend.setOnClickListener {
            val name = viewModel.name.value
            val email = viewModel.email.value
            val message = viewModel.message.value

            viewModel.getValues(requireContext(),name, email, message)

        }
        binding.linkBack.setOnClickListener {
            findNavController().navigate(R.id.action_contactFragment_to_profileFragment2)
        }

        return binding.root
    }


}