package com.shubhadip.examhunt

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.shubhadip.examhunt.databinding.FragmentEngChapterBinding
import com.shubhadip.examhunt.databinding.FragmentHisChapterBinding


class HisChapterFragment : Fragment() {

    private  var _binding: FragmentHisChapterBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        // Inflate the layout for this fragment
        _binding = FragmentHisChapterBinding.inflate(inflater, container, false)


       //     history 1 chapter pdf
        binding.hisChap1Btn.setOnClickListener {
            Toast.makeText(requireActivity(), "Downloading PDF", Toast.LENGTH_SHORT).show()

            var hisChap1PDFUrl = "https://drive.google.com/uc?export=download&id=1p2sgi-Z-pv5jLgSQM1DwbAi5JBX2Q5uq"
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(hisChap1PDFUrl)))
        }

        //        history 2 chapter pdf
        binding.hisChap2Btn.setOnClickListener {
            Toast.makeText(requireActivity(), "Downloading PDF", Toast.LENGTH_SHORT).show()

            var hisChap2PDFUrl = "https://drive.google.com/uc?export=download&id=1p2sgi-Z-pv5jLgSQM1DwbAi5JBX2Q5uq"
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(hisChap2PDFUrl)))
        }

        //        history 3 chapter pdf
        binding.hisChap3Btn.setOnClickListener {
            Toast.makeText(requireActivity(), "Downloading PDF", Toast.LENGTH_SHORT).show()

            var hisChap3PDFUrl = "https://drive.google.com/uc?export=download&id=1p2sgi-Z-pv5jLgSQM1DwbAi5JBX2Q5uq"
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(hisChap3PDFUrl)))
        }

        //       history 4 chapter pdf
        binding.hisChap4Btn.setOnClickListener {
            Toast.makeText(requireActivity(), "Downloading PDF", Toast.LENGTH_SHORT).show()

            var hisChap4PDFUrl = "https://drive.google.com/uc?export=download&id=1p2sgi-Z-pv5jLgSQM1DwbAi5JBX2Q5uq"
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(hisChap4PDFUrl)))
        }

        //     history 5 chapter pdf
        binding.hisChap5Btn.setOnClickListener {
            Toast.makeText(requireActivity(), "Downloading PDF", Toast.LENGTH_SHORT).show()

            var hisChap5PDFUrl = "https://drive.google.com/uc?export=download&id=1p2sgi-Z-pv5jLgSQM1DwbAi5JBX2Q5uq"
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(hisChap5PDFUrl)))
        }

        //       history 6 chapter pdf
        binding.hisChap6Btn.setOnClickListener {
            Toast.makeText(requireActivity(), "Downloading PDF", Toast.LENGTH_SHORT).show()

            var hisChap6PDFUrl = "https://drive.google.com/uc?export=download&id=1p2sgi-Z-pv5jLgSQM1DwbAi5JBX2Q5uq"
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(hisChap6PDFUrl)))
        }

        //       history 7 chapter pdf
        binding.hisChap7Btn.setOnClickListener {
            Toast.makeText(requireActivity(), "Downloading PDF", Toast.LENGTH_SHORT).show()

            var hisChap7PDFUrl = "https://drive.google.com/uc?export=download&id=1p2sgi-Z-pv5jLgSQM1DwbAi5JBX2Q5uq"
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(hisChap7PDFUrl)))
        }

        //        history 8 chapter pdf
        binding.hisChap8Btn.setOnClickListener {
            Toast.makeText(requireActivity(), "Downloading PDF", Toast.LENGTH_SHORT).show()

            var hisChap8PDFUrl = "https://drive.google.com/uc?export=download&id=1p2sgi-Z-pv5jLgSQM1DwbAi5JBX2Q5uq"
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(hisChap8PDFUrl)))
        }

        return binding.root


    }

}