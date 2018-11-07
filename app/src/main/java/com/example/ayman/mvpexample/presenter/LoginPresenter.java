package com.example.ayman.mvpexample.presenter;

import com.example.ayman.mvpexample.Model.LoginContract;
import com.example.ayman.mvpexample.Model.user;

public class LoginPresenter implements LoginContract.Ipresenter {
LoginContract.Imodel model;
LoginContract.Iview view;

    public LoginPresenter(LoginContract.Iview view) {
        model=new user("","");
        this.view = view;
    }
    @Override
    public void onCheckLogin(user _user) {
      view.afterCheckLogin(model.CheckUserData(_user));
    }
}
