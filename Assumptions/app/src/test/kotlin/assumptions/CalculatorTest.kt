package assumptions

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assumptions.*


// Assertions bawaan java
import org.junit.jupiter.api.Assertions.*

// Assertions untuk kotlin.
import org.junit.jupiter.api.*
import org.opentest4j.TestAbortedException

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
        @Test
        fun testAborted(){
            // Ketika tedapat Environment Variable "PROFILE" dan value-nya adalah "DEV" maka test berjalan
            // tapi ketika value-nya lain maka akan @Disabled tapi tidak error.
            val profile: String? = System.getenv()["PROFILE"]
            if ("DEV" != profile) throw TestAbortedException()

            println("Test Not Aborted because Dev Profile")

        }

        // Melakukan Test dengan Assumptions
        // Ketika tedapat Environment Variable "PROFILE" dan value-nya adalah "DEV" maka test berjalan
        // tapi ketika value-nya lain maka akan thrown TestAbortedException sehingga Test-nya @Disabled tapi tidak error.
        @Test
        fun testAssumption(){
            assumeTrue("DEV" == System.getenv()["PROFILE"])
            println("Executed if assumtions true")
        }

}