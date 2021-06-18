package com.tddmvvm

import androidx.lifecycle.ViewModel
import com.tddmvvm.domain.LoginUseCase


// cntl +shift + t
// cmd +shift + t
class LoginViewModel(
    val loginUseCase: LoginUseCase
) : ViewModel() {

    val userDetailModel = UserDetailModel()


    var success = false

    fun loginClicked() {

        success = userDetailModel.userName.isNotEmpty() && userDetailModel.password.isNotEmpty()

        if(success) {
            loginUseCase.doLogin("", "")
        }
    }
}