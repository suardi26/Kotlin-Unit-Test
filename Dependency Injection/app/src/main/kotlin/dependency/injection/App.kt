/**
    - TestInfo adalah bagian dari dependency injection pada JUnit.
    - Dependency Injection sederhana-nya adalah bagaimana kita dapat memasukan dependency (object/instance) ke dalam
      unit test secara otomatis tanpa proses manual.
    - Pada Saat menambahkan parameter di function unit test, sebenarnya kita bisa secara otomatis memasukan paramter
      tersebut dengan bantuan ParameterResolver.
    - Contohnya TestInfo, sebenarnya object-nya dibuat oleh TestInfoParameterResolver.

    Menggunakan Parameter Resolver
    - Untuk menggunakan parameter resolver yang sudah kita buat, kita dapat menggunakan annotation @ExtendWith di test class.
    - Dan jika lebih dari 1 parameter resolver, kita dapat menggunakan @Extensions.
 */
package dependency.injection

class App {
    val greeting: String
        get() {
            return "Hello World!"
        }
}

fun main() {
    println(App().greeting)
}
