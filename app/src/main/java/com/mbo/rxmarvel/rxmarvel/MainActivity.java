package com.mbo.rxmarvel.rxmarvel;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.widget.Toast;

import com.mbo.rxmarvel.rxmarvel.characters.CharacterListViewModel;
import com.mbo.rxmarvel.rxmarvel.characters.CharacterViewModel;
import com.mbo.rxmarvel.rxmarvel.characters.CharactersFragment;

import java.util.List;

import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;

public class MainActivity extends AppCompatActivity implements CharactersFragment.CharacterListViewModelProvider {

    CharacterListViewModel characterListViewModel;
    Disposable characterDisposable;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setSupportActionBar((Toolbar) findViewById(R.id.toolbar));

        Fragment frag = getSupportFragmentManager().findFragmentById(R.id.content);
        if (frag == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.content, CharactersFragment.newInstance())
                    .commit();
        }

        characterListViewModel = new CharacterListViewModel(true);


        characterDisposable = MarvelProvider.getSpiderCharacterObservable().subscribe(new Consumer<List<CharacterViewModel>>() {
            @Override
            public void accept(List<CharacterViewModel> characters) throws Exception {
                characterListViewModel.characters.addAll(characters);
                characterListViewModel.loading.set(false);
            }
        }, new Consumer<Throwable>() {
            @Override
            public void accept(Throwable throwable) throws Exception {
                Toast.makeText(MainActivity.this, "Error: " + throwable, Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    protected void onPause() {
        super.onPause();
        if (characterDisposable != null && (isFinishing() || isChangingConfigurations())) {
            characterDisposable.dispose();
        }
    }

    @Override
    public CharacterListViewModel getCharacterListViewModel() {
        return characterListViewModel;
    }

    @Override
    public void onCharacterClicked(CharacterViewModel viewModel) {
        Toast.makeText(this, viewModel.character.getName(), Toast.LENGTH_SHORT).show();
    }
}
