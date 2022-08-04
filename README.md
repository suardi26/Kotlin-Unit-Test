# Kotlin Unit Test

## Software Testing

- <samp>Software testing adalah salah satu displin ilmu dalam software engineering</samp>

- <samp>Tujuan utama dari software testing adalah memastikan kualitas code aplikasi kita baik.</samp>

- <samp>Ilmu untuk software testing sendiri sangatlah luas, dan salah satu bagian terkecil dari</samp>

  <samp>software testing adalah unit testing.</samp>

- <samp>Secara garis besasr Software Testing terbagi menjadi beberapa bagian, biasanya</samp>

  <samp>digambarkan pada Pyramid Test.</samp>
  
  <img src="https://github.com/suardi26/Kotlin-Unit-Test/blob/main/TestPyramid.jpg" alt="Pyramid Test" width=50% height=50%/>

- <samp>UI Test (End To End Test).</samp>

  <samp>UI Test adalah test yang dilakukan menyeluruh atau dari ujung depan ke ujung akhir,</samp>
  
  <samp>jadi testing ini membuat program yang bertindak sebagai user dan mengecek semua flow</samp> 
  
  <samp>dari frontend, sampai ke backend hingga service-service yang terintegrasi dengan aplikasi kita.</samp> 
  
  <samp>Karena testing ini melakukan test secara menyeluruh dan sistem harus berjalan secara bersamaan pada</samp>
  
  <samp>saat melakukan test untuk itu testing ini paling mahal biayanya.</samp>
  
  <img src="https://github.com/suardi26/Kotlin-Unit-Test/blob/main/UI%20Test.jpg" alt="Pyramid Test" width=60% height=60%/>
  
- <samp>Service Test (Integration Test).</samp>
  
  <samp>Service Test adalah test yang biasanya dilakukan di back-end dan tidak melakukan test secara menyeluruh</samp> 
  
  <samp>namun mengerjakan testnya setiap bagian dari integrasi aplikasi dengan software pendukungnya misalnya</samp> 
  
  <samp>database atau service lain yang terhubung dengan aplikasi kita. Jadi service test mengerjakan satu persatu</samp> 
  
  <samp>proses integrasi software pendukung dengan aplikasi kita, hal ini mengakibatkan biayanya lebih murah</samp> 
  
  <samp>dibanding dengan UI testing.</samp>
  
  <img src="https://github.com/suardi26/Kotlin-Unit-Test/blob/main/Service%20Test.jpg" alt="Pyramid Test" width=60% height=60%/>
  
- <samp>Unit Test.</samp>

  <samp>Pada saat membuat aplikasi, maka aplikasi tersebut terbagi dalam beberapa bagian yaitu layer atau class.</samp>

  <samp>Unit test adalah melakukan testing ke kompenen terkecil dari aplikasi yaitu layer/class. Misalnya kita</samp>

  <samp>membuat class Controller maka kita akan membuat unit test Controller atau kita membuat class Service</samp>

  <samp>maka kita akan membuat unit test Service. jadi fokus dari unit test yaitu melakukan test di bagian</samp> 

  <samp>terckecil di dalam aplikasi kita, sehingga biayanya paling murah dan untuk melakukan testing</samp> 

  <samp>unit test terbilang mudah karena kita cukup menjalankan unit test dari aplikasi kita tanpa harus</samp> 

  <samp>menjalankan aplikasinya. Dan meskipun aplikasi connect ke database namun ketika melakukan unit test</samp> 

  <samp>tidak dibutuhkan ke database.</samp>
    
  <img src="https://github.com/suardi26/Kotlin-Unit-Test/blob/main/Unit%20Test.jpg" alt="Pyramid Test" width=60% height=60%/>
    
## Unit Test
    
  - <samp>Unit test akan fokus menguji bagian kode program terkecil, biasanya menguji sebuah</samp>
    
    <samp>class dan function.</samp>
    
  - <samp>Unit test biasanya dibuat kecil dan cepat, oleh karena itu biasanya kode unit test lebih banyak</samp>
    
    <samp>dari kode program aslinya, karena semua skenario pengujian akan dicoba di unit test misalnya</samp>
    
    <samp>membuat suatu method maka unit testnya dibuat berbagai skenario contohnya skenario berhasil,</samp>
    
    <samp>gagal, dll sesuai kebutuhan pengujian.</samp>
    
  - <samp>Unit test bisa digunakan sebagai cara untuk meningkatkan kualitas program.</samp>
    
## Kotlin Test
    
  - <samp>Kotlin sendiri mendukung pembuatan test menggunakan kotlin test.</samp>
    
  - <samp>Kotlin test sendiri sebenarnya di belakangnya  adalah sebuah test framework yang bernama JUnit</samp>
    
  - <samp>Untuk lebih jelasnya silahkan kunjungi halaman website-nya:</samp>
  
    <samp>'https://kotlinlang.org/api/latest/kotlin.test/'</samp>
    
## JUnit
    
  - <samp>Junit adalah test framework yang paling populer di Java.</samp>
    
  - <samp>Untuk implementasi unit test tidak bisa menggunakan bawaan java karena bawaan java tidak terdapat</samp>
    
    <samp>testing frameworknya namun memerlukan library.</samp>
    
  - <samp>Library yang digunakan untuk melakukan unit test adalah JUnit & TestNG.</samp>
    
  - <samp>Untuk JUnit 5 membutuhkan java minimal versi 8.</samp>
    
  - <samp>Untuk detail mengenai JUnit dapat mengujungi halaman 'https://junit.org'.</samp>
    
## Membuat Test
    
  - <samp>Untuk membuat test di JUnit itu sederhana, kita cukup membuat class, lalu menambahkan </samp>
    
    <samp>function-function test-nya.</samp>
    
  - <samp>Function akan dianggap sebuah test jika ditambahkan annotation @Test.</samp>
    
  - <samp>Kode Test disimpan dibagian test folder pada gradle, bukan di main folder.</samp>
    
  - <samp>Biasanya saat membuat class untuk test, nama class-nya sama dengan nama class yang akan di-Test,</samp> 
      
    <samp>namun diakhiri dengan kata Test, misal jika nama class-nya adalah Product, maka nama</samp> 
      
    <samp>class test-nya adalah ProductTest.</samp>
    
      
### Software :

 - <a href="https://www.jetbrains.com/idea/download/?from=SafeEyes#section=windows" target="blank"><img align="center" src="https://img.icons8.com/material/144/000000/intellij-idea.png" height="30" width="30" />&nbsp;&nbsp;&nbsp;IntelliJ IDEA Community Edition 2021.2.3.</a>

### Social Media :
<p align="left">
<a href="https://fb.com/suardi.daudmanda" target="blank"><img align="center" src="https://cdn.jsdelivr.net/npm/simple-icons@v3/icons/facebook.svg" alt="suardi.daudmanda" height="30" width="40" /></a>
<a href="https://instagram.com/soeardi_26" target="blank"><img align="center" src="https://cdn.jsdelivr.net/npm/simple-icons@v3/icons/instagram.svg" alt="soeardi_26" height="30" width="40" /></a>
<a href="mailto:suardi260696@gmail.com" target="blank"><img align="center" src="https://cdn.jsdelivr.net/npm/simple-icons@v3/icons/gmail.svg" alt="suardi260696@gmail.com" height="30" width="40" /></a>
</p>

