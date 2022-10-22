package com.example.mylist.di

import com.example.mylist.data.repository.MainRepositoryImpl
import com.example.mylist.domain.repository.MainRepository
import com.example.mylist.presentation.main.MainViewModel
import org.koin.android.ext.koin.androidApplication
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {

    single { MainRepositoryImpl() }

    viewModel { MainViewModel(get(), app = androidApplication()) }
}