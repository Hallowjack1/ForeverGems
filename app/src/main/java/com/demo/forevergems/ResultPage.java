package com.demo.forevergems;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ResultPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_page);

        TextView result;

        Bundle extras = getIntent().getExtras();

        String results = extras.getString("finalResult");

        result = findViewById(R.id.results);
        result.setText(results);
    }
}