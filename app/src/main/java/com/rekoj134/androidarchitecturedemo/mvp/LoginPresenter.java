package com.rekoj134.androidarchitecturedemo.mvp;

public class LoginPresenter {
    private LoginInterface loginInterface;

    public LoginPresenter(LoginInterface loginInterface) {
        this.loginInterface = loginInterface;
    }

    public void login(MVPUser user) {
        if (user.isValidEmail() && user.isValidPassword()) {
            loginInterface.loginOk();
        } else {
            loginInterface.loginNotOK();
        }
    }
}
