package com.rayworks.databindingsample

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.rayworks.databindingsample.R.layout
import com.rayworks.databindingsample.databinding.ActivityMainBinding
import com.rayworks.databindingsample.viewmodel.PasswordViewModel

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val mainBinding: ActivityMainBinding = DataBindingUtil.setContentView<ActivityMainBinding>(
            this,
            layout.activity_main
        )
        mainBinding.viewModel = PasswordViewModel()
    }
}
