package test.conditions



import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.condition.*
import kotlin.math.max


class CalculatorTest {

    // Melakukan Test sesuai dengan Kondisi (Sistem Operasi)
        // Hanya berjalan di operasi sistem WINDOWS dan LINUX
        @Test
        @EnabledOnOs(value = [OS.WINDOWS, OS.LINUX])
        fun onlyRunOnWindowsOrLinux(){
            println("Hanya berjalan di operasi sistem WINDOWS dan LINUX")
        }

        // Tidak dapat berjalan di operasi sistem WINDOWS.
        @Test
        @DisabledOnOs(value = [OS.WINDOWS])
        fun disabledOnWindows(){
            println("Tidak dapat berjalan di operasi sistem WINDOWS")
        }

    // Melakukan Test sesuai dengan Kondisi (Versi Java)
        // Hanya berjalan di Java versi 15
        @Test
        @EnabledOnJre(value = [JRE.JAVA_15])
        fun onlyRunOnJava15(){
            println("Hanya berjalan di Java versi 15")
        }

        // Tidak dapat berjalan di Java versi 15
        @Test
        @DisabledOnOs(value = [OS.WINDOWS])
        fun disabledRunOnJava15(){
            println("Tidak dapat berjalan di Java versi 15")
        }

        // Hanya berjalan di Java versi 11 sampai 15
        @Test
        @EnabledForJreRange(min = JRE.JAVA_11, max = JRE.JAVA_15)
        fun onlyRunOnJava11ToJava15(){
            println("Hanya berjalan di Java versi 11 sampai 15")
        }

        // Tidak dapat berjalan di Java versi 11 sampai 15
        @Test
        @DisabledForJreRange(min = JRE.JAVA_11, max = JRE.JAVA_15)
        fun disabledRunOnJava11ToJava15(){
            println("Tidak dapat berjalan di Java versi 11 sampai 15")
        }

    // Melakukan Test sesuai dengan Kondisi (System Property)
        // cara mengetahui system properties
        @Test
        fun printSystemProperties(){
          System.getProperties().forEach(){key, value -> println("$key => $value")}
        }

        // Hanya berjalan ketika System Property "java.vendor" = "Oracle Corporation"
        @Test
        @EnabledIfSystemProperty(named = "java.vendor", matches = "Oracle Corporation")
        fun enabledOnOracle(){

            println("Hanya berjalan ketika System Property 'java.vendor' = 'Oracle Corporation'")
        }

        // Tidak dapat berjalan ketika System Property "java.vendor" = "Oracle Corporation"
        @Test
        @DisabledIfSystemProperty(named = "java.vendor", matches = "Oracle Corporation")
        fun disabledOnOracle(){
            println("Tidak dapat berjalan ketika System Property 'java.vendor' = 'Oracle Corporation'")
        }

        // Hanya berjalan ketika beberapa System Properties-nya benar.
        @Test
        @EnabledIfSystemProperties(value = [
            EnabledIfSystemProperty(named = "java.vendor", matches = "Oracle Corporation"),
            EnabledIfSystemProperty(named = "os.name", matches = "Windows 10")
        ])
        fun enabledOnProperties(){
            println("Hanya berjalan ketika beberapa System Properties-nya benar.")
        }


        // Tidak dapat berjalan ketika beberapa System Properties-nya benar.
        @Test
        @DisabledIfSystemProperties(value = [
            DisabledIfSystemProperty(named = "java.vendor", matches = "Oracle Corporation"),
            DisabledIfSystemProperty(named = "os.name", matches = "Windows 10")
        ])
        fun disabledOnProperties(){
            println("Tidak dapat berjalan ketika beberapa System Properties-nya benar.")
        }

    // Melakukan Test sesuai dengan Kondisi (Environment Variable)
        // Hanya berjalan ketika Environment Variable "PROFILE" = "DEV"
        @Test
        @EnabledIfEnvironmentVariable(named = "PROFILE", matches = "DEV")
        fun enabledOnEnvironmentVar(){
            println("Hanya berjalan ketika Environment Variable 'PROFILE' = 'DEV'")
        }

        // Tidak dapat berjalan ketika Environment Variable "PROFILE" = "DEV"
        @Test
        @DisabledIfEnvironmentVariable(named = "PROFILE", matches = "DEV")
        fun disabledOnEnvironmentVar(){
            println("Tidak dapat berjalan ketika Environment Variable 'PROFILE' = 'DEV'")
        }

        // Hanya berjalan ketika beberapa Environment Variables benar.
        @Test
        @EnabledIfEnvironmentVariables(value = [
            EnabledIfEnvironmentVariable(named = "PROFILE", matches = "DEV"),
            EnabledIfEnvironmentVariable(named = "VAR", matches = "EN")
        ])
        fun enabledOnEnvironmentVars(){
            println("Hanya berjalan ketika beberapa Environment Variables benar.")
        }


        // Tidak dapat berjalan ketika beberapa Environment Variables benar.
        @Test
        @DisabledIfEnvironmentVariables(value = [
            DisabledIfEnvironmentVariable(named = "PROFILE", matches = "DEV"),
            DisabledIfEnvironmentVariable(named = "VAR", matches = "EN")
        ])
        fun disabledOnEnvironmentVars(){
            println("Tidak dapat berjalan ketika beberapa Environment Variables benar.")
        }
}