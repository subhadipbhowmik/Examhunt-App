package com.shubhadip.examhunt

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.shubhadip.examhunt.databinding.FragmentBioChapterBinding
import com.shubhadip.examhunt.databinding.FragmentPhyChapterBinding

class BioChapterFragment : Fragment() {

    private  var _binding: FragmentBioChapterBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        // Inflate the layout for this fragment
        _binding = FragmentBioChapterBinding.inflate(inflater, container, false)



        //     Life Science 1 chapter pdf
        binding.bioChap1Btn.setOnClickListener {
            Toast.makeText(requireActivity(), "Downloading PDF", Toast.LENGTH_SHORT).show()

            var bioChap1PDFUrl = "https://drive.google.com/uc?export=download&id=1p2sgi-Z-pv5jLgSQM1DwbAi5JBX2Q5uq"
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(bioChap1PDFUrl)))
        }

        //        Life Science 2 chapter pdf
        binding.bioChap2Btn.setOnClickListener {
            Toast.makeText(requireActivity(), "Downloading PDF", Toast.LENGTH_SHORT).show()

            var bioChap2PDFUrl = "https://drive.google.com/uc?export=download&id=1p2sgi-Z-pv5jLgSQM1DwbAi5JBX2Q5uq"
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(bioChap2PDFUrl)))
        }

        //        Life Science 3 chapter pdf
        binding.bioChap3Btn.setOnClickListener {
            Toast.makeText(requireActivity(), "Downloading PDF", Toast.LENGTH_SHORT).show()

            var bioChap3PDFUrl = "https://drive.google.com/uc?export=download&id=1p2sgi-Z-pv5jLgSQM1DwbAi5JBX2Q5uq"
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(bioChap3PDFUrl)))
        }

        //       Life Science 4 chapter pdf
        binding.bioChap4Btn.setOnClickListener {
            Toast.makeText(requireActivity(), "Downloading PDF", Toast.LENGTH_SHORT).show()

            var bioChap4PDFUrl = "https://drive.google.com/uc?export=download&id=1p2sgi-Z-pv5jLgSQM1DwbAi5JBX2Q5uq"
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(bioChap4PDFUrl)))
        }

        //     Life Science 5 chapter pdf
        binding.bioChap5Btn.setOnClickListener {
            Toast.makeText(requireActivity(), "Downloading PDF", Toast.LENGTH_SHORT).show()

            var bioChap5PDFUrl = "https://drive.google.com/uc?export=download&id=1p2sgi-Z-pv5jLgSQM1DwbAi5JBX2Q5uq"
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(bioChap5PDFUrl)))
        }



        return  binding.root
    }

}