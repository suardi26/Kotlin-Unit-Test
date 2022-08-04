/**
    - Kadang agak sulit membuat nama function yang merepresentasikan kasus test-nya.
    - Jika kita ingin menambahkan deskripsi untuk tiap test, kita dapat menggunakan annotation @DisplayName
    - Dengan menggunakan annnotation @DisplayName, kita dapat menambahkan dekskripsi unit testnya.
    - Annotation @DisplayName dapat digunakan pada TYPE/Class dan function.

    Display Name Generator
    - JUnit mendukung pembuatan DisplayName secara otomatis menggunakan generator.
    - Yang perlu kita lakukan adalah membuat class turunan dari interface DisplayNameGenerator, lalu menambahkan
      annotation @DisplayNameGeneration pada test class-nya.
 */
package display.name

class App {
    val greeting: String
        get() {
            return "Hello World!"
        }
}

fun main() {
    println(App().greeting)
}
