package com.example.mylist.presentation.main

import android.widget.Toast
import com.example.mylist.databinding.FragmentMainBinding
import com.example.mylist.domain.model.Servers
import com.example.mylist.presentation.base.BaseFragment
import org.koin.android.ext.android.inject

class MainFragment :
    BaseFragment<FragmentMainBinding, MainViewModel>(FragmentMainBinding::inflate) {

    override val mViewModel: MainViewModel by inject()

    private lateinit var adapter: MainAdapter

    override fun setupUI() {
        super.setupUI()

        setupRecyclerView()
        setupObserver()
    }

    private fun setupRecyclerView() {
        adapter = MainAdapter(this::onItemClick)
        binding.recyclerView.adapter = adapter
    }

    private fun onItemClick(servers: Servers) {
        Toast.makeText(requireContext(), "Item " + servers.name + " Clicked!", Toast.LENGTH_SHORT)
            .show()
    }

    private fun setupObserver() {
        mViewModel.mServerList.observe(viewLifecycleOwner) { adapter.submitList(it) }
    }
}
