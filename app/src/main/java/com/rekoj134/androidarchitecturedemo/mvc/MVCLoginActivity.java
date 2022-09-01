package com.rekoj134.androidarchitecturedemo.mvc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.rekoj134.androidarchitecturedemo.R;

public class MVCLoginActivity extends AppCompatActivity {
    private EditText etEmail, etPassword;
    private TextView tvMessage;
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mvclogin);
        setTitle("MVC Architecture");

        etEmail = findViewById(R.id.etEmail);
        etPassword = findViewById(R.id.etPassword);
        tvMessage = findViewById(R.id.tvMessage);
        btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onClickLogin();
            }
        });
    }

    private void onClickLogin() {
        String strEmail = etEmail.getText().toString().trim();
        String strPassword = etPassword.getText().toString().trim();

        MVCUser user = new MVCUser(strEmail, strPassword);

        tvMessage.setVisibility(View.VISIBLE);

        if (user.isValidEmail() && user.isValidPassword()) {
            tvMessage.setText("Login successfully");
            tvMessage.setTextColor(getResources().getColor(R.color.teal_200));
        } else {
            tvMessage.setText("Login unsuccessfully");
            tvMessage.setTextColor(getResources().getColor(R.color.red));
        }
    }
}