package com.example.frag.home;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.frag.fragment.AccountFragment;
import com.example.frag.fragment.HomeFragment;
import com.example.frag.fragment.TicketFragment;
import com.example.frag.fragment.TrendFragment;

public class HomeViewPagerAdapter extends FragmentPagerAdapter {


    public HomeViewPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new Tab1Fragment();
            case 1:
                    return new Tab2Fragment();
            case 2:
                return new Tab3Fragment();
            default: return new Tab1Fragment();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return "Địa điểm quốc tế";
            case 1:
                return "Địa điểm trong nước";

            default:
                return  "Địa điếm ưa chuộng";
        }
    }
}
