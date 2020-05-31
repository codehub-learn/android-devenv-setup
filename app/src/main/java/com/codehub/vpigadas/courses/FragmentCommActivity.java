package com.codehub.vpigadas.courses;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import com.codehub.vpigadas.courses.database.ApplicationDatabase;

public class FragmentCommActivity extends AppCompatActivity implements ThirdFragment.ThirdFragmentListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_comm);
    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frameLayout, ThirdFragment.newInstance(), null);
        transaction.addToBackStack(null);
        transaction.commit();


        ApplicationDatabase database = ApplicationDatabase.getInstance(this);

        database.getEntityDaoModel().insert();
        database.getEntityDaoModel().delete();
        database.getEntityDaoModel().getAll();
    }

    @Override
    public void onReturnValue(Object value) {
        Log.d("Activity", String.valueOf(value));
    }

    public void setSomething(String value){

    }
}
