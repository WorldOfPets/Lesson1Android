package com.example.lesson1.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.lesson1.R
import com.example.lesson1.databinding.FragmentFirstScreenBinding

class FirstScreenFragment : Fragment() {

    private lateinit var binding: FragmentFirstScreenBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentFirstScreenBinding.inflate(layoutInflater, container, false)


        binding.mainBtn.setOnClickListener {
            findNavController().navigate(R.id.action_firstScreenFragment_to_secondFragment)
        }



        return binding.root
    }

}