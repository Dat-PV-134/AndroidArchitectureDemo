package com.rekoj134.androidarchitecturedemo.mvp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.rekoj134.androidarchitecturedemo.R;

public class MVPLoginActivity extends AppCompatActivity implements LoginInterface {
    private EditText etEmail, etPassword;
    private TextView tvMessage;
    private Button btnLogin;

    private LoginPresenter loginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mvplogin);
        setTitle("MVP Architecture");

        etEmail = findViewById(R.id.etEmailMVP);
        etPassword = findViewById(R.id.etPasswordMVP);
        tvMessage = findViewById(R.id.tvMessageMVP);
        btnLogin = findViewById(R.id.btnLoginMVP);

        loginPresenter = new LoginPresenter(this);

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

        MVPUser user = new MVPUser(strEmail, strPassword);

        loginPresenter.login(user);
    }

    @Override
    public void loginOk() {
        tvMessage.setVisibility(View.VISIBLE);
        tvMessage.setText("Login Successfully");
        tvMessage.setTextColor(getResources().getColor(R.color.teal_200));
    }

    @Override
    public void loginNotOK() {
        tvMessage.setVisibility(View.VISIBLE);
        tvMessage.setText("Login Unsuccessfully");
        tvMessage.setTextColor(getResources().getColor(R.color.red));
    }
}