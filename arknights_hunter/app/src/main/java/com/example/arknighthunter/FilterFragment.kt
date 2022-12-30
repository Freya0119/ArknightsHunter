package com.example.arknighthunter

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.arknighthunter.data.DataSource
import com.example.arknighthunter.databinding.TagFilterFragmentBinding

class FilterFragment : Fragment() {
    private var _binding: TagFilterFragmentBinding? = null
    private val binding get() = _binding!!
    lateinit var recyclerView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = TagFilterFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        recyclerView = binding.tagFilterRecyclerView

//        val adapter = FilterAdapter()
//        val theList = DataSource.tagList
//        adapter.submitList(theList)
//        recyclerView.adapter = adapter

        val adapter = FilterAdapter()
        Log.d("BBB", "count: ${adapter.itemCount}")
        recyclerView.adapter = adapter
    }
}