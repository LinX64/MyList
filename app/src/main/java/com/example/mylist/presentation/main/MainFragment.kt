package com.example.mylist.presentation.main

import androidx.fragment.app.viewModels
import com.example.mylist.databinding.FragmentMainBinding
import com.example.mylist.presentation.base.BaseFragment

class MainFragment : BaseFragment<FragmentMainBinding>(FragmentMainBinding::inflate) {

    private val viewModel by viewModels<MainViewModel>()
    private lateinit var adapter: MainAdapter

    override fun setupUI() {
        super.setupUI()

        setupRecyclerView()
        setupObserver()
    }

    private fun setupRecyclerView() {
        adapter = MainAdapter()
        binding.recyclerView.adapter = adapter
    }

    private fun setupObserver() {
        viewModel.mServerList.observe(viewLifecycleOwner) { adapter.submitList(it) }
    }
}