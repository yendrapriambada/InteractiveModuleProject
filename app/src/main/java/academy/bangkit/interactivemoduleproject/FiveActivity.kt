package academy.bangkit.interactivemoduleproject

import academy.bangkit.interactivemoduleproject.databinding.ActivityFiveBinding
import academy.bangkit.interactivemoduleproject.databinding.ActivityFourBinding
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class FiveActivity : AppCompatActivity() {
    private lateinit var binding: ActivityFiveBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFiveBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnPrev.setOnClickListener {
            Intent(this, FourActivity::class.java).also {
                startActivity(it)
            }
        }
    }
}