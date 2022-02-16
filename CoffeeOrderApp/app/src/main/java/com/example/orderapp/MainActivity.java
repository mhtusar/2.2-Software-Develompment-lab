package com.example.orderapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Model> modelList;
    RecyclerView recyclerView;
    OrderAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("NST Home");

        // creating an arraylist

        modelList = new ArrayList<>();
        modelList.add(new Model("Green Tea", getString(R.string.greentea), R.drawable.green ));
        modelList.add(new Model("latte",getString(R.string.latte), R.drawable.clatte));
        modelList.add(new Model("Americano",getString(R.string.Americano), R.drawable.americano));
       // modelList.add(new Model("Orange Smoothie", getString(R.string.orangesmoothie), R.drawable.orange));
        modelList.add(new Model("Orange Vanilla", getString(R.string.orangevanilla), R.drawable.orange));
        modelList.add(new Model("Cappucino", getString(R.string.cappcuni), R.drawable.cappuccino));
        modelList.add(new Model("Thai Tea", getString(R.string.thaitea), R.drawable.thaitea));
        modelList.add(new Model("Tea", getString(R.string.tea), R.drawable.tea));
        modelList.add(new Model("Bubble Tea", getString(R.string.bubbletea), R.drawable.bubble));
        modelList.add(new Model("Matcha", getString(R.string.match), R.drawable.matcha));


        // recyclerview
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(null));
        // adapter
        mAdapter = new OrderAdapter(this, modelList);
        recyclerView.setAdapter(mAdapter);




    }
}