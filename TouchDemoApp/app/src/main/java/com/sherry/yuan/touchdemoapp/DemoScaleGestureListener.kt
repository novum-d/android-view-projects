package com.sherry.yuan.touchdemoapp

import android.view.MotionEvent
import android.view.ScaleGestureDetector

class DemoScaleGestureListener(
    private val viewName: String
) : ScaleGestureDetector.SimpleOnScaleGestureListener() {

    override fun onScale(detector: ScaleGestureDetector): Boolean {
        val res = super.onScale(detector)
        TouchDemoLogger.logTouch(
            action = MotionEvent.ACTION_UP,
            viewName = viewName,
            function = "ScaleGestureListener.onScale",
            result = res
        )
        return res
    }
}