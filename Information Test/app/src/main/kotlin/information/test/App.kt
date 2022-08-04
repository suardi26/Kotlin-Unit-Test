/**
    - Kita juga bisa mendapatkan informasi test yang sedang berjalan menggunakan interface TestInfo.
    - Kita dapat menambahkan TestInfo sebagai parameter di function unit test.
 */
package information.test

class App {
    val greeting: String
        get() {
            return "Hello World!"
        }
}

fun main() {
    println(App().greeting)
}
