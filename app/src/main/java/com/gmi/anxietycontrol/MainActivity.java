package com.gmi.anxietycontrol;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

public class MainActivity extends AppCompatActivity {
//ConstraintLayout con=new ConstraintLayout(this);
//ConstraintLayout con;
    View someView = findViewById(R.id.layout1);
    View con=someView.getRootView();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        con=findViewById(R.id.layout1);

        Handler handler=new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                con.setBackgroundColor(Color.parseColor("#000000"));
            }
        },2500);

    }
}