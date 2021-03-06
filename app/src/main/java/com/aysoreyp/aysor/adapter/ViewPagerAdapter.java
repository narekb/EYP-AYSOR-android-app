package com.aysoreyp.aysor.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.aysoreyp.aysor.R;
import com.aysoreyp.aysor.fragments.AboutFragment;
import com.aysoreyp.aysor.fragments.CommiteesFragment;
import com.aysoreyp.aysor.fragments.MediaFragment;
import com.aysoreyp.aysor.fragments.ScheduleFragment;

public class ViewPagerAdapter extends FragmentPagerAdapter {

    private int drawables[] = {
            R.drawable.ic_group,
            R.drawable.ic_schedule,
            R.drawable.ic_play,
            R.drawable.ic_about
    };

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment tab;

        if (position == 0) {
            tab = new CommiteesFragment();
        } else if (position == 1) {
            tab = new ScheduleFragment();
        } else if (position == 2) {
            tab = new MediaFragment();
        } else {
            tab = new AboutFragment();
        }

        return tab;
    }

    public int getDrawable(int position) {
        return drawables[position];
    }

    @Override
    public int getCount() {
        return drawables.length;
    }
}
