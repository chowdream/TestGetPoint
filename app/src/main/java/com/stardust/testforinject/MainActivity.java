package com.stardust.testforinject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Button target = (Button) findViewById(R.id.target_button);
//        target.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(v.getContext(), "Target Button was pressed by hidden service!", Toast.LENGTH_SHORT).show();
//            }
//        });

    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if (event.getAction() == MotionEvent.ACTION_DOWN)
            Toast.makeText(this, "Touch Down occured at (" + event.getX() + ", " + event.getY() + ")", Toast.LENGTH_SHORT).show();
        return super.onTouchEvent(event);
    }
}