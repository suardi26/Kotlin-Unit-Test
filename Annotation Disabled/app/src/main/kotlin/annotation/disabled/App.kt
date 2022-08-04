/**
    - Terkadang ada kondisi kita ingin menonaktifkan unit test, misal karena terjadi error pada unit test tersebut,
      dan belum dapat diperbaiki.
    - Sebenarnya cara paling mudah untuk menonaktifkan unit test adalah dengan menghapus annotation @Test, namun
      kita tidak dapat mendeteksi kalo ada unit test yang di disabled.
    - Untuk menonaktifkan unit test secara benar, kita dapat menggunakan annotation @Disabled.
 */
package annotation.disabled

class App {
    val greeting: String
        get() {
            return "Hello World!"
        }
}

fun main() {
    println(App().greeting)
}
