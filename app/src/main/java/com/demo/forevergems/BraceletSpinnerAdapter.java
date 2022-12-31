package com.demo.forevergems;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class BraceletSpinnerAdapter extends ArrayAdapter<BraceletMaterial>
{

    LayoutInflater layoutInflater;

    public BraceletSpinnerAdapter(@NonNull Context context, int resource, @NonNull List<BraceletMaterial> braceletMaterials)
    {
        super(context, resource, braceletMaterials);
        layoutInflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent)
    {
        View rowView = layoutInflater.inflate(R.layout.custom_bracelet_spinner_adapter, null,true);
        BraceletMaterial braceletMaterial = getItem(position);
        TextView textView = (TextView)rowView.findViewById(R.id.nameTextViewBracelet);
        ImageView imageView = (ImageView)rowView.findViewById(R.id.imageIconBracelet);
        textView.setText(braceletMaterial.getName());
        imageView.setImageResource(braceletMaterial.getImage());
        return rowView;
    }


    @Override
    public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent)
    {
        if(convertView == null)
            convertView = layoutInflater.inflate(R.layout.custom_bracelet_spinner_adapter, parent,false);

        BraceletMaterial braceletMaterial = getItem(position);
        TextView textView = (TextView)convertView.findViewById(R.id.nameTextViewBracelet);
        ImageView imageView = (ImageView)convertView.findViewById(R.id.imageIconBracelet);
        textView.setText(braceletMaterial.getName());
        imageView.setImageResource(braceletMaterial.getImage());
        return convertView;
    }

}