package life.cycle.test

import org.junit.jupiter.api.*

// Menggunakan Lifecycle.PER_CLASS = 1 object untuk semua function dalam satu class.
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class LifecycleTestPerClass {
    var counter: Int = 0

    // menambahkan @BeforeAll dan @AfterAll pada function biasa bukan object function (harus Lifecycle.PER_CLASS).
    @BeforeAll
    fun beforeAll(){
        println("Awal Test")
    }

    @AfterAll
    fun afterAll(){
        println("Akhir Test")
    }

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