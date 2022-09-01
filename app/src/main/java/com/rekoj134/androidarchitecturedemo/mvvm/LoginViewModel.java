package com.rekoj134.androidarchitecturedemo.mvvm;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.ObservableField;

import com.rekoj134.androidarchitecturedemo.BR;

public class LoginViewModel extends BaseObservable {
    private String email;
    private String password;

    public ObservableField<String> loginMessage = new ObservableField<>();
    public ObservableField<Boolean> isShowMessage = new ObservableField<>();
    public ObservableField<Boolean> isSuccess = new ObservableField<>();

    @Bindable
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        notifyPropertyChanged(BR.email);
    }

    @Bindable
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
        notifyPropertyChanged(BR.password);
    }

    public void onClickLogin() {
        MVVMUser user = new MVVMUser(getEmail(), getPassword());

        isShowMessage.set(true);

        if (user.isValidEmail() && user.isValidPassword()) {
            loginMessage.set("Login Successfully");
            isSuccess.set(true);
        } else {
            loginMessage.set("Login Unsuccessfully");
            isSuccess.set(false);
        }
    }
}
