package com.codehub.vpigadas.courses;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class SecondActivity extends AppCompatActivity {

    //    private RecyclerView recyclerView;
    private CustomAdapter adapter;

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
        array.add(0);
        array.add("S");
        array.add("D");
        array.add(0);
        array.add("F");
        array.add("B");
        array.add("BH");
        array.add(0);
        array.add("BB");
        array.add("BA");
        array.add(0);
        array.add(0);
        array.add("BS");
        array.add("BD");
        array.add(0);
        array.add("V");
        array.add(0);
        array.add("S");
        array.add("D");
        array.add(0);
        array.add("F");
        array.add("B");
        array.add("BH");
        array.add(0);
        array.add("BB");
        array.add("BA");
        array.add(0);
        array.add(0);
        array.add("BS");
        array.add("BD");
        array.add(0);
        array.add("V");
        array.add(0);
        array.add("S");
        array.add("D");
        array.add(0);
        array.add("F");
        array.add("B");
        array.add("BH");
        array.add(0);
        array.add("BB");
        array.add("BA");
        array.add(0);
        array.add(0);
        array.add("BS");
        array.add("BD");
        array.add(0);
        array.add("V");
        array.add(0);
        array.add("S");
        array.add("D");
        array.add(0);
        array.add("F");
        array.add("B");
        array.add("BH");
        array.add(0);
        array.add("BB");
        array.add("BA");
        array.add(0);
        array.add(0);
        array.add("BS");
        array.add("BD");
        array.add(0);
        array.add("V");
        array.add(0);
        array.add("S");
        array.add("D");
        array.add(0);
        array.add("F");
        array.add("B");
        array.add("BH");
        array.add(0);
        array.add("BB");
        array.add("BA");
        array.add(0);
        array.add(0);
        array.add("BS");
        array.add("BD");
        array.add(0);
        array.add("V");
        array.add(0);
        array.add("S");
        array.add("D");
        array.add(0);
        array.add("F");
        array.add("B");
        array.add("BH");
        array.add(0);
        array.add("BB");
        array.add("BA");
        array.add(0);
        array.add(0);
        array.add("BS");
        array.add("BD");
        array.add(0);
        array.add("V");
        array.add(0);
        array.add("S");
        array.add("D");
        array.add(0);
        array.add("F");
        array.add("B");
        array.add("BH");
        array.add(0);
        array.add("BB");
        array.add("BA");
        array.add(0);
        array.add(0);
        array.add("BS");
        array.add("BD");
        array.add(0);
        array.add("V");
        array.add(0);
        array.add("S");
        array.add("D");
        array.add(0);
        array.add("F");
        array.add("B");
        array.add("BH");
        array.add(0);
        array.add("BB");
        array.add("BA");
        array.add(0);
        array.add(0);
        array.add("BS");
        array.add("BD");
        array.add(0);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
//        recyclerView.setAdapter(new RecAdapter(array, new ItemClickListener() {
//            @Override
//            public void onItemClick(Object item) {
//                    // object item
//            }
//        }));
        adapter = new CustomAdapter(new ItemClickListener() {
            @Override
            public void onItemClick(Object item) {
                Log.i("CUSTOM", item.toString());
//                Log.v(); // verbose
//                Log.i(); // info
//                Log.d(); // debug
//                Log.e(); // error
//                Log.wtf(); // wth
//                Log.w(); //warning
                // object item
            }
        });
        recyclerView.setAdapter(adapter);

        adapter.submitList(array);

    }
}
