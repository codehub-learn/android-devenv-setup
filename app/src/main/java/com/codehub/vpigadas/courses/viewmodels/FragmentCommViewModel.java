package com.codehub.vpigadas.courses.viewmodels;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;

public class FragmentCommViewModel extends ViewModel {

    private MutableLiveData<String> stream = new MutableLiveData<>();

    public MutableLiveData<String> getStream() {
        return stream;
    }

    public void makeRequest(RequestQueue queue){
        String url = "https://api.themoviedb.org/3/discover/movie?api_key=ebdfc664a6e43caf666a31376c711ee4&language=en-US&sort_by=popularity.desc&include_adult=false&include_video=false&page=1";

        StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        stream.postValue(response);
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
            }
        });

        queue.add(stringRequest);
    }

}
