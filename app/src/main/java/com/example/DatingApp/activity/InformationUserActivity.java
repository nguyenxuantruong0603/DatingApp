package com.example.DatingApp.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.example.DatingApp.R;
import com.google.android.material.bottomsheet.BottomSheetDialog;

public class InformationUserActivity extends AppCompatActivity {
    TextView tvTitle, tvSetting, tvAddReason, tvNameInformation, tvAddWork, tvAboutYou;
    ImageView imgOpition, imgBackButton;
    private TextView tvHeight, tvWeight, tvWine, tvSmoke, tvLanguage, tvLocation, tvMarriage, tvReligion;
    private ImageView imgsetHeight, imgSetReligion, imgSetMarriage, imgsetLocation, imgsetLanguage, imgSetSmoke, imgsetWine, imgsetWeight;
    AlertDialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information_user);
        tvAddReason = findViewById(R.id.tvAddReason);
        setUpToolbar();
        initView();
        setOnClick();
    }

    private void setOnClick() {

        imgsetHeight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(InformationUserActivity.this, DetailActivity.class);
                intent.putExtra("POSITION", 0);
                startActivity(intent);
            }
        });
        imgsetWeight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(InformationUserActivity.this, DetailActivity.class);
                intent.putExtra("POSITION", 1);
                startActivity(intent);
            }
        });
        imgsetWine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(InformationUserActivity.this, DetailActivity.class);
                intent.putExtra("POSITION", 2);
                startActivity(intent);
            }
        });
        imgSetSmoke.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(InformationUserActivity.this, DetailActivity.class);
                intent.putExtra("POSITION", 3);
                startActivity(intent);
            }
        });
        imgsetLanguage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(InformationUserActivity.this, DetailActivity.class);
                intent.putExtra("POSITION", 4);
                startActivity(intent);
            }
        });
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


    public void initView() {

        tvNameInformation = findViewById(R.id.tvNameInformation);
        tvAddReason = findViewById(R.id.tvAddReason);
        tvAddWork = findViewById(R.id.tvAddWork);
        tvAboutYou = findViewById(R.id.tvAboutYou);
        tvHeight = findViewById(R.id.tvHeight);
        imgsetHeight = findViewById(R.id.imgsetHeight);
        tvWeight = findViewById(R.id.tvWeight);
        imgsetWeight = findViewById(R.id.imgsetWeight);
        tvWine = findViewById(R.id.tvWine);
        imgsetWine = findViewById(R.id.imgsetWine);
        tvSmoke = findViewById(R.id.tvSmoke);
        imgSetSmoke = findViewById(R.id.imgSetSmoke);
        tvLanguage = findViewById(R.id.tvLanguage);
        imgsetLanguage = findViewById(R.id.imgsetLanguage);
        tvLocation = findViewById(R.id.tvLocation);
        imgsetLocation = findViewById(R.id.imgsetLocation);
        tvMarriage = findViewById(R.id.tvMarriage);
        imgSetMarriage = findViewById(R.id.imgSetMarriage);
        tvReligion = findViewById(R.id.tvReligion);
        imgSetReligion = findViewById(R.id.imgSetReligion);

        tvNameInformation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(InformationUserActivity.this, AccountActivity.class);
                startActivity(intent);

            }
        });

        tvAddWork.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(InformationUserActivity.this, WorkEducationActivity.class);
                startActivity(intent);

            }
        });

        tvAboutYou.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(InformationUserActivity.this);

                builder.setTitle("Cho chúng tôi biết thêm về bạn ");
                View view1 = LayoutInflater.from(InformationUserActivity.this).inflate(R.layout.dialog_aboutyou, null);
                builder.setView(view1);
                ImageButton btnSaveAboutYou;
                EditText edtAboutYou;
                edtAboutYou = view1.findViewById(R.id.edtAboutYou);
                btnSaveAboutYou = view1.findViewById(R.id.btnSaveAboutYou);

                btnSaveAboutYou.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String AboutYou = edtAboutYou.getText().toString();
                        tvAboutYou.setText(AboutYou);
                        dialog.dismiss();
                    }
                });


                builder.create();
                dialog = builder.show();
            }
        });
    }

    public void AddWork(View view) {


    }

    public void AddReason(View view) {
        BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(this, R.style.BottomSheetDialogTheme);
        View bottomSheetView = LayoutInflater.from(this).inflate(R.layout.dialog_reason, findViewById(R.id.bottomSheetContainer));


        bottomSheetDialog.setContentView(bottomSheetView);
        bottomSheetDialog.show();
    }
}