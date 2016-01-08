package com.example.jun.activitylifecircletest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.*;
import android.view.Window;
import android.widget.Button;

public class MainActivity extends Activity {
    final String TAG="MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate");
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

        if(savedInstanceState!=null){
            String tempData= savedInstanceState.getString("save_data");
            Log.d(TAG,tempData);
        }
        Button startNormal = (Button) findViewById(R.id.start_normal);
        Button startDialog = (Button) findViewById(R.id.start_dialog);

        startNormal.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, NormalActivity.class);
                startActivity(intent);
            }
        });
        startDialog.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DialogActivity.class);
                startActivity(intent);
            }
        });
    }
        protected void onSaveInstanceState(Bundle outState){
            super.onSaveInstanceState(outState);
            String tempData="something you just typed";
            outState.putString("save_data",tempData);
        }
        protected void onStart(){
            super.onStart();
            Log.d(TAG,"onStart");
        }
        protected void onResume(){
            super.onResume();
            Log.d(TAG, "onResume");
        }
        protected void onPause(){
            super.onPause();
            Log.d(TAG, "onPause");
        }
        protected void onStop(){
            super.onStop();
            Log.d(TAG, "onStop");
        }
        protected void onDestroy(){
            super.onRestart();
            Log.d(TAG, "onDestroy");
        }
        protected void onRestart(){
            super.onRestart();
            Log.d(TAG, "onRestart");
        }
}


