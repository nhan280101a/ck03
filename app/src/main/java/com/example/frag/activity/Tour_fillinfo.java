package com.example.frag.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.frag.R;

public class Tour_fillinfo extends AppCompatActivity {
<<<<<<< HEAD


=======
    private Button btnPay;
>>>>>>> ddbc492e275de1af922c5ee69eef8efe8414a6be
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tour_fillinfo);

        initViews();

        btnPay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Tour_fillinfo.this, Tour_paysuccess.class);
                startActivity(intent);
            }
        });
    }

    private void initViews() {
        btnPay = findViewById(R.id.btnPay);
    }
}