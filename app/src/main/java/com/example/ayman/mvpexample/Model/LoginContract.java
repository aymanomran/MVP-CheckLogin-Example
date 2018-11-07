package com.example.ayman.mvpexample.Model;

public class LoginContract {
public interface Iview{
    void afterCheckLogin(boolean flage);

}
    public interface Ipresenter{
    void onCheckLogin(user _user);
    }
    public interface Imodel{
        public boolean CheckUserData(user _user);
        }

}
