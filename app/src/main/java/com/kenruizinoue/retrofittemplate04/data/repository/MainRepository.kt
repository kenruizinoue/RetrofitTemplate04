package com.kenruizinoue.retrofittemplate04.data.repository

import com.kenruizinoue.retrofittemplate04.data.api.ApiHelper

class MainRepository(private val apiHelper: ApiHelper) {
    suspend fun getUsers() = apiHelper.getUsers()
}