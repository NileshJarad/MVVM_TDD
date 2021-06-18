package com.tddmvvm.data

import com.tddmvvm.domain.LoginRepository
import com.tddmvvm.domain.UserSessionRepository
import org.koin.dsl.bind
import org.koin.dsl.module

val dataModule = module {
    single { UserSessionRepositoryImpl(get()) } bind UserSessionRepository::class
    single { LoginRepositoryImpl(get()) } bind LoginRepository::class
}