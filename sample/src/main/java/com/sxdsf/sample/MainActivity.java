package com.sxdsf.sample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.sxdsf.sample.lesson1.Lesson1Activity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btnLesson1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                jump(Lesson1Activity.class);
            }
        });
    }

    private void jump(Class<?> activity) {
        Intent tIntent = new Intent();
        tIntent.setClass(this, activity);
        startActivity(tIntent);
    }
}
