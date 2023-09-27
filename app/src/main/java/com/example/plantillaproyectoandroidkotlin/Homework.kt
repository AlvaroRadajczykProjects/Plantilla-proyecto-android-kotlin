package com.example.plantillaproyectoandroidkotlin

object Homework {

    /**
     * Returns the n-th fibonacci number
     * They are defined like this:
     * f(0) = 0
     * f(1) = 1
     * fib(n) = fib(n-2) + fib(n-1)
     */
    fun fib(n: Int): Long {
        if( n == 0 || n == 1 ){ return n.toLong() }
        var a = 0L
        var b = 1L
        var c = 1L
        //with n-1 instead of n-2 works
        (1..n-2).forEach { i ->
            c = a + b
            a = b
            b = c
        }
        return c
    }

    /**
     * Checks if the braces are set correctly. E.g.: "(a * b))" should return false
     */
    fun checkBraces(string: String): Boolean {
        return string.count { it == '(' } == string.count { it == ')' }
    }

}