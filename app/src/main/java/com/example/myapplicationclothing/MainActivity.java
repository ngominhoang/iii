package com.example.myapplicationclothing;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<Clothing> clothingArrayList;
    private ClothingListAdapter clothingListAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.rcvClothing);
        clothingArrayList = new ArrayList<>();
        clothingArrayList.add(new Clothing(R.drawable.ao, "polo", "23"));
        clothingArrayList.add(new Clothing(R.drawable.ao, "polo", "23"));
        clothingArrayList.add(new Clothing(R.drawable.ao, "polo", "23"));
        clothingArrayList.add(new Clothing(R.drawable.ao, "polo", "23"));
        clothingArrayList.add(new Clothing(R.drawable.ao, "polo", "23"));
        clothingArrayList.add(new Clothing(R.drawable.ao, "polo", "23"));
        clothingArrayList.add(new Clothing(R.drawable.ao, "polo", "23"));

        clothingListAdapter = new ClothingListAdapter(this, clothingArrayList);
        recyclerView.setAdapter(clothingListAdapter);
//        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        GridLayoutManager gridLayoutManager=new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(gridLayoutManager);
    }
}