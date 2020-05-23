package com.codehub.vpigadas.courses;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;

public class CustomViewHolder extends PfAcademyViewHolder<Object> {

    public CustomViewHolder(@NonNull View itemView, @NonNull ItemClickListener listener) {
        super(itemView);
        setListener(listener);
    }

    @Override
    void present(Object data) {
        setData(data);
        TextView text = itemView.findViewById(R.id.holder_txt);

        if (data instanceof String) {
            String value = (String) data;
            text.setText(value);
        } else {
            text.setText(data.toString());
        }
    }
}
