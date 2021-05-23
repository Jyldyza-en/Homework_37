package kg.tutorialapp.homework_37

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity(), FragmentToast {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupActivity2()
    }

    private fun setupActivity2() {

        val buttonActivity1 = findViewById<Button>(R.id.button_activity)

        buttonActivity1.setOnClickListener {

            val editText2 = findViewById<EditText>(R.id.editText)

            if (editText2.text.toString().isEmpty()){
                this.ShowToast()
            }else{
                val intent = Intent(this, MainActivity2::class.java)
                intent.putExtra("activity1", editText2.text.toString())
                startActivity(intent)
            }
        }
    }

    override fun ShowToast() {
        Toast.makeText(this, "Enter text please!", Toast.LENGTH_LONG).show()
    }

}


