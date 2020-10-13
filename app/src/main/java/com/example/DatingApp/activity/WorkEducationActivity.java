package com.example.DatingApp.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.example.DatingApp.R;

public class WorkEducationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work_education);
        setUpToolbar();
    }

    private void setUpToolbar() {
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.account_toolbar);

        TextView tvTitle = getSupportActionBar().getCustomView().findViewById(R.id.tvTitle);
        tvTitle.setText("Công việc, học vấn");
        TextView tvSave = getSupportActionBar().getCustomView().findViewById(R.id.tvSave);
        ImageView imgBack = getSupportActionBar().getCustomView().findViewById(R.id.imgBack);
        imgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        tvSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}