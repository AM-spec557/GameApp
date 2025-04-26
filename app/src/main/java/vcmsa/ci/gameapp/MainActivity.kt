package vcmsa.ci.gameapp

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() , View.OnClickListener {

    lateinit var btnWord: Button
    lateinit var btnGuess: Button
    lateinit var btnAdd: Button
    lateinit var btnEqual: Button
    lateinit var etA: EditText
    lateinit var etB: EditText
    lateinit var etC: EditText
    lateinit var playTv: TextView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnWord = findViewById(R.id.btn_word)
        btnGuess = findViewById(R.id.btn_guess)
        btnAdd = findViewById(R.id.btn_add)
        btnEqual = findViewById(R.id.btn_equal)
        etA = findViewById(R.id.et_a)
        etB = findViewById(R.id.et_b)
        etC = findViewById(R.id.et_c)
        playTv = findViewById(R.id.play_tv)

        btnWord.setOnClickListener(this)
        btnGuess.setOnClickListener(this)
        btnAdd.setOnClickListener(this)
        btnEqual.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        var a = etA.text.toString().toDouble()
        var b = etB.text.toString().toDouble()
        var c = etC.text.toString().toDouble()
        var play = 0.0
        when (v?.id) {
            R.id.btn_word -> {
                play = a + b + c
            }

            R.id.btn_guess -> {
                play = a + b + c
            }

            R.id.btn_add -> {
                play = a + b + c
            }

            R.id.btn_equal -> {
                play = a + b + c
            }
        }
        playTv.text = "Play is $play"
    }
}