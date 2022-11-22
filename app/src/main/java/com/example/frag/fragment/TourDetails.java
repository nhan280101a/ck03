package com.example.frag.fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.hardware.lights.LightState;
import android.os.Bundle;
import android.provider.ContactsContract;

import com.example.frag.Adapter.TourDetailsAdapter;
import com.example.frag.Adapter.TourPhoto;
import com.example.frag.R;

import java.util.ArrayList;
import java.util.List;

import me.relex.circleindicator.CircleIndicator3;

public class TourDetails extends AppCompatActivity {
    private ViewPager2 mviewPager2;
    private CircleIndicator3 mcircleIndicator3;
    private List<TourPhoto> mlistPhoto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tour_details);

        mviewPager2 = findViewById(R.id.viewPagerdetails);
        mcircleIndicator3 = findViewById(R.id.cicleIddetails);

        mlistPhoto = getListPhoto();
        TourDetailsAdapter adapter = new TourDetailsAdapter(mlistPhoto);
        mviewPager2.setAdapter(adapter);

        mcircleIndicator3.setViewPager(mviewPager2);

    }

    private List<TourPhoto> getListPhoto(){
        List<TourPhoto> list = new ArrayList<>();
        list.add(new TourPhoto(R.drawable.a1));
        list.add(new TourPhoto(R.drawable.a2));
        list.add(new TourPhoto(R.drawable.a3));
        list.add(new TourPhoto(R.drawable.a4));
        list.add(new TourPhoto(R.drawable.a5));
        return list;
    }
}