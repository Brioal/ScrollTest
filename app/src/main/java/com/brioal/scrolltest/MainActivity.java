package com.brioal.scrolltest;

import android.os.Bundle;
import android.view.View;

import com.brioal.scrolltest.activity.BaseMethodActivity;
import com.brioal.scrolltest.activity.Method1Activity;
import com.brioal.scrolltest.activity.Method2Activity;
import com.brioal.scrolltest.activity.Method3Activity;
import com.brioal.scrolltest.activity.Method4Activity;
import com.brioal.scrolltest.activity.Method5Activity;
import com.brioal.scrolltest.activity.Method6Activity;
import com.brioal.scrolltest.activity.Method7Activity;

public class MainActivity extends BaseMethodActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //第一种实现方式
    public void method1(View view) {
        Method1Activity.startActivity(mContext);
    }

    //第二种实现方式
    public void method2(View view) {
        Method2Activity.startActivity(mContext);
    }

    //第三种实现方式
    public void method3(View view) {
        Method3Activity.startActivity(mContext);
    }

    //第四种实现方式
    public void method4(View view) {
        Method4Activity.startActivity(mContext);
    }

    //第五种实现方式
    public void method5(View view) {
        Method5Activity.startActivity(mContext);
    }

    //第六种实现方式
    public void method6(View view) {
        Method6Activity.startActivity(mContext);
    }

    //第七种实现方式
    public void method7(View view) {
        Method7Activity.startActivity(mContext);
    }
}
