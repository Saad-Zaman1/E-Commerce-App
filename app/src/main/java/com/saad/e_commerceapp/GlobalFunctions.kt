package com.saad.e_commerceapp

object GlobalFunctions {
    fun isNameValid(name: String): String {
        val regex = Regex("^[a-zA-Z]+$")

        return if (name.length < 4) {
            "Length must be greater then 4"
        } else if (!regex.matches(name)) {
            "Name contains special characters or numbers."
        } else {
            name
        }
    }

    fun isEmailValid(email: String): String {
        val emailRegex = Regex("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Z|a-z]{2,}\$")

        return when {
            email.length < 4 -> "Email length must be greater than 4"
            !emailRegex.matches(email) -> "Invalid email format"
            else -> email
        }
    }

    fun isPasswordValid(password: String): String {
        val passwordRegex =
            Regex("^(?=.*[A-Z])(?=.*\\d)(?=.*[!@#\$%^&*()-_+=])[A-Za-z\\d!@#\$%^&*()-_+=]{8,}$")

        return when {
            password.length < 8 -> "Password must be at least 8 characters"
            !passwordRegex.matches(password) -> "Password should contains at least 1 special character 1 capital letter 1 number"
            else -> password
        }
    }
}