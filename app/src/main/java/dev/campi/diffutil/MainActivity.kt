package dev.campi.diffutil

import android.graphics.Color
import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import dev.campi.diffutil.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private lateinit var adapter: CustomAdapter

    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.lifecycleOwner = this
        binding.viewmodel = viewModel

        adapter = CustomAdapter(listener)

        binding.rvMain.adapter = adapter
//        adapter.submitList(Objeto.listaDeCuatro)
    }

    private val listener = CustomAdapter.OnMensajeClic { obj, view ->
        view.setBackgroundColor(
            arrayOf(
                Color.CYAN,
                Color.GREEN,
                Color.MAGENTA,
                Color.LTGRAY,
                Color.YELLOW
            ).random()
        )
        Toast.makeText(applicationContext, obj.mensaje, Toast.LENGTH_SHORT).show()
    }
}