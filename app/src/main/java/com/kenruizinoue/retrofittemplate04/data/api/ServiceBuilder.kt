package com.kenruizinoue.retrofittemplate04.data.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ServiceBuilder {

    private const val BASE_URL = "https://5e510330f2c0d300147c034c.mockapi.io/"

    private fun getRetrofitService(): Retrofit {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val apiService: ApiService = getRetrofitService().create(ApiService::class.java)
}