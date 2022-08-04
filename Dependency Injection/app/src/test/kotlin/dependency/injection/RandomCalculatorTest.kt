package dependency.injection

import dependency.injection.resolver.RandomParameterResolver
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.junit.jupiter.api.extension.Extensions
import java.util.*
import kotlin.math.max

// menggunakan parameter resolver yang sudah kita buat
@Extensions(value = [
    ExtendWith(RandomParameterResolver::class)
])

class RandomCalculatorTest {

    private val calculator = Calculator()

    @Test
    fun testRandom(random: Random){
        val a: Int = random.nextInt(100)
        val b: Int = random.nextInt(100)
        val result: Int = calculator.add(first = a, second = b)
        Assertions.assertEquals(a + b, result)
        println("$a + $b = ${a+b}")

    }
}