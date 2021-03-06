package com.brioal.scrolltest.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

/**
 * Emlail : brioal@foxmail.com
 * Github : https://github.com/Brioal
 * Created by Brioal on 2017/1/1.
 */

public class MethodView3 extends View {
    public MethodView3(Context context) {
        super(context);
    }

    public MethodView3(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    private int mLastX = 0;
    private int mLastY = 0;

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        int x = (int) event.getX();
        int y = (int) event.getY();
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                mLastX = x;
                mLastY = y;
                break;
            case MotionEvent.ACTION_MOVE:
                int offsetX = x - mLastX;
                int offsetY = y - mLastY;
                ViewGroup.MarginLayoutParams params = (ViewGroup.MarginLayoutParams) getLayoutParams();
                params.leftMargin = getLeft() + offsetX;
                params.topMargin = getTop() + offsetY;
                setLayoutParams(params);
                break;
        }
        return true;
    }
}
