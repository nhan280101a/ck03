package com.example.frag.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.frag.R;

<<<<<<< HEAD:app/src/main/java/com/example/frag/activity/Tour_choosedate.java
public class Tour_choosedate extends AppCompatActivity {
    private TextView tvTitle;
    private TextView tvTourName;
=======
public class Tour_choosedate2 extends AppCompatActivity {
>>>>>>> bb1ef9ade51c3533b412a687bb7c9bbf95960b5d:app/src/main/java/com/example/frag/activity/Tour_choosedate2.java

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
<<<<<<< HEAD:app/src/main/java/com/example/frag/activity/Tour_choosedate.java
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
=======
        setContentView(R.layout.activity_tour_choosedate2);
>>>>>>> bb1ef9ade51c3533b412a687bb7c9bbf95960b5d:app/src/main/java/com/example/frag/activity/Tour_choosedate2.java
    }
}