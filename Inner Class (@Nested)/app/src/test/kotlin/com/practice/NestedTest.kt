package com.practice

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test
import java.util.*

// Membuat test di dalam test (@Nested)
class NestedTest {

    @Test
    fun testOuterClass(){
        println("Test Outer Class")
    }

    lateinit var queue: Queue<String>

    @Nested
    inner class NestedTest1{

        @Test
        fun testInnerClass(){
            println("Test Inner Class")
        }
    }

}