package com.mbo.rxmarvel.rxmarvel.characters;

import android.databinding.ObservableArrayList;
import android.databinding.ObservableBoolean;
import android.databinding.ObservableList;

import com.marvel.model.Comic;

public class CharacterListViewModel {

    public final ObservableBoolean loading = new ObservableBoolean(true);
    public final ObservableList<CharacterViewModel> characters = new ObservableArrayList<>();

    public CharacterListViewModel(boolean loading) {
        this.loading.set(loading);
    }
}
