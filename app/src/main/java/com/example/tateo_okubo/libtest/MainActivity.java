package com.example.tateo_okubo.libtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import net.example.liba.LibA;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        LibA.VALUE = 100;
    }
}
