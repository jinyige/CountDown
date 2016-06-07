package com.example.navigationdrawer;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ViewUtils;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.lidroid.xutils.view.annotation.ViewInject;

public class SplashActivity extends AppCompatActivity {
//    @ViewInject(R.id.login_P)
//    private ImageView login_p;
//    @ViewInject(R.id.login_layout)
//    private RelativeLayout relativeLayout;
    private static final int DELAY_TIME = 2000;
        @Override
        public void onCreate (Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
//        ViewUtils.inject(this);
            supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager
                    .LayoutParams.FLAG_FULLSCREEN);
            setContentView(R.layout.activity_splash);
//            com.lidroid.xutils.ViewUtils.inject(this);
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    startActivity(new Intent(SplashActivity.this, MainActivity.class));
                    overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
                    finish();
                }
            }, DELAY_TIME);
        }
    }

