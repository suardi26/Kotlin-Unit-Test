package annotation.disabled

import org.junit.jupiter.api.Test

// Assertions bawaan java
import org.junit.jupiter.api.Assertions.*

// Assertions untuk kotlin.
import org.junit.jupiter.api.*

class CalculatorTest {
    val calculator: Calculator = Calculator()

    // Test function add
        @Test
        fun testAddSuccess(){
            val result: Int = calculator.add(first = 1, second = 2)

            // Memanggil static function dari Assertions
            // ekspektasinya 3 dan hasilnya 3 beserta dengan pesannya
            assertEquals(3, result, "Hasil yang benar adalah 3")
        }

        @Test
        fun testAddSuccess2(){
            val result: Int = calculator.add(first = 2, second = 2)
            assertEquals(4, result, "Hasil yang benar adalah 4")
        }

        @Test
        @Disabled("Test Belum Selesai !!!")
        fun testNotComplete(){
            // Test belum selesai.
        }


}