/**
    - JUnit mendukung eksekusi unit test berulang kali sesuai dengan jumlah yang kita tentukan.
    - Untuk mengulang eksekusi unit test, kita dapat menggunakan annotation @RepeatedTest di function unit test-nya, namun
      ketika unit test ingin dieksekusi sekali saja maka tetap menggunakan @Test.
    - @RepeatedTest juga dapat digunakan untuk mengubah detail nama test-nya, dan kita dapat menggunakan value[displayName]
      untuk mendapatkan display name, [currentRepetition] untuk mendapatkan perulangan ke beberapa saat ini, dan
      [totalRepetitions] untuk mendapatkan total perulangan-nya.
    Informasi Perulangan
    - @RepeatedTest juga memiliki object RepetitionInfo yang di Inject oleh class RepetitionInfoParameterResolver, sehingga
      kita bisa mendapatkan informasi RepetitionInfo melalui parameter function unit test.
 */
package annotation.repeatedtest

class App {
    val greeting: String
        get() {
            return "Hello World!"
        }
}

fun main() {
    println(App().greeting)
}
