package com.tddmvvm.domain.di

import com.tddmvvm.domain.LoginUseCase
import com.tddmvvm.domain.LoginUseCaseImpl
import org.koin.dsl.bind
import org.koin.dsl.module

val domainModule = module {
    single {
        LoginUseCaseImpl()
    } bind LoginUseCase::class
}