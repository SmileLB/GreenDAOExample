package com.example.admin.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import daoUtils.CartDao;
import javabean.Shop;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for(int i=0;i<10;i++){
            Shop shop=new Shop();
            CartDao.insertCart(shop);
        }
    }
}
