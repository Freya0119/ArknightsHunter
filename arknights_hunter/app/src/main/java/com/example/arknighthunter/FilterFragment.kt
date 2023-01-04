package com.example.arknighthunter

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.arknighthunter.adapter.FilterAdapter
import com.example.arknighthunter.databinding.TagFilterFragmentBinding
import com.example.arknighthunter.viewmodel.FilterViewModel

class FilterFragment : Fragment() {
    private var _binding: TagFilterFragmentBinding? = null
    private val binding get() = _binding!!
    private lateinit var filter_recyclerView: RecyclerView
    private lateinit var operators_recyclerView: RecyclerView

    private val viewModel = FilterViewModel()

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

        filter_recyclerView = binding.tagFilterRecyclerView
        operators_recyclerView = binding.operatorsRecyclerView

//        val adapter = FilterAdapter()
//        val theList = DataSource.tagList
//        adapter.submitList(theList)
//        recyclerView.adapter = adapter

//        //TODO: for test
//        viewModel.setTag("先锋")
//        viewModel.setTag("近战位")
//        viewModel.setTag("先锋")
        //TODO: for test2
        viewModel.setTags("先锋")
        viewModel.setTags("近战位")
        viewModel.setTags("先锋")

        val adapter = FilterAdapter()
        filter_recyclerView.adapter = adapter
        operators_recyclerView.adapter = adapter
    }
}