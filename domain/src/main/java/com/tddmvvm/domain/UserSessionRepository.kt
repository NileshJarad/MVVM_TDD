package com.tddmvvm.domain


const val USER_NAME = "user_name"
const val PASSWORD = "password"
const val LOGGED_IN = "logged"

interface UserSessionRepository {
    fun saveUserName(userName: String)
    fun getUserName(userName: String)
    fun savePassword(password: String)
    fun getPassword(password: String)
    fun saveLoggedInStatus(loggedIn: Boolean)
    fun getLoggedInStatus(loggedIn: Boolean)
}