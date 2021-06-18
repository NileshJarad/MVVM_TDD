package com.tddmvvm.domain

interface LoginUseCase {
    fun doLogin(userName : String, password : String)
    fun doLogin1(userName : String, password : String)
}


class LoginUseCaseImpl : LoginUseCase {
    override fun doLogin(userName: String, password: String) {
        TODO("Not yet implemented")
    }

    override fun doLogin1(userName: String, password: String) {
        TODO("Not yet implemented")
    }

}

