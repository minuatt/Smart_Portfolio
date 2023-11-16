package kr.ac.hallym.smartportfoilo

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import kr.ac.hallym.smartportfoilo.databinding.FragmentOneBinding
import kr.ac.hallym.smartportfoilo.databinding.FragmentTwoBinding

class TwoFragment : Fragment() {
    val bb = mutableListOf<String>()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        bb.add("")
        val binding = FragmentTwoBinding.inflate(inflater, container, false)
        val layoutManager=LinearLayoutManager(activity)
        binding.recyclerview2.layoutManager=layoutManager
        val adapter= MyAdapter2(bb)
        binding.recyclerview2.adapter=adapter

        return binding.root
        //return inflater.inflate(R.layout.fragment_one, container, false)
    }
}