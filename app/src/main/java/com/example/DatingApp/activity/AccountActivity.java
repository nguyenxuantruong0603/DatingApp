package com.example.DatingApp.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatRadioButton;

import com.example.DatingApp.R;
import com.google.android.material.textfield.TextInputLayout;

public class AccountActivity extends AppCompatActivity {
    private TextInputLayout edtFullName;
    private TextInputLayout edtBirthDay;
    private AppCompatRadioButton rdNewFriend;
    private AppCompatRadioButton rdChat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);
        setUpToolbar();
        edtFullName = findViewById(R.id.edtFullName);
        edtBirthDay = findViewById(R.id.edtBirthDay);
        rdNewFriend = findViewById(R.id.rdNewFriend);
        rdChat = findViewById(R.id.rdChat);

    }

    private void setUpToolbar() {
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.account_toolbar);

        TextView tvSave=getSupportActionBar().getCustomView().findViewById(R.id.tvSave);
        ImageView imgBack= getSupportActionBar().getCustomView().findViewById(R.id.imgBack);
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