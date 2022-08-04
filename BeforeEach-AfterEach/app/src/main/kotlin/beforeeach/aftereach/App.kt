/**
    - Kadang kita ingin menjalankan code yang sama sebelum dan setelah eksekusi unit test.
    - Hal ini sebenarnya bisa dilakukan secara manual pada function @Test-nya, namun hal ini akan membuat code duplikat
      yang banyak.
    - JUnit memiliki annotation @BeforeEach dan @AfterEach.
    - @BeforeEach  digunakan untuk menandai function yang akan dieksekusi sebelum unit test dijalankan.
    - @AfterEach digunakan untuk menandai function yang akan dieksekusi setelah Unit test dijalankan.
    - Dengan menambahkan @BeforeEach dan @AfterEach pada function maka function tersebut akan selalu dieksekusi setiap
      function @Test dijalankan, bukan sekali untuk class test saja.

    - @BeforeEach & @AfterEach akan dieksekusi setiap kali function @Test jalan.
    - Namun kadang kita ingin melakukan sesuatu  sebelum semua unit test berjalan, atau setelah semua unit test berjalan.
    - Ini bisa dilakukan menggunakan annotation @BeforeAll dan @AfterAll
    - Namun hanya static function (object function di kotlin) yang dapat menggunakan @BeforeAll dan @AfterAll.
    - Selain menambahkan @BeforeAll dan @AfterAll, kita juga harus menambahkan @JvmStatic untuk memberikan informasi
      bahwa function tersebut akan di compile menjadi java static function.

 */
package beforeeach.aftereach

class App {
    val greeting: String
        get() {
            return "Hello World!"
        }
}

fun main() {
    println(App().greeting)
}
