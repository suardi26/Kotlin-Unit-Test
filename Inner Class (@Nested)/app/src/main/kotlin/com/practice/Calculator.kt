package com.practice

class Calculator {
    fun add(first: Int, second: Int): Int{
        return first + second
    }

    fun divide(first: Int, second: Int): Int{
        if (second == 0) throw IllegalArgumentException("Tidak dapat dibagi dengan angka 0 !!!")
        else return first / second
    }
}