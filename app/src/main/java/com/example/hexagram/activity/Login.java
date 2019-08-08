package com.example.hexagram.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.hexagram.R;

public class Login extends BaseActivity {

    EditText txtEmail, txtPassword;
    TextView tvForgot, tvRegister;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        findView();
        initView();
        initListener();
    }

    @Override
    public void findView() {
        txtEmail = findViewById(R.id.email);
        txtPassword = findViewById(R.id.password);
        tvForgot = findViewById(R.id.forgot_password);
        tvRegister = findViewById(R.id.register);
        btnLogin = findViewById(R.id.login);
    }

    @Override
    public void initView() {

    }

    @Override
    public void initListener() {
        //btn login onclick listener
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = txtEmail.getText().toString();
                String password = txtPassword.getText().toString();
                Toast.makeText(Login.this, email + ' ' + password, Toast.LENGTH_SHORT).show();
            }
        });

        //text forgot password onclick listener
        tvForgot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Login.this, ForgotPassword.class);
                startActivity(intent);
            }
        });

        //text register onclick listener
        tvRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Login.this,SignUp.class);
                startActivity(intent);
            }
        });
    }
}
