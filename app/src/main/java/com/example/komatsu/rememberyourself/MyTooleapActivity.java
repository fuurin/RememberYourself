package com.example.komatsu.rememberyourself;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.tooleap.sdk.Tooleap;
import com.tooleap.sdk.TooleapActivities;

/**
 * Created by komatsu on 2016/11/13.
 */

public class MyTooleapActivity extends TooleapActivities.Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tooleap);
    }
}
