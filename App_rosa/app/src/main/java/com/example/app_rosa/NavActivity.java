package com.example.app_rosa;

import android.app.Application;

import com.ubtrobot.Robot;
import com.ubtrobot.locomotion.LocomotionManager;

public class NavActivity extends Application {
    private LocomotionManager mManager = Robot.globalContext().getSystemService(LocomotionManager.SERVICE);

    float dist = (float) 0.2;

    public void rotate(float angle) {
        mManager.turnBy(angle);
    }

    public void moveForward() {
        mManager.moveStraightBy(0, dist);
    }

    public void moveBackward() {
        mManager.moveStraightBy(180, dist);
    }
}
