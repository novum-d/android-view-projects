package com.sherry.yuan.touchdemoapp

import android.view.GestureDetector
import android.view.MotionEvent

class DemoGestureDetectorListener(private val viewName: String) : GestureDetector.SimpleOnGestureListener() {
    override fun onDoubleTap(e: MotionEvent): Boolean {
        val res = super.onDoubleTap(e)
        TouchDemoLogger.logTouch(
            action = e.action,
            viewName = viewName,
            function = "GestureDetectorListener.onDoubleTap",
            result = res
        )
        return res
    }

    override fun onFling(
        e1: MotionEvent,
        e2: MotionEvent,
        velocityX: Float,
        velocityY: Float
    ): Boolean {
        val res = super.onFling(e1, e2, velocityX, velocityY)
        TouchDemoLogger.logTouch(
            action = e1.action,
            viewName = viewName,
            function = "GestureDetectorListener.onFling",
            result = res
        )
        return res
    }
}