package com.example.drawableshapeexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnGradient, btnCorner, btnRing, btnOval, btnStroke, btnLine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnGradient = findViewById(R.id.btn_gradient);
        btnCorner = findViewById(R.id.btn_corner);
        btnRing = findViewById(R.id.btn_ring);
        btnOval = findViewById(R.id.btn_oval);
        btnStroke = findViewById(R.id.btn_stroke);
        btnLine = findViewById(R.id.btn_line);

        btnGradient.setOnClickListener(this);
        btnCorner.setOnClickListener(this);
        btnRing.setOnClickListener(this);
        btnOval.setOnClickListener(this);
        btnStroke.setOnClickListener(this);
        btnLine.setOnClickListener(this);
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
            case R.id.btn_oval:
                setContentView(R.layout.oval);
                break;
            case R.id.btn_stroke:
                setContentView(R.layout.stroke);
                break;
            case R.id.btn_line:
                setContentView(R.layout.line);
                break;
        }
        if (intent != null) startActivity(intent);
    }
}
