package com.example.plantillaproyectoandroidkotlin

object RegistrationUtil {

    private val existingUsers = listOf("Peter","Carl")

    /**
     * The input is not valid if
     *      the username/password/confirmedPassword is empty
     *      the username is already taken
     *      the confirm password is not the same as the password
     *      the password contains less than 2 digits
     */
    fun validateRegistrationInput(
        username: String,
        password: String,
        confirmedPassword: String
    ): Boolean {
        if (username.isEmpty() or password.isEmpty() or confirmedPassword.isEmpty()) { return false }
        if (username in existingUsers) { return false }
        if (password != confirmedPassword) { return false }
        if (password.length < 2) { return false }
        return true
    }

}