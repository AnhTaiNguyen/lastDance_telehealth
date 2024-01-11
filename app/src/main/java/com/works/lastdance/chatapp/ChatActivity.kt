package com.works.lastdance.chatapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.chatapp.adapter.ViewPagerAdapter

import com.works.lastdance.chatapp.ui.ChatFragment


import com.google.firebase.auth.FirebaseAuth
import com.works.lastdance.databinding.ActivityChatBinding

class ChatActivity : AppCompatActivity() {


    private  var binding: ActivityChatBinding? =null
    private lateinit var auth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityChatBinding.inflate(layoutInflater)
        setContentView(binding!!.root)
        val fragmentArrayList = ArrayList<Fragment>()
        
        fragmentArrayList.add(ChatFragment())


//        auth = FirebaseAuth.getInstance()
//        if (auth.currentUser==null){
//            startActivity(Intent(this, NumberActivity::class.java))
//            finish()
//        }

        val adapter = ViewPagerAdapter(context = this, supportFragmentManager, fragmentArrayList)
        
//        binding!!..adapter = adapter
//        binding!!.tabs.setupWithViewPager((binding!!.viewPager))
        
        
    }
}

