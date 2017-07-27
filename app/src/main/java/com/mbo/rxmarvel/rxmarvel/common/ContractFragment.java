package com.mbo.rxmarvel.rxmarvel.common;

import android.content.Context;
import android.support.v4.app.Fragment;


public class ContractFragment<T> extends Fragment {

    private T mContract;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            //noinspection unchecked - catching the cast
            mContract = (T) getActivity();
        } catch (ClassCastException e) {
            throw new IllegalStateException(getContract().getClass().getSimpleName()
                    + " does not implement " + getClass().getSimpleName() + "'s contract interface.", e);
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mContract = null;
    }

    public final T getContract() {
        return mContract;
    }
}
