package com.example.DatingApp.activity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatRadioButton;

import com.example.DatingApp.R;

import io.apptik.widget.MultiSlider;

public class SelectiveActivity extends AppCompatActivity {

    TextView tvSetting, tvTitle, tvAgeMin, tvAgeMax,tvKhoangCach;
    ImageView imgBackButton, imgOpition;

    AppCompatRadioButton rdNam, rdNu, rdCahai;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selective);

        rdCahai = findViewById(R.id.rdCahai);
        rdNam = findViewById(R.id.rdNam);
        rdNu = findViewById(R.id.rdNu);
        tvAgeMin = findViewById(R.id.tvAgeMin);
        tvAgeMax = findViewById(R.id.tvAgeMax);
        tvKhoangCach=findViewById(R.id.tvKhoangCach);

        setupToolbar();


        MultiSlider multiSlider5 = findViewById(R.id.range_slider5);
        MultiSlider range_khoangcach = findViewById(R.id.range_khoangcach);
        multiSlider5.setOnThumbValueChangeListener(new MultiSlider.OnThumbValueChangeListener() {
            @Override
            public void onValueChanged(MultiSlider multiSlider,
                                       MultiSlider.Thumb thumb,
                                       int thumbIndex,
                                       int value) {
                if (thumbIndex == 0) {
                    tvAgeMin.setText(String.valueOf(multiSlider.getThumb(0).getValue()));
                    tvAgeMax.setText(String.valueOf(multiSlider.getThumb(1).getValue()));
                } else {
                    tvAgeMin.setText(String.valueOf(multiSlider.getThumb(0).getValue()));
                    tvAgeMax.setText(String.valueOf(multiSlider.getThumb(1).getValue()));
                }
            }
        });

        range_khoangcach.setOnThumbValueChangeListener(new MultiSlider.OnThumbValueChangeListener() {
            @Override
            public void onValueChanged(MultiSlider multiSlider, MultiSlider.Thumb thumb, int thumbIndex, int value) {
                if (thumbIndex == 0) {

                    tvKhoangCach.setText((multiSlider.getThumb(1).getValue()) - multiSlider.getThumb(0).getValue() +" km");

                } else {
                    tvKhoangCach.setText((multiSlider.getThumb(1).getValue()) - multiSlider.getThumb(0).getValue() +" km");
                }
            }
        });
    }




    private void setupToolbar() {
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.home_toolbar);
        imgBackButton = getSupportActionBar().getCustomView().findViewById(R.id.imgBackButton);
        tvSetting = getSupportActionBar().getCustomView().findViewById(R.id.tvSetting);
        imgOpition = getSupportActionBar().getCustomView().findViewById(R.id.imgOpition);
        tvTitle = getSupportActionBar().getCustomView().findViewById(R.id.tvTitle);

        tvSetting.setVisibility(View.VISIBLE);
        imgBackButton.setVisibility(View.VISIBLE);
        tvTitle.setVisibility(View.GONE);
        imgOpition.setVisibility(View.GONE);

        imgBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    public void onRadioButtonClicked(View view) {

        boolean isSelected = ((AppCompatRadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.rdNam:
                if (isSelected) {
                    rdCahai.setTextColor(Color.parseColor("#000000"));
                    rdNu.setTextColor(Color.parseColor("#000000"));
                    rdNam.setTextColor(Color.parseColor("#fc826d"));
                }
                break;

            case R.id.rdNu:
                if (isSelected) {
                    rdCahai.setTextColor(Color.parseColor("#000000"));
                    rdNu.setTextColor(Color.parseColor("#fc826d"));
                    rdNam.setTextColor(Color.parseColor("#000000"));
                }
                break;

            case R.id.rdCahai:
                if (isSelected) {
                    rdCahai.setTextColor(Color.parseColor("#fc826d"));
                    rdNu.setTextColor(Color.parseColor("#000000"));
                    rdNam.setTextColor(Color.parseColor("#000000"));
                }
                break;
        }
    }
}