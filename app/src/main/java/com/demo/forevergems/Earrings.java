package com.demo.forevergems;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Earrings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_earrings);

        Button Finish = findViewById(R.id.btnFinish);
        Finish.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(Earrings.this, ResultPage.class);
            startActivity(intent);
        }
        });
    }
}