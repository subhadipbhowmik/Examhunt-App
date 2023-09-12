package com.shubhadip.examhunt

import android.app.FragmentTransaction
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.shubhadip.examhunt.databinding.FragmentHomeBinding
import com.shubhadip.examhunt.databinding.FragmentPyqBinding

class HomeFragment : Fragment() {
    private  var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView( inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentHomeBinding.inflate(inflater, container, false)

            // open all bengali chapters
            binding.homeSubBenCard.setOnClickListener {
                val benChapterFragment = BenChapterFragment()
                val transaction: androidx.fragment.app.FragmentTransaction = requireFragmentManager().beginTransaction()
                transaction.replace(R.id.frame_layout, benChapterFragment)
                transaction.addToBackStack(null)
                transaction.commit()
            }

        // open english chapters
        binding.homeSubEngCard.setOnClickListener {
            val engChapterFragment = EngChapterFragment()
            val transaction: androidx.fragment.app.FragmentTransaction = requireFragmentManager().beginTransaction()
            transaction.replace(R.id.frame_layout, engChapterFragment)
            transaction.addToBackStack(null)
            transaction.commit()
        }

        // open math chapters
        binding.homeSubMathCard.setOnClickListener {
            val mathChapterFragment = MathChapterFragment()
            val transaction: androidx.fragment.app.FragmentTransaction = requireFragmentManager().beginTransaction()
            transaction.replace(R.id.frame_layout, mathChapterFragment)
            transaction.addToBackStack(null)
            transaction.commit()
        }

        // open history chapters
        binding.homeSubHistCard.setOnClickListener {
            val histChapterFragment = HisChapterFragment()
            val transaction: androidx.fragment.app.FragmentTransaction = requireFragmentManager().beginTransaction()
            transaction.replace(R.id.frame_layout, histChapterFragment)
            transaction.addToBackStack(null)
            transaction.commit()
        }

        // open geography chapters

        binding.homeSubGeoCard.setOnClickListener {
            val geoChapterFragment = GeoChapterFragment()
            val transaction: androidx.fragment.app.FragmentTransaction = requireFragmentManager().beginTransaction()
            transaction.replace(R.id.frame_layout, geoChapterFragment)
            transaction.addToBackStack(null)
            transaction.commit()
        }

        // open physical science chapters

        binding.homeSubPhysicsCard.setOnClickListener {
            val phyChapterFragment = PhyChapterFragment()
            val transaction: androidx.fragment.app.FragmentTransaction = requireFragmentManager().beginTransaction()
            transaction.replace(R.id.frame_layout, phyChapterFragment)
            transaction.addToBackStack(null)
            transaction.commit()
        }

        // open life science chapters

        binding.homeSubBiologyCard.setOnClickListener {
            val bioChapterFragment = BioChapterFragment()
            val transaction: androidx.fragment.app.FragmentTransaction = requireFragmentManager().beginTransaction()
            transaction.replace(R.id.frame_layout, bioChapterFragment)
            transaction.addToBackStack(null)
            transaction.commit()
        }

        // open routine

        binding.homeRoutineCard.setOnClickListener {
            val routineFragment = ExamRoutineFragment()
            val transaction: androidx.fragment.app.FragmentTransaction = requireFragmentManager().beginTransaction()
            transaction.replace(R.id.frame_layout, routineFragment)
            transaction.addToBackStack(null)
            transaction.commit()
        }



        return  binding.root


    }
}