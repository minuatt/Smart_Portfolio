package kr.ac.hallym.smartportfoilo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import kr.ac.hallym.smartportfoilo.databinding.FragmentTwoBinding

class ThreeFragment : Fragment() {
    val cc = mutableListOf<String>()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        cc.add("")
        val binding = FragmentTwoBinding.inflate(inflater, container, false)
        val layoutManager= LinearLayoutManager(activity)
        binding.recyclerview2.layoutManager=layoutManager
        val adapter= MyAdapter3(cc)
        binding.recyclerview2.adapter=adapter

        return binding.root
        //return inflater.inflate(R.layout.fragment_one, container, false)
    }
}