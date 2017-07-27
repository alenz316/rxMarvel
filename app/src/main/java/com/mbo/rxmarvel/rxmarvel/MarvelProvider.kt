package com.mbo.rxmarvel.rxmarvel

import android.util.Log
import com.marvel.CollectionFormats
import com.marvel.Marvel
import com.marvel.api.PublicApi
import com.marvel.model.CharacterDataWrapper
import com.marvel.model.Comic
import com.marvel.model.ComicDataWrapper
import com.mbo.rxmarvel.rxmarvel.characters.CharacterViewModel
import io.reactivex.Observable
import io.reactivex.Single
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.functions.Consumer
import io.reactivex.schedulers.Schedulers
import org.joda.time.LocalDate

object MarvelProvider {

    val sCharacterObservable: Observable<List<CharacterViewModel>> by lazy {
        // Query the API for characters that start with "spider"
        Marvel.getApi().getCreatorCollectionKt(nameStartsWith = "spider")
                // Take the API result and emit each character individually
                .flatMap { characterDataWrapper -> Observable.fromIterable(characterDataWrapper.data.results) }
                // Query the API for each character for 5 comics ordered by the issue number
                .flatMap { character ->
                    Marvel.getApi().getComicsCharacterCollectionKt(characterId = character.id, orderBy = CollectionFormats.CSVParams("issueNumber"), limit = 5, offset = null)
                            // Take the API result and emit each comic individually
                            .flatMap { comicDataWrapper -> Observable.fromIterable(comicDataWrapper.data.results) }
                            // Filter out lame comics that have issue numbers < 0
                            .filter { comic -> comic.issueNumber >= 0 }
                            // Empty comic if there are no comic for the character
                            .firstKt(defaultItem = Comic())
                            // Group the character and the comic together
                            .map { comic -> Pair(character, comic) }
                            .toObservable() // Is a single, we want an observable for this demo
                }
                // Map to the pairing to a new view model
                .map { (character, comic) -> CharacterViewModel(character, comic) }
                // Collect all view models into a single list
                .collect({ mutableListOf<CharacterViewModel>() },
                        { pairs, characterComicPair -> pairs.add(characterComicPair) })
                // Prevent list modification
                .map { it as List<CharacterViewModel> }
                .toObservable() // Is a single, we want an observable for this demo
                .cache() // Mem-cache the results to prevent hitting the API again
                .subscribeOn(Schedulers.io()) // ^ all work is done in the background
                .observeOn(AndroidSchedulers.mainThread()) // results are delivered on the Main Thread
                .apply {
                    subscribe(sConsumer)
                }
    }

    internal var sConsumer: Consumer<List<CharacterViewModel>> = Consumer { characters ->
        // Logging
        Log.d("TESTERS", "accept() called with: characters = [$characters]")
    }

    val spiderCharacterObservable: Observable<List<CharacterViewModel>>
        get() {
            return sCharacterObservable
        }

    // region Extension methods to improve legibility
    // Ideally, these are available in PublicApi, but it's generated code that I don't wanna touch

    private fun PublicApi.getCreatorCollectionKt(name: String? = null, nameStartsWith: String? = null, modifiedSince: LocalDate? = null,
                                                 comics: CollectionFormats.CSVParams? = null, series: CollectionFormats.CSVParams? = null,
                                                 events: CollectionFormats.CSVParams? = null, stories: CollectionFormats.CSVParams? = null,
                                                 orderBy: CollectionFormats.CSVParams? = null, limit: Int? = null, offset: Int? = null): Observable<CharacterDataWrapper> {
        return getCreatorCollection(name, nameStartsWith, modifiedSince, comics, series, events, stories, orderBy, limit, offset)
    }

    private fun PublicApi.getComicsCharacterCollectionKt(characterId: Int? = null, format: String? = null, formatType: String? = null, noVariants: Boolean? = null,
                                                         dateDescriptor: String? = null, dateRange: CollectionFormats.CSVParams? = null, title: String? = null,
                                                         titleStartsWith: String? = null, startYear: Int? = null, issueNumber: Int? = null, diamondCode: String? = null,
                                                         digitalId: Int? = null, upc: String? = null, isbn: String? = null, ean: String? = null, issn: String? = null,
                                                         hasDigitalIssue: Boolean? = null, modifiedSince: LocalDate? = null, creators: CollectionFormats.CSVParams? = null,
                                                         series: CollectionFormats.CSVParams? = null, events: CollectionFormats.CSVParams? = null,
                                                         stories: CollectionFormats.CSVParams? = null, sharedAppearances: CollectionFormats.CSVParams? = null,
                                                         collaborators: CollectionFormats.CSVParams? = null, orderBy: CollectionFormats.CSVParams? = null,
                                                         limit: Int? = null, offset: Int? = null): Observable<ComicDataWrapper> {

        return getComicsCharacterCollection(characterId, format, formatType, noVariants, dateDescriptor,
                dateRange, title, titleStartsWith, startYear, issueNumber, diamondCode, digitalId, upc,
                isbn, ean, issn, hasDigitalIssue, modifiedSince, creators, series, events, stories,
                sharedAppearances, collaborators, orderBy, limit, offset)
    }

    private fun <T> Observable<T>.firstKt(defaultItem: T): Single<T> = first(defaultItem)

    // endregion
}
