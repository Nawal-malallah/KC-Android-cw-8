package com.example.cw_8;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_page);

        Bundle b = getIntent().getExtras();

        TextView name = findViewById(R.id.name);
        TextView price = findViewById(R.id.price);
        ImageView photo = findViewById(R.id.photo);

        Items leItems = (Items) b.getSerializable("item");
        name.setText(leItems.getName());
        price.setText(leItems.getPrice());
        photo.setImageResource(leItems.getPhoto());

    }
}