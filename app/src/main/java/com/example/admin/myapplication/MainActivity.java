package com.example.admin.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.util.List;

import daoUtils.CartDao;
import javabean.Shop;

public class MainActivity extends AppCompatActivity {

    private TextView mTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTv = (TextView) findViewById(R.id.tv);

        for(int i=0;i<10;i++){
            Shop shop=new Shop();
            shop.setName("电脑");
            shop.setPrice("3000");
            CartDao.insertCart(shop);
        }

        findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                List<Shop> list = CartDao.queryAll();
                for (int i = 0; i < list.size(); i++) {
                    Shop shop = list.get(i);
                    mTv.append(shop.getName());
                }
            }
        });
    }
}
