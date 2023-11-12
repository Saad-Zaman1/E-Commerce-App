package com.saad.e_commerceapp

interface A {
    fun foo()
}

interface B {
    fun foo()
}

class Test : A, B {
    override fun foo() {
        println("This is the implementation of foo from class Test A")
    }
}

fun main() {
    val obj = Test()
    
}