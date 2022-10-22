package com.example.mylist.presentation.main

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.mylist.databinding.ItemLayoutBinding
import com.example.mylist.domain.model.Servers

class MainAdapter : ListAdapter<Servers, MainAdapter.MyViewHolder>(MainDiffUtil()) {

    inner class MyViewHolder(
        private val binding: ItemLayoutBinding
    ) : RecyclerView.ViewHolder(binding.root) {
        fun bind(servers: Servers) {
            binding.apply {
                serverName.text = servers.name
                serverIP.text = servers.ip
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val binding = ItemLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MyViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) =
        holder.bind(getItem(position))

    class MainDiffUtil : DiffUtil.ItemCallback<Servers>() {
        override fun areItemsTheSame(oldItem: Servers, newItem: Servers): Boolean {
            return oldItem == newItem
        }

        override fun areContentsTheSame(oldItem: Servers, newItem: Servers): Boolean {
            return oldItem == newItem
        }
    }
}