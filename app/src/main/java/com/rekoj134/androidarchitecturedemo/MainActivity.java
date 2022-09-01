package com.rekoj134.androidarchitecturedemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.rekoj134.androidarchitecturedemo.databinding.ActivityMainBinding;
import com.rekoj134.androidarchitecturedemo.mvc.MVCLoginActivity;
import com.rekoj134.androidarchitecturedemo.mvp.MVPLoginActivity;
import com.rekoj134.androidarchitecturedemo.mvvm.MVVMLoginActivity;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this , R.layout.activity_main);

        binding.btnMVC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getBaseContext(), MVCLoginActivity.class));
            }
        });

        binding.btnMVP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getBaseContext(), MVPLoginActivity.class));
            }
        });

        binding.btnMVVM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getBaseContext(), MVVMLoginActivity.class));
            }
        });
    }
}