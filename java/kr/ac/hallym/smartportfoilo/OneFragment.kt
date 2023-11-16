package kr.ac.hallym.smartportfoilo

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import kr.ac.hallym.smartportfoilo.databinding.FragmentOneBinding

class OneFragment : Fragment() {
    val aa = mutableListOf<String>()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        aa.add("")
        val binding = FragmentOneBinding.inflate(inflater, container, false)
        val layoutManager=LinearLayoutManager(activity)
        binding.recyclerview.layoutManager=layoutManager
        val adapter= MyAdapter(aa)
        binding.recyclerview.adapter=adapter

        return binding.root
        //return inflater.inflate(R.layout.fragment_one, container, false)
    }
}