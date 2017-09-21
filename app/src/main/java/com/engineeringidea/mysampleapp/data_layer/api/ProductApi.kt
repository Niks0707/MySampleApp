package com.engineeringidea.mysampleapp.data_layer.api

import com.engineeringidea.mysampleapp.data_layer.model.Product
import retrofit2.Call
import retrofit2.http.GET

interface ProductApi {
    @get:GET("59c3852b1100000f0099cb21/")
    val product: Call<Product>
}