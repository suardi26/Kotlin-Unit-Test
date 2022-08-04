package mocking.service

import mocking.model.Person
import mocking.repository.PersonRepository
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNotNull
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.api.extension.ExtendWith
import org.junit.jupiter.api.extension.Extensions
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.junit.jupiter.MockitoExtension

// integrasi Mockito dengan JUnit secara otomatis menggunakan annotation @Extensions.
@Extensions( value = [
    ExtendWith(MockitoExtension::class)
])
class PersonServiceTest {

    // menambahkan annotation @Mock pada atribute/field-nya
    @Mock
    lateinit var personRepository: PersonRepository

    // Membuat field tanpa menambahkan annotation @Mock
    lateinit var personService: PersonService

    @BeforeEach
    fun beforeEach(){
        personService = PersonService(personRepository)
    }

    // Melakukan test value dari parameter function get() apakah blank atau tidak.
    @Test
    fun testPersonIdIsBlank(){
        assertThrows<IllegalArgumentException> {
            personService.get(" ")
        }
    }

    // Melakukan test apakah object Person null.
    @Test
    fun testPersonNotNull(){
        assertThrows<Exception> {
            personService.get("Person not found !!!")
        }
    }

    // Melakukan test dengan Scenario Success Mengambil data Person.
    @Test
    fun testGetPersonSuccess(){

        // Menambah behavior di mock object
        // ketika get("suardi") maka akan mengembalikan id=suardi, dan name=Suardi Daud Manda.
        Mockito.`when`(personRepository.selectById("suardi")).thenReturn(Person("suardi", "Suardi Daud Manda"))

        val person: Person = personService.get("suardi")
        assertEquals("suardi", person.id)
        assertEquals("Suardi Daud Manda", person.name)

    }

    // Melakukan test value dari parameter function register() apakah blank atau tidak.
    @Test
    fun testRegisterNameIsBlank(){
        assertThrows<IllegalArgumentException> {
            personService.register(" ")
        }
    }

    // Melakukan test dengan scenario Success Registrasi data Person.
    @Test
    fun testRegisterSuccess(){
        val person: Person = personService.register("Suardi")

        // Melakukan pengecekan name dari object Person
        assertEquals("Suardi", person.name)

        // Melakukan pengecekan object dari person ID tidak null.
        assertNotNull(person.id)

        // Melakukan verifikasi bahwa function insert dari interface PersonRepository dipanggil setidaknya sekali, sehingga
        // pada saat tidak sengaja menghapus pemanggilan function insert(person) pada class PersonService akan terdeteksi
        // test akan gagal, hal ini mencegah test berhasil tapi tidak melakukan insert data ke database.
        Mockito.verify(personRepository, Mockito.times(1)).insert(Person(person.id, person.name))
    }
}