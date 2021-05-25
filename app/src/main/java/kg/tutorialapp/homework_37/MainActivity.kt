package kg.tutorialapp.homework_37

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity(), FragmentToast, MenuMainListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setSupportActionBar(findViewById(R.id.myToolbar))


        setupActivity2()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when(item.itemId){
            R.id.action_call -> {
                showItem1()
            }
            R.id.action_camera -> {
                showItem2()
            }
            R.id.action_settings -> {
                showItem3()
            }
            R.id.action_help -> {
                showItem4()
            }
        }
        return super.onOptionsItemSelected(item)
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

    override fun showItem1() {
        Toast.makeText(this, "Call", Toast.LENGTH_LONG).show()
    }

    override fun showItem2() {
        Toast.makeText(this, "Camera", Toast.LENGTH_LONG).show()
    }

    override fun showItem3() {
        Toast.makeText(this, "Settings", Toast.LENGTH_LONG).show()
    }

    override fun showItem4() {
        Toast.makeText(this, "Help", Toast.LENGTH_LONG).show()
    }
}


