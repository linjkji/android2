package com.le.book;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.le.book.chapter3.ListActivity;
import com.le.book.chapter3.MainTitle;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_title).setOnClickListener((View.OnClickListener) this);
        findViewById(R.id.btn_list).setOnClickListener((View.OnClickListener) this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn_title){
            Intent intent = new Intent(this, MainTitle.class);
            startActivity(intent);
        }
        if (v.getId() == R.id.btn_list){
            Intent intent = new Intent(this, ListActivity.class);
            startActivity(intent);
        }
    }
}
