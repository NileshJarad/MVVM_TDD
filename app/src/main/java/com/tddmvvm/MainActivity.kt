package com.tddmvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tddmvvm.utils.extension.showFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainFrameLayout.showFragment(
            supportFragmentManager = supportFragmentManager,
            LoginFragment.getLoginInstance()
        )
    }
}