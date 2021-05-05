package com.example.senior.book;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class BaseActivity extends AppCompatActivity {
    private String TAG = "BaseActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //BaseActivity继承 AppCompatActivity
        //其他Activity 都继承该类，进入活动页面时，相应的类名就会打印出来
        Log.d(TAG, getClass().getSimpleName());
        ActivityCollector.addActivity(this); //创建时添加
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ActivityCollector.removeActivity(this);//销毁时移除
    }

    public void onClick(View v) {
        ActivityCollector.finishAll();
        //关闭所有活动界面， killProcess(进程id参数) ，只能杀掉当前程序的进程
        android.os.Process.killProcess(android.os.Process.myPid());
        //由于ActivityManager时刻监听着进程，一旦发现进程被非正常Kill，它将会试图去重启这个进程。
        //这就是为什么，有时候当我们试图这样去结束掉应用时，发现它又自动重新启动的原因.
        //
        //System.exit()其实是Java中结束进程的方法，调用它将关闭当前的JVM虚拟机。
        //System.exit(0)表示是正常退出；
        //System.exit(1)表示是非正常退出，通常这种退出方式应该放在catch块中。
    }

}
