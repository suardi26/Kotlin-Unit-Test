/**
    - Kadang kita ingin membatalkan unit test ketika kondisi tertentu terjadi.
    - Untuk membatalkan, kita dapat menggunakan exception TestAbortedException.
    - Jika JUnit mendapatkan exception TestAbortedException, secara otomatis test tersebut akan dibatalkan/@Disabled.
 */
package exception.testabortedexception

class App {
    val greeting: String
        get() {
            return "Hello World!"
        }
}

fun main() {
    println(App().greeting)
}
