package com.brioal.scrolltest.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Scroller;

/**
 * Emlail : brioal@foxmail.com
 * Github : https://github.com/Brioal
 * Created by Brioal on 2017/1/1.
 */

public class MethodView5 extends View {
    private Scroller mScroller;
    public MethodView5(Context context, AttributeSet attrs) {
        super(context, attrs);
        mScroller = new Scroller(context);
    }

    private int mLastX = 0;
    private int mLastY = 0;

    @Override
    public void computeScroll() {
        super.computeScroll();
        if (mScroller.computeScrollOffset()) {
            View parent = (View) getParent();
            parent.scrollTo(mScroller.getCurrX(), mScroller.getCurrY());
            //通过重绘来不断调用computeScroll
            invalidate();
        }
    }

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
                ((View) getParent()).scrollBy(-offsetX, -offsetY);
                break;
            case MotionEvent.ACTION_UP:
                View parent = (View) getParent();
                mScroller.startScroll(parent.getScrollX(), parent.getScrollY() ,- parent.getScrollX(), -parent.getScrollY(),2500);
                //激活滑动操作
                invalidate();
                break;
        }
        return true;
    }

}
