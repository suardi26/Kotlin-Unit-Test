package annotation.parameterizedtest


import com.sun.jdi.Value
import inheritance.unit.test.resolver.ParentCalculatorTest
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.RepeatedTest
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.junit.jupiter.api.extension.Extensions
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource
import org.junit.jupiter.params.provider.ValueSource
import java.util.*
import kotlin.math.max


// Tidak perlu lagi menambahkan @Extensions dan juga function  beforeEach(), karena sudah ada pada parent-nya dan
// diwarisi setiap class test yang menjadi Child-nya.

//@Extensions(value = [
//    ExtendWith(RandomParameterResolver::class)
//])


class RandomCalculatorTest: ParentCalculatorTest() {

    //  variable calculator juga tidak perlu ditambahkan kerena sudah ada dari parent-nya.
    //  private val calculator = Calculator()

    // Menggunakan @ParameterizedTest =>  @ValueSource
    @DisplayName("Test Calculator @ValueSource")
    @ParameterizedTest(
        // Mengambil nama Test dan juga perulangan keberapa pada suatu unit test.
        name = "{displayName} with data {0}"
    )
    // test akan dieksekusi sesuai jumlah dari value array dari @ValueSource
    @ValueSource(ints = [1, 2, 3, 4, 5]) // Kalau data Int maka Parameter pada function test harus Int.
    fun testWithParameter(value: Int){
        val result = value + value
        println(result)
        Assertions.assertEquals(result, calculator.add(value, value))
        println("= = = = = = = =")

    }

    // Menggunakan @ParameterizedTest =>  @MethodSource
    @DisplayName("Test Calculator @MethodSource")
    @ParameterizedTest(
        // Mengambil nama Test dan juga perulangan keberapa pada suatu unit test.
        name = "{displayName} with data {0}"
    )
    @MethodSource(value = ["parameterSource"])
    // paremeternya harus sesuai dengan return value object function yang dimasukan, misalnya Int maka paramternya Int.
    fun testWithMethodSource(value: Int){
        val result = value + value
        println(result)
        Assertions.assertEquals(value + value, calculator.add(value, value))
        println("= = = = = = = =")
    }

    companion object{
        @JvmStatic
        fun parameterSource(): List<Int>{
            return listOf(1, 2, 3, 4, 5)
        }
    }
}