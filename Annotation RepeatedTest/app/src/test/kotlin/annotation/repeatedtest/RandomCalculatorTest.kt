package annotation.repeatedtest


import inheritance.unit.test.resolver.ParentCalculatorTest
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.RepeatedTest
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.junit.jupiter.api.extension.Extensions
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

    // Menggunakan @RepeatedTest
    @DisplayName("Test Calculator Random")
    @RepeatedTest(
        value = 10, // test ini akan diulang-ulang sebanyak 10 kali.

        // Mengambil nama Test dan juga perulangan keberapa serta total perulangan suatu unit test.
        name = "{displayName} perulangan ke {currentRepetition} dari {totalRepetitions} total perulangan."
    )
    fun testRandom(random: Random){
        val a: Int = random.nextInt(100)
        val b: Int = random.nextInt(100)
        val result: Int = calculator.add(first = a, second = b)
        Assertions.assertEquals(a + b, result)
        println("$a + $b = ${a+b}")
        println("= = = = = = = =")

    }
}