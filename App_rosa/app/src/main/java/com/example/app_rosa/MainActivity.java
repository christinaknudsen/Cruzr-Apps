package com.example.app_rosa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    //private EditText mDegVal;
    private int rotAng;
    private EditText dflowText;

    private Button btnPlay, btnStop, btnRecord,btnStopRecord;
    final int REQUEST_PERMISSION_CODE = 1000;

    private static final String TAG = MainActivity.class.getSimpleName();

    //Create a new instance of LightActivity.
    private LightActivity light = new LightActivity();
    private NavActivity nav = new NavActivity();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //mDegVal = findViewById(R.id.turnDeg);
        rotAng = 20;
    }

    //Create a lightOn method that uses a view param so that a button can access it via onClick.
    public void lightOn(View view) {
        light.turnOn();
    }
    //Create a lightOff method that uses a view param so that a button can access it via onClick.
    public void lightOff(View view) {
        light.turnOff();
    }

    //Create a color method that uses a view param so that a button can access it via onClick.
    public void color(View view) {
        light.changeColor();
    }


    public void rotateRight(View view) {
        nav.rotate(-rotAng);
    }
    public void rotateLeft(View view) {
        nav.rotate(rotAng);
    }
    public void forward(View view) {
        nav.moveForward();
    }
    public void backward(View view) {
        nav.moveBackward();
    }


}
