package information.test

import org.junit.jupiter.api.*

@DisplayName("Test with TestInfo")
class InformationTest {


    // Menambahkan TestInfo sebagai parameter di function unit test untuk mendapatkan informasi test.
    @Test
    @Tags( value = [
        Tag("Test-Database"),
        Tag("Test-Sync")
    ])
    @DisplayName("Test Data")
    fun testData(testInfo: TestInfo){
        println("Display Name : ${testInfo.displayName}")
        println("Tags         : ${testInfo.tags}")
        println("Test Method  : ${testInfo.testMethod}")
        println("Test Class   : ${testInfo.testClass}")
    }
}