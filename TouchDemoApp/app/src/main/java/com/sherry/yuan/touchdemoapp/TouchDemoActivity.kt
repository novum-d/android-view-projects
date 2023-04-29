package com.sherry.yuan.touchdemoapp

import android.os.Bundle
import android.view.GestureDetector
import android.view.MotionEvent
import android.view.ScaleGestureDetector
import androidx.appcompat.app.AppCompatActivity
import com.sherry.yuan.touchdemoapp.databinding.ActivityTouchDemoBinding

class TouchDemoActivity : AppCompatActivity() {

    private lateinit var binding: ActivityTouchDemoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTouchDemoBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupListeners()
    }

    override fun dispatchTouchEvent(ev: MotionEvent): Boolean {
        val res = super.dispatchTouchEvent(ev)
        TouchDemoLogger.logTouch(
            action = ev.action,
            viewName = VIEW_NAME,
            function = "dispatchTouchEvent",
            result = res
        )
        return  res
    }

    override fun onTouchEvent(event: MotionEvent): Boolean {
        val res = super.onTouchEvent(event)
        TouchDemoLogger.logTouch(
            action = event.action,
            viewName = VIEW_NAME,
            function = "onTouchEvent",
            result = res
        )
        return  res
    }

    private fun setupListeners() {
    }

    companion object {
        private const val VIEW_NAME = "TouchDemoActivity"
    }
}
