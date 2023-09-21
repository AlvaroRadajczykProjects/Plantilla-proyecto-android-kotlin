package com.example.plantillaproyectoandroidkotlin.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import com.example.plantillaproyectoandroidkotlin.R
import com.example.plantillaproyectoandroidkotlin.databinding.FragmentMainBinding
import com.example.plantillaproyectoandroidkotlin.databinding.FragmentNextBinding

class FragmentNext : Fragment() {

    private lateinit var binding: FragmentNextBinding

    private lateinit var navHostFragment: NavHostFragment
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentNextBinding.inflate(layoutInflater)
        val view = binding.root

        navHostFragment = activity?.supportFragmentManager?.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        navController = navHostFragment.navController

        binding.button.setOnClickListener {
            val action = FragmentNextDirections.actionFragmentNextToFragmentMain()
            it?.findNavController()?.navigate(action)
        }

        return view
    }

}