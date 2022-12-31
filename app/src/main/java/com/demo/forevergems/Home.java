package com.demo.forevergems;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ImageView imgOne = findViewById(R.id.logo);
        imgOne.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i = new Intent(Home.this, CSV.class);
                startActivity(i);
            }
        });

        final ArrayList<NumbersView> arrayList = new ArrayList<NumbersView>();

        arrayList.add(new NumbersView(R.drawable.ring,  "Rings"));
        arrayList.add(new NumbersView(R.drawable.necklace, "Necklaces"));
        arrayList.add(new NumbersView(R.drawable.bracelet, "Bracelets"));
        arrayList.add(new NumbersView(R.drawable.earring, "Earrings"));

        NumbersViewAdapter numbersArrayAdapter = new NumbersViewAdapter(this, arrayList);

        ListView numbersListView = findViewById(R.id.listView);

        numbersListView.setAdapter(numbersArrayAdapter);

        numbersListView.setAdapter(numbersArrayAdapter);

        numbersListView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                if(position == 0){
                    Intent i = new Intent(Home.this, Rings.class);
                    startActivity(i);
                }
                else if (position == 1){
                    Intent i = new Intent(Home.this, Necklaces.class);
                    startActivity(i);
                }
                else if (position == 2){
                    Intent i = new Intent(Home.this, Bracelets.class);
                    startActivity(i);
                }
                else {
                    Intent i = new Intent(Home.this, Earrings.class);
                    startActivity(i);
                }
            }
        });
    }
}