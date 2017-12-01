package com.ashish.carousalviewandroid

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        container.adapter = PagerAdapter(supportFragmentManager)
        container.setPageTransformer(false, CarousalEffectTransformer(this));
    }

}
