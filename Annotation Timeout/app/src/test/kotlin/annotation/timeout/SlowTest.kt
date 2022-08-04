package annotation.timeout

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Timeout
import java.util.concurrent.TimeUnit


class SlowTest {

    // Menggunakan Annotation
    // Ketika test berjalan dibawah 5 detik maka berhasil, namun ketika 5 detik maka akan gagal dan throw TimeoutException.
    @Test
    @Timeout(value = 5, unit = TimeUnit.SECONDS)
    fun slow(){
        // Menghentikan program selama 10_000ms = 10 detik
        Thread.sleep(10_000)
    }
}