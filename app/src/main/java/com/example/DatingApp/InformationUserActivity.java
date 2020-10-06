package com.example.DatingApp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomsheet.BottomSheetDialog;

public class InformationUserActivity extends AppCompatActivity {

    TextView tvTitle, tvSetting;
    ImageView imgOpition, imgBackButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information_user);

        setUpToolbar();

    }

    private void setUpToolbar() {
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.home_toolbar);
        tvTitle = getSupportActionBar().getCustomView().findViewById(R.id.tvTitle);
        imgOpition = getSupportActionBar().getCustomView().findViewById(R.id.imgOpition);
        imgBackButton = getSupportActionBar().getCustomView().findViewById(R.id.imgBackButton);
        tvSetting = getSupportActionBar().getCustomView().findViewById(R.id.tvSetting);

        imgOpition.setVisibility(View.GONE);
        tvTitle.setVisibility(View.GONE);
        imgBackButton.setVisibility(View.VISIBLE);
        tvSetting.setVisibility(View.VISIBLE);
        tvSetting.setText("Thông tin cá nhân");
        tvSetting.setTextSize(25);
        tvSetting.setGravity(View.TEXT_ALIGNMENT_CENTER);
        imgBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    public void AddWork(View view) {


    }

    public void AddReason(View view) {
        BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(this, R.style.BottomSheetDialogTheme);
        View bottomSheetView = LayoutInflater.from(this).inflate(R.layout.dialog_reason, (LinearLayout) findViewById(R.id.bottomSheetContainer));

        bottomSheetView.findViewById(R.id.btnTest).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(InformationUserActivity.this, "Test Thu", Toast.LENGTH_SHORT).show();
                bottomSheetDialog.dismiss();
            }
        });
        bottomSheetDialog.setContentView(bottomSheetView);
        bottomSheetDialog.show();
    }
}