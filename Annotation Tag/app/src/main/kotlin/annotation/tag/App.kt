/**
    - Class atau function unit test dapat kita tambahkan tag (tanda) dengan menggunakan annotation @Tag.
    - Dengan menambahkan tag ke dalam unit test, kita dapat fleksibel ketika menjalankan unit test, dapat memilih
      tag mana yang akan di-include atau di-exclude.
    - Jika kita menambahkan tag pada class Unit test, secara otomatis semua function unit test di dalam class tersebut
      akan memiliki tag tersebut.
    - Jika ingin menambahkan beberapa tag dalam satu class atau function unit test, kita dapat menggunakan annotation @Tags.
    - Ketika kita Membuat @Tags pada class atau function, kita dapat membuat tasks pada 'build.gradle.kts' untuk menjalankan
      test tertentu dengan nama tags yang telah ditambahkan pada @Tags.
        contoh :        @Tag("integration-test")
                        class CalculatorTest {...}

        membuat tasks : tasks.register<Test>("integration-test",Test::class){
                            useJUnitPlatform(){
                                // tags-nya boleh lebih dari satu cukup dipisahkan dengan tanda koma.
                                includeTags("integration-test")
                            }
                        }
        - Untuk menjalankan test yang memiliki @Tag("integration-test") cukup dengan memanggil task-nya, seperti:
          'gradle integration-test'
 */
package annotation.tag

class App {
    val greeting: String
        get() {
            return "Hello World!"
        }
}

fun main() {
    println(App().greeting)
}
