package display.name

import display.name.generator.SimpleDisplayNameGenerator
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DisplayNameGeneration
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

@DisplayNameGeneration(SimpleDisplayNameGenerator::class)
class CalculatorGeneratorTest {

    val calculator: Calculator = Calculator()

    // Test function divide
    @Test
    fun testDivideSucces2(){
        val result = calculator.divide(10, 2)
        Assertions.assertEquals(5, result)

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