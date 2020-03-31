package com.example.drawableexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnGradient, btnCorner, btnRing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnGradient = findViewById(R.id.btn_gradient);
        btnCorner = findViewById(R.id.btn_corner);
        btnRing = findViewById(R.id.btn_ring);

        btnGradient.setOnClickListener(this);
        btnCorner.setOnClickListener(this);
        btnRing.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = null;
        switch (v.getId()) {
            case R.id.btn_gradient:
                intent = new Intent(this, Gradient.class);
                break;
            case R.id.btn_corner:
                intent = new Intent(this, Corner.class);
                break;
            case R.id.btn_ring:
                setContentView(R.layout.ring);
                break;
        }
        if (intent != null) startActivity(intent);
    }
}
