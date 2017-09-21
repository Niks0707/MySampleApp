package com.engineeringidea.mysampleapp.data_layer.model

import com.google.gson.annotations.SerializedName


class Product {

    @SerializedName("id")
    val id: Long? = null
    @SerializedName("name")
    val name: String? = null
    @SerializedName("description")
    val description: String? = null
    @SerializedName("price")
    val price: Float? = null
    @SerializedName("images")
    val images: List<Image>? = null
    @SerializedName("colors")
    val colors: List<Color>? = null

}
