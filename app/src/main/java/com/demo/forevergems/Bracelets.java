package com.demo.forevergems;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;

public class Bracelets extends AppCompatActivity {

    EditText etMaterialPrice, etGemPrice;
    String strMaterialPrice, strGemPrice, resultMessage;
    Button btnFinish;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bracelets);

        btnFinish = findViewById(R.id.btnFinish);

        etMaterialPrice = findViewById(R.id.etMaterialPrice);
        etGemPrice = findViewById(R.id.etGemShapePrice);

        btnFinish.setOnClickListener(view -> {

            Intent i = new Intent(getApplicationContext(), ResultPage.class);

            Bundle args = new Bundle();

            if (etMaterialPrice.getText().toString().isEmpty() || etGemPrice.getText().toString().isEmpty()) {
                strMaterialPrice = "0";
                strGemPrice = "0";
            } else {
                strMaterialPrice = etMaterialPrice.getText().toString();
                strGemPrice = etGemPrice.getText().toString();
            }
            double rawMaterialPrice = Double.parseDouble(strMaterialPrice);
            double rawGemPrice = Double.parseDouble(strGemPrice);

            double totalPrice = ((rawMaterialPrice + rawGemPrice) + 112) * 4;
            double addLabor = totalPrice + 126000;
            double calcOverhead = addLabor * 0.1;
            double retailPrice = addLabor + calcOverhead;
            double wholesalePrice = retailPrice * 0.6;

            resultMessage = "The Retail Price of the Jewelry is: ₱" + (int) retailPrice +
                    "\n\nThe Wholesale Price of the Jewelry is: ₱" + (int) wholesalePrice;
            args.putString("finalResult", resultMessage);

            i.putExtras(args);
            startActivity(i);
            clearEditText();
        });

        BraceletMaterial.initBraceletMaterial();
        Spinner spinnerBracelet = (Spinner) findViewById(R.id.spinnerBraceletMaterial);

        SpinnerAdapter customAdapter = new BraceletSpinnerAdapter(this, R.layout.custom_ring_spinner_adapter, BraceletMaterial.getBraceletMaterialArrayList());
        spinnerBracelet.setAdapter(customAdapter);

        GemShape.initGemShape();
        Spinner spinnerGem = (Spinner) findViewById(R.id.spinnerGemShape);

        customAdapter = (SpinnerAdapter) new GemSpinnerAdapter(this, R.layout.custom_gem_spinner_adapter, GemShape.getGemShapeArrayList());
        spinnerGem.setAdapter(customAdapter);

    }
    public void clearEditText() {
        etGemPrice.getText().clear();
        etMaterialPrice.getText().clear();
    }
}