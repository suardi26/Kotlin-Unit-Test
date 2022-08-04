# Kotlin Unit Test

## Software Testing

- <samp>Software testing adalah salah satu displin ilmu dalam software engineering</samp>

- <samp>Tujuan utama dari software testing adalah memastikan kualitas code aplikasi kita baik.</samp>

- <samp>Ilmu untuk software testing sendiri sangatlah luas, dan salah satu bagian terkecil dari</samp>

  <samp>software testing adalah unit testing.</samp>

- <samp>Secara garis besasr Software Testing terbagi menjadi beberapa bagian, biasanya</samp>

  <samp>digambarkan pada Pyramid Test.</samp>
  
  <img src="https://github.com/suardi26/Kotlin-Unit-Test/blob/main/TestPyramid.jpg" alt="Pyramid Test" width=50% height=50%/>

- <samp>UI Test (End To End Test).

  <samp>UI Test adalah test yang dilakukan menyeluruh atau dari ujung depan ke ujung akhir,</samp>
  
  <samp>jadi testing ini membuat program yang bertindak sebagai user dan mengecek semua flow</samp> 
  
  <samp>dari frontend, sampai ke backend hingga service-service yang terintegrasi dengan aplikasi kita.</samp> 
  
  <samp>Karena testing ini melakukan test secara menyeluruh dan sistem harus berjalan secara bersamaan pada</samp>
  
  <samp>saat melakukan test untuk itu testing ini paling mahal biayanya.</samp>
  
  <img src="https://github.com/suardi26/Kotlin-Unit-Test/blob/main/UI%20Test.jpg" alt="Pyramid Test" width=60% height=60%/>
  
- <samp>Service Test (Integration Test).
  
  <samp>Service Test adalah test yang biasanya dilakukan di back-end dan tidak melakukan test secara menyeluruh</samp> 
  
  <samp>namun mengerjakan testnya setiap bagian dari integrasi aplikasi dengan software pendukungnya misalnya</samp> 
  
  <samp>database atau service lain yang terhubung dengan aplikasi kita. Jadi service test mengerjakan satu persatu</samp> 
  
  <samp>proses integrasi software pendukung dengan aplikasi kita, hal ini mengakibatkan biayanya lebih murah</samp> 
  
  <samp>dibanding dengan UI testing.</samp>
  
  <img src="https://github.com/suardi26/Kotlin-Unit-Test/blob/main/Service%20Test.jpg" alt="Pyramid Test" width=60% height=60%/>
  
- <samp>Unit Test.

  <samp>Pada saat membuat aplikasi, maka aplikasi tersebut terbagi dalam beberapa bagian yaitu layer atau class.</samp>

  <samp>Unit test adalah melakukan testing ke kompenen terkecil dari aplikasi yaitu layer/class. Misalnya kita</samp>

  <samp>membuat class Controller maka kita akan membuat unit test Controller atau kita membuat class Service</samp>

  <samp>maka kita akan membuat unit test Service. jadi fokus dari unit test yaitu melakukan test di bagian</samp> 

  <samp>terckecil di dalam aplikasi kita, sehingga biayanya paling murah dan untuk melakukan testing</samp> 

  <samp>unit test terbilang mudah karena kita cukup menjalankan unit test dari aplikasi kita tanpa harus</samp> 

  <samp>menjalankan aplikasinya. Dan meskipun aplikasi connect ke database namun ketika melakukan unit test</samp> 

  <samp>tidak dibutuhkan ke database.
    
  <img src="https://github.com/suardi26/Kotlin-Unit-Test/blob/main/Unit%20Test.jpg" alt="Pyramid Test" width=60% height=60%/>
