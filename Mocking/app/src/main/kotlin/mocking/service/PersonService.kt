package mocking.service

import mocking.model.Person
import mocking.repository.PersonRepository
import java.util.*

class PersonService(private val personRepository: PersonRepository) {

    fun get(id: String): Person {
        if(id.isBlank()){
            throw IllegalArgumentException("ID is Blank !!!")
        }

        val person: Person? = personRepository.selectById(id)
        if (person != null){
            return person
        }else{
            throw Exception("Person not found !!!")
        }
    }

    fun register(name: String): Person {
        if (name.isBlank()) throw IllegalArgumentException("Name is Blank")
        val person = Person(UUID.randomUUID().toString(), name)
        personRepository.insert(person)
        return person
    }
}