package com.codehub.vpigadas.courses;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecViewHolder extends RecyclerView.ViewHolder {

    private ItemClickListener itemClickListener;

    private Object data;

    public RecViewHolder(@NonNull View itemView, ItemClickListener itemClickListener) {
        super(itemView);
        this.itemClickListener = itemClickListener;

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                itemClickListener.onItemClick(data);
            }
        });
    }

    public void present(String data) {
        TextView txt = itemView.findViewById(R.id.holder_txt);
        txt.setText(data);
    }

    public void present(Object data) {
        this.data = data;

        TextView txt = itemView.findViewById(R.id.holder_txt);
        txt.setText(data.toString());
    }

}
