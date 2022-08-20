package com.example.cw_8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.io.Serializable;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Items> itemslist = new ArrayList<>();

    int nn = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView name , price;
        ImageView photo;


        name = findViewById(R.id.name);
        price = findViewById(R.id.price);
        photo = findViewById(R.id.photo);




        Items i1 = new Items("cheese" , 4 , R.drawable.cheese);
        Items i2 = new Items("chocolate" , 5 , R.drawable.chocolate);
        Items i3 = new Items("coffee" , 5  , R.drawable.coffee);
        Items i4 = new Items("donut" , 2  , R.drawable.donut);
        Items i5 = new Items("fries" , 1  , R.drawable.fries);
        Items i6 = new Items("honey" , 1  , R.drawable.honey);


        itemslist.add(i1);
        itemslist.add(i2);
        itemslist.add(i3);
        itemslist.add(i4);
        itemslist.add(i5);
        itemslist.add(i6);


        ItemsAdapter itemsadapter = new ItemsAdapter(this , 0 , itemslist);

        ListView listView = findViewById(R.id.listview);

        listView.setAdapter(itemsadapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Items currentItems = itemslist.get(i);

                Intent itemsIntent = new Intent(MainActivity.this , DetailsPage.class);
                itemsIntent.putExtra("item" ,  currentItems);
                startActivity(itemsIntent);
            }
        });


    }
}
