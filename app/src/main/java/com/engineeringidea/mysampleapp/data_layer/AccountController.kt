package com.engineeringidea.mysampleapp.data_layer

import com.engineeringidea.mysampleapp.data_layer.model.User

class AccountController {

    private var user: User? = null

    fun saveUser(user: User) {
        this.user = user
    }

    fun fetchUser(): User? {
        return user
    }


}