/**
    - Ketika kita ingin menambahkan parameter pada function unit test, maka kita perlu membuat Parameter Resolver.
    - Namun jika terlalu banyak membuat ParameterResolver juga agak menyulitkan kita
    - JUnit memiliki fitur yang bernama @ParameterzedTest, dimana jenis unit test ini memang khusus dibuat agar dapat
      menerima parameter.
    - Yang perlu kita lakukan adalah dengan mengganti @Test menjadi @ParameterizedTest.

    Sumber Parameter
    @ParameterizedTest mendukung beberapa sumber parameter, yaitu :
        - @ValueSource, untuk sumber Number, Char, Boolean dan String.
        - @EnumSource, untuk sumber berupa enum.
        - @MethodSource, untuk sumber dari function object(static)
        - @CsvSource, untuk sumber berupa data CSV.
        - @CsvFileSource, untuk sumber berupa file CSV.
        - @ArgumentSource, untuk data dari class ArgumentProvider.
 */
package annotation.parameterizedtest

class App {
    val greeting: String
        get() {
            return "Hello World!"
        }
}

fun main() {
    println(App().greeting)
}
