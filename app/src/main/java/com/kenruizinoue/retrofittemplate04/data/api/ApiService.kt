package com.kenruizinoue.retrofittemplate04.data.api

import com.kenruizinoue.retrofittemplate04.data.model.User
import retrofit2.http.GET

interface ApiService {
    // use the suspend keyword to perform GET inside the coroutine scope
    @GET("users")
    suspend fun getUsers(): List<User>
}