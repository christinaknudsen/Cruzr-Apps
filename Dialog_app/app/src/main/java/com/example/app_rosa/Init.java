package com.example.app_rosa;

import android.app.Application;

import com.ubtrobot.Robot;

public class Init extends Application {
    @Override
    public void onCreate(){
        super.onCreate();

        Robot.initialize( this);
    }
}
