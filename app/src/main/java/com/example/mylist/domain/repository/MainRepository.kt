package com.example.mylist.domain.repository

import com.example.mylist.domain.model.Servers
import kotlinx.coroutines.flow.Flow

interface MainRepository {

    fun getServerList(): Flow<List<Servers>>
}