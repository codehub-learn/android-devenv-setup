package com.codehub.vpigadas.courses;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.codehub.vpigadas.courses.viewmodels.FragmentCommViewModel;


public class BlankFragment extends Fragment {

    private FragmentCommViewModel viewmodel;

    public static BlankFragment getInstance(String name, int number) {
        BlankFragment fragment = new BlankFragment();
        Bundle parameter = new Bundle();
        parameter.putString("name", name);
        parameter.putInt("number", number);

        fragment.setArguments(parameter);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        FragmentActivity activity = getActivity();
        if(activity == null){
            viewmodel = new ViewModelProvider(this).get(FragmentCommViewModel.class);
        }else {
            viewmodel = new ViewModelProvider(activity).get(FragmentCommViewModel.class);
        }

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_blank, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        viewmodel.getStream().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(String s) {
                Log.i("Response", s);
            }
        });
    }

    @Override
    public void onResume() {
        super.onResume();

        // api call
        // callback return response
        // get Image
        View view = getView();

        if(view != null){
        ImageView img = view.findViewById(R.id.fragmentImg1);
            img.setImageResource(R.drawable.ic_router_black_24dp);
        }
    }

    @Override
    public void onPause() {
        super.onPause();
    }

    @Override
    public void onStop() {
        super.onStop();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }
}
