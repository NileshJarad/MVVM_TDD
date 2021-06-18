package com.tddmvvm

import com.nhaarman.mockitokotlin2.any
import com.nhaarman.mockitokotlin2.mock
import com.nhaarman.mockitokotlin2.verify
import com.tddmvvm.domain.LoginUseCase
import org.junit.Assert
import org.junit.Test

class LoginViewModelTest {

    private val useCase = mock<LoginUseCase>()

    @Test
    fun `should not invoke use case method`() {
        //GIVEN
        val vm = LoginViewModel(useCase)

        //WHEN
        vm.loginClicked()

        //THEN
        TODO("Need to validate this condition")
        verify(useCase).doLogin(any(), any())
    }

    @Test
    fun `should invoke  user case method`() {
        //GIVEN
        val vm = LoginViewModel(useCase)
        vm.userDetailModel.password = "asdf"
        vm.userDetailModel.userName = "1254"

        //WHEN
        vm.loginClicked()

        //THEN
       Assert.assertTrue(vm.success)
        verify(useCase).doLogin(any(), any())
    }
}