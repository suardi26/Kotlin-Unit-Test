/**
    - Kadang kita ingin memastikan bahwa sebuah unit test berjalan tidak lebih dari sekian detik.
    - Misalnya ketika kasus kita ingin memastikan code program kita mempunyai performa bagus dan cepat.
    - JUnit memiliki fitur timeout, yaitu memastikan bahwa unit test berjalan tidak lebih dari waktu yang ditentukan,
      jika melebihi waktu yang ditentukan, secara otomatis unit test tersebut akan gagal dan throw TimeoutException.
    - Kita bisa menggunakan annotation @Timeout untuk melakukan hal tersebut.
 */
package annotation.timeout

class App {
    val greeting: String
        get() {
            return "Hello World!"
        }
}

fun main() {
    println(App().greeting)
}
