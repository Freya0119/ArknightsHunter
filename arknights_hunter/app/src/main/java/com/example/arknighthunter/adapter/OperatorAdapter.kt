package com.example.arknighthunter.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.arknighthunter.databinding.OperatorItemBinding
import com.example.arknighthunter.model.Operator

class OperatorAdapter() : ListAdapter<Operator, OperatorAdapter.OperatorViewHolder>(DiffCallback) {

    class OperatorViewHolder(binding: OperatorItemBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OperatorViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: OperatorViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    companion object DiffCallback : DiffUtil.ItemCallback<Operator>() {
        override fun areItemsTheSame(oldItem: Operator, newItem: Operator): Boolean {
            return oldItem == newItem
        }

        override fun areContentsTheSame(oldItem: Operator, newItem: Operator): Boolean {
            return oldItem == newItem
        }
    }
}