package com.codehub.vpigadas.courses;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class RecAdapter extends RecyclerView.Adapter<RecViewHolder> {

    private List<Object> arrayData = new ArrayList<Object>();
    private ItemClickListener listener;

    public RecAdapter(List<Object> array, ItemClickListener listener) {
        arrayData = array;
        this.listener = listener;
    }

    @NonNull
    @Override
    public RecViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.holder_item_row, parent, false);
        return new RecViewHolder(view, listener);
    }

    @Override
    public void onBindViewHolder(@NonNull RecViewHolder holder, int position) {
        holder.present(arrayData.get(position));
    }

    @Override
    public int getItemCount() {
        return arrayData.size();
    }
}
