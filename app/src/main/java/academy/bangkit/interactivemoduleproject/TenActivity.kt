package academy.bangkit.interactivemoduleproject

import academy.bangkit.interactivemoduleproject.databinding.ActivityMainBinding
import academy.bangkit.interactivemoduleproject.databinding.ActivityTenBinding
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class TenActivity : AppCompatActivity() {
    private lateinit var binding: ActivityTenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTenBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnPrev.setOnClickListener{
            Intent(this@TenActivity, ElevenActivity::class.java).also {
                startActivity(it)
            }
        }
    }
}