package annotation.tag



import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.condition.*
import kotlin.math.max

// Menambahkan @Tag pada class
@Tag("integration-test")
class IntegrationTest {

    @Test
    fun integrationTest1(){
        println("Integration Test 1")
    }

    @Test
    fun integrationTest2(){
        println("Integration Test 2")
    }

}