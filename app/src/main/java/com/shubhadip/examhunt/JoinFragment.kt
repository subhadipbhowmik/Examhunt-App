package com.shubhadip.examhunt

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast

import com.shubhadip.examhunt.databinding.FragmentJoinBinding
class JoinFragment : Fragment() {
    private  var _binding: FragmentJoinBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentJoinBinding.inflate(inflater, container, false)

        // Inflate the layout for this fragment

        binding.joinWhatsappBtn.setOnClickListener{
            var url = "https://chat.whatsapp.com/BpwU0KqUm8fBsPPrBTbGzK"
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(url)))
        }

        // visit website
        binding.webBtn.setOnClickListener {
            var url = "https://examhuntin.blogspot.com/"
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(url)))
        }

        //   youtube
       binding.youtubeBtn.setOnClickListener {
           var url = "https://www.youtube.com/@SHUBHADIPBHOWMIK"
           startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(url)))
       }

       //  donate us

          binding.donateBtn.setOnClickListener {
              Toast.makeText(requireActivity(), "Please Donate Us", Toast.LENGTH_LONG).show()
          }

        //    contact

        binding.supportBtn.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:" + "+91 7550814404")
            startActivity(intent)
        }

       //   privacy policy

        binding.privacyBtn.setOnClickListener {
            val url = "https://examhuntin.blogspot.com/p/privacy-policy-examhunt.html"
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(url)))
        }

//        terms and conditions

        binding.tocBtn.setOnClickListener {
            val url = "https://examhuntin.blogspot.com/p/privacy-policy-examhunt.html"
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(url)))
        }

        //   About examhunt

        binding.examhuntAboutBtn.setOnClickListener {
            val url = "https://examhuntin.blogspot.com/p/about-us-examhunt.html"
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(url)))
        }

       //        linkedin

        binding.linkedinIcon.setOnClickListener {
            val linkedinUrl = "https://www.linkedin.com/in/shubhadip-bhowmik/"
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(linkedinUrl)))
        }

        //        github

        binding.gitHubIcon.setOnClickListener {
            val url = "https://github.com/subhadipbhowmik"
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(url)))
        }

        //        medium

        binding.mediumIcon.setOnClickListener {
            val url = "https://shubhadipbhowmik.medium.com/"
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(url)))
        }

        //        dev to

        binding.devToIcon.setOnClickListener {
            val url = "https://dev.to/shubhadip_bhowmik"
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(url)))
        }

        //        youtube

        binding.youTubeIcon.setOnClickListener {
            val url = "https://www.youtube.com/SHUBHADIPBHOWMIK"
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(url)))
        }

        //        google

        binding.gmailIcon.setOnClickListener {
            val url = "mailto:shubhadipbhowmik02@gmail.com"
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(url)))
        }


        return  binding.root
    }
}