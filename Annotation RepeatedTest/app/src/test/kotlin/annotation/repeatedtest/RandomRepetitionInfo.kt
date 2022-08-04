package annotation.repeatedtest

import inheritance.unit.test.resolver.ParentCalculatorTest
import org.junit.jupiter.api.*
import java.util.*

class RandomRepetitionInfo : ParentCalculatorTest() {

    // Menggunakan @RepeatedTest
    @DisplayName("Test Calculator Random")
    @RepeatedTest(
        value = 10, // test ini akan diulang-ulang sebanyak 10 kali.

        // Mengambil nama Test dan juga perulangan keberapa serta total perulangan suatu unit test.
        name = "{displayName} perulangan ke {currentRepetition} dari {totalRepetitions} total perulangan."
    )
    fun testRandom(random: Random, repetitionInfo: RepetitionInfo, testInfo: TestInfo){

        // Mendapatkan Informasi Perulangan Unit test Melalui parameter RepetitionInfo
        println("${testInfo.displayName} perulangan ke ${repetitionInfo.currentRepetition} dari " +
                 "${repetitionInfo.totalRepetitions} total perulangan.")

        val a: Int = random.nextInt(100)
        val b: Int = random.nextInt(100)
        val result: Int = calculator.add(first = a, second = b)
        Assertions.assertEquals(a + b, result)
        println("$a + $b = ${a+b}")
        println("= = = = = = = =")

    }
}