package com.sherry.yuan.touchdemoapp

import android.content.Context
import android.util.AttributeSet
import android.view.MotionEvent
import android.widget.FrameLayout

class TouchDemoFrameLayout(
    context: Context,
    attrs: AttributeSet? = null
) : FrameLayout(context, attrs) {

    override fun dispatchTouchEvent(ev: MotionEvent): Boolean {
        val res  = super.dispatchTouchEvent(ev)
        TouchDemoLogger.logTouch(
            action = ev.action,
            viewName = VIEW_NAME,
            function =  "dispatchTouchEvent",
            result = res
        )
        return res
    }

    override fun onInterceptTouchEvent(ev: MotionEvent): Boolean {
        val res  = super.onInterceptTouchEvent(ev)
        TouchDemoLogger.logTouch(
            action = ev.action,
            viewName = VIEW_NAME,
            function =  "onInterceptTouchEvent",
            result = res
        )
        return res
    }

    override fun onTouchEvent(event: MotionEvent): Boolean {
        val res  = super.onTouchEvent(event)
        TouchDemoLogger.logTouch(
            action = event.action,
            viewName = VIEW_NAME,
            function =  "onTouchEvent",
            result = res
        )
        return res
    }

    companion object {
        private const val VIEW_NAME = "TouchDemoFrameLayout"
    }
}
