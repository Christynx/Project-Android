package com.example.projectx;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class PlacesActivity extends AppCompatActivity {
    TextView reserve_tick_view;
    Button bts_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places);

        Button bts_btn = findViewById(R.id.bts_btn);
        TextView reserve_tick_view = findViewById(R.id.reserve_tick_view);

        reserve_tick_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(PlacesActivity.this, RBusTickets.class);
                startActivity(myIntent);
            }
        });

        bts_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mySecIntent = new Intent(PlacesActivity.this, Burnham_Park.class);
                startActivity(mySecIntent);
            }
        });
    }
}
