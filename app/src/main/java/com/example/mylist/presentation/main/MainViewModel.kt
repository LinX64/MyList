package com.example.mylist.presentation.main

import android.app.Application
import androidx.lifecycle.asLiveData
import com.example.mylist.domain.usecase.GetListUseCase
import com.example.mylist.presentation.base.BaseViewModel

class MainViewModel(getListUseCase: GetListUseCase, app: Application) :
    BaseViewModel(app) {

    val mServerList = getListUseCase.getServers().asLiveData()
}
