package com.example.plantillaproyectoandroidkotlin

import org.junit.Assert.*
import org.junit.Test

class HomeworkTest {

    @Test
    fun fibonnaciCase0_ReturnFalse(){
        assertFalse( Homework.fib(0) != 0.toLong() )
    }

    @Test
    fun fibonnaciCase0_ReturnTrue(){
        assertTrue( Homework.fib(0) == 0.toLong() )
    }

    @Test
    fun fibonnaciCase1_ReturnFalse(){
        assertFalse( Homework.fib(1) != 1.toLong() )
    }

    @Test
    fun fibonnaciCase1_ReturnTrue(){
        assertTrue( Homework.fib(1) == 1.toLong() )
    }

    @Test
    fun fibbonaciGeneralCase_ReturnTrue(){
        var res: Boolean = true
        for(n in 1..4) {
            if( Homework.fib(n) != (Homework.fib(n-1) + Homework.fib(n-2)) ){
                res = false
                break
            }
        }
        assertTrue( res )
    }

    @Test
    fun checkBraces_ReturnFalse(){
        assertFalse( Homework.checkBraces("(a*b))") )
    }

    @Test
    fun checkBraces_ReturnFalse2(){
        assertFalse( Homework.checkBraces(")(") )
    }

    @Test
    fun checkBraces_ReturnTrue(){
        assertTrue( Homework.checkBraces("((a*b)+c)") )
    }

}