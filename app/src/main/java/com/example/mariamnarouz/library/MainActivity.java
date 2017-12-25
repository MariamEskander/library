package com.example.mariamnarouz.library;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.android.mariam.calculater.Calculations;

public class MainActivity extends AppCompatActivity {

    int a = 10 , b  =5;
    Calculations calculations= new Calculations();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i("class", "add  "+ calculations.sub(a,b));
    }
}
