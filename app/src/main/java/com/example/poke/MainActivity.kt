package com.example.poke

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.poke.databinding.ActivityMainBinding
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

lateinit var binding:ActivityMainBinding
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val repository = BeerRepository(IBeerList())
        GlobalScope.launch (Dispatchers.Main){
            val beers = repository.getBeers()
            Toast.makeText(this@MainActivity,beers.toString(),Toast.LENGTH_SHORT).show()
        }


    }
}