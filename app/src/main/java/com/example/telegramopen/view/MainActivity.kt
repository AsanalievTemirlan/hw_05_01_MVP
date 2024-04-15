package com.example.telegramopen.view

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.telegramopen.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), CounterView {

    private lateinit var binding: ActivityMainBinding
    private val presenter = Presenter(this)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initListener()
    }

    private fun initListener() = with(binding) {
        btnPlus.setOnClickListener {
            presenter.incrementCounter()
        }
        btnMinus.setOnClickListener {
            presenter.decrementCounter()
        }
    }

    override fun showNewCount(number: Int) {
        binding.tvNum.text = number.toString()
    }

    override fun showToast(context: String) {
        Toast.makeText(this, context, Toast.LENGTH_SHORT).show()
    }

    override fun changeColor() {
        binding.tvNum.setTextColor(Color.GREEN)
    }
}