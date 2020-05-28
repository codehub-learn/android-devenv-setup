package com.codehub.vpigadas.courses;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.bumptech.glide.Glide;
import com.codehub.vpigadas.courses.json.CarJsonModel;
import com.codehub.vpigadas.courses.json.JsonModel;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;

import java.util.ArrayList;
import java.util.List;

public class ThirdActivity extends AppCompatActivity {
    private static final String url = "https://firebasestorage.googleapis.com/v0/b/greek-tv-program.appspot.com/o/ggtool%2FChampions_League.png?alt=media&token=a7fd7e62-12e2-4146-912e-5c39f771f5b5";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);

        ImageView img = findViewById(R.id.thirdImg);
        Glide.with(this).load(url).into(img);
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();

        RequestQueue queue = Volley.newRequestQueue(this);
        String url = "https://navneet7k.github.io/cars_list.json";
        String url1 = "https://navneet7k.github.io/vans_list.json";
        String url2 = "https://navneet7k.github.io/bike_list.json";

        StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {

                        JsonModel model = new Gson().fromJson(response,JsonModel.class);
                        Log.i("RESPONSE", model.toString());
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                error.printStackTrace();
            }
        });

//        stringRequest = new StringRequest(Request.Method.GET, url,
//                new Response.Listener<String>() {
//                    @Override
//                    public void onResponse(String response) {
//
//                        JsonModel model = new Gson().fromJson(response,JsonModel.class);
//                        Log.i("RESPONSE", model.toString());
//                    }
//                }, new Response.ErrorListener() {
//            @Override
//            public void onErrorResponse(VolleyError error) {
//                error.printStackTrace();
//            }
//        });
//
//        stringRequest = new StringRequest(Request.Method.GET, url,
//                new Response.Listener<String>() {
//                    @Override
//                    public void onResponse(String response) {
//
//                        JsonModel model = new Gson().fromJson(response,JsonModel.class);
//                        Log.i("RESPONSE", model.toString());
//                    }
//                }, new Response.ErrorListener() {
//            @Override
//            public void onErrorResponse(VolleyError error) {
//                error.printStackTrace();
//            }
//        });

        queue.add(stringRequest);
    }
}
