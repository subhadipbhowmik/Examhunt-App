package com.shubhadip.examhunt

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.FragmentTransaction
import com.shubhadip.examhunt.databinding.FragmentHomeBinding
import com.shubhadip.examhunt.databinding.FragmentPyqBinding

class PyqFragment : Fragment() {
    private  var _binding: FragmentPyqBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentPyqBinding.inflate(inflater, container, false)

        // Inflate the layout for this fragment
        binding.pyqY23.setOnClickListener {
            val pyq2023Fragment = Pyq2023()
            val transaction: FragmentTransaction = requireFragmentManager().beginTransaction()
            transaction.replace(R.id.frame_layout, pyq2023Fragment)
            transaction.addToBackStack(null)
            transaction.commit()
        }

        //    open 2022 pyq of all subjects
        binding.pyqY22.setOnClickListener {
            val pyq2022Fragment = Pyq2022()
            val transaction: FragmentTransaction = requireFragmentManager().beginTransaction()
            transaction.replace(R.id.frame_layout, pyq2022Fragment)
            transaction.addToBackStack(null)
            transaction.commit()
        }

        //      open 2020 pyq of all subjects
        binding.pyqY20.setOnClickListener {
            val pyq2020Fragment = Pyq2020()
            val transaction: FragmentTransaction = requireFragmentManager().beginTransaction()
            transaction.replace(R.id.frame_layout, pyq2020Fragment)
            transaction.addToBackStack(null)
            transaction.commit()
        }

        //  open 2019 pyq of all subjects

        binding.pyqY19.setOnClickListener {
            val pyq2019Fragment = Pyq2019()
            val transaction: FragmentTransaction = requireFragmentManager().beginTransaction()
            transaction.replace(R.id.frame_layout, pyq2019Fragment)
            transaction.addToBackStack(null)
            transaction.commit()
        }

        //     open 2018 pyq of all subjects
        binding.pyqY18.setOnClickListener {
            val pyq2018Fragment = Pyq2018()
            val transaction: FragmentTransaction = requireFragmentManager().beginTransaction()
            transaction.replace(R.id.frame_layout, pyq2018Fragment)
            transaction.addToBackStack(null)
            transaction.commit()
        }

        //    open 2017 pyq of all subjects
        binding.pyqY17.setOnClickListener {
            val pyq2017Fragment = Pyq2017()
            val transaction: FragmentTransaction = requireFragmentManager().beginTransaction()
            transaction.replace(R.id.frame_layout, pyq2017Fragment)
            transaction.addToBackStack(null)
            transaction.commit()
        }

        return  binding.root

    }

}