package create.test

import org.junit.jupiter.api.Test

class CalculatorTest {
    val calculator: Calculator = Calculator()

    // Test function add

        @Test
        fun testAddSuccess(){
            val result: Int = calculator.add(first = 1, second = 2)
        }

        @Test
        fun testAddSuccess2(){
            val result: Int = calculator.add(first = 2, second = 2)
        }


}