/**
    - Pada saat membuat test, kita harus memastikan bahwa test tersebut sesuai dengan ekspektasi yang kita inginkan.
    - Jika manual, kita dapat melakukan pengecekan if else, namun itu tidak direkomendasikan.
    - JUnit memiliki fitur untuk melakukan assertions, yaitu memastikan bahwa unit test sesuai dengan kondisi yang
      diinginkan.
    - Assertions pada JUnit direpresentasikan dalam class Assertions, dan di dalamnya terdapat banyak sekali function
      static (pada kotlin adalah object function)
    - Walaupun JUnit dibuat menggunakan Java, tapi JUnit menyediakan function khusus untuk Kotlin.
    - Banyak sekali function-function static yang dapat digunakan untuk melakukan Assertions, untuk detailnya dapat dikunjungi
      pada halaman : 'https://junit.org/junit5/docs/5.0.1/api/org/junit/jupiter/api/Assertions.html'.

    Menggagalkan Test
    - Kadang dalam membuat Unit test, kita tidak hanya ingin melakukan test kasus sukses atau gagal.
    - Kita juga dapat melakukan sebuah Exception misalnya.
    - Assertions juga dapat digunakan untuk mengecek apakah sebuah exception terjadi.
 */
package assertions

class App {
    val greeting: String
        get() {
            return "Hello World!"
        }
}

fun main() {
    println(App().greeting)
}
