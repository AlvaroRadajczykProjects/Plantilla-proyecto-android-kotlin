package com.example.plantillaproyectoandroidkotlin

import org.junit.Assert.*
import org.junit.Test

class RegistrationUtilTest {

    @Test
    fun emptyUsername_ReturnFalse() {
        val result = RegistrationUtil.validateRegistrationInput(
            "",
            "123",
            "123"
        )
        //assertThat(result).isFalse()
        //assertTrue(!result)
        assertFalse(result)
    }

    @Test
    fun emptyPasword_ReturnFalse() {
        val result = RegistrationUtil.validateRegistrationInput(
            "Phillip",
            "",
            "123"
        )
        //assertThat(result).isFalse()
        //assertTrue(!result)
        assertFalse(result)
    }


    @Test
    fun emptyConfirmPassword_ReturnFalse() {
        val result = RegistrationUtil.validateRegistrationInput(
            "Phillip",
            "123",
            ""
        )
        //assertThat(result).isFalse()
        //assertTrue(!result)
        assertFalse(result)
    }

    @Test
    fun usernameAlreadyExists_ReturnFalse() {
        val result = RegistrationUtil.validateRegistrationInput(
            "Peter",
            "123",
            "123"
        )
        assertFalse(result)
    }

    @Test
    fun confirmPasswordNotSamePassword_ReturnFalse() {
        val result = RegistrationUtil.validateRegistrationInput(
            "Phillip",
            "123",
            "124"
        )
        assertFalse(result)
    }

    @Test
    fun confirmPasswordLessThanTwoDigits_ReturnFalse() {
        val result = RegistrationUtil.validateRegistrationInput(
            "Phillip",
            "1",
            "124"
        )
        assertFalse(result)
    }

    @Test
    fun everythingOk_ReturnTrue() {
        val result = RegistrationUtil.validateRegistrationInput(
            "Phillip",
            "123",
            "123"
        )
        assertTrue(result)
    }

}