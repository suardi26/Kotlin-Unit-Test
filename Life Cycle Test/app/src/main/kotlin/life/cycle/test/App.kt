/**
    - Secara default, lifecycle (siklus hidup) object test adalah independent per function test, artinya object unit test
      akan selalu dibuat baru per function unit test, oleh karena itu kita tidak dapat bergantung dengan function test lain.
    - Cara Pembuatan object test pada JUnit ditentukan oleh annotation @TestInstance, dimana defaultnya adalah
      Lifecycle.PER_METHOD, artinya tiap function akan dibuat sebuah instance/object baru.
    - Kita dapat merubahnya menjadi Lifecycle.PER_CLASS jika kita mau, dengan demikian instance/object test-nya hanya
      dibuat sekali per class, dan function test akan menggunakan object test yang sama.
    - Hal ini dapat kita manfaatkan ketika membuat test yang tergantung dengan test lain.

    Keuntungan Instance Per Class
    - Salah satu keuntungan saat menggunakan Lifecycle.PER_CLASS adalah kita dapat @BeforeAll dan @AfterAll di function
      biasa bukan di static method (object function pada Kotlin).
 */
package life.cycle.test

class App {
    val greeting: String
        get() {
            return "Hello World!"
        }
}

fun main() {
    println(App().greeting)
}
