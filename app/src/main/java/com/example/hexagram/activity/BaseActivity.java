package com.example.hexagram.activity;

import android.support.v7.app.AppCompatActivity;

public abstract class BaseActivity extends AppCompatActivity {
    public abstract void findView();
    public abstract void initView();
    public abstract void initListener();
}
