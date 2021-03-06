package com.engineeringidea.mysampleapp.data_layer.data_source

interface DataSourceListener<in T> {
    fun notifyWillLoadItems()

    fun notifyDidLoadItems(data: T?)

    fun notifyDidLoadItemsWithError(error: String)
}