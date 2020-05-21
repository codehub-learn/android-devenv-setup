package com.codehub.vpigadas.courses;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class SecondActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);

        List<Object> array = new ArrayList<Object>();
        array.add("V");
        array.add("S");
        array.add("D");
        array.add("F");
        array.add("B");
        array.add("BH");
        array.add("BB");
        array.add("BA");
        array.add("BS");
        array.add("BD");

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setAdapter(new RecAdapter(array, new ItemClickListener() {
            @Override
            public void onItemClick(Object item) {
                    // object item
            }
        }));

    }
}
