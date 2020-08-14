package com.kenruizinoue.retrofittemplate04.ui.main

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.kenruizinoue.retrofittemplate04.data.repository.MainRepository
import com.kenruizinoue.retrofittemplate04.utils.Resource
import kotlinx.coroutines.Dispatchers.IO

class MainViewModel(private val mainRepository: MainRepository) : ViewModel() {
    // the result of the function will be emitted as LiveData,
    // which can be observed in the view (Activity or Fragment)
    fun getUsers() = liveData(IO) {
        emit(Resource.loading(data = null))
        try {
            emit(Resource.success(data = mainRepository.getUsers()))
        } catch (exception: Exception) {
            // use elvis operator in case exception.message is null
            emit(Resource.error(data = null, message = exception.message ?: "An error occurred!"))
        }
    }
}