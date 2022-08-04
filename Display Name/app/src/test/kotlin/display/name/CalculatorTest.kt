package display.name

import org.junit.jupiter.api.Test

// Assertions bawaan java
import org.junit.jupiter.api.Assertions.*

// Assertions untuk kotlin.
import org.junit.jupiter.api.*

@DisplayName("test calculator")
class CalculatorTest {
    val calculator: Calculator = Calculator()

    // Test function add
        @Test
        @DisplayName("Test function Calculator.add(first = 1, second = 2)")
        fun testAddSuccess(){
            val result: Int = calculator.add(first = 1, second = 2)

            // Memanggil static function dari Assertions
            // ekspektasinya 3 dan hasilnya 3 beserta dengan pesannya
            assertEquals(3, result, "Hasil yang benar adalah 3")
        }

        @Test
        @DisplayName("Test function Calculator.add(first = 2, second = 2)")
        fun testAddSuccess2(){
            val result: Int = calculator.add(first = 2, second = 2)
            assertEquals(4, result, "Hasil yang benar adalah 4")
        }

    // Test function divide
        @Test
        fun testDivideSucces2(){
            val result = calculator.divide(10, 2)
            assertEquals(5, result)

        }

        @Test
        fun testDivideError(){
            // Menggunakan object function dari Assertions.kt
            // Untuk menangkap Exception dan ekspektasinya terjadi Error/Exception, Ketika tidak ada Exception maka gagal.
            assertThrows<IllegalArgumentException>() {
                calculator.divide(100, 0)
            }
        }
}