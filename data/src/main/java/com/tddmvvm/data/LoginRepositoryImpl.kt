package com.tddmvvm.data

import com.tddmvvm.domain.LoginRepository
import com.tddmvvm.domain.UserSessionRepository

class LoginRepositoryImpl(val userSessionRepository: UserSessionRepository) : LoginRepository {
    override suspend fun doLogin(userName: String, password: String) {
        TODO("Not yet implemented")
    }
}