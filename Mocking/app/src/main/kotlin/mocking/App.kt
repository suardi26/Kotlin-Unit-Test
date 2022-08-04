/**
    - Pada saat membuat aplikasi yang besar, source code pun akan semakin besar, struktur class pun akan semakin kompleks.
    - Kita tidak dapat memungkiri lagi bahwa akan ada ketergantungan antar class.
    - Unit test yang bagus itu dapat terprediksi dan cukup melakukan test ke satu function, jika harus mengetes interaksi
      antar class, lebih disarankan integration test.
    - Namun bagaimana jika kita harus melakukan test class yang ketergantungan dengan class lain ?
    - Solusinya adalah Melakukan mocking terhadap dependency yang dibutuhkan class yang akan kita test.

    Pengenalan Mocking
    - Mocking adalah membuat object tiruan.
    - Hal ini dilakukan agar behavior object tersebut dapat kita tentukan sesuai dengan keinginan kita.
    - Dengan Mocking, kita dapat membuat request response seolah-olah object tersebut benar dibuat.
    - Misalnya ketika kita ingin melakukan test terhadap Class A namun membutuhkan Class B maka kita dapat membuat object
      tiruan dari Class B, dengan begitu kita dapat malakukan test terhadap Class A tanpa harus membuat Class B.

    Pengenalan Mockito
    - Ada banyak framework untuk melakukan mocking.
    - Mockito adalah salah satu mocking framework paling populer di Java, dan bisa digunakan juga untuk Kotlin.
    - Dan Mockito dapat diintegrasikan dengan JUnit.
    - Untuk Detail dari Mockito dapat mengunjungi halaman 'https://site.mockito.org/'.
    - Sebelum menggunakan Mockito, maka kita harus menambahkan Dependency Mockito.

    Mockito Pada Test
    - Mockito memiliki MockitoExtention yang dapat kita gunakan untuk integrasi dengan JUnit.
    - Hal ini memudahkan kita ketika ingin membuat mock object, kita cukup gunakan @Mock.

    Contoh Kasus
    - Kita punya sebuah class model dengan nama class Person(id: String, name: String)
    - Selanjutnya kita punya interface PersonRepository sebagai interaksi ke database, dan memiliki function
      selectById(id: String) untuk mendapatkan data Person pada database.
    - Dan terakhir kita memiliki class PersonService yang digunakan sebagai class bisnis logic, dimana di class tersebut
      kita akan coba gunakan PersonRepository untuk mendapatkan data dari database, jika gagal, kita throw Exception.
    - Kita dapat integrasi Mockito dengan JUnit secara otomatis.
    - Di interface PersonRepository kita akan membuat function insert(person: Person) yang digunakan untuk menyimpan
      data ke database, namun tidak mengembalikan value, alias unit.
    - Pada class PersonService kita akan membuat function register(name: String) dimana akan membuat object Person dengan
      id random, lalu menyimpan ke database via PersonRepository, lalu mengembalikan object person tersebut.

 */
package mocking

class App {
    val greeting: String
        get() {
            return "Hello World!"
        }
}

fun main() {
    println(App().greeting)
}
