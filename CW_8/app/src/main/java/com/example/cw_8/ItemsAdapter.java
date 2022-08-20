 package com.example.cw_8;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.helper.widget.Layer;

import com.example.cw_8.Items;
import com.example.cw_8.R;

import java.util.List;

public class ItemsAdapter extends ArrayAdapter<Items> {

    List<Items> itemslist;

    public ItemsAdapter(@NonNull Context context, int resource, @NonNull List<Items> objects) {
        super(context, resource, objects);
        itemslist = objects;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.items_row, parent, false);

        Items currentitems = itemslist.get(position);

        TextView itemName = v.findViewById(R.id.name);
        TextView itemPrice = v.findViewById(R.id.price);
        ImageView itemPhoto = v.findViewById(R.id.photo);

        itemName.setText(currentitems.getName());
        itemPrice.setText(String.valueOf(currentitems.getPrice()));
        itemPhoto.setImageResource(currentitems.getPhoto());

        ImageView delete = v.findViewById(R.id.delete);

        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                itemslist.remove(position);
                notify();

            }
        });

        return v;
    }
}
