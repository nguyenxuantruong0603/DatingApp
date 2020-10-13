package com.example.DatingApp.activity;

import android.os.Bundle;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.example.DatingApp.R;
import com.example.DatingApp.adapter.viewpager.AdapterViewPagerDetail;

public class DetailActivity extends AppCompatActivity {

    AdapterViewPagerDetail adapterViewPager;
    ViewPager vpDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        vpDetail = findViewById(R.id.vpDetail);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        int POSITION = getIntent().getIntExtra("POSITION", 999);

        adapterViewPager = new AdapterViewPagerDetail(getSupportFragmentManager());
        vpDetail.setAdapter(adapterViewPager);
        vpDetail.setCurrentItem(POSITION);

    }
}