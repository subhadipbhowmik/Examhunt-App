package com.shubhadip.examhunt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.shubhadip.examhunt.databinding.ActivityMainBinding

private  val homeFragment = HomeFragment()
private  val pyqFragment = PyqFragment()
private  val tipsFragment = TipsFragment()
private  val joinFragment = JoinFragment()

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottom_navigation_bar)
        replaceFragment(homeFragment)

        bottomNavigationView.setOnItemSelectedListener {
            when(it.itemId){
                R.id.item_home -> replaceFragment(homeFragment)
                R.id.item_pyq -> replaceFragment(pyqFragment)
                R.id.item_tips -> replaceFragment(tipsFragment)
                R.id.item_join -> replaceFragment(joinFragment)
            }
            true
        }

    }

    private fun replaceFragment(fragment : Fragment){

        if(fragment!= null){
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.frame_layout, fragment)
            transaction.commit()
        }

    }

}