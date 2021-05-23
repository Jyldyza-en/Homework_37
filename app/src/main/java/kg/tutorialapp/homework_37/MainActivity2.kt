package kg.tutorialapp.homework_37

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        getEditTextFromActivity1()
    }

    private fun getEditTextFromActivity1() {

        val editText3 = intent.getStringExtra("activity1")

        val fragm = Fragment()

        val args = Bundle()

        args.putString("key", editText3.toString())
        fragm.arguments = args

        supportFragmentManager
            .beginTransaction()
            .add(R.id.container, fragm)
            .commit()
    }

}