package beforeeach.aftereach

import org.junit.jupiter.api.Test

// Assertions bawaan java
import org.junit.jupiter.api.Assertions.*

// Assertions untuk kotlin.
import org.junit.jupiter.api.*

class CalculatorTest {
    companion object CalculatorTest{
        // function dengan @BeforeAll
        @BeforeAll
        @JvmStatic // memberikan informasi bahwa function ini akan di-generate menjadi java static function.
        fun beforeAll(){
            println("Dijalankan Sebelum Semua Unit Test dijalankan")
        }

        // function dengan @AfterAll
        @AfterAll
        @JvmStatic // memberikan informasi bahwa function ini akan di-generate menjadi java static function.
        fun afterAll(){
            println("Dijalankan Sesudah Semua Unit Test dijalankan")
        }

    }

    val calculator: Calculator = Calculator()

    // function dengan @BeforeEach
        @BeforeEach
        fun beforeEach(){
            println("Dijalankan Sebelum Unit Test dijalankan")
        }

    // function dengan @AferEach
        @AfterEach
        fun afterEach(){
            println("Dijalankan Sesudah Unit Test dijalankan")
        }

    // Test function add
        @Test
        fun testAddSuccess(){
            println("Unit Test : testAddSuccess()")
            val result: Int = calculator.add(first = 1, second = 2)

            // Memanggil static function dari Assertions
            // ekspektasinya 3 dan hasilnya 3 beserta dengan pesannya
            assertEquals(3, result, "Hasil yang benar adalah 3")
        }

        @Test
        fun testAddSuccess2(){
            println("Unit Test : testAddSuccess2()")
            val result: Int = calculator.add(first = 2, second = 2)
            assertEquals(4, result, "Hasil yang benar adalah 4")
        }

        @Test
        @Disabled("Test Belum Selesai !!!")
        fun testNotComplete(){
            // Test belum selesai.
        }


}