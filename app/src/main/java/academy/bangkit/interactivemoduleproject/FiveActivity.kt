package academy.bangkit.interactivemoduleproject

import academy.bangkit.interactivemoduleproject.databinding.ActivityFiveBinding
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class FiveActivity : AppCompatActivity() {
    private lateinit var binding: ActivityFiveBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFiveBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            btnPrev.setOnClickListener {
                Intent(this@FiveActivity, FourActivity::class.java).also {
                    startActivity(it)
                }
            }
            btnCp.setOnClickListener {
                Intent(this@FiveActivity, SixActivity::class.java).also {
                    startActivity(it)
                }
            }
            btnTp.setOnClickListener {
                Intent(this@FiveActivity, SevenActivity::class.java).also {
                    startActivity(it)
                }
            }
            btnMke.setOnClickListener {
                Intent(this@FiveActivity, EightActivity::class.java).also {
                    startActivity(it)
                }
            }
            btnKunjaw.setOnClickListener {
                Intent(this@FiveActivity, TwentyOneActivity::class.java).also {
                    startActivity(it)
                }
            }
            btnDapus.setOnClickListener {
                Intent(this@FiveActivity, TwentyTwoActivity::class.java).also {
                    startActivity(it)
                }
            }
        }
    }
}