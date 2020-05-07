package com.example.projectx;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class RBusTickets extends AppCompatActivity {
    TextView exp_view;
    TextView exp1_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_r_bus_tickets);

        TextView exp_view = findViewById(R.id.exp_view);
        TextView exp1_view = findViewById(R.id.exp1_view);

        exp_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(RBusTickets.this, "Sorry, there are no departures on this day of the week.", Toast.LENGTH_LONG).show();
            }
        });

    }
}
