package com.rekoj134.androidarchitecturedemo.mvvm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.rekoj134.androidarchitecturedemo.R;
import com.rekoj134.androidarchitecturedemo.databinding.ActivityMvvmloginBinding;

public class MVVMLoginActivity extends AppCompatActivity {
    ActivityMvvmloginBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mvvmlogin);
        setTitle("MVVM Architecture");

        binding = DataBindingUtil.setContentView(this, R.layout.activity_mvvmlogin);

        LoginViewModel viewModel = new LoginViewModel();
        binding.setLoginViewModel(viewModel);
    }
}