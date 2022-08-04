package running.unit.test.paralel

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Timeout
import org.junit.jupiter.api.parallel.Execution
import org.junit.jupiter.api.parallel.ExecutionMode
import java.util.concurrent.TimeUnit

@Execution(ExecutionMode.CONCURRENT)
class SlowTest {

    // Menggunakan Annotation
    // Ketika test berjalan dibawah 5 detik maka berhasil, namun ketika 5 detik maka akan gagal dan throw TimeoutException.
    @Test
    @Timeout(value = 5, unit = TimeUnit.SECONDS)
    fun slow1(){
        // Menghentikan program selama 3_000ms = 3 detik
        Thread.sleep(3_000)
    }

    @Test
    @Timeout(value = 5, unit = TimeUnit.SECONDS)
    fun slow2(){
        // Menghentikan program selama 3_000ms = 3 detik
        Thread.sleep(3_000)
    }
    @Test
    @Timeout(value = 5, unit = TimeUnit.SECONDS)
    fun slow3(){
        // Menghentikan program selama 3_000ms = 3 detik
        Thread.sleep(3_000)
    }
}