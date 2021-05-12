package com.le.book.chapter3;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.le.book.R;

public class MainTitle extends AppCompatActivity {

    //自身类中添加 静态 start方法，参数使用需要的数据，启动时其他类直接调用该方法
    public static void actionStart(Context context, String data1, String data2) {
        Intent intent = new Intent(context, MainTitle.class);
        intent.putExtra("param1", data1);
        intent.putExtra("param2", data2);
        context.startActivity(intent);
    }


    //添加、引入布局 标题栏
    //MainTitle  TitleLayout  activity_main_title.xml title_layout.xml
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_title);
        ActionBar actionbar = getSupportActionBar();//隐藏系统自带标题栏
        if (actionbar != null) {
            actionbar.hide();
        }
    }

    //返回键，此时会调用 onBackPressed() 可以重写 添加要返回的数据
    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

}
