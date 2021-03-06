package com.example.sensor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.sensor_btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendMessage();
            }
        });

        Button shakeBtn = findViewById(R.id.shake_btn);
        shakeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goShake();
            }
        });

        Button posButton = findViewById(R.id.pos_btn);
        posButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goPos();
            }
        });

        Button rotateButton = findViewById(R.id.rotate_btn);
        rotateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goRotate();
            }
        });
    }

    public void sendMessage() {
        Intent intent = new Intent(this, SensorActivity.class);
        startActivity(intent);
    }

    public void goShake() {
        Intent intent = new Intent(this, ShakeActivity.class);
        startActivity(intent);
    }

    public void goPos() {
        Intent intent = new Intent(this, PositionActivity.class);
        startActivity(intent);
    }

    public void goRotate() {
        Intent intent = new Intent(this, RotateActivity.class);
        startActivity(intent);
    }

}