package com.practicalcoding.lifecycleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private static final String ID = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i(ID, "onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.i(ID, "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.i(ID, "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.i(ID, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.i(ID, "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.i(ID, "onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Log.i(ID, "onRestart");
    }

    public void changeToActivityTwo(View view){
        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);
    }
}
