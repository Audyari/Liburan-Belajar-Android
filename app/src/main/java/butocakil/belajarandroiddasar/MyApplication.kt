package butocakil.belajarandroiddasar

import android.app.Application
import android.util.Log

class MyApplication: Application() {
   
    override fun onCreate() {
        super.onCreate()
        Log.d("log di MyApplication", "onCreate")
    }
}