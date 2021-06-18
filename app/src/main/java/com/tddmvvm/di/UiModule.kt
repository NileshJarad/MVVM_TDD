package com.tddmvvm.di

import com.tddmvvm.LoginViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val uiModule = module {
    viewModel {
        LoginViewModel(get())
    }
}