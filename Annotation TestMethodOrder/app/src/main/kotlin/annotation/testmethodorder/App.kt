/**
    - Secara default, urutan eksekusi unit test tidak dapat ditentukan, jadi bukan berarti ketika sebuah function berada
      diatas function lainnya, maka akan dijalankan lebih dulu.
    - Hal ini dikarenakan memang sebaiknya function unit test itu harus independen, tidak saling ketergantungan.
    - Secara default pun, object class unit test akan selalu dibuat ulang tiap function, jadi jangan berharap
      kita dapat menyimpan data pada variable untuk digunakan pada unit test function selanjutnya.

    Mengubah Urutan eksekusi Test
    - JUnit mendukung perubahan urutan eksekusi test dengan menggunakan annotation @TestMethodOrder, ada beberapa cara
      yang dapat kita lakukan :
        - Alphanumeric, artinya urutan eksekusi unit test akan diurutkan berdasarkan alphanumeric namun Alphanumeric
          Deprecated digantikan oleh class MethodName.
        - Random, artinya urutan-urutan eksekusi unit test akan dieksekusi secara random.
        - OrderAnnotation, artinya urutan eksekusi unit test akan mengikuti annotation @Order yang ada pada tiap function
          unit test.
        - Kita dapat membuat urutan unit test function sendiri, dengan cara membuat class baru turunan dari MethodOrderer
          interface.
 */
package annotation.testmethodorder

class App {
    val greeting: String
        get() {
            return "Hello World!"
        }
}

fun main() {
    println(App().greeting)
}
