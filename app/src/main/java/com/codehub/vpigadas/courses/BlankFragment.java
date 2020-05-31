package com.codehub.vpigadas.courses;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


public class BlankFragment extends Fragment {


    public static BlankFragment getInstance(String name, int number) {
        BlankFragment fragment = new BlankFragment();
        Bundle parameter = new Bundle();
        parameter.putString("name", name);
        parameter.putInt("number", number);

        fragment.setArguments(parameter);
        return fragment;
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_blank, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ImageView img = view.findViewById(R.id.fragmentImg1);

        if (getArguments() != null) {
            String name = getArguments().getString("name");
        }else {
            //Handle special event (wrong arguments)
        }
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
