package com.brioal.scrolltest.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.brioal.scrolltest.R;

public class Method4Activity extends BaseMethodActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_method4);
    }

    public static void startActivity(Context context) {
        Intent intent = new Intent(context, Method4Activity.class);
        context.startActivity(intent);
    }

}
