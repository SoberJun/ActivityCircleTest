package com.example.jun.activitylifecircletest;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;


/**
 * Created by Administrator on 2016/1/4.
 */
public class NormalActivity extends Activity{
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.normal_layout);
    }
}
