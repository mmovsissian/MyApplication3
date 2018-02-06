package com.example.pink24.myapplication3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent= new Intent(MainActivity.this,MyService.class);
        startService(intent);


    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        Intent intent= new Intent(MainActivity.this,MyService.class);

        stopService(intent);
    }


}
