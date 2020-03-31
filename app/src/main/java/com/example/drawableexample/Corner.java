package com.example.drawableexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Corner extends AppCompatActivity implements View.OnClickListener {

    Button btnRadiusAll, btnRadiusSingle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_corner);

        btnRadiusAll = findViewById(R.id.btn_radius_all);
        btnRadiusSingle = findViewById(R.id.btn_radius_single);

        btnRadiusAll.setOnClickListener(this);
        btnRadiusSingle.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int viewId = 0;
        switch (v.getId()) {
            case R.id.btn_radius_single:
                viewId = R.layout.radius_single;
                break;
            case R.id.btn_radius_all:
                viewId = R.layout.radius_all;
                break;
        }
        setContentView(viewId);
    }
}
