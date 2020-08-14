package com.kenruizinoue.retrofittemplate04.utils

// Parameterized class
data class Resource<T>(val status: Status, val data: T?, val message: String?) {
    companion object {
        // when the data is fetched without an error
        fun <T> success(data: T): Resource<T> =
            Resource(status = Status.SUCCESS, data = data, message = null)

        // when an error occurs
        fun <T> error(data: T?, message: String): Resource<T> =
            Resource(status = Status.ERROR, data = data, message = message)

        // when loading
        fun <T> loading(data: T?): Resource<T> {
            return Resource(status = Status.LOADING, data = data, message = null)
        }
    }
}