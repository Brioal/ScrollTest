package com.brioal.scrolltest.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.brioal.scrolltest.R;

public class Method6Activity extends BaseMethodActivity {
    View mView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_method6);
        mView = findViewById(R.id.method6_view);
        mView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation = AnimationUtils.loadAnimation(mContext, R.anim.trans_back);
                animation.setDuration(2500);
                mView.startAnimation(animation);
            }
        });
    }


    public static void startActivity(Context context) {
        Intent intent = new Intent(context, Method6Activity.class);
        context.startActivity(intent);
    }
}
