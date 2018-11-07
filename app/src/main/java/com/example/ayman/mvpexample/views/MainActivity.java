package com.example.ayman.mvpexample.views;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.ayman.mvpexample.Model.LoginContract;
import com.example.ayman.mvpexample.Model.user;
import com.example.ayman.mvpexample.R;
import com.example.ayman.mvpexample.presenter.LoginPresenter;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements LoginContract.Iview {
       @BindView(R.id.usernameEtID)EditText usernameEt;
        @BindView(R.id.passwordEtID)EditText passwordEt;
       @BindView(R.id.btnID)Button btn;
       LoginPresenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        presenter=new LoginPresenter(this);
        onbtnClick();
    }

    void onbtnClick(){
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
           presenter.onCheckLogin(new user(usernameEt.getText().toString(),passwordEt.getText().toString()));
            }
        });
    }


    @Override
    public void afterCheckLogin(boolean flage) {

        if(flage==true){
          Toast.makeText(getApplicationContext(),"Welcome "+usernameEt.getText().toString(),Toast.LENGTH_LONG).show();
                 }
                 else{

            Toast.makeText(getApplicationContext(),"Please Try Again With Correct Data",Toast.LENGTH_LONG).show();
        }
    }
}
