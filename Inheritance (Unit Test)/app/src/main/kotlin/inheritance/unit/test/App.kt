/**
    - JUnit mendukung pewarisan pada test, artinya jika kita membuat class atau interface dan menambahkan informasi test
      disitu, maka ketika kita membuat turunannya, secara otomatis semua fitur test-nya dimiliki oleh turunannya.
    - Ini sangat cocok ketika kita misal contohnya sering membuat code sebelum dan setelah test yang berulang-ulang, sehingga
      dibanding dibuat di semua test class, lebih baik dibuat sekali di parent test class-nya, dan test class tinggal
      menjadi child class dari parent test class.
 */
package inheritance.unit.test

class App {
    val greeting: String
        get() {
            return "Hello World!"
        }
}

fun main() {
    println(App().greeting)
}
