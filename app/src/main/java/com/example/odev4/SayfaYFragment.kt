package com.example.odev4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.odev4.databinding.FragmentSayfaYBinding

class SayfaYFragment : Fragment() {
    private lateinit var binding:FragmentSayfaYBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSayfaYBinding.inflate(inflater, container, false)
        binding.buttonAnasayfaGecis.setOnClickListener {
            findNavController().navigate(R.id.anasayfaGecis)
        }
        return binding.root
    }
}