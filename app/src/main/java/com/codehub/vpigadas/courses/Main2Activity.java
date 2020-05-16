package com.codehub.vpigadas.courses;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);

        TextView textView = findViewById(R.id.mainTxt);
        textView.setText("Vassilis");
        textView.setBackgroundResource(R.color.colorPrimary);

        EditText edit = findViewById(R.id.editTxt);
    }
}
