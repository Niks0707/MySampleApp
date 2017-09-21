package com.engineeringidea.mysampleapp.presentation_layer.product_page

interface ProductPageListener {
    fun onAddToBag(productId: Long, selectedColor: String)
}