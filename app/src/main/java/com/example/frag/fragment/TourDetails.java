package com.example.frag.fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.frag.Adapter.TourDetailsAdapter;
import com.example.frag.model.TourPhoto;
import com.example.frag.R;
import com.example.frag.model.Trend_ItemList;
import com.example.frag.model.photo1;

import java.util.ArrayList;
import java.util.List;

import me.relex.circleindicator.CircleIndicator3;

public class TourDetails extends AppCompatActivity {
    private ViewPager2 mviewPager2;
    private CircleIndicator3 mcircleIndicator3;
    private List<photo1> mlistPhoto;

    private ImageView viewPagerdetails;
    private TextView tvTourName;
    private TextView tourtrend, tvPrice;
    private photo1 itemDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tour_details);

        initViews();

        Bundle bundle = getIntent().getExtras();
        int image = bundle.getInt("image");
        String title = bundle.getString("name");
        String price = bundle.getString("price");
        String about = bundle.getString("about");

        viewPagerdetails.setImageResource(image);
        tvTourName.setText(title);
        tvPrice.setText(price);
        tourtrend.setText(about);

    }

    private void initViews() {
        viewPagerdetails = findViewById(R.id.viewPagerdetails);
        tvTourName = findViewById(R.id.tvTourName);
        tvPrice = findViewById(R.id.tvPrice);
        tourtrend = findViewById(R.id.tourtrend);
    }


}