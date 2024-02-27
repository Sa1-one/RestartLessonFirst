package first.sai.restartlessonfirst

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import first.sai.restartlessonfirst.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.menuOne.setOnClickListener {
            Toast.makeText(this,"Menu", Toast.LENGTH_SHORT).show()
        }
        binding.buttonTwo.setOnClickListener {
            Toast.makeText(this,"Izbrannoe", Toast.LENGTH_SHORT).show()
        }
        binding.buttonThree.setOnClickListener {
            Toast.makeText(this,"Posmotret Pozje", Toast.LENGTH_SHORT).show()
        }
        binding.buttonFour.setOnClickListener {
            Toast.makeText(this,"Podborki", Toast.LENGTH_SHORT).show()
        }
        binding.buttonFive.setOnClickListener {
            Toast.makeText(this,"Nastroiki", Toast.LENGTH_SHORT).show()
        }



        fun initMenuButtons(){

        }

    }
}