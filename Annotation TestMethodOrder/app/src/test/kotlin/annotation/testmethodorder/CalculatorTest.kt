package annotation.testmethodorder



import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.condition.*
import kotlin.math.max

// @TestMethodOrder(value = MethodOrderer.Alphanumeric::class) untuk sorting method unit test berdasarkan alphanumeric.
// Alphanumeric Deprecated digantikan oleh class MethodName
// @TestMethodOrder(value = MethodOrderer.MethodName::class)

// @TestMethodOrder(value = MethodOrderer.Random::class) eksekusi unit test dilakukan secara random.

// Menggunakan order annotation
@TestMethodOrder(value = MethodOrderer.OrderAnnotation::class)
class CalculatorTest {

    @Test
    @Order(2)
    fun test2(){
        println("test 2")
    }

    @Test
    @Order(1)
    fun test3(){
        println("test 3")
    }

    @Test
    @Order(3)
    fun test1(){
        println("test 1")
    }
}