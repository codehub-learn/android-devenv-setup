package com.codehub.vpigadas.courses;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;
import com.codehub.vpigadas.courses.viewmodels.FragmentCommViewModel;

public class FragmentCommActivity extends AppCompatActivity implements ThirdFragment.ThirdFragmentListener {

    private FragmentCommViewModel viewmodel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_comm);

        viewmodel = new ViewModelProvider(this).get(FragmentCommViewModel.class);

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.add(R.id.frameLayout, BlankFragment.getInstance("", 0));
        transaction.commit();
    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);

        viewmodel.getStream().observe(this, new Observer<String>() {
            @Override
            public void onChanged(String s) {
                Log.i("Response", s);
            }
        });

        RequestQueue queue = Volley.newRequestQueue(this);
        viewmodel.makeRequest(queue);
    }

    @Override
    public void onReturnValue(Object value) {
        Log.d("Activity", String.valueOf(value));
    }
}
