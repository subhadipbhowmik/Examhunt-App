package com.shubhadip.examhunt

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.shubhadip.examhunt.databinding.FragmentGeoChapterBinding
import com.shubhadip.examhunt.databinding.FragmentHisChapterBinding

class GeoChapterFragment : Fragment() {

    private  var _binding: FragmentGeoChapterBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        // Inflate the layout for this fragment
        _binding = FragmentGeoChapterBinding.inflate(inflater, container, false)


//        Geography 1 chapter pdf
        binding.geoChap1Btn.setOnClickListener {
            Toast.makeText(requireActivity(), "Downloading PDF", Toast.LENGTH_SHORT).show()

            var geoChap1PDFUrl = "https://drive.google.com/uc?export=download&id=1p2sgi-Z-pv5jLgSQM1DwbAi5JBX2Q5uq"
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(geoChap1PDFUrl)))
        }

        //        Geography 2 chapter pdf
        binding.geoChap2Btn.setOnClickListener {
            Toast.makeText(requireActivity(), "Downloading PDF", Toast.LENGTH_SHORT).show()

            var geoChap2PDFUrl = "https://drive.google.com/uc?export=download&id=1p2sgi-Z-pv5jLgSQM1DwbAi5JBX2Q5uq"
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(geoChap2PDFUrl)))
        }

        //        Geography 3 chapter pdf
        binding.geoChap3Btn.setOnClickListener {
            Toast.makeText(requireActivity(), "Downloading PDF", Toast.LENGTH_SHORT).show()

            var geoChap3PDFUrl = "https://drive.google.com/uc?export=download&id=1p2sgi-Z-pv5jLgSQM1DwbAi5JBX2Q5uq"
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(geoChap3PDFUrl)))
        }

        //       Geography 4 chapter pdf
        binding.geoChap4Btn.setOnClickListener {
            Toast.makeText(requireActivity(), "Downloading PDF", Toast.LENGTH_SHORT).show()

            var geoChap4PDFUrl = "https://drive.google.com/uc?export=download&id=1p2sgi-Z-pv5jLgSQM1DwbAi5JBX2Q5uq"
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(geoChap4PDFUrl)))
        }

        //     Geography 5 chapter pdf
        binding.geoChap5Btn.setOnClickListener {
            Toast.makeText(requireActivity(), "Downloading PDF", Toast.LENGTH_SHORT).show()

            var geoChap5PDFUrl = "https://drive.google.com/uc?export=download&id=1p2sgi-Z-pv5jLgSQM1DwbAi5JBX2Q5uq"
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(geoChap5PDFUrl)))
        }

        //       Geography 6 chapter pdf
        binding.geoChap6Btn.setOnClickListener {
            Toast.makeText(requireActivity(), "Downloading PDF", Toast.LENGTH_SHORT).show()

            var geoChap6PDFUrl = "https://drive.google.com/uc?export=download&id=1p2sgi-Z-pv5jLgSQM1DwbAi5JBX2Q5uq"
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(geoChap6PDFUrl)))
        }


        return binding.root
    }

}