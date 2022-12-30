package com.example.arknighthunter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.View.inflate
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.example.arknighthunter.data.DataSource
import com.example.arknighthunter.databinding.ActivityMainBinding.inflate
import com.example.arknighthunter.databinding.TagFilterItemBinding

//class FilterAdapter : ListAdapter<String, FilterAdapter.FilterAdapterViewHolder>(DiffCallback) {
//
//    class FilterAdapterViewHolder(private var binding: TagFilterItemBinding) :
//        RecyclerView.ViewHolder(binding.root) {
//
//        fun bind(tag: String) {
//            binding.tagNameTextview.text = tag
////            binding.executePendingBindings()
//        }
//    }
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FilterAdapterViewHolder {
//        val layoutInflater = LayoutInflater.from(parent.context)
//        return FilterAdapterViewHolder(TagFilterItemBinding.inflate(layoutInflater, parent, false))
//    }
//
//    override fun onBindViewHolder(holder: FilterAdapterViewHolder, position: Int) {
//        val tag = getItem(position)
//        holder.bind(tag)
//    }
//
//    companion object DiffCallback : DiffUtil.ItemCallback<String>() {
//        override fun areItemsTheSame(oldItem: String, newItem: String): Boolean {
//            return oldItem == newItem
//        }
//
//        override fun areContentsTheSame(oldItem: String, newItem: String): Boolean {
//            return oldItem == newItem
//        }
//    }
//}

class FilterAdapter(clickListener: ClickListener) :
    Adapter<FilterAdapter.FilterAdapterViewHolder>() {
    class FilterAdapterViewHolder(var binding: TagFilterItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(tag: String) {
            binding.tagNameTextview.text = tag
        }
    }

    private val tags = DataSource.tagList

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FilterAdapterViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return FilterAdapterViewHolder(TagFilterItemBinding.inflate(inflater, parent, false))
    }

    override fun onBindViewHolder(holder: FilterAdapterViewHolder, position: Int) {
        val item = tags[position]
        holder.bind(item)
    }

    override fun getItemCount(): Int {
        return tags.size
    }
}

class ClickListener(tag: String)