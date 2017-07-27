package com.mbo.rxmarvel.rxmarvel.common;

import android.databinding.ObservableList;


public abstract class ListChangeListener<T extends ObservableList> extends ObservableList.OnListChangedCallback<T> {
    @Override
    public void onChanged(T observableList) {
        // No-op: override at your leisure
    }

    @Override
    public void onItemRangeChanged(T observableList, int positionStart, int itemCount) {
        // No-op: override at your leisure
    }

    @Override
    public void onItemRangeInserted(T observableList, int positionStart, int itemCount) {
        // No-op: override at your leisure
    }

    @Override
    public void onItemRangeMoved(T observableList, int fromPosition, int toPosition, int itemCount) {
        // No-op: override at your leisure
    }

    @Override
    public void onItemRangeRemoved(T observableList, int positionStart, int itemCount) {
        // No-op: override at your leisure
    }
}
