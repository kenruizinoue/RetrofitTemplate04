package com.kenruizinoue.retrofittemplate04.data.api

// helper class for consuming apiService
class ApiHelper(private val apiService: ApiService) {
    suspend fun getUsers() = apiService.getUsers()
}