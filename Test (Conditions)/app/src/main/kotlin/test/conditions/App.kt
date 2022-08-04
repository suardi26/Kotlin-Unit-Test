/**
    - Assumptions dapat juga digunakan untuk menjalankan unit test berdasarkan kondisi tertentu.
    - Namun JUnit menyediakan fitur yang lebih mudah untuk pengecekan beberapa kondisi seperti kondisi sistem operasi,
      versi java, system property atau environment variable.
    - ini lebih mudah dibandingkan menggunakan Assumptions.

    Kondisi Sistem Operasi
    - Untuk kondisi sistem operasi, kita dapat menggunakan beberapa annotation.
    - @EnabledOnOs digunakan untuk penanda bahwa unit test boleh berjalan pada sistem operasi yang ditentukan.
    - @DisabledOnOs digunakan untuk penanda bahwa unit test tidak boleh berjalaln pada sistem operasi yang ditentukan.

    Kondisi Versi Java
     - Untuk kondisi versi Java yang kita gunakan, kita dapat menggunakan beberapa annotation.
     - @EnabledOnJre digunakan untuk penanda bahwa unit test boleh berjalan pada Java versi tertentu.
     - @DisabledOnJre digunakan untuk penanda bahwa  unit test tidak boleh berjalan pada  Java versi tertentu.
     - @EnabledForJreRange digunakan untuk penanda bahwa unit test boleh berjalan di range Java versi tertentu.
     - @DisabledForJreRange digunakan untuk penanda bahwa unit test tidak boleh berjalan di range Java versi tertentu.

    Kondisi System Property
     - Untuk kondisi nilai dari system property, kita dapat menggunakan beberapa annotation.
     - @EnabledIfSystemProperty untuk penanda bahwa unit test boleh berjalan jika system property sesuai dengan yang
       ditentukan.
     - @DisabledIfSystemProperty untuk penanda bahwa unit test tidak boleh berjalan jika system property sesuai dengan
       yang ditentukan.
     - Jika kondisinya lebih dari satu, kita dapat menggunakan @EnabledIfSystemProperties dan @DisabledIfSystemProperties.

    Kondisi Environment Variable
     - Untuk kondisi nilai dari environment variable, kita dapat menggunakan beberapa annotation.
     - @EnabledIfEnvironmentVariable untuk penanda bahwa unit test boleh berjalan jika environment variable sesuai dengan yang
       ditentukan.
     - @DisabledIfEnvironmentVariable untuk penanda bahwa unit test tidak boleh berjalan jika environment variable sesuai dengan
       yang ditentukan.
     - Jika kondisinya lebih dari satu, kita dapat menggunakan @EnabledIfEnvironmentVariables dan @DisabledIfEnvironmentVariables
 */
package test.conditions

class App {
    val greeting: String
        get() {
            return "Hello World!"
        }
}

fun main() {
    println(App().greeting)
}
