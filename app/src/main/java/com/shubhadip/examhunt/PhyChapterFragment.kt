package com.shubhadip.examhunt

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.shubhadip.examhunt.databinding.FragmentHisChapterBinding
import com.shubhadip.examhunt.databinding.FragmentPhyChapterBinding

class PhyChapterFragment : Fragment() {
    private  var _binding: FragmentPhyChapterBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentPhyChapterBinding.inflate(inflater, container, false)


        //     Physical Science 1 chapter pdf
        binding.phyChap1Btn.setOnClickListener {
            Toast.makeText(requireActivity(), "Downloading PDF", Toast.LENGTH_SHORT).show()

            var phyChap1PDFUrl = "https://drive.google.com/uc?export=download&id=1p2sgi-Z-pv5jLgSQM1DwbAi5JBX2Q5uq"
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(phyChap1PDFUrl)))
        }

        //        Physical Science 2 chapter pdf
        binding.phyChap2Btn.setOnClickListener {
            Toast.makeText(requireActivity(), "Downloading PDF", Toast.LENGTH_SHORT).show()

            var phyChap2PDFUrl = "https://drive.google.com/uc?export=download&id=1p2sgi-Z-pv5jLgSQM1DwbAi5JBX2Q5uq"
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(phyChap2PDFUrl)))
        }

        //        Physical Science 3 chapter pdf
        binding.phyChap3Btn.setOnClickListener {
            Toast.makeText(requireActivity(), "Downloading PDF", Toast.LENGTH_SHORT).show()

            var phyChap3PDFUrl = "https://drive.google.com/uc?export=download&id=1p2sgi-Z-pv5jLgSQM1DwbAi5JBX2Q5uq"
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(phyChap3PDFUrl)))
        }

        //       Physical Science 4 chapter pdf
        binding.phyChap4Btn.setOnClickListener {
            Toast.makeText(requireActivity(), "Downloading PDF", Toast.LENGTH_SHORT).show()

            var phyChap4PDFUrl = "https://drive.google.com/uc?export=download&id=1p2sgi-Z-pv5jLgSQM1DwbAi5JBX2Q5uq"
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(phyChap4PDFUrl)))
        }

        //     Physical Science 5 chapter pdf
        binding.phyChap5Btn.setOnClickListener {
            Toast.makeText(requireActivity(), "Downloading PDF", Toast.LENGTH_SHORT).show()

            var phyChap5PDFUrl = "https://drive.google.com/uc?export=download&id=1p2sgi-Z-pv5jLgSQM1DwbAi5JBX2Q5uq"
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(phyChap5PDFUrl)))
        }

        //       Physical Science 6 chapter pdf
        binding.phyChap6Btn.setOnClickListener {
            Toast.makeText(requireActivity(), "Downloading PDF", Toast.LENGTH_SHORT).show()

            var phyChap6PDFUrl = "https://drive.google.com/uc?export=download&id=1p2sgi-Z-pv5jLgSQM1DwbAi5JBX2Q5uq"
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(phyChap6PDFUrl)))
        }

        //       Physical Science 7 chapter pdf
        binding.phyChap7Btn.setOnClickListener {
            Toast.makeText(requireActivity(), "Downloading PDF", Toast.LENGTH_SHORT).show()

            var phyChap7PDFUrl = "https://drive.google.com/uc?export=download&id=1p2sgi-Z-pv5jLgSQM1DwbAi5JBX2Q5uq"
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(phyChap7PDFUrl)))
        }


        return binding.root


    }

}