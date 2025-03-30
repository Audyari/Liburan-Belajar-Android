package butocakil.belajarandroiddasar

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

    
    private fun initComponent() {
        nameEditText = findViewById(R.id.nameEditText)
        sayHelloButton = findViewById(R.id.sayHelloButton)
        sayHelloTextView = findViewById(R.id.sayHelloTextView)
        sayHelloTextView2 = findViewById(R.id.sayHelloTextView2)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.hello_word)

        initComponent()

        sayHelloTextView2.text = resources.getString(R.string.app_name)
     
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
        }
    }
}

