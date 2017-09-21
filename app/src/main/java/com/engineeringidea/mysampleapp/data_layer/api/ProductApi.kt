package com.engineeringidea.mysampleapp.data_layer.api

import com.engineeringidea.mysampleapp.data_layer.model.Product
import retrofit2.Call
import retrofit2.http.GET

interface ProductApi {
    @get:GET("/")
    val product: Call<Product>
}