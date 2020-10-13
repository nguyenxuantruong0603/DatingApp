package com.example.DatingApp.activity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.example.DatingApp.R;
import com.example.DatingApp.fragment.ChatFragment;
import com.example.DatingApp.fragment.HomeFragment;
import com.example.DatingApp.fragment.MeetingFragment;
import com.example.DatingApp.fragment.UserFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView view;
    public static TextView tvTitle, tvSetting;
    public static ImageView imgOpition, imgBackButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.home_toolbar);
        tvTitle = getSupportActionBar().getCustomView().findViewById(R.id.tvTitle);
        imgOpition = getSupportActionBar().getCustomView().findViewById(R.id.imgOpition);
        imgBackButton = getSupportActionBar().getCustomView().findViewById(R.id.imgBackButton);
        tvSetting = getSupportActionBar().getCustomView().findViewById(R.id.tvSetting);

        loadFragment(new HomeFragment());
        view = findViewById(R.id.nav_view);
        view.setItemIconTintList(null);
        view.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment selectedFragment = null;
                switch (item.getItemId()) {
                    case R.id.Home:
                        selectedFragment = new HomeFragment();
                        tvTitle.setText("Gần đây");
                        imgOpition.setBackgroundResource(R.drawable.ic_settings);
                        imgOpition.setVisibility(View.VISIBLE);
                        tvSetting.setVisibility(View.GONE);
                        imgBackButton.setVisibility(View.GONE);
                        tvTitle.setVisibility(View.VISIBLE);
                        break;
                    case R.id.Meeting:
                        selectedFragment = new MeetingFragment();
                        tvTitle.setText("Bắt gặp");
                        imgOpition.setBackgroundResource(R.drawable.ic_settings);
                        imgOpition.setVisibility(View.VISIBLE);
                        tvSetting.setVisibility(View.GONE);
                        imgBackButton.setVisibility(View.GONE);
                        tvTitle.setVisibility(View.VISIBLE);
                        break;
                    case R.id.Chat:
                        selectedFragment = new ChatFragment();
                        tvTitle.setText("Chat");
                        imgOpition.setVisibility(View.GONE);
                        tvSetting.setVisibility(View.GONE);
                        imgBackButton.setVisibility(View.GONE);
                        tvTitle.setVisibility(View.VISIBLE);
                        break;
                    case R.id.User:
                        selectedFragment = new UserFragment();
                        tvTitle.setText("Hồ sơ");
                        imgOpition.setBackgroundResource(R.drawable.ic_settings2);
                        imgOpition.setVisibility(View.VISIBLE);
                        tvSetting.setVisibility(View.GONE);
                        imgBackButton.setVisibility(View.GONE);
                        tvTitle.setVisibility(View.VISIBLE);
                        break;

                }

                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.nav_host_fragment, selectedFragment);
                transaction.commit();
                return true;

            }
        });
    }


    private void loadFragment(Fragment fragment) {
        // cái này dùng để load các fragment ở phần switch case trên kia.
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.nav_host_fragment, fragment);
        transaction.addToBackStack(null);
        transaction.commit();

    }

}