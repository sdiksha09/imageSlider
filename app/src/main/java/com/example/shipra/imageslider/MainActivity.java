package com.example.shipra.imageslider;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager imagePager;
        imagePager=(ViewPager)findViewById(R.id.viewPage);   //declare variable for View pager

        imageAdapter adapterView= new imageAdapter(this);
        imagePager.setAdapter(adapterView);

    }
}
