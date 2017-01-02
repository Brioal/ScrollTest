package com.brioal.scrolltest.view;

import android.content.Context;
import android.support.v4.view.ViewCompat;
import android.support.v4.widget.ViewDragHelper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

/**
 * Emlail : brioal@foxmail.com
 * Github : https://github.com/Brioal
 * Created by Brioal on 2017/1/2.
 */

public class MethodView7 extends ViewGroup {
    private View mView;
    private ViewDragHelper mHelper;

    public MethodView7(Context context) {
        this(context, null);
    }

    public MethodView7(Context context, AttributeSet attrs) {
        super(context, attrs);
        mHelper = ViewDragHelper.create(this, new ViewDragHelper.Callback() {
            @Override
            public boolean tryCaptureView(View child, int pointerId) {
                return child == mView;
            }

            @Override
            public int clampViewPositionVertical(View child, int top, int dy) {
                return top;
            }

            @Override
            public int clampViewPositionHorizontal(View child, int left, int dx) {
                return left;
            }
        });
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        mView = getChildAt(0);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        return mHelper.shouldInterceptTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        mHelper.processTouchEvent(event);
        return true;
    }

    @Override
    public void computeScroll() {
        if (mHelper.continueSettling(true)) {
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
        mView.layout(16, 16,  216, 216);
    }
}
