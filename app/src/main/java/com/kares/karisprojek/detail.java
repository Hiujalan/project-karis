package com.kares.karisprojek;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class detail extends AppCompatActivity {
    public TextView title,det,desk;
    public ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        title = findViewById(R.id.Judul);
        desk = findViewById(R.id.text_Desk);
        img = findViewById(R.id.miami);

        title.setText(getIntent().getExtras().getString("Judul"));
        desk.setText(getIntent().getExtras().getString("Desk"));

        int imgg= getIntent().getIntExtra("img", 0);
        img.setImageResource(imgg);
    }
}