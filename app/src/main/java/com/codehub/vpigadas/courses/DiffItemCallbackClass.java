package com.codehub.vpigadas.courses;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;

public class DiffItemCallbackClass<T extends Object> extends DiffUtil.ItemCallback<T> {

    @Override
    public boolean areItemsTheSame(@NonNull T oldItem, @NonNull T newItem) {
        return oldItem.equals(newItem);
    }

    @Override
    public boolean areContentsTheSame(@NonNull T oldItem, @NonNull T newItem) {
        return false;
    }
}
