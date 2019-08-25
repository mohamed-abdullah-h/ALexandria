package com.example.alex_city;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class Viewpager_adapter extends FragmentPagerAdapter {
    Context context;

    public Viewpager_adapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    //    return our fragments depending on pisition
    @Override
    public Fragment getItem(int i) {
        if (i == 0) {
            return new Historical_places();
        } else if (i == 1) {
            return new Resturants();
        } else if (i == 2) {
            return new Malls();
        } else
            return new Cinemas();


    }

    @Nullable
    @Override
    // return our fragments names depending on position
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return context.getString(R.string.Historiacal_places);
        } else if (position == 1) {
            return context.getString(R.string.Resturants);
        } else if (position == 2) {
            return context.getString(R.string.Malls);
        } else
            return context.getString(R.string.Cinemas);

    }

    // tell adapter how much fragments we want to add to adapter
    @Override
    public int getCount() {
        return 4;
    }
}
