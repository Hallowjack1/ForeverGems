package com.demo.forevergems;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ImageView imgOne = findViewById(R.id.imgEarring);
        imgOne.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i = new Intent(Home.this, Earrings.class);
                startActivity(i);
            }
        });

        ImageView imgTwo = findViewById(R.id.imgRing);
        imgTwo.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i = new Intent(Home.this, Rings.class);
                startActivity(i);
            }
        });

        ImageView imgThree = findViewById(R.id.imgNecklace);
        imgThree.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i = new Intent(Home.this, Necklaces.class);
                startActivity(i);
            }
        });

        ImageView imgFour = findViewById(R.id.imgBracelet);
        imgFour.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i = new Intent(Home.this, Bracelets.class);
                startActivity(i);
            }
        });
    }
}