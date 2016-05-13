package com.poisonh.zerod.base;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

/**
 * Created by PoisonH on 2016/5/13.
 */
public class BaseActivity extends AppCompatActivity
{
    private static final String TAG = "BaseActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        Log.i(TAG, getClass().getSimpleName());
    }
}
