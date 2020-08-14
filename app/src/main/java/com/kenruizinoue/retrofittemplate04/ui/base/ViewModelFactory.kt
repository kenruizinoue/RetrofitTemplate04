package com.kenruizinoue.retrofittemplate04.ui.base

import com.kenruizinoue.retrofittemplate04.data.api.ApiHelper
import com.kenruizinoue.retrofittemplate04.data.repository.MainRepository
import com.kenruizinoue.retrofittemplate04.ui.main.MainViewModel
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class ViewModelFactory(private val apiHelper: ApiHelper) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MainViewModel::class.java)) {
            return MainViewModel(MainRepository(apiHelper)) as T
        }
        throw IllegalAccessException("Unknown class name")
    }
}