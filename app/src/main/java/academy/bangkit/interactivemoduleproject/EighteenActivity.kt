package academy.bangkit.interactivemoduleproject

import academy.bangkit.interactivemoduleproject.databinding.ActivityEighteenBinding
import academy.bangkit.interactivemoduleproject.databinding.ActivitySevenTeenBinding
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class EighteenActivity : AppCompatActivity() {
    private lateinit var binding: ActivityEighteenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEighteenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnMenu.setOnClickListener {
            Intent(this, FiveActivity::class.java).also {
                startActivity(it)
                finish()
            }
        }
    }
}