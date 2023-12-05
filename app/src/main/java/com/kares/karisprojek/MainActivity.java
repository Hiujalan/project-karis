package com.kares.karisprojek;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.reycler_view);
        adapter = new CobaAdapter();
        layoutManager = new LinearLayoutManager(this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(layoutManager);
        }

        public boolean onCreateOptionsMenu(Menu menu){
            MenuInflater inflater = getMenuInflater();
            inflater.inflate(R.menu.optionmenu,menu);
            return true;
        }
        public boolean onOptionsItemSelected(MenuItem item) {
            if (item.getItemId() == R.id.Tentang) {
                Intent intent = new Intent(MainActivity.this,Tentang.class);
                startActivity(intent);
            }
            if (item.getItemId() == R.id.Pengaturan) {
                Toast toast = Toast.makeText(this, "PENGATURAN", Toast.LENGTH_LONG);
                toast.show();
            }
            if (item.getItemId() == R.id.Bantuan) {
                Toast toast = Toast.makeText(this, "BANTUAN", Toast.LENGTH_LONG);
                toast.show();
            }
            return true;
        }}