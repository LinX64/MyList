package com.example.mylist.domain.usecase

import com.example.mylist.data.repository.MainRepositoryImpl

class GetListUseCase(private val mainRepository: MainRepositoryImpl) {

    fun getServers() = mainRepository.getServerList()
}