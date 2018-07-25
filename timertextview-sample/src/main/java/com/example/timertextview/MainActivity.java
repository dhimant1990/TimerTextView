package com.example.timertextview;

import android.app.Activity;
import android.os.Bundle;

import com.dhims.timerview.TimerTextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TimerTextView timerTextView = (TimerTextView) findViewById(R.id.timerTextView);
        timerTextView.setEndTime(System.currentTimeMillis() + 60 * 1000);
    }
}
