package com.saad.e_commerceapp.global

object GlobalFunctions {
    fun validateName(name: String): String? {
        if (name < "4") {
            return "Name should be greater than 4 characters"
        }
        return null
    }
}