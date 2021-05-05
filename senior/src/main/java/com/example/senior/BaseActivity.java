package com.example.senior;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class BaseActivity extends AppCompatActivity {
    private String TAG = "BaseActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //BaseActivity继承 AppCompatActivity
        //其他Activity 都继承该类，进入活动页面时，相应的类名就会打印出来
        Log.d(TAG, getClass().getSimpleName());
    }
}
