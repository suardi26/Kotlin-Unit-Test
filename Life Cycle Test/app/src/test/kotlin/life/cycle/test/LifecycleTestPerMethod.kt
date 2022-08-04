package life.cycle.test



import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.condition.*
import kotlin.math.max

// Menggunakan Lifecycle.PER_METHOD = 1 function 1 object
@TestInstance(TestInstance.Lifecycle.PER_METHOD)
class LifecycleTestPerMethod {
    var counter: Int = 0

    @Test
    fun test1(){
        println("test 1")
        println("counter = ${++counter}")
        println("Hascode Object = ${this.hashCode()}")
    }

    @Test
    fun test2(){
        println("test 2")
        println("counter = ${++counter}")
        println("Hascode Object = ${this.hashCode()}")
    }

    @Test
    fun test3(){
        println("test 3")
        println("counter = ${++counter}")
        println("Hascode Object = ${this.hashCode()}")
    }
}