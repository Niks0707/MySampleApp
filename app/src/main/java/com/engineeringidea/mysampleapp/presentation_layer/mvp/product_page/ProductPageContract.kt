package com.engineeringidea.mysampleapp.presentation_layer.mvp.product_page

import android.support.annotation.StringRes
import com.engineeringidea.mysampleapp.data_layer.model.Product
import com.engineeringidea.mysampleapp.presentation_layer.mvp.BasePresenter
import com.engineeringidea.mysampleapp.presentation_layer.mvp.BaseView

interface ProductPageContract {

    interface View : BaseView<Presenter> {

        val isActive: Boolean

        fun initViews()

        fun setupViews(product: Product)

        fun showMessage(message: String)

        fun showMessage(@StringRes messageId: Int)

        fun showErrorMessage(message: String)

        fun onAddToBag(productId: Long, selectedColor: String)

    }

    interface Presenter : BasePresenter {

        fun addToBag()

    }
}