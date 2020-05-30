package com.example.rickybenkovich.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button mButton = null;

    private static final String TAG = MainActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButton = (Button) findViewById(R.id.myButton);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeChart(v);
            }
        });
    }
    public void makeChart(View view){
        Intent startNewActivity = new Intent(this,DisplayWeatherChart.class);
        startActivity(startNewActivity);
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "i method onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "i method onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "i method onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "i method onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "i method onDestroy");

    }
}
