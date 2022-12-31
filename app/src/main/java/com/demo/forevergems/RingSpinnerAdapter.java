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

public class RingSpinnerAdapter extends ArrayAdapter<RingMaterial>
{

    LayoutInflater layoutInflater;

    public RingSpinnerAdapter(@NonNull Context context, int resource, @NonNull List<RingMaterial> ringMaterials)
    {
        super(context, resource, ringMaterials);
        layoutInflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent)
    {
        View rowView = layoutInflater.inflate(R.layout.custom_ring_spinner_adapter, null,true);
        RingMaterial ringMaterial = getItem(position);
        TextView textView = (TextView)rowView.findViewById(R.id.nameTextViewRing);
        ImageView imageView = (ImageView)rowView.findViewById(R.id.imageIconRing);
        textView.setText(ringMaterial.getName());
        imageView.setImageResource(ringMaterial.getImage());
        return rowView;
    }


    @Override
    public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent)
    {
        if(convertView == null)
            convertView = layoutInflater.inflate(R.layout.custom_ring_spinner_adapter, parent,false);

        RingMaterial ringMaterial = getItem(position);
        TextView textView = (TextView)convertView.findViewById(R.id.nameTextViewRing);
        ImageView imageView = (ImageView)convertView.findViewById(R.id.imageIconRing);
        textView.setText(ringMaterial.getName());
        imageView.setImageResource(ringMaterial.getImage());
        return convertView;
    }

}