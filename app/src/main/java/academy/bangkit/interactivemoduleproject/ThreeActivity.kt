package academy.bangkit.interactivemoduleproject

import academy.bangkit.interactivemoduleproject.databinding.ActivityThreeBinding
import academy.bangkit.interactivemoduleproject.databinding.ActivityTwoBinding
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ThreeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityThreeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityThreeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnNext.setOnClickListener {
            Intent(this, FourActivity::class.java).also {
                startActivity(it)
            }
        }

        binding.btnPrev.setOnClickListener {
            Intent(this, TwoActivity::class.java).also {
                startActivity(it)
                finish()
            }
        }
    }
}