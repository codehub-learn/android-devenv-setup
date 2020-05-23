package com.codehub.vpigadas.courses;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.ListAdapter;

public class CustomAdapter extends ListAdapter<Object, PfAcademyViewHolder<Object>> {

    private ItemClickListener listener;

    protected CustomAdapter(ItemClickListener listener) {
        super(new DiffItemCallbackClass<Object>());
        this.listener = listener;
    }

    @NonNull
    @Override
    public PfAcademyViewHolder<Object> onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(viewType, parent, false);

        if (viewType == R.layout.holder_item_row) {
            return new CustomViewHolder(view, listener);
        }else if(viewType == R.layout.holder_line){
            return new CustomLineViewHolder(view);
        } else {
            return new EmptyViewHolder(view);
        }
    }

    @Override
    public void onBindViewHolder(@NonNull PfAcademyViewHolder<Object> holder, int position) {
        holder.present(getItem(position));
    }


    @Override
    public int getItemViewType(int position) {
        Object item = getItem(position);

        if (item instanceof String) {
            return R.layout.holder_item_row;
        } else if(item instanceof Integer){
            return R.layout.holder_line;
        }else {
            return R.layout.holder_empty;
        }
    }
}
