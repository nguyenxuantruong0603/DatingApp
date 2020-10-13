package com.example.DatingApp.activity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.example.DatingApp.R;
import com.squareup.picasso.Picasso;

public class ChatActivity extends AppCompatActivity {
    private ImageView imgEndToolbar, imgCamera, imgLocation;
    private ImageView imgAvatarToolbar;
    private TextView tvNameToolbar, tvGui;
    private ImageView imgMoreToolBar;
    private int avatar = 0;
    private String name, message;
    private EditText edtMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);

        imgCamera = findViewById(R.id.imgCamera);
        imgLocation = findViewById(R.id.imgLocation);
        edtMessage = findViewById(R.id.edtMessage);
        tvGui = findViewById(R.id.tvGui);


        name = getIntent().getStringExtra("NAME");
        avatar = getIntent().getIntExtra("AVATAR", 0);
        message = getIntent().getStringExtra("MESSAGE");

        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.chat_toolbar);

        imgEndToolbar = getSupportActionBar().getCustomView().findViewById(R.id.imgEndToolbar);
        imgAvatarToolbar = getSupportActionBar().getCustomView().findViewById(R.id.imgAvatarToolbar);
        tvNameToolbar = getSupportActionBar().getCustomView().findViewById(R.id.tvNameToolbar);
        imgMoreToolBar = getSupportActionBar().getCustomView().findViewById(R.id.imgMoreToolBar);


        SetUpToolbar();

        edtMessage.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @SuppressLint("ResourceType")
            @Override
            public void afterTextChanged(Editable editable) {
                if (editable.length() == 0) {
                    tvGui.setTextColor(Color.parseColor("#636363"));
                } else {
                    tvGui.setTextColor(Color.parseColor("#ff69b4"));
                }
            }
        });


    }

    private void SetUpToolbar() {
        Picasso.get().load(avatar).into(imgAvatarToolbar);
        tvNameToolbar.setText(name);

        imgMoreToolBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ChatActivity.this, "ABCABCABCABCA", Toast.LENGTH_SHORT).show();
            }
        });

        imgEndToolbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();


    }
}