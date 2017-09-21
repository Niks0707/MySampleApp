package com.engineeringidea.mysampleapp.data_layer.api

import com.engineeringidea.mysampleapp.data_layer.model.User
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.HeaderMap

interface SignInApi {
    @GET("/")
    fun signIn(@HeaderMap headers: Map<String, String>): Call<User>
}