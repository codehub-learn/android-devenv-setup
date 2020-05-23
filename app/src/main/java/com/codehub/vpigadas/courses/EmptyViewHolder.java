package com.codehub.vpigadas.courses;

import android.view.View;

import androidx.annotation.NonNull;

public class EmptyViewHolder extends PfAcademyViewHolder<Object> {
    public EmptyViewHolder(@NonNull View itemView) {
        super(itemView);
    }

    @Override
    void present(Object data) {

    }
}
