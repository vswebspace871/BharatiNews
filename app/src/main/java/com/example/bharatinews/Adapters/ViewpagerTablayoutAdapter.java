package com.example.bharatinews.Adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.bharatinews.Fragments.NewsFragment;

public class ViewpagerTablayoutAdapter extends FragmentStateAdapter {


    public ViewpagerTablayoutAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new NewsFragment();
            case 1:
                return new NewsFragment();
            case 2:
                return new NewsFragment();
            case 3:
                return new NewsFragment();
            case 4:
                return new NewsFragment();
            case 5:
                return new NewsFragment();
            case 6:
                return new NewsFragment();
            case 7:
                return new NewsFragment();
            case 8:
                return new NewsFragment();
            case 9:
                return new NewsFragment();
            case 10:
                return new NewsFragment();
            case 11:
                return new NewsFragment();
            case 12:
                return new NewsFragment();
            case 13:
                return new NewsFragment();
            case 14:
                return new NewsFragment();
            case 15:
                return new NewsFragment();
            case 16:
                return new NewsFragment();
            case 17:
                return new NewsFragment();
            case 18:
                return new NewsFragment();
            case 19:
                return new NewsFragment();
            case 20:
                return new NewsFragment();
            default:
                return new NewsFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 21;
    }
}
