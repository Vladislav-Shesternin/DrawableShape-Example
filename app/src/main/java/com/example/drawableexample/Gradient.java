package com.example.drawableexample;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Gradient extends AppCompatActivity implements View.OnClickListener {
    Button btnLinear, btnRadial, btnSweep, btnRadialXY, btnSweepXY;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gradient);
        btnLinear = findViewById(R.id.btn_linear);
        btnRadial = findViewById(R.id.btn_radial);
        btnSweep = findViewById(R.id.btn_sweep);
        btnRadialXY = findViewById(R.id.btn_radial_xy);
        btnSweepXY = findViewById(R.id.btn_sweep_xy);

        btnLinear.setOnClickListener(this);
        btnRadial.setOnClickListener(this);
        btnSweep.setOnClickListener(this);
        btnRadialXY.setOnClickListener(this);
        btnSweepXY.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int viewId = 0;
        switch (v.getId()) {
            case R.id.btn_linear:
                viewId = R.layout.gradient_linear;
                break;
            case R.id.btn_radial:
                viewId = R.layout.gradient_radial;
                break;
            case R.id.btn_sweep:
                viewId = R.layout.gradient_sweep;
                break;
            case R.id.btn_radial_xy:
                viewId = R.layout.gradient_radial_xy;
                break;
            case R.id.btn_sweep_xy:
                viewId = R.layout.gradient_sweep_xy;
                break;
        }
        setContentView(viewId);
    }
}
