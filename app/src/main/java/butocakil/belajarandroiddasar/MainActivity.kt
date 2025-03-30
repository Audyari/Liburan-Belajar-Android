package butocakil.belajarandroiddasar

import android.os.Bundle
import androidx.activity.ComponentActivity
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.hello_word)


        val nameEditText = findViewById<EditText>(R.id.nameEditText)
        val sayHelloButton = findViewById<Button>(R.id.sayHelloButton)
        val sayHelloTextView = findViewById<TextView>(R.id.sayHelloTextView)

        sayHelloButton.setOnClickListener {
            val name = nameEditText.text.toString()
            sayHelloTextView.text = "Hello, $name!"
        }
    }
}

