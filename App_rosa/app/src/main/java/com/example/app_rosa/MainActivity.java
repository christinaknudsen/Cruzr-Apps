package com.example.app_rosa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    //Create a new instance of LightActivity.
    private LightActivity light = new LightActivity();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

}
