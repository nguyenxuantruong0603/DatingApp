package com.example.DatingApp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
    private ActionBar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        toolbar=getSupportActionBar();
        toolbar.hide();
    }

    public void SignIn(View view) {

        Intent intent = new Intent(LoginActivity.this, MainActivity.class);
        startActivity(intent);

    }
}