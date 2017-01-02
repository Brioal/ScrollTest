package com.brioal.scrolltest.activity;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Emlail : brioal@foxmail.com
 * Github : https://github.com/Brioal
 * Created by Brioal on 2017/1/1.
 */

public  class BaseMethodActivity extends AppCompatActivity {
    protected Context mContext;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        mContext = this;
        super.onCreate(savedInstanceState);
    }

}
