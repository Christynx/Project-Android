package com.example.projectx;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;

import androidx.appcompat.app.AppCompatActivity;

public class Straw_Berry extends AppCompatActivity {
    float x1,x2,y1,y2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_straw__berry);

    }
    public boolean onTouchEvent(MotionEvent touchEvent){
        switch(touchEvent.getAction()){
            case MotionEvent.ACTION_DOWN:
                x1 = touchEvent.getX();
                y1 = touchEvent.getY();
                break;
            case MotionEvent.ACTION_UP:
                x2 = touchEvent.getX();
                y2 = touchEvent.getY();
                if(x1 < x2){
                    Intent i = new Intent(Straw_Berry.this, Burnham_Park.class);
                    startActivity(i);
                }else if(x1 > x2){
                Intent i = new Intent(Straw_Berry.this, Bencab_Museum.class);
                startActivity(i);
            }
                break;
        }
        return false;
    }
}
