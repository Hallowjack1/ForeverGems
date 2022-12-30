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

        Button btnType, btnNext;
        TextView txt_result;

        /*btnType = findViewById(R.id.btnType);
        btnType.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ResultPage.this, CustomMaterial.class);
                startActivity(intent);
            }
        });

        btnNext = findViewById(R.id.btnNext);
        btnNext.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ResultPage.this, CustomGems.class);
                startActivity(intent);
            }
        });*/
        txt_result = findViewById(R.id.txt_result);
        txt_result.setText(getIntent().getExtras().getString("message_key"));
       /* Bundle extras = getIntent().getExtras();
        String result = extras.getString("result");
        setContentView(R.layout.activity_result_page);*/





        /*Intent intent = getIntent();
        String name = this.getIntent().getStringExtra("message_key");
        //String str = intent.getStringExtra("message_key");

        txt_result.setText(name);*/
    }
}