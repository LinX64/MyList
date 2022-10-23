package com.example.mylist.di

import com.example.mylist.data.repository.MainRepositoryImpl
import com.example.mylist.presentation.main.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {

    single { MainRepositoryImpl() }

    viewModel { MainViewModel(get()) }
}