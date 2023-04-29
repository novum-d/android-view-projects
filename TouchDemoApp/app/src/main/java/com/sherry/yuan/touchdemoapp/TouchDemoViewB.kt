package com.sherry.yuan.touchdemoapp

import android.content.Context
import android.util.AttributeSet
import android.view.MotionEvent
import android.view.View

class TouchDemoViewB(
    context: Context,
    attrs: AttributeSet? = null
) : View(context, attrs) {

    override fun dispatchTouchEvent(ev: MotionEvent): Boolean {
        val res = super.dispatchTouchEvent(ev)
        parent.requestDisallowInterceptTouchEvent(true)
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
        // B's onTouch
    }

    companion object {
        const val VIEW_NAME = "View B"
    }
}
