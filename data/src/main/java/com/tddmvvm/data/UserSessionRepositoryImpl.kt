package com.tddmvvm.data

import android.app.Application
import com.tddmvvm.domain.UserSessionRepository

class UserSessionRepositoryImpl(val application: Application) : UserSessionRepository {
    override fun saveUserName(userName: String) {
        TODO("Not yet implemented")
    }

    override fun getUserName(userName: String) {
        TODO("Not yet implemented")
    }

    override fun savePassword(password: String) {
        TODO("Not yet implemented")
    }

    override fun getPassword(password: String) {
        TODO("Not yet implemented")
    }

    override fun saveLoggedInStatus(loggedIn: Boolean) {
        TODO("Not yet implemented")
    }

    override fun getLoggedInStatus(loggedIn: Boolean) {
        TODO("Not yet implemented")
    }
}