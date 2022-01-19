package com.jiaotailang.flutterdemo;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.idlefish.flutterboost.FlutterBoost;
import com.idlefish.flutterboost.FlutterBoostRouteOptions;

import java.util.HashMap;
import java.util.Timer;
import java.util.TimerTask;

import io.flutter.embedding.android.FlutterActivity;

public class MainActivity extends AppCompatActivity {

    private CountDownTimer simplePage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.textView).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                simplePage.start();

            }

        });
        simplePage = new CountDownTimer(2000, 1000) {

            @Override
            public void onTick(long l) {

            }

            @Override
            public void onFinish() {
                FlutterBoostRouteOptions options = new FlutterBoostRouteOptions.Builder()
                        .pageName("SimplePage")
                        .arguments(new HashMap<>())
                        .requestCode(1111)
                        .build();
                FlutterBoost.instance().open(options);
            }
        };
    }

}