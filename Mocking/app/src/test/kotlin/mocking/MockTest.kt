package mocking

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.mockito.Mockito

class MockTest {
    @Test
    fun testMock(){

        // Membuat Mock/object tiruan dari interface List<String>
        val listMock: List<String> = Mockito.mock(List::class.java) as List<String>

        // Menambah behavior di mock object
        Mockito.`when`(listMock.get(0)).thenReturn("Suardi")
        Mockito.`when`(listMock.get(1)).thenReturn("Daud")

        // test mock
        assertEquals("Suardi", listMock.get(0))
        assertEquals("Daud", listMock.get(1))

        // verify mock
        // dilakukan verifikasi dimana function get(0) dipanggil berapa kali dengan menambahkan value int pada Mockito.times(1).
        Mockito.verify(listMock, Mockito.times(1)).get(0)

        // secara default verfikasi pada function sekali, sehingga jika ingin melakukan pengecekan function
        // yang muncul cuma sekali maka cukup 1 parameter saja yaitu object-nya.
        Mockito.verify(listMock).get(0)

        // ketika sebuah function dipanggil cuma sekali  dan dilakukan verifikasi dimana function-nya dipanggil 2 kali
        // maka yang terjadi adalah error.
        // Mockito.verify(listMock, Mockito.times(2)).get(1) //error
    }
}