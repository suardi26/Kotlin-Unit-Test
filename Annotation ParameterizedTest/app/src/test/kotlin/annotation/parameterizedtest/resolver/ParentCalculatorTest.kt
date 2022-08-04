package inheritance.unit.test.resolver

import annotation.parameterizedtest.Calculator

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.extension.ExtendWith
import org.junit.jupiter.api.extension.Extensions

// Membuat abstract Class sebagai parent class untuk class test yang menjadi Child.
@Extensions(value = [
    ExtendWith(RandomParameterResolver::class)
])
abstract class ParentCalculatorTest {
    val calculator = Calculator()

    @BeforeEach
    fun beforeEach(){
        println("Before Each")
    }
}