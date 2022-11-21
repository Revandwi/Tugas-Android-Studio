package com.example.a2012500548_revan_fragment;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;

import androidx.viewpager.widget.ViewPager;

public class CustomViewPager extends ViewPager {

    public boolean mIsEnableSwipe = false;

    public CustomViewPager(Context context) {
        super(context);
    }

    public CustomViewPager(Context context, AttributeSet attributeSet){
        super(context, attributeSet);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent event) {
        return mIsEnableSwipe;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        return mIsEnableSwipe;
    }
}
