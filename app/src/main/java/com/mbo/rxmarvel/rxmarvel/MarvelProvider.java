package com.mbo.rxmarvel.rxmarvel;

import android.util.Log;

import com.marvel.CollectionFormats;
import com.marvel.Marvel;
import com.marvel.model.Character;
import com.marvel.model.CharacterDataWrapper;
import com.marvel.model.Comic;
import com.marvel.model.ComicDataWrapper;
import com.mbo.rxmarvel.rxmarvel.characters.CharacterViewModel;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.BiConsumer;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.schedulers.Schedulers;
import kotlin.Pair;

public class MarvelProvider {

    private MarvelProvider() {
    }

    static Observable<List<CharacterViewModel>> sCharacterObservable;

    static Consumer<List<CharacterViewModel>> sConsumer = new io.reactivex.functions.Consumer<List<CharacterViewModel>>() {
        @Override
        public void accept(List<CharacterViewModel> characters) throws Exception {
            Log.d("TESTERS", "accept() called with: characters = [" + characters + "]");
        }
    };


    public static Observable<List<CharacterViewModel>> getSpiderCharacterObservable() {
        if (sCharacterObservable == null) {
            sCharacterObservable = Marvel.getApi().getCreatorCollection(null, "spider",
                    null, null, null, null, null,
                    null, null, null)
                    .flatMap(new Function<CharacterDataWrapper, ObservableSource<Character>>() {
                        @Override
                        public ObservableSource<Character> apply(CharacterDataWrapper characterDataWrapper) throws Exception {
                            return Observable.fromIterable(characterDataWrapper.getData().getResults());
                        }
                    })
                    .flatMap(new Function<Character, ObservableSource<Pair<Character, Comic>>>() {
                        @Override
                        public ObservableSource<Pair<Character, Comic>> apply(final Character character) throws Exception {
                            return Marvel.getApi().getComicsCharacterCollection(character.getId(), null, null,
                                    null, null, null, null,
                                    null, null, null, null, null, null, null, null, null, null, null, null,
                                    null, null, null, null, null, new CollectionFormats.CSVParams("issueNumber"), 5, null)
                                    .flatMap(new Function<ComicDataWrapper, ObservableSource<Comic>>() {
                                        @Override
                                        public ObservableSource<Comic> apply(ComicDataWrapper comicDataWrapper) throws Exception {
                                            return Observable.fromIterable(comicDataWrapper.getData().getResults());
                                        }
                                    })
                                    .filter(new Predicate<Comic>() {
                                        @Override
                                        public boolean test(Comic comic) throws Exception {
                                            return comic.getIssueNumber() >= 0;
                                        }
                                    })
                                    .first(new Comic()) // Empty
                                    .map(new Function<Comic, Pair<Character, Comic>>() {
                                        @Override
                                        public Pair<Character, Comic> apply(Comic comic) throws Exception {
                                            return new Pair<>(character, comic);
                                        }
                                    })
                                    .toObservable();
                        }
                    })
                    .map(new Function<Pair<Character, Comic>, CharacterViewModel>() {
                        @Override
                        public CharacterViewModel apply(Pair<Character, Comic> characterComicPair) throws Exception {
                            return new CharacterViewModel(characterComicPair.getFirst(), characterComicPair.getSecond());
                        }
                    })
                    .collect(new Callable<List<CharacterViewModel>>() {
                        @Override
                        public List<CharacterViewModel> call() throws Exception {
                            return new ArrayList<>();
                        }
                    }, new BiConsumer<List<CharacterViewModel>, CharacterViewModel>() {
                        @Override
                        public void accept(List<CharacterViewModel> pairs, CharacterViewModel characterComicPair) throws Exception {
                            pairs.add(characterComicPair);
                        }
                    })
                    .toObservable()
                    //.compose(ReplayingShare.<List<CharacterViewModel>>instance())
                    .cache()
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread());
            sCharacterObservable.subscribe(sConsumer);
        }

        return sCharacterObservable;
    }
}
