package com.example.a2012500548_aplikasigabungan_ae;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class ScrollViewActivity extends AppCompatActivity {
    Button oreo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroll_view);
        oreo = findViewById(R.id.oreo);
        oreo.setOnClickListener((view) -> {
            startActivity(new Intent(ScrollViewActivity.this, OreoActivity.class));
        });
    }
}