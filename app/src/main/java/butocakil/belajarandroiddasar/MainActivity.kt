package butocakil.belajarandroiddasar

import android.content.pm.PackageManager
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : ComponentActivity() {

    private lateinit var nameEditText: EditText
    private lateinit var sayHelloButton: Button
    private lateinit var sayHelloTextView: TextView
    private lateinit var sayHelloTextView2: TextView
    private lateinit var cekDeviceFeature: Button

    
    private fun initComponent() {
        nameEditText = findViewById(R.id.nameEditText)
        sayHelloButton = findViewById(R.id.sayHelloButton)
        sayHelloTextView = findViewById(R.id.sayHelloTextView)
        sayHelloTextView2 = findViewById(R.id.sayHelloTextView2)
        cekDeviceFeature = findViewById(R.id.cekDeviceFeature)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.hello_word)

        initComponent()

        //sayHelloTextView2.text = resources.getString(R.string.app_name)
     
        sayHelloButton.setOnClickListener {
            // Log.v("log di sayHelloButton verbose", "Button diklik")
            // Log.d("log di sayHelloButtonc debug", "Button diklik")
            // Log.i("log di sayHelloButton info", "Button diklik")
            // Log.w("log di sayHelloButton warning", "Button diklik")
            // Log.e("log di sayHelloButton error", "Button diklik")
           
            // Get name from EditText
            val name = nameEditText.text.toString()
            sayHelloTextView.text = resources.getString(R.string.sayHelloTextView, name)
            // Log.d("log di sayHelloButton", "Hello, $name!")

            // Mengambil String Array Resource
            resources.getStringArray(R.array.names).forEach {
                Log.d("log di sayHelloButton", "Name: $it")
            }

            Log.i("Value Resource", "Max Age: ${resources.getInteger(R.integer.maxAge).toString()}")
            Log.i("Value Resource", "Is Login: ${resources.getBoolean(R.bool.isLogin).toString()}")
            Log.i("Value Resource", "Color Primary: ${resources.getColor(R.color.colorPrimary, theme).toString()}")
            Log.i("Value Resource", resources.getIntArray(R.array.maxAge).joinToString(", "))

            //sayHelloButton.setBackgroundColor(resources.getColor(R.color.colorPrimary, theme))
            sayHelloTextView2.setBackgroundColor(resources.getColor(R.color.colorPrimary, theme))
        
            // drawable resource :
            val drawable = resources.getDrawable(R.drawable.gambar_lucu, theme)
            sayHelloTextView2.background = drawable
            val params = sayHelloTextView2.layoutParams
            params.width = (100 * resources.displayMetrics.density).toInt()
            params.height = (100 * resources.displayMetrics.density).toInt()
            sayHelloTextView2.layoutParams = params

            // Asset manager : 
            var json = resources.assets.open("sample.json")
            .bufferedReader()
            .use { it.readText()}

            Log.d("log Pemanggilan Asset JSON", json)

            // raw resource :
            var json2 = resources.openRawResource(R.raw.sample)
            .bufferedReader()
            .use { it.readText()}

            Log.d("log Pemanggilan Raw JSON", json2)
        }

        cekDeviceFeature.setOnClickListener {
            // Device Feature Device Compatibility :
            if (packageManager.hasSystemFeature(PackageManager.FEATURE_FINGERPRINT)) {
                Log.d("log di Device Feature", "Fingerprint supported")
            } else {
                Log.d("log di Device Feature", "Fingerprint not supported")
            }
        }
    }
}

