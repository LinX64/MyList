package com.example.mylist.data.repository

import com.example.mylist.domain.model.Servers
import com.example.mylist.domain.repository.MainRepository
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn

class MainRepositoryImpl(
    private val ioDispatcher: CoroutineDispatcher = Dispatchers.IO
) : MainRepository {

    override fun getServerList(): Flow<List<Servers>> = flow {
        delay(1000)

        val fakeList = listOf(
            Servers(name = "UK#1", ipAddress = "192.168.1.1"),
            Servers(name = "US#1", ipAddress = "192.168.1.2"),
            Servers(name = "DE#1", ipAddress = "192.168.1.3"),
            Servers(name = "DE#2", ipAddress = "192.168.1.4"),
            Servers(name = "FR#1", ipAddress = "192.168.1.5"),
            Servers(name = "ES#1", ipAddress = "192.168.1.6"),
            Servers(name = "NL#1", ipAddress = "192.168.1.7"),
            Servers(name = "PL#1", ipAddress = "192.168.1.8")
        )

        return@flow emit(fakeList)
    }.flowOn(ioDispatcher)
}