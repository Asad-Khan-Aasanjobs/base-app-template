package com.asadkhan.base_app

import android.app.Activity
import android.os.Bundle
import android.os.Handler
import com.asadkhan.global.Constants
import kotlinx.android.synthetic.main.activity_main.tv_hello_world

class MainActivity : Activity() {
  
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    Handler().postDelayed({
      tv_hello_world.text = getString(R.string.hello_world)
    }, 2000)
    val answerToEverything = Constants.answerToEverything()
  }
}
