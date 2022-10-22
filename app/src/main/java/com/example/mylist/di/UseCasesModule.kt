package com.example.mylist.di

import com.example.mylist.domain.usecase.GetListUseCase
import org.koin.dsl.module

val useCaseModule = module {

    single { GetListUseCase(get()) }
}