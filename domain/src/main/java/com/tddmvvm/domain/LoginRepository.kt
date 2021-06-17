package com.tddmvvm.domain

interface LoginRepository {
    suspend fun doLogin(userName: String, password: String)
}