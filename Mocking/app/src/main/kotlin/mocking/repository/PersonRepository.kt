package mocking.repository

import mocking.model.Person

// interface ini merupakan kontrak untuk terkoneksi dengan database
interface PersonRepository {
    fun insert(person: Person)
    fun selectById(id: String): Person?
}