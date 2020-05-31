package com.codehub.vpigadas.courses;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.codehub.vpigadas.courses.models.Monkey;
import com.codehub.vpigadas.courses.models.Monkey2;

public class Main2Activity extends AppCompatActivity {

    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);

        String name = getIntent().getStringExtra("name");
        String name1 = getIntent().getStringExtra("name1");

//        Monkey monkey = (Monkey) getIntent().getSerializableExtra("monkey");

        Monkey2 monkey2 = getIntent().getParcelableExtra("monkey");

        TextView textView = findViewById(R.id.mainTxt);
        textView.setText("Vassilis");
        textView.setBackgroundResource(R.color.colorPrimary);

        EditText edit = findViewById(R.id.editTxt);


        btn = findViewById(R.id.mainBtn);
//        btn.setOnTouchListener(new View.OnTouchListener() {
//            @Override
//            public boolean onTouch(View v, MotionEvent event) {
//                return false;
//            }
//        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoNextScreen();
                onBackPressed();
            }
        });

        btn.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                getIntent().putExtra("status","Go Back");
                setResult(RESULT_OK,getIntent());
                finish();
                return true;
            }
        });
    }

    private void gotoNextScreen() {
        Intent intent = new Intent(Main2Activity.this,SecondActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onResume() {
        super.onResume();
    }
}
