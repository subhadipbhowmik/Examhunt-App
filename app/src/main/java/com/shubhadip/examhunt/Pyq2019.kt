package com.shubhadip.examhunt

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.shubhadip.examhunt.databinding.FragmentPyq2019Binding
import com.shubhadip.examhunt.databinding.FragmentPyq2020Binding


class Pyq2019 : Fragment() {
    private  var _binding: FragmentPyq2019Binding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentPyq2019Binding.inflate(inflater, container, false)

        // bengali pdf 2019

        binding.pyqBeng2019Btn.setOnClickListener {
            Toast.makeText(requireActivity(), "Downloading PDF", Toast.LENGTH_SHORT).show()

            var pyqBen2019PDFurl = "https://drive.google.com/uc?export=download&id=1p2sgi-Z-pv5jLgSQM1DwbAi5JBX2Q5uq"
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(pyqBen2019PDFurl)))
        }

        // english pdf 2019

        binding.pyqEng2019Btn.setOnClickListener {
            Toast.makeText(requireActivity(), "Downloading PDF", Toast.LENGTH_SHORT).show()

            var pyqEng2019PDFurl = "https://drive.google.com/uc?export=download&id=1p2sgi-Z-pv5jLgSQM1DwbAi5JBX2Q5uq"
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(pyqEng2019PDFurl)))
        }


        // math pdf 2019

        binding.pyqMath2019Btn.setOnClickListener {
            Toast.makeText(requireActivity(), "Downloading PDF", Toast.LENGTH_SHORT).show()

            var pyqMath2019PDFurl = "https://drive.google.com/uc?export=download&id=1p2sgi-Z-pv5jLgSQM1DwbAi5JBX2Q5uq"
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(pyqMath2019PDFurl)))
        }

        // history pdf 2019

        binding.pyqHistory2019Btn.setOnClickListener {
            Toast.makeText(requireActivity(), "Downloading PDF", Toast.LENGTH_SHORT).show()

            var pyqHis2019PDFurl = "https://drive.google.com/uc?export=download&id=1p2sgi-Z-pv5jLgSQM1DwbAi5JBX2Q5uq"
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(pyqHis2019PDFurl)))
        }

        // geography pdf 2019

        binding.pyqGeo2019Btn.setOnClickListener {
            Toast.makeText(requireActivity(), "Downloading PDF", Toast.LENGTH_SHORT).show()

            var pyqGeo2019PDFurl = "https://drive.google.com/uc?export=download&id=1p2sgi-Z-pv5jLgSQM1DwbAi5JBX2Q5uq"
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(pyqGeo2019PDFurl)))
        }

        // Physics pdf 2019

        binding.pyqPhysics2019Btn.setOnClickListener {
            Toast.makeText(requireActivity(), "Downloading PDF", Toast.LENGTH_SHORT).show()

            var pyqPhy2019PDFurl = "https://drive.google.com/uc?export=download&id=1p2sgi-Z-pv5jLgSQM1DwbAi5JBX2Q5uq"
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(pyqPhy2019PDFurl)))
        }

        // Biology pdf 2019

        binding.pyqBiology2019Btn.setOnClickListener {
            Toast.makeText(requireActivity(), "Downloading PDF", Toast.LENGTH_SHORT).show()

            var pyqBio2019PDFurl = "https://drive.google.com/uc?export=download&id=1p2sgi-Z-pv5jLgSQM1DwbAi5JBX2Q5uq"
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(pyqBio2019PDFurl)))
        }


        return binding.root
    }

}