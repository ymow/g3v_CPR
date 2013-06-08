package com.example.cp9_1;

import org.apache.cordova.DroidGap;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;



public class MainActivity extends DroidGap {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.loadUrl("file:///android_asset/www/index.html");
      // setContentView(R.layout.activity_hello_hell);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
 }
