package com.example.frag.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.frag.R;

public class Tour_choosedate extends AppCompatActivity {
    private TextView tvTitle;
    private TextView tvTourName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tour_choosedate);

        initViews();

        Bundle bundle = getIntent().getExtras();
        String name = bundle.getString("name");

        tvTitle.setText(name);
        tvTourName.setText(name);
    }
    private void initViews() {
        tvTitle = findViewById(R.id.tvTitle);
        tvTourName = findViewById(R.id.tvTourName);
    }
}