package com.brioal.scrolltest.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.brioal.scrolltest.R;

public class Method5Activity extends BaseMethodActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_method5);
    }

    public static void startActivity(Context context) {
        Intent intent = new Intent(context, Method5Activity.class);
        context.startActivity(intent);
    }
}
