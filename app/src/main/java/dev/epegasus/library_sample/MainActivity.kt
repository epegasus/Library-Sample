package dev.epegasus.library_sample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.epegasus.toasting.MyToast.Companion.showToast
import dev.epegasus.library_sample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnSubmitMain.setOnClickListener { showToast("Hello World") }
    }

}