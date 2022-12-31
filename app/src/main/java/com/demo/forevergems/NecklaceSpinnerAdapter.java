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

public class NecklaceSpinnerAdapter extends ArrayAdapter<NecklaceMaterial>
{

    LayoutInflater layoutInflater;

    public NecklaceSpinnerAdapter(@NonNull Context context, int resource, @NonNull List<NecklaceMaterial> necklaceMaterials)
    {
        super(context, resource, necklaceMaterials);
        layoutInflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent)
    {
        View rowView = layoutInflater.inflate(R.layout.custom_necklace_spinner_adapter, null,true);
        NecklaceMaterial necklaceMaterial = getItem(position);
        TextView textView = (TextView)rowView.findViewById(R.id.nameTextViewNecklace);
        ImageView imageView = (ImageView)rowView.findViewById(R.id.imageIconNecklace);
        textView.setText(necklaceMaterial.getName());
        imageView.setImageResource(necklaceMaterial.getImage());
        return rowView;
    }


    @Override
    public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent)
    {
        if(convertView == null)
            convertView = layoutInflater.inflate(R.layout.custom_necklace_spinner_adapter, parent,false);

        NecklaceMaterial necklaceMaterial = getItem(position);
        TextView textView = (TextView)convertView.findViewById(R.id.nameTextViewNecklace);
        ImageView imageView = (ImageView)convertView.findViewById(R.id.imageIconNecklace);
        textView.setText(necklaceMaterial.getName());
        imageView.setImageResource(necklaceMaterial.getImage());
        return convertView;
    }

}