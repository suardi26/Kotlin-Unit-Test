/**
    - Secara default, JUnit tidak mendukung eksekusi unit test secara pararel, artinya unit test akan dijalankan
      secara sequential satu per satu.
    - Namun kadang ada kasus kita ingin mempercepat proses unit test sehingga dijalankan secara paralel, hal ini
      dapat kita lakukan pada JUnit, namun perlu beberapa langkah.
    - Tapi ingat, pastikan unit test kita aman ketika dijalankan secara pararel.

    Menambah Konfigurasi Pararel
    - Hal pertama yang perlu dilakukan adalah membuat file junit-platform.properties pada resource, lalu menambahkan
      value : "junit.jupiter.execution.parallel.enabled = true"

    Menggunakan @Execution
    - Ketika sudah mengaktifkan fitur paralel, bukan berarti secara otomatis semua unit test berjalan pararel, agar
      unit test berjalan pararel, kita perlu menggunakan annotation @Execution.
    - Lalu memilih jenis execution-nya, misal untuk pararel bisa menggunakan ExecutionMode.CONCURRENT.
 */
package running.unit.test.paralel

class App {
    val greeting: String
        get() {
            return "Hello World!"
        }
}

fun main() {
    println(App().greeting)
}
