package com.example.myapplicationclothing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private ImageView img;
    private TextView ten;
    private TextView gia;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();

        Bundle bundle= getIntent().getExtras();
        int imgv = bundle.getInt("img");
        String tenv = intent.getStringExtra("name");
        String giav = intent.getStringExtra("gia");

        img = findViewById(R.id.imginfo);
        ten = findViewById(R.id.tvteninfo);
        gia = findViewById(R.id.tvgiainfo);

        img.setImageResource(imgv);
        ten.setText(tenv);
        gia.setText(giav);


        //((TextView)findViewById(R.id.rcvClothing)).setText();
    }
}