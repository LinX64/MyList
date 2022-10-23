package com.example.mylist.presentation.main

import androidx.lifecycle.asLiveData
import com.example.mylist.domain.usecase.GetListUseCase
import com.example.mylist.presentation.base.BaseViewModel

class MainViewModel(getListUseCase: GetListUseCase) : BaseViewModel() {

    val mServerList = getListUseCase.getServers().asLiveData()
}
