/**
    - Untuk membatalkan test, kita dapat menggunakan exception TestAbortedException.
    - Namun ada cara lain yang lebih mudah, yaitu dengan menggunakan Assumtions.
    - Penggunaan Assumptions mirip seperti Assertions, jika nilainya tidak sama maka function Assumptions akan thrown
      TestAbortedException, sehingga secara otomatis akan membatalkan unit test yang sedang berjalan.
    - Banyak sekali method-method static (object function pada Kotlin) yang dapat digunakan untuk melakukan Assumptions,
      untuk detailnya dapat dikunjungi pada halaman :
      'https://junit.org/junit5/docs/5.0.1/api/org/junit/jupiter/api/Assumptions.html'.
 */
package assumptions

class App {
    val greeting: String
        get() {
            return "Hello World!"
        }
}

fun main() {
    println(App().greeting)
}
