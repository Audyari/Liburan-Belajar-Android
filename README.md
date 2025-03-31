# BelajarAndroidDasar

1. Manifest File :
    - berisikan informasi dari aplikasi yang kita buat, seperti informasi Activity, Permission, Intent, Provider, Receiver, Service, dan lain-lain

2. Activity adalah main function dari aplikasi android
    ada di : AndroidManifest.xml

3. Layout : yg perlu di perhatikan :
    - layout linear layout
    - activity

4. penggunaan View di android :
    - menggunakan  xml :
    - textview
    - edittext
    - button


5. pembuatan View ID

    Pembuatan nya di XML ya : 
    -  android:id="@+id/nameText"

6. Action Listener adalah object yang bisa kita tambahkan ke komponen ketika sebuah aksi dilakukan ke komponen tersebut

    contoh nya pada Button

7. Lateinit adalah pengembangan dari view ID dan indViewById biar lebih mudah mengelola nya

8. Log cara pembuatan :
    - VERBOSE
    - DEBUG
    - INFO
    - WARN
    - ERROR

9. Resource :
  - text
  - gambar
  - animasi

10. String Resource :
    - Formatting String :  <string name="sayHelloTextView">Hello %1$s </string> untuk data dinamis
    - String Array : <string-array name="names">

11. Value Resource Lainnya
    Misalnya Integer : <integer name="maxAge">100</integer>
    Integer Array : <integer-array name="maxAge">100</integer-array>
    Boolean : <bool name="isLogin">true</bool>
    Color : <color name="colorPrimary">#FF0000</color>
    dan lain-lain

12. Layout Resource :
    - pake Merge dan include

13. Color State List Resource

14. drawable resource :
    - seperti Bitmap File (file gambar), Nine Patch File, Layer List, State List dan lain-lain
    - cari file .png
    - gunakan imageview

15. localization :
    - aplikasi yang kita buat akan diakses dari berbagai negara menggunakan berbagai bahasa

16. Asset manager : 
    buat folder assets
    -  pemanggilan file json contoh nya : 

17. raw resource :  alternatif asset manager
    - pemanggilan file json di raw resource 

18. Context : 
    - application context
        * getapplicationcontext()
        * digunakan jika kita ingin membuat object yang singleton yang membutuhkan Context
    - activity context
        * getcontext()
        * digunakan jika kita ingin membuat object yang hanya digunakan di Activity tersebut
    kesalahan memilih akan menyebabkan memory leak

    Application Context: Cocok untuk tugas yang perlu diakses di seluruh aplikasi.
    Activity Context: Cocok untuk tugas yang spesifik untuk satu aktivitas.

19. application :

    kita bisa buat application class untuk 
    onCreate : metode siklus hidup aktivitas yang dipanggil ketika aktivitas pertama kali dibuat.

20. Device Compatibility :
    - Device Feature di Manifest File
        contoh : 
        <uses-feature android:name="android.hardware.fingerprint" android:required="true" />

   - Device Feature di Kode 
        contoh : 
       if (packageManager.hasSystemFeature(PackageManager.FEATURE_FINGERPRINT)) {
            Log.d("log di Device Feature", "Fingerprint supported")
        } else {
            Log.d("log di Device Feature", "Fingerprint not supported")
        }

    - pengecekan versi platform API
        contoh : 
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            Log.d("log di Device Feature", "API level 23 or higher")
        } else {
            Log.d("log di Device Feature", "API level lower than 23")
        }

21. screen compatibility
    - screen size : ukuran layar
        *small
        *normal
        *large
        *xlarge
    - screen density : kepadatan pixel : gunakan contoh 100dp
        *ldpi
        *mdpi
        *hdpi
        *xhdpi
        *xxhdpi
        *xxxhdpi

22. resource compatibility
    - berbeda gambar kalo kita buat landscape

23. debugging :
    gunakan evaluate expression dan dot warna merah
    - bisa berinteraksi di lingkungan sekitar nya
    
24.  Testing :

    - local unit test adalah unit test yang dijalankan di komputer
    - instrumented test adalah unit test yang dijalankan di perangkat android
        
        jangan manual gunakan : Activity Scenario Rule : 

        * gunakan library Espresso :
            - onView
            - perform
            - onClick
            - check

25. Profiling :
    - yang sering terjadi adalah masalah memory leak
    - memonitor penggunaan memory, cpu, dan lain-lain
    - gunakkan analyze memory usage heap dump pastikan gk ada memory leak

26. Reset Android Studio :
    - Hapus Emulator
    - Hapus Android SDK
    - Invalidate Cache di menu file

27. bikin aplikasi gunting kertas batu
    - bikin object game
    - bikin unit test objek game
    - bikin mainActivity
    - bikin view
    - bikin resources value String
    - edit AndroidManifest.xml
 