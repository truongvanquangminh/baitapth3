package com.example.coffeehouse;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.tabs.TabLayout;

public class DathangFragment extends Fragment {

    private TabLayout mTabLayout_229;
    private ViewPager mViewPager_229;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View r_229 = inflater.inflate(R.layout.fragment_dathang, container, false);

        mTabLayout_229 = r_229.findViewById(R.id.tab_layout);
        mViewPager_229 = r_229.findViewById(R.id.view_pager);

        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getFragmentManager(), FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        mViewPager_229.setAdapter(viewPagerAdapter);
        mTabLayout_229.setupWithViewPager(mViewPager_229);
        return r_229;
    }
}