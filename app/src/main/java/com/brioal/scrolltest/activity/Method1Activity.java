package com.brioal.scrolltest.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.brioal.scrolltest.R;

public class Method1Activity extends BaseMethodActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_method1);
    }


    public static void startActivity(Context context) {
        Intent intent = new Intent(context, Method1Activity.class);
        context.startActivity(intent);
    }
}
