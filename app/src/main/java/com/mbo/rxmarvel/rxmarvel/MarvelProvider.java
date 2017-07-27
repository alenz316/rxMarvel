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
            // Logging
            Log.d("TESTERS", "accept() called with: characters = [" + characters + "]");
        }
    };


    public static Observable<List<CharacterViewModel>> getSpiderCharacterObservable() {
        if (sCharacterObservable == null) {
            // Query the API for characters that start with "spider"
            sCharacterObservable = Marvel.getApi().getCreatorCollection(null, "spider",
                    null, null, null, null, null,
                    null, null, null)
                    .flatMap(new Function<CharacterDataWrapper, ObservableSource<Character>>() {
                        @Override
                        public ObservableSource<Character> apply(CharacterDataWrapper characterDataWrapper) throws Exception {
                            // Take the API result and emit each character individually
                            return Observable.fromIterable(characterDataWrapper.getData().getResults());
                        }
                    })
                    .flatMap(new Function<Character, ObservableSource<Pair<Character, Comic>>>() {
                        @Override
                        public ObservableSource<Pair<Character, Comic>> apply(final Character character) throws Exception {
                            // Query the API for each character for 5 comics ordered by the issue number
                            return Marvel.getApi().getComicsCharacterCollection(character.getId(), null, null,
                                    null, null, null, null,
                                    null, null, null, null, null, null, null, null, null, null, null, null,
                                    null, null, null, null, null, new CollectionFormats.CSVParams("issueNumber"), 5, null)
                                    .flatMap(new Function<ComicDataWrapper, ObservableSource<Comic>>() {
                                        @Override
                                        public ObservableSource<Comic> apply(ComicDataWrapper comicDataWrapper) throws Exception {
                                            // Take the API result and emit each comic individually
                                            return Observable.fromIterable(comicDataWrapper.getData().getResults());
                                        }
                                    })
                                    .filter(new Predicate<Comic>() {
                                        @Override
                                        public boolean test(Comic comic) throws Exception {
                                            // Filter out lame comics that have issue numbers < 0
                                            return comic.getIssueNumber() >= 0;
                                        }
                                    })
                                    .first(new Comic()) // Empty comic if there are no comic for the character
                                    .map(new Function<Comic, Pair<Character, Comic>>() {
                                        @Override
                                        public Pair<Character, Comic> apply(Comic comic) throws Exception {
                                            // Group the character and the comic together
                                            return new Pair<>(character, comic);
                                        }
                                    })
                                    .toObservable();// Is a single, we want an observable for this demo
                        }
                    })
                    .map(new Function<Pair<Character, Comic>, CharacterViewModel>() {
                        @Override
                        public CharacterViewModel apply(Pair<Character, Comic> characterComicPair) throws Exception {
                            // Map to the pairing to a new view model
                            return new CharacterViewModel(characterComicPair.getFirst(), characterComicPair.getSecond());
                        }
                    })
                    // Collect all view models into a single list
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
                    .toObservable() // Is a single, we want an observable for this demo
                    //.compose(ReplayingShare.<List<CharacterViewModel>>instance())
                    .cache() // Mem-cache the results to prevent hitting the API again
                    .subscribeOn(Schedulers.io()) // ^ all work is done in the background
                    .observeOn(AndroidSchedulers.mainThread()); // results are delivered on the Main Thread
            sCharacterObservable.subscribe(sConsumer);
        }

        return sCharacterObservable;
    }
}
