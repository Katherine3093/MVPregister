package com.katherine.mvpregister;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private EditText nameView;
    private EditText emailView;
    private EditText passwordView;
    private EditText passwordRepeatView;
    private RegisterPresenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameView=(EditText)findViewById(R.id.name_view);
        emailView=(EditText)findViewById(R.id.email_view);
        passwordView=(EditText)findViewById(R.id.password_view);
        passwordRepeatView=(EditText)findViewById(R.id.password_repeat_view);

        mPresenter=  new RegisterPresenter(this);

    }



    public void register(View view) {
        String name = nameView.getText().toString();
        String email=emailView.getText().toString();
        String password=passwordView.getText().toString();
        String passwordRepeat=passwordRepeatView.getText().toString();

        mPresenter.register(name,email,password,passwordRepeat);
    }

    public void showRegistered(boolean registered) {
        if (registered==true){
            Toast.makeText(this,R.string.success,Toast.LENGTH_LONG).show();

        }else {
            Toast.makeText(this,R.string.error,Toast.LENGTH_LONG).show();
        }
    }
}
