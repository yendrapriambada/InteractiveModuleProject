package academy.bangkit.interactivemoduleproject

import academy.bangkit.interactivemoduleproject.databinding.ActivityFifteenBinding
import academy.bangkit.interactivemoduleproject.databinding.ActivitySevenTeenBinding
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SevenTeenActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySevenTeenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySevenTeenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnNext.setOnClickListener {
            Intent(this, EighteenActivity::class.java).also {
                startActivity(it)
                finish()
            }
        }
    }
}