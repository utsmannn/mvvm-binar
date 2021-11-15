package com.utsman.mvvmbinar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.get

class MainActivity : AppCompatActivity() {

    //private val mainPresenter: MainPresenter = MainPresenterImpl(this)

    private val viewModel: MainViewModel by lazy {
        ViewModelProvider(this, defaultViewModelProviderFactory)[MainViewModel::class.java]
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel.resultLiveData.observe(this, { newValue ->
            // nilai baru
            textView(R.id.tv_result).text = newValue.toString()
        })

        button(R.id.btn_minus).setOnClickListener {
            viewModel.min()
        }

        button(R.id.btn_plus).setOnClickListener {
            viewModel.plus()
        }


    }

    private fun button(id: Int): Button = findViewById(id)
    private fun textView(id: Int): TextView = findViewById(id)
}