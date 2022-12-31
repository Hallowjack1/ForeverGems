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

public class GemSpinnerAdapter extends ArrayAdapter<GemShape>{
    LayoutInflater layoutInflater;

    public GemSpinnerAdapter(@NonNull Context context, int resource, @NonNull List<GemShape> gemShapes)
    {
        super(context, resource, gemShapes);
        layoutInflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent)
    {
        View rowView = layoutInflater.inflate(R.layout.custom_gem_spinner_adapter, null,true);
        GemShape gemShape = getItem(position);
        TextView textView = (TextView)rowView.findViewById(R.id.nameTextView);
        ImageView imageView = (ImageView)rowView.findViewById(R.id.imageIcon);
        textView.setText(gemShape.getName());
        imageView.setImageResource(gemShape.getImage());
        return rowView;
    }


    @Override
    public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent)
    {
        if(convertView == null)
            convertView = layoutInflater.inflate(R.layout.custom_gem_spinner_adapter, parent,false);

        GemShape gemShape = getItem(position);
        TextView textView = (TextView)convertView.findViewById(R.id.nameTextView);
        ImageView imageView = (ImageView)convertView.findViewById(R.id.imageIcon);
        textView.setText(gemShape.getName());
        imageView.setImageResource(gemShape.getImage());
        return convertView;
    }
}
