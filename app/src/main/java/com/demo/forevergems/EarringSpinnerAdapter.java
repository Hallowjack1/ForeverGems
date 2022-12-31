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

public class EarringSpinnerAdapter extends ArrayAdapter<EarringMaterial>
{

    LayoutInflater layoutInflater;

    public EarringSpinnerAdapter(@NonNull Context context, int resource, @NonNull List<EarringMaterial> earringMaterials)
    {
        super(context, resource, earringMaterials);
        layoutInflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent)
    {
        View rowView = layoutInflater.inflate(R.layout.custom_earring_spinner_adapter, null,true);
        EarringMaterial earringMaterial = getItem(position);
        TextView textView = (TextView)rowView.findViewById(R.id.nameTextViewEarring);
        ImageView imageView = (ImageView)rowView.findViewById(R.id.imageIconEarring);
        textView.setText(earringMaterial.getName());
        imageView.setImageResource(earringMaterial.getImage());
        return rowView;
    }


    @Override
    public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent)
    {
        if(convertView == null)
            convertView = layoutInflater.inflate(R.layout.custom_earring_spinner_adapter, parent,false);

        EarringMaterial earringMaterial = getItem(position);
        TextView textView = (TextView)convertView.findViewById(R.id.nameTextViewEarring);
        ImageView imageView = (ImageView)convertView.findViewById(R.id.imageIconEarring);
        textView.setText(earringMaterial.getName());
        imageView.setImageResource(earringMaterial.getImage());
        return convertView;
    }

}