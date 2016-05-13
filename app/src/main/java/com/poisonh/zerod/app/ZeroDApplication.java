package com.poisonh.zerod.app;

import android.app.Application;

import com.hyphenate.chat.EMClient;
import com.hyphenate.chat.EMOptions;

/**
 * Created by PoisonH on 2016/5/13.
 */
public class ZeroDApplication extends Application
{
    @Override
    public void onCreate()
    {
        super.onCreate();
        EMOptions mEMOptions = new EMOptions();
        mEMOptions.setAutoLogin(true);
        EMClient.getInstance().init(this, mEMOptions);
    }
}
