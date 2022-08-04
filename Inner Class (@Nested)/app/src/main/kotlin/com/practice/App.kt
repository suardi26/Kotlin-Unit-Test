/**
    - Pada saat membuat unit test, ada baiknya ukuran test class-nya tidak terlalu besar, karena akan sulit dimengerti.
    - Jika test class sudah semakin besar, ada baiknya kita pecah menjadi beberapa test class, lalu kita grouping sesuai
      dengan jenis function test-nya.
    - JUnit mendukung pembuatan class test di dalam class test, jadi kita dapat memecah sebuah class test, tanpa harus
      membuat class di file berbeda, kita cukup menggunakan inner class.
    - Untuk memberi tahu bahwa inner class tersebut adalah test class, kita dapat menggunakan annotation @Nested
 */
package com.practice

class App {
    val greeting: String
        get() {
            return "Hello World!"
        }
}

fun main() {
    println(App().greeting)
}
