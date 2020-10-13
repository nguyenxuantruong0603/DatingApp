package com.example.DatingApp.adapter.viewpager;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.DatingApp.fragment.informationfragment.SetHeightFragment;
import com.example.DatingApp.fragment.informationfragment.SetLanguageFragment;
import com.example.DatingApp.fragment.informationfragment.SetSmokeFragment;
import com.example.DatingApp.fragment.informationfragment.SetWeighttFragment;
import com.example.DatingApp.fragment.informationfragment.SetWineFragment;

public class AdapterViewPagerDetail extends FragmentPagerAdapter {
    private static int NUM_ITEMS = 5;

    public AdapterViewPagerDetail(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0: // Fragment # 0 - This will show FirstFragment
                return SetHeightFragment.newInstance(0, " 1");
            case 1: // Fragment # 0 - This will show FirstFragment different title
                return SetWeighttFragment.newInstance(1, "  2");
            case 2: // Fragment # 1 - This will show SecondFragment
                return SetWineFragment.newInstance(2, "  3");
            case 3: // Fragment # 1 - This will show SecondFragment
                return SetSmokeFragment.newInstance(2, "  4");
            case 4: // Fragment # 1 - This will show SecondFragment
                return SetLanguageFragment.newInstance(2, "  5");
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return NUM_ITEMS;
    }
}
