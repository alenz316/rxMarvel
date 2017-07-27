package com.marvel.api;

import com.marvel.CollectionFormats.*;


import io.reactivex.Observable;

import retrofit2.http.*;

import okhttp3.RequestBody;

import com.marvel.model.CharacterDataWrapper;
import com.marvel.model.ComicDataWrapper;
import com.marvel.model.CreatorDataWrapper;
import com.marvel.model.EventDataWrapper;
import org.joda.time.LocalDate;
import com.marvel.model.SeriesDataWrapper;
import com.marvel.model.StoryDataWrapper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface PublicApi {
  /**
   * Fetches lists of events filtered by a character id.
   * Fetches lists of events in which a specific character appears, with optional filters. See notes on individual parameters below.
   * @param characterId The character ID. (required)
   * @param name Filter the event list by name. (optional)
   * @param nameStartsWith Return events with names that begin with the specified string (e.g. Sp). (optional)
   * @param modifiedSince Return only events which have been modified since the specified date. (optional)
   * @param creators Return only events which feature work by the specified creators (accepts a comma-separated list of ids). (optional)
   * @param series Return only events which are part of the specified series (accepts a comma-separated list of ids). (optional)
   * @param comics Return only events which take place in the specified comics (accepts a comma-separated list of ids). (optional)
   * @param stories Return only events which contain the specified stories (accepts a comma-separated list of ids). (optional)
   * @param orderBy Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed. (optional)
   * @param limit Limit the result set to the specified number of resources. (optional)
   * @param offset Skip the specified number of resources in the result set. (optional)
   * @return Call&lt;EventDataWrapper&gt;
   */
  @GET("v1/public/characters/{characterId}/events")
  Observable<EventDataWrapper> getCharacterEventsCollection(
    @retrofit2.http.Path("characterId") Integer characterId, @retrofit2.http.Query("name") String name, @retrofit2.http.Query("nameStartsWith") String nameStartsWith, @retrofit2.http.Query("modifiedSince") LocalDate modifiedSince, @retrofit2.http.Query("creators") CSVParams creators, @retrofit2.http.Query("series") CSVParams series, @retrofit2.http.Query("comics") CSVParams comics, @retrofit2.http.Query("stories") CSVParams stories, @retrofit2.http.Query("orderBy") CSVParams orderBy, @retrofit2.http.Query("limit") Integer limit, @retrofit2.http.Query("offset") Integer offset
  );

  /**
   * Fetches a single character by id.
   * This method fetches a single character resource.  It is the canonical URI for any character resource provided by the API.
   * @param characterId A single character id. (required)
   * @return Call&lt;CharacterDataWrapper&gt;
   */
  @GET("v1/public/characters/{characterId}")
  Observable<CharacterDataWrapper> getCharacterIndividual(
    @retrofit2.http.Path("characterId") Integer characterId
  );

  /**
   * Fetches lists of series filtered by a character id.
   * Fetches lists of comic series in which a specific character appears, with optional filters. See notes on individual parameters below.
   * @param characterId The character ID (required)
   * @param title Filter by series title. (optional)
   * @param titleStartsWith Return series with titles that begin with the specified string (e.g. Sp). (optional)
   * @param startYear Return only series matching the specified start year. (optional)
   * @param modifiedSince Return only series which have been modified since the specified date. (optional)
   * @param comics Return only series which contain the specified comics (accepts a comma-separated list of ids). (optional)
   * @param stories Return only series which contain the specified stories (accepts a comma-separated list of ids). (optional)
   * @param events Return only series which have comics that take place during the specified events (accepts a comma-separated list of ids). (optional)
   * @param creators Return only series which feature work by the specified creators (accepts a comma-separated list of ids). (optional)
   * @param seriesType Filter the series by publication frequency type. (optional)
   * @param contains Return only series containing one or more comics with the specified format. (optional)
   * @param orderBy Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed. (optional)
   * @param limit Limit the result set to the specified number of resources. (optional)
   * @param offset Skip the specified number of resources in the result set. (optional)
   * @return Call&lt;SeriesDataWrapper&gt;
   */
  @GET("v1/public/characters/{characterId}/series")
  Observable<SeriesDataWrapper> getCharacterSeriesCollection(
    @retrofit2.http.Path("characterId") Integer characterId, @retrofit2.http.Query("title") String title, @retrofit2.http.Query("titleStartsWith") String titleStartsWith, @retrofit2.http.Query("startYear") Integer startYear, @retrofit2.http.Query("modifiedSince") LocalDate modifiedSince, @retrofit2.http.Query("comics") CSVParams comics, @retrofit2.http.Query("stories") CSVParams stories, @retrofit2.http.Query("events") CSVParams events, @retrofit2.http.Query("creators") CSVParams creators, @retrofit2.http.Query("seriesType") String seriesType, @retrofit2.http.Query("contains") CSVParams contains, @retrofit2.http.Query("orderBy") CSVParams orderBy, @retrofit2.http.Query("limit") Integer limit, @retrofit2.http.Query("offset") Integer offset
  );

  /**
   * Fetches lists of stories filtered by a character id.
   * Fetches lists of comic stories  featuring a specific character with optional filters. See notes on individual parameters below.
   * @param characterId The character ID. (required)
   * @param modifiedSince Return only stories which have been modified since the specified date. (optional)
   * @param comics Return only stories contained in the specified (accepts a comma-separated list of ids). (optional)
   * @param series Return only stories contained the specified series (accepts a comma-separated list of ids). (optional)
   * @param events Return only stories which take place during the specified events (accepts a comma-separated list of ids). (optional)
   * @param creators Return only stories which feature work by the specified creators (accepts a comma-separated list of ids). (optional)
   * @param orderBy Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed. (optional)
   * @param limit Limit the result set to the specified number of resources. (optional)
   * @param offset Skip the specified number of resources in the result set. (optional)
   * @return Call&lt;StoryDataWrapper&gt;
   */
  @GET("v1/public/characters/{characterId}/stories")
  Observable<StoryDataWrapper> getCharacterStoryCollection(
    @retrofit2.http.Path("characterId") Integer characterId, @retrofit2.http.Query("modifiedSince") LocalDate modifiedSince, @retrofit2.http.Query("comics") CSVParams comics, @retrofit2.http.Query("series") CSVParams series, @retrofit2.http.Query("events") CSVParams events, @retrofit2.http.Query("creators") CSVParams creators, @retrofit2.http.Query("orderBy") CSVParams orderBy, @retrofit2.http.Query("limit") Integer limit, @retrofit2.http.Query("offset") Integer offset
  );

  /**
   * Fetches lists of characters filtered by a comic id.
   * Fetches lists of characters which appear in a specific comic with optional filters. See notes on individual parameters below.
   * @param comicId The comic id. (required)
   * @param name Return only characters matching the specified full character name (e.g. Spider-Man). (optional)
   * @param nameStartsWith Return characters with names that begin with the specified string (e.g. Sp). (optional)
   * @param modifiedSince Return only characters which have been modified since the specified date. (optional)
   * @param series Return only characters which appear the specified series (accepts a comma-separated list of ids). (optional)
   * @param events Return only characters which appear comics that took place in the specified events (accepts a comma-separated list of ids). (optional)
   * @param stories Return only characters which appear the specified stories (accepts a comma-separated list of ids). (optional)
   * @param orderBy Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed. (optional)
   * @param limit Limit the result set to the specified number of resources. (optional)
   * @param offset Skip the specified number of resources in the result set. (optional)
   * @return Call&lt;CharacterDataWrapper&gt;
   */
  @GET("v1/public/comics/{comicId}/characters")
  Observable<CharacterDataWrapper> getComicCharacterCollection(
    @retrofit2.http.Path("comicId") Integer comicId, @retrofit2.http.Query("name") String name, @retrofit2.http.Query("nameStartsWith") String nameStartsWith, @retrofit2.http.Query("modifiedSince") LocalDate modifiedSince, @retrofit2.http.Query("series") CSVParams series, @retrofit2.http.Query("events") CSVParams events, @retrofit2.http.Query("stories") CSVParams stories, @retrofit2.http.Query("orderBy") CSVParams orderBy, @retrofit2.http.Query("limit") Integer limit, @retrofit2.http.Query("offset") Integer offset
  );

  /**
   * Fetches a single comic by id.
   * This method fetches a single comic resource.  It is the canonical URI for any comic resource provided by the API.
   * @param comicId A single comic. (required)
   * @return Call&lt;ComicDataWrapper&gt;
   */
  @GET("v1/public/comics/{comicId}")
  Observable<ComicDataWrapper> getComicIndividual(
    @retrofit2.http.Path("comicId") Integer comicId
  );

  /**
   * Fetches lists of stories filtered by a comic id.
   * Fetches lists of comic stories in a specific comic issue, with optional filters. See notes on individual parameters below.
   * @param comicId The comic ID. (required)
   * @param modifiedSince Return only stories which have been modified since the specified date. (optional)
   * @param series Return only stories contained the specified series (accepts a comma-separated list of ids). (optional)
   * @param events Return only stories which take place during the specified events (accepts a comma-separated list of ids). (optional)
   * @param creators Return only stories which feature work by the specified creators (accepts a comma-separated list of ids). (optional)
   * @param characters Return only stories which feature the specified characters (accepts a comma-separated list of ids). (optional)
   * @param orderBy Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed. (optional)
   * @param limit Limit the result set to the specified number of resources. (optional)
   * @param offset Skip the specified number of resources. (optional)
   * @return Call&lt;StoryDataWrapper&gt;
   */
  @GET("v1/public/comics/{comicId}/stories")
  Observable<StoryDataWrapper> getComicStoryCollection(
    @retrofit2.http.Path("comicId") Integer comicId, @retrofit2.http.Query("modifiedSince") LocalDate modifiedSince, @retrofit2.http.Query("series") CSVParams series, @retrofit2.http.Query("events") CSVParams events, @retrofit2.http.Query("creators") CSVParams creators, @retrofit2.http.Query("characters") CSVParams characters, @retrofit2.http.Query("orderBy") CSVParams orderBy, @retrofit2.http.Query("limit") Integer limit, @retrofit2.http.Query("offset") Integer offset
  );

  /**
   * Fetches lists of comics filtered by a character id.
   * Fetches lists of comics containing a specific character, with optional filters. See notes on individual parameters below.
   * @param characterId The character id. (required)
   * @param format Filter by the issue format (e.g. comic, digital comic, hardcover). (optional)
   * @param formatType Filter by the issue format type (comic or collection). (optional)
   * @param noVariants Exclude variant comics from the result set. (optional)
   * @param dateDescriptor Return comics within a predefined date range. (optional)
   * @param dateRange Return comics within a predefined date range.  Dates must be specified as date1,date2 (e.g. 2013-01-01,2013-01-02).  Dates are preferably formatted as YYYY-MM-DD but may be sent as any common date format. (optional)
   * @param title Return only issues in series whose title matches the input. (optional)
   * @param titleStartsWith Return only issues in series whose title starts with the input. (optional)
   * @param startYear Return only issues in series whose start year matches the input. (optional)
   * @param issueNumber Return only issues in series whose issue number matches the input. (optional)
   * @param diamondCode Filter by diamond code. (optional)
   * @param digitalId Filter by digital comic id. (optional)
   * @param upc Filter by UPC. (optional)
   * @param isbn Filter by ISBN. (optional)
   * @param ean Filter by EAN. (optional)
   * @param issn Filter by ISSN. (optional)
   * @param hasDigitalIssue Include only results which are available digitally. (optional)
   * @param modifiedSince Return only comics which have been modified since the specified date. (optional)
   * @param creators Return only comics which feature work by the specified creators (accepts a comma-separated list of ids). (optional)
   * @param series Return only comics which are part of the specified series (accepts a comma-separated list of ids). (optional)
   * @param events Return only comics which take place in the specified events (accepts a comma-separated list of ids). (optional)
   * @param stories Return only comics which contain the specified stories (accepts a comma-separated list of ids). (optional)
   * @param sharedAppearances Return only comics in which the specified characters appear together (for example in which BOTH Spider-Man and Wolverine appear). (optional)
   * @param collaborators Return only comics in which the specified creators worked together (for example in which BOTH Stan Lee and Jack Kirby did work). (optional)
   * @param orderBy Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed. (optional)
   * @param limit Limit the result set to the specified number of resources. (optional)
   * @param offset Skip the specified number of resources in the result set. (optional)
   * @return Call&lt;ComicDataWrapper&gt;
   */
  @GET("v1/public/characters/{characterId}/comics")
  Observable<ComicDataWrapper> getComicsCharacterCollection(
    @retrofit2.http.Path("characterId") Integer characterId, @retrofit2.http.Query("format") String format, @retrofit2.http.Query("formatType") String formatType, @retrofit2.http.Query("noVariants") Boolean noVariants, @retrofit2.http.Query("dateDescriptor") String dateDescriptor, @retrofit2.http.Query("dateRange") CSVParams dateRange, @retrofit2.http.Query("title") String title, @retrofit2.http.Query("titleStartsWith") String titleStartsWith, @retrofit2.http.Query("startYear") Integer startYear, @retrofit2.http.Query("issueNumber") Integer issueNumber, @retrofit2.http.Query("diamondCode") String diamondCode, @retrofit2.http.Query("digitalId") Integer digitalId, @retrofit2.http.Query("upc") String upc, @retrofit2.http.Query("isbn") String isbn, @retrofit2.http.Query("ean") String ean, @retrofit2.http.Query("issn") String issn, @retrofit2.http.Query("hasDigitalIssue") Boolean hasDigitalIssue, @retrofit2.http.Query("modifiedSince") LocalDate modifiedSince, @retrofit2.http.Query("creators") CSVParams creators, @retrofit2.http.Query("series") CSVParams series, @retrofit2.http.Query("events") CSVParams events, @retrofit2.http.Query("stories") CSVParams stories, @retrofit2.http.Query("sharedAppearances") CSVParams sharedAppearances, @retrofit2.http.Query("collaborators") CSVParams collaborators, @retrofit2.http.Query("orderBy") CSVParams orderBy, @retrofit2.http.Query("limit") Integer limit, @retrofit2.http.Query("offset") Integer offset
  );

  /**
   * Fetches lists of comics.
   * Fetches lists of comics with optional filters. See notes on individual parameters below.
   * @param format Filter by the issue format (e.g. comic, digital comic, hardcover). (optional)
   * @param formatType Filter by the issue format type (comic or collection). (optional)
   * @param noVariants Exclude variants (alternate covers, secondary printings, director&#39;s cuts, etc.) from the result set. (optional)
   * @param dateDescriptor Return comics within a predefined date range. (optional)
   * @param dateRange Return comics within a predefined date range.  Dates must be specified as date1,date2 (e.g. 2013-01-01,2013-01-02).  Dates are preferably formatted as YYYY-MM-DD but may be sent as any common date format. (optional)
   * @param title Return only issues in series whose title matches the input. (optional)
   * @param titleStartsWith Return only issues in series whose title starts with the input. (optional)
   * @param startYear Return only issues in series whose start year matches the input. (optional)
   * @param issueNumber Return only issues in series whose issue number matches the input. (optional)
   * @param diamondCode Filter by diamond code. (optional)
   * @param digitalId Filter by digital comic id. (optional)
   * @param upc Filter by UPC. (optional)
   * @param isbn Filter by ISBN. (optional)
   * @param ean Filter by EAN. (optional)
   * @param issn Filter by ISSN. (optional)
   * @param hasDigitalIssue Include only results which are available digitally. (optional)
   * @param modifiedSince Return only comics which have been modified since the specified date. (optional)
   * @param creators Return only comics which feature work by the specified creators (accepts a comma-separated list of ids). (optional)
   * @param characters Return only comics which feature the specified characters (accepts a comma-separated list of ids). (optional)
   * @param series Return only comics which are part of the specified series (accepts a comma-separated list of ids). (optional)
   * @param events Return only comics which take place in the specified events (accepts a comma-separated list of ids). (optional)
   * @param stories Return only comics which contain the specified stories (accepts a comma-separated list of ids). (optional)
   * @param sharedAppearances Return only comics in which the specified characters appear together (for example in which BOTH Spider-Man and Wolverine appear). Accepts a comma-separated list of ids. (optional)
   * @param collaborators Return only comics in which the specified creators worked together (for example in which BOTH Stan Lee and Jack Kirby did work). Accepts a comma-separated list of ids. (optional)
   * @param orderBy Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed. (optional)
   * @param limit Limit the result set to the specified number of resources. (optional)
   * @param offset Skip the specified number of resources in the result set. (optional)
   * @return Call&lt;ComicDataWrapper&gt;
   */
  @GET("v1/public/comics")
  Observable<ComicDataWrapper> getComicsCollection(
    @retrofit2.http.Query("format") String format, @retrofit2.http.Query("formatType") String formatType, @retrofit2.http.Query("noVariants") Boolean noVariants, @retrofit2.http.Query("dateDescriptor") String dateDescriptor, @retrofit2.http.Query("dateRange") CSVParams dateRange, @retrofit2.http.Query("title") String title, @retrofit2.http.Query("titleStartsWith") String titleStartsWith, @retrofit2.http.Query("startYear") Integer startYear, @retrofit2.http.Query("issueNumber") Integer issueNumber, @retrofit2.http.Query("diamondCode") String diamondCode, @retrofit2.http.Query("digitalId") Integer digitalId, @retrofit2.http.Query("upc") String upc, @retrofit2.http.Query("isbn") String isbn, @retrofit2.http.Query("ean") String ean, @retrofit2.http.Query("issn") String issn, @retrofit2.http.Query("hasDigitalIssue") Boolean hasDigitalIssue, @retrofit2.http.Query("modifiedSince") LocalDate modifiedSince, @retrofit2.http.Query("creators") CSVParams creators, @retrofit2.http.Query("characters") CSVParams characters, @retrofit2.http.Query("series") CSVParams series, @retrofit2.http.Query("events") CSVParams events, @retrofit2.http.Query("stories") CSVParams stories, @retrofit2.http.Query("sharedAppearances") CSVParams sharedAppearances, @retrofit2.http.Query("collaborators") CSVParams collaborators, @retrofit2.http.Query("orderBy") CSVParams orderBy, @retrofit2.http.Query("limit") Integer limit, @retrofit2.http.Query("offset") Integer offset
  );

  /**
   * Fetches lists of comics filtered by a creator id.
   * Fetches lists of comics in which the work of a specific creator appears, with optional filters. See notes on individual parameters below.
   * @param creatorId The creator ID. (required)
   * @param format Filter by the issue format (e.g. comic, digital comic, hardcover). (optional)
   * @param formatType Filter by the issue format type (comic or collection). (optional)
   * @param noVariants Exclude variant comics from the result set. (optional)
   * @param dateDescriptor Return comics within a predefined date range. (optional)
   * @param dateRange Return comics within a predefined date range.  Dates must be specified as date1,date2 (e.g. 2013-01-01,2013-01-02).  Dates are preferably formatted as YYYY-MM-DD but may be sent as any common date format. (optional)
   * @param title Return only issues in series whose title matches the input. (optional)
   * @param titleStartsWith Return only issues in series whose title starts with the input. (optional)
   * @param startYear Return only issues in series whose start year matches the input. (optional)
   * @param issueNumber Return only issues in series whose issue number matches the input. (optional)
   * @param diamondCode Filter by diamond code. (optional)
   * @param digitalId Filter by digital comic id. (optional)
   * @param upc Filter by UPC. (optional)
   * @param isbn Filter by ISBN. (optional)
   * @param ean Filter by EAN. (optional)
   * @param issn Filter by ISSN. (optional)
   * @param hasDigitalIssue Include only results which are available digitally. (optional)
   * @param modifiedSince Return only comics which have been modified since the specified date. (optional)
   * @param characters Return only comics which feature the specified characters (accepts a comma-separated list of ids). (optional)
   * @param series Return only comics which are part of the specified series (accepts a comma-separated list of ids). (optional)
   * @param events Return only comics which take place in the specified events (accepts a comma-separated list of ids). (optional)
   * @param stories Return only comics which contain the specified stories (accepts a comma-separated list of ids). (optional)
   * @param sharedAppearances Return only comics in which the specified characters appear together (for example in which BOTH Spider-Man and Wolverine appear). (optional)
   * @param collaborators Return only comics in which the specified creators worked together (for example in which BOTH Stan Lee and Jack Kirby did work). (optional)
   * @param orderBy Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed. (optional)
   * @param limit Limit the result set to the specified number of resources. (optional)
   * @param offset Skip the specified number of resources in the result set. (optional)
   * @return Call&lt;ComicDataWrapper&gt;
   */
  @GET("v1/public/creators/{creatorId}/comics")
  Observable<ComicDataWrapper> getComicsCollection_0(
    @retrofit2.http.Path("creatorId") Integer creatorId, @retrofit2.http.Query("format") String format, @retrofit2.http.Query("formatType") String formatType, @retrofit2.http.Query("noVariants") Boolean noVariants, @retrofit2.http.Query("dateDescriptor") String dateDescriptor, @retrofit2.http.Query("dateRange") CSVParams dateRange, @retrofit2.http.Query("title") String title, @retrofit2.http.Query("titleStartsWith") String titleStartsWith, @retrofit2.http.Query("startYear") Integer startYear, @retrofit2.http.Query("issueNumber") Integer issueNumber, @retrofit2.http.Query("diamondCode") String diamondCode, @retrofit2.http.Query("digitalId") Integer digitalId, @retrofit2.http.Query("upc") String upc, @retrofit2.http.Query("isbn") String isbn, @retrofit2.http.Query("ean") String ean, @retrofit2.http.Query("issn") String issn, @retrofit2.http.Query("hasDigitalIssue") CSVParams hasDigitalIssue, @retrofit2.http.Query("modifiedSince") LocalDate modifiedSince, @retrofit2.http.Query("characters") CSVParams characters, @retrofit2.http.Query("series") CSVParams series, @retrofit2.http.Query("events") CSVParams events, @retrofit2.http.Query("stories") CSVParams stories, @retrofit2.http.Query("sharedAppearances") CSVParams sharedAppearances, @retrofit2.http.Query("collaborators") CSVParams collaborators, @retrofit2.http.Query("orderBy") CSVParams orderBy, @retrofit2.http.Query("limit") Integer limit, @retrofit2.http.Query("offset") Integer offset
  );

  /**
   * Fetches lists of comics filtered by an event id.
   * Fetches lists of comics which take place during a specific event, with optional filters. See notes on individual parameters below.
   * @param eventId The event id. (required)
   * @param format Filter by the issue format (e.g. comic, digital comic, hardcover). (optional)
   * @param formatType Filter by the issue format type (comic or collection). (optional)
   * @param noVariants Exclude variant comics from the result set. (optional)
   * @param dateDescriptor Return comics within a predefined date range. (optional)
   * @param dateRange Return comics within a predefined date range.  Dates must be specified as date1,date2 (e.g. 2013-01-01,2013-01-02).  Dates are preferably formatted as YYYY-MM-DD but may be sent as any common date format. (optional)
   * @param title Return only issues in series whose title matches the input. (optional)
   * @param titleStartsWith Return only issues in series whose title starts with the input. (optional)
   * @param startYear Return only issues in series whose start year matches the input. (optional)
   * @param issueNumber Return only issues in series whose issue number matches the input. (optional)
   * @param diamondCode Filter by diamond code. (optional)
   * @param digitalId Filter by digital comic id. (optional)
   * @param upc Filter by UPC. (optional)
   * @param isbn Filter by ISBN. (optional)
   * @param ean Filter by EAN. (optional)
   * @param issn Filter by ISSN. (optional)
   * @param hasDigitalIssue Include only results which are available digitally. (optional)
   * @param modifiedSince Return only comics which have been modified since the specified date. (optional)
   * @param creators Return only comics which feature work by the specified creators (accepts a comma-separated list of ids). (optional)
   * @param characters Return only comics which feature the specified characters (accepts a comma-separated list of ids). (optional)
   * @param series Return only comics which are part of the specified series (accepts a comma-separated list of ids). (optional)
   * @param events Return only comics which take place in the specified events (accepts a comma-separated list of ids). (optional)
   * @param stories Return only comics which contain the specified stories (accepts a comma-separated list of ids). (optional)
   * @param sharedAppearances Return only comics in which the specified characters appear together (for example in which BOTH Spider-Man and Wolverine appear). (optional)
   * @param collaborators Return only comics in which the specified creators worked together (for example in which BOTH Stan Lee and Jack Kirby did work). (optional)
   * @param orderBy Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed. (optional)
   * @param limit Limit the result set to the specified number of resources. (optional)
   * @param offset Skip the specified number of resources in the result set. (optional)
   * @return Call&lt;ComicDataWrapper&gt;
   */
  @GET("v1/public/events/{eventId}/comics")
  Observable<ComicDataWrapper> getComicsCollection_1(
    @retrofit2.http.Path("eventId") Integer eventId, @retrofit2.http.Query("format") String format, @retrofit2.http.Query("formatType") String formatType, @retrofit2.http.Query("noVariants") CSVParams noVariants, @retrofit2.http.Query("dateDescriptor") CSVParams dateDescriptor, @retrofit2.http.Query("dateRange") CSVParams dateRange, @retrofit2.http.Query("title") String title, @retrofit2.http.Query("titleStartsWith") String titleStartsWith, @retrofit2.http.Query("startYear") Integer startYear, @retrofit2.http.Query("issueNumber") Integer issueNumber, @retrofit2.http.Query("diamondCode") String diamondCode, @retrofit2.http.Query("digitalId") Integer digitalId, @retrofit2.http.Query("upc") String upc, @retrofit2.http.Query("isbn") String isbn, @retrofit2.http.Query("ean") String ean, @retrofit2.http.Query("issn") String issn, @retrofit2.http.Query("hasDigitalIssue") CSVParams hasDigitalIssue, @retrofit2.http.Query("modifiedSince") LocalDate modifiedSince, @retrofit2.http.Query("creators") CSVParams creators, @retrofit2.http.Query("characters") CSVParams characters, @retrofit2.http.Query("series") CSVParams series, @retrofit2.http.Query("events") CSVParams events, @retrofit2.http.Query("stories") CSVParams stories, @retrofit2.http.Query("sharedAppearances") CSVParams sharedAppearances, @retrofit2.http.Query("collaborators") CSVParams collaborators, @retrofit2.http.Query("orderBy") CSVParams orderBy, @retrofit2.http.Query("limit") Integer limit, @retrofit2.http.Query("offset") Integer offset
  );

  /**
   * Fetches lists of comics filtered by a series id.
   * Fetches lists of comics which are published as part of a specific series, with optional filters. See notes on individual parameters below.
   * @param seriesId The series ID. (required)
   * @param format Filter by the issue format (e.g. comic, digital comic, hardcover). (optional)
   * @param formatType Filter by the issue format type (comic or collection). (optional)
   * @param noVariants Exclude variant comics from the result set. (optional)
   * @param dateDescriptor Return comics within a predefined date range. (optional)
   * @param dateRange Return comics within a predefined date range.  Dates must be specified as date1,date2 (e.g. 2013-01-01,2013-01-02).  Dates are preferably formatted as YYYY-MM-DD but may be sent as any common date format. (optional)
   * @param title Return only issues in series whose title matches the input. (optional)
   * @param titleStartsWith Return only issues in series whose title starts with the input. (optional)
   * @param startYear Return only issues in series whose start year matches the input. (optional)
   * @param issueNumber Return only issues in series whose issue number matches the input. (optional)
   * @param diamondCode Filter by diamond code. (optional)
   * @param digitalId Filter by digital comic id. (optional)
   * @param upc Filter by UPC. (optional)
   * @param isbn Filter by ISBN. (optional)
   * @param ean Filter by EAN. (optional)
   * @param issn Filter by ISSN. (optional)
   * @param hasDigitalIssue Include only results which are available digitally. (optional)
   * @param modifiedSince Return only comics which have been modified since the specified date. (optional)
   * @param creators Return only comics which feature work by the specified creators (accepts a comma-separated list of ids). (optional)
   * @param characters Return only comics which feature the specified characters (accepts a comma-separated list of ids). (optional)
   * @param events Return only comics which take place in the specified events (accepts a comma-separated list of ids). (optional)
   * @param stories Return only comics which contain the specified stories (accepts a comma-separated list of ids). (optional)
   * @param sharedAppearances Return only comics in which the specified characters appear together (for example in which BOTH Spider-Man and Wolverine appear). (optional)
   * @param collaborators Return only comics in which the specified creators worked together (for example in which BOTH Stan Lee and Jack Kirby did work). (optional)
   * @param orderBy Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed. (optional)
   * @param limit Limit the result set to the specified number of resources. (optional)
   * @param offset Skip the specified number of resources in the result set. (optional)
   * @return Call&lt;ComicDataWrapper&gt;
   */
  @GET("v1/public/series/{seriesId}/comics")
  Observable<ComicDataWrapper> getComicsCollection_2(
    @retrofit2.http.Path("seriesId") Integer seriesId, @retrofit2.http.Query("format") String format, @retrofit2.http.Query("formatType") String formatType, @retrofit2.http.Query("noVariants") CSVParams noVariants, @retrofit2.http.Query("dateDescriptor") CSVParams dateDescriptor, @retrofit2.http.Query("dateRange") CSVParams dateRange, @retrofit2.http.Query("title") String title, @retrofit2.http.Query("titleStartsWith") String titleStartsWith, @retrofit2.http.Query("startYear") Integer startYear, @retrofit2.http.Query("issueNumber") Integer issueNumber, @retrofit2.http.Query("diamondCode") String diamondCode, @retrofit2.http.Query("digitalId") Integer digitalId, @retrofit2.http.Query("upc") String upc, @retrofit2.http.Query("isbn") String isbn, @retrofit2.http.Query("ean") String ean, @retrofit2.http.Query("issn") String issn, @retrofit2.http.Query("hasDigitalIssue") CSVParams hasDigitalIssue, @retrofit2.http.Query("modifiedSince") LocalDate modifiedSince, @retrofit2.http.Query("creators") CSVParams creators, @retrofit2.http.Query("characters") CSVParams characters, @retrofit2.http.Query("events") CSVParams events, @retrofit2.http.Query("stories") CSVParams stories, @retrofit2.http.Query("sharedAppearances") CSVParams sharedAppearances, @retrofit2.http.Query("collaborators") CSVParams collaborators, @retrofit2.http.Query("orderBy") CSVParams orderBy, @retrofit2.http.Query("limit") Integer limit, @retrofit2.http.Query("offset") Integer offset
  );

  /**
   * Fetches lists of comics filtered by a story id.
   * Fetches lists of comics in which a specific story appears, with optional filters. See notes on individual parameters below.
   * @param storyId The story ID. (required)
   * @param format Filter by the issue format (e.g. comic, digital comic, hardcover). (optional)
   * @param formatType Filter by the issue format type (comic or collection). (optional)
   * @param noVariants Exclude variant comics from the result set. (optional)
   * @param dateDescriptor Return comics within a predefined date range. (optional)
   * @param dateRange Return comics within a predefined date range.  Dates must be specified as date1,date2 (e.g. 2013-01-01,2013-01-02).  Dates are preferably formatted as YYYY-MM-DD but may be sent as any common date format. (optional)
   * @param title Return only issues in series whose title matches the input. (optional)
   * @param titleStartsWith Return only issues in series whose title starts with the input. (optional)
   * @param startYear Return only issues in series whose start year matches the input. (optional)
   * @param issueNumber Return only issues in series whose issue number matches the input. (optional)
   * @param diamondCode Filter by diamond code. (optional)
   * @param digitalId Filter by digital comic id. (optional)
   * @param upc Filter by UPC. (optional)
   * @param isbn Filter by ISBN. (optional)
   * @param ean Filter by EAN. (optional)
   * @param issn Filter by ISSN. (optional)
   * @param hasDigitalIssue Include only results which are available digitally. (optional)
   * @param modifiedSince Return only comics which have been modified since the specified date. (optional)
   * @param creators Return only comics which feature work by the specified creators (accepts a comma-separated list of ids). (optional)
   * @param characters Return only comics which feature the specified characters (accepts a comma-separated list of ids). (optional)
   * @param series Return only comics which are part of the specified series (accepts a comma-separated list of ids). (optional)
   * @param events Return only comics which take place in the specified events (accepts a comma-separated list of ids). (optional)
   * @param sharedAppearances Return only comics in which the specified characters appear together (for example in which BOTH Spider-Man and Wolverine appear). (optional)
   * @param collaborators Return only comics in which the specified creators worked together (for example in which BOTH Stan Lee and Jack Kirby did work). (optional)
   * @param orderBy Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed. (optional)
   * @param limit Limit the result set to the specified number of resources. (optional)
   * @param offset Skip the specified number of resources in the result set. (optional)
   * @return Call&lt;ComicDataWrapper&gt;
   */
  @GET("v1/public/stories/{storyId}/comics")
  Observable<ComicDataWrapper> getComicsCollection_3(
    @retrofit2.http.Path("storyId") Integer storyId, @retrofit2.http.Query("format") String format, @retrofit2.http.Query("formatType") String formatType, @retrofit2.http.Query("noVariants") CSVParams noVariants, @retrofit2.http.Query("dateDescriptor") CSVParams dateDescriptor, @retrofit2.http.Query("dateRange") CSVParams dateRange, @retrofit2.http.Query("title") String title, @retrofit2.http.Query("titleStartsWith") String titleStartsWith, @retrofit2.http.Query("startYear") Integer startYear, @retrofit2.http.Query("issueNumber") Integer issueNumber, @retrofit2.http.Query("diamondCode") String diamondCode, @retrofit2.http.Query("digitalId") Integer digitalId, @retrofit2.http.Query("upc") String upc, @retrofit2.http.Query("isbn") String isbn, @retrofit2.http.Query("ean") String ean, @retrofit2.http.Query("issn") String issn, @retrofit2.http.Query("hasDigitalIssue") CSVParams hasDigitalIssue, @retrofit2.http.Query("modifiedSince") LocalDate modifiedSince, @retrofit2.http.Query("creators") CSVParams creators, @retrofit2.http.Query("characters") CSVParams characters, @retrofit2.http.Query("series") CSVParams series, @retrofit2.http.Query("events") CSVParams events, @retrofit2.http.Query("sharedAppearances") CSVParams sharedAppearances, @retrofit2.http.Query("collaborators") CSVParams collaborators, @retrofit2.http.Query("orderBy") CSVParams orderBy, @retrofit2.http.Query("limit") Integer limit, @retrofit2.http.Query("offset") Integer offset
  );

  /**
   * Fetches lists of characters.
   * Fetches lists of comic characters with optional filters. See notes on individual parameters below.
   * @param name Return only characters matching the specified full character name (e.g. Spider-Man). (optional)
   * @param nameStartsWith Return characters with names that begin with the specified string (e.g. Sp). (optional)
   * @param modifiedSince Return only characters which have been modified since the specified date. (optional)
   * @param comics Return only characters which appear in the specified comics (accepts a comma-separated list of ids). (optional)
   * @param series Return only characters which appear the specified series (accepts a comma-separated list of ids). (optional)
   * @param events Return only characters which appear in the specified events (accepts a comma-separated list of ids). (optional)
   * @param stories Return only characters which appear the specified stories (accepts a comma-separated list of ids). (optional)
   * @param orderBy Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed. (optional)
   * @param limit Limit the result set to the specified number of resources. (optional)
   * @param offset Skip the specified number of resources in the result set. (optional)
   * @return Call&lt;CharacterDataWrapper&gt;
   */
  @GET("v1/public/characters")
  Observable<CharacterDataWrapper> getCreatorCollection(
    @retrofit2.http.Query("name") String name, @retrofit2.http.Query("nameStartsWith") String nameStartsWith, @retrofit2.http.Query("modifiedSince") LocalDate modifiedSince, @retrofit2.http.Query("comics") CSVParams comics, @retrofit2.http.Query("series") CSVParams series, @retrofit2.http.Query("events") CSVParams events, @retrofit2.http.Query("stories") CSVParams stories, @retrofit2.http.Query("orderBy") CSVParams orderBy, @retrofit2.http.Query("limit") Integer limit, @retrofit2.http.Query("offset") Integer offset
  );

  /**
   * Fetches lists of creators filtered by a comic id.
   * Fetches lists of comic creators whose work appears in a specific comic, with optional filters. See notes on individual parameters below.
   * @param comicId The comic id. (required)
   * @param firstName Filter by creator first name (e.g. brian). (optional)
   * @param middleName Filter by creator middle name (e.g. Michael). (optional)
   * @param lastName Filter by creator last name (e.g. Bendis). (optional)
   * @param suffix Filter by suffix or honorific (e.g. Jr., Sr.). (optional)
   * @param nameStartsWith Filter by creator names that match critera (e.g. B, St L). (optional)
   * @param firstNameStartsWith Filter by creator first names that match critera (e.g. B, St L). (optional)
   * @param middleNameStartsWith Filter by creator middle names that match critera (e.g. Mi). (optional)
   * @param lastNameStartsWith Filter by creator last names that match critera (e.g. Ben). (optional)
   * @param modifiedSince Return only creators which have been modified since the specified date. (optional)
   * @param comics Return only creators who worked on in the specified comics (accepts a comma-separated list of ids). (optional)
   * @param series Return only creators who worked on the specified series (accepts a comma-separated list of ids). (optional)
   * @param stories Return only creators who worked on the specified stories (accepts a comma-separated list of ids). (optional)
   * @param orderBy Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed. (optional)
   * @param limit Limit the result set to the specified number of resources. (optional)
   * @param offset Skip the specified number of resources in the result set. (optional)
   * @return Call&lt;CreatorDataWrapper&gt;
   */
  @GET("v1/public/comics/{comicId}/creators")
  Observable<CreatorDataWrapper> getCreatorCollection_0(
    @retrofit2.http.Path("comicId") Integer comicId, @retrofit2.http.Query("firstName") String firstName, @retrofit2.http.Query("middleName") String middleName, @retrofit2.http.Query("lastName") String lastName, @retrofit2.http.Query("suffix") String suffix, @retrofit2.http.Query("nameStartsWith") String nameStartsWith, @retrofit2.http.Query("firstNameStartsWith") String firstNameStartsWith, @retrofit2.http.Query("middleNameStartsWith") String middleNameStartsWith, @retrofit2.http.Query("lastNameStartsWith") String lastNameStartsWith, @retrofit2.http.Query("modifiedSince") LocalDate modifiedSince, @retrofit2.http.Query("comics") CSVParams comics, @retrofit2.http.Query("series") CSVParams series, @retrofit2.http.Query("stories") CSVParams stories, @retrofit2.http.Query("orderBy") CSVParams orderBy, @retrofit2.http.Query("limit") Integer limit, @retrofit2.http.Query("offset") Integer offset
  );

  /**
   * Fetches lists of creators.
   * Fetches lists of comic creators with optional filters. See notes on individual parameters below.
   * @param firstName Filter by creator first name (e.g. Brian). (optional)
   * @param middleName Filter by creator middle name (e.g. Michael). (optional)
   * @param lastName Filter by creator last name (e.g. Bendis). (optional)
   * @param suffix Filter by suffix or honorific (e.g. Jr., Sr.). (optional)
   * @param nameStartsWith Filter by creator names that match critera (e.g. B, St L). (optional)
   * @param firstNameStartsWith Filter by creator first names that match critera (e.g. B, St L). (optional)
   * @param middleNameStartsWith Filter by creator middle names that match critera (e.g. Mi). (optional)
   * @param lastNameStartsWith Filter by creator last names that match critera (e.g. Ben). (optional)
   * @param modifiedSince Return only creators which have been modified since the specified date. (optional)
   * @param comics Return only creators who worked on in the specified comics (accepts a comma-separated list of ids). (optional)
   * @param series Return only creators who worked on the specified series (accepts a comma-separated list of ids). (optional)
   * @param events Return only creators who worked on comics that took place in the specified events (accepts a comma-separated list of ids). (optional)
   * @param stories Return only creators who worked on the specified stories (accepts a comma-separated list of ids). (optional)
   * @param orderBy Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed. (optional)
   * @param limit Limit the result set to the specified number of resources. (optional)
   * @param offset Skip the specified number of resources in the result set. (optional)
   * @return Call&lt;CreatorDataWrapper&gt;
   */
  @GET("v1/public/creators")
  Observable<CreatorDataWrapper> getCreatorCollection_1(
    @retrofit2.http.Query("firstName") String firstName, @retrofit2.http.Query("middleName") String middleName, @retrofit2.http.Query("lastName") String lastName, @retrofit2.http.Query("suffix") String suffix, @retrofit2.http.Query("nameStartsWith") String nameStartsWith, @retrofit2.http.Query("firstNameStartsWith") String firstNameStartsWith, @retrofit2.http.Query("middleNameStartsWith") String middleNameStartsWith, @retrofit2.http.Query("lastNameStartsWith") String lastNameStartsWith, @retrofit2.http.Query("modifiedSince") LocalDate modifiedSince, @retrofit2.http.Query("comics") CSVParams comics, @retrofit2.http.Query("series") CSVParams series, @retrofit2.http.Query("events") CSVParams events, @retrofit2.http.Query("stories") CSVParams stories, @retrofit2.http.Query("orderBy") CSVParams orderBy, @retrofit2.http.Query("limit") Integer limit, @retrofit2.http.Query("offset") Integer offset
  );

  /**
   * Fetches lists of creators filtered by an event id.
   * Fetches lists of comic creators whose work appears in a specific event, with optional filters. See notes on individual parameters below.
   * @param eventId The event ID. (required)
   * @param firstName Filter by creator first name (e.g. brian). (optional)
   * @param middleName Filter by creator middle name (e.g. Michael). (optional)
   * @param lastName Filter by creator last name (e.g. Bendis). (optional)
   * @param suffix Filter by suffix or honorific (e.g. Jr., Sr.). (optional)
   * @param nameStartsWith Filter by creator names that match critera (e.g. B, St L). (optional)
   * @param firstNameStartsWith Filter by creator first names that match critera (e.g. B, St L). (optional)
   * @param middleNameStartsWith Filter by creator middle names that match critera (e.g. Mi). (optional)
   * @param lastNameStartsWith Filter by creator last names that match critera (e.g. Ben). (optional)
   * @param modifiedSince Return only creators which have been modified since the specified date. (optional)
   * @param comics Return only creators who worked on in the specified comics (accepts a comma-separated list of ids). (optional)
   * @param series Return only creators who worked on the specified series (accepts a comma-separated list of ids). (optional)
   * @param stories Return only creators who worked on the specified stories (accepts a comma-separated list of ids). (optional)
   * @param orderBy Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed. (optional)
   * @param limit Limit the result set to the specified number of resources. (optional)
   * @param offset Skip the specified number of resources in the result set. (optional)
   * @return Call&lt;CreatorDataWrapper&gt;
   */
  @GET("v1/public/events/{eventId}/creators")
  Observable<CreatorDataWrapper> getCreatorCollection_2(
    @retrofit2.http.Path("eventId") Integer eventId, @retrofit2.http.Query("firstName") String firstName, @retrofit2.http.Query("middleName") String middleName, @retrofit2.http.Query("lastName") String lastName, @retrofit2.http.Query("suffix") String suffix, @retrofit2.http.Query("nameStartsWith") String nameStartsWith, @retrofit2.http.Query("firstNameStartsWith") String firstNameStartsWith, @retrofit2.http.Query("middleNameStartsWith") String middleNameStartsWith, @retrofit2.http.Query("lastNameStartsWith") String lastNameStartsWith, @retrofit2.http.Query("modifiedSince") LocalDate modifiedSince, @retrofit2.http.Query("comics") CSVParams comics, @retrofit2.http.Query("series") CSVParams series, @retrofit2.http.Query("stories") CSVParams stories, @retrofit2.http.Query("orderBy") CSVParams orderBy, @retrofit2.http.Query("limit") Integer limit, @retrofit2.http.Query("offset") Integer offset
  );

  /**
   * Fetches lists of creators filtered by a series id.
   * Fetches lists of comic creators whose work appears in a specific series, with optional filters. See notes on individual parameters below.
   * @param seriesId The series ID. (required)
   * @param firstName Filter by creator first name (e.g. brian). (optional)
   * @param middleName Filter by creator middle name (e.g. Michael). (optional)
   * @param lastName Filter by creator last name (e.g. Bendis). (optional)
   * @param suffix Filter by suffix or honorific (e.g. Jr., Sr.). (optional)
   * @param nameStartsWith Filter by creator names that match critera (e.g. B, St L). (optional)
   * @param firstNameStartsWith Filter by creator first names that match critera (e.g. B, St L). (optional)
   * @param middleNameStartsWith Filter by creator middle names that match critera (e.g. Mi). (optional)
   * @param lastNameStartsWith Filter by creator last names that match critera (e.g. Ben). (optional)
   * @param modifiedSince Return only creators which have been modified since the specified date. (optional)
   * @param comics Return only creators who worked on in the specified comics (accepts a comma-separated list of ids). (optional)
   * @param events Return only creators who worked on comics that took place in the specified events (accepts a comma-separated list of ids). (optional)
   * @param stories Return only creators who worked on the specified stories (accepts a comma-separated list of ids). (optional)
   * @param orderBy Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed. (optional)
   * @param limit Limit the result set to the specified number of resources. (optional)
   * @param offset Skip the specified number of resources in the result set. (optional)
   * @return Call&lt;CreatorDataWrapper&gt;
   */
  @GET("v1/public/series/{seriesId}/creators")
  Observable<CreatorDataWrapper> getCreatorCollection_3(
    @retrofit2.http.Path("seriesId") Integer seriesId, @retrofit2.http.Query("firstName") String firstName, @retrofit2.http.Query("middleName") String middleName, @retrofit2.http.Query("lastName") String lastName, @retrofit2.http.Query("suffix") String suffix, @retrofit2.http.Query("nameStartsWith") String nameStartsWith, @retrofit2.http.Query("firstNameStartsWith") String firstNameStartsWith, @retrofit2.http.Query("middleNameStartsWith") String middleNameStartsWith, @retrofit2.http.Query("lastNameStartsWith") String lastNameStartsWith, @retrofit2.http.Query("modifiedSince") LocalDate modifiedSince, @retrofit2.http.Query("comics") CSVParams comics, @retrofit2.http.Query("events") CSVParams events, @retrofit2.http.Query("stories") CSVParams stories, @retrofit2.http.Query("orderBy") CSVParams orderBy, @retrofit2.http.Query("limit") Integer limit, @retrofit2.http.Query("offset") Integer offset
  );

  /**
   * Fetches lists of characters filtered by a story id.
   * Fetches lists of comic characters appearing in a single story, with optional filters. See notes on individual parameters below.
   * @param storyId The story ID. (required)
   * @param name Return only characters matching the specified full character name (e.g. Spider-Man). (optional)
   * @param nameStartsWith Return characters with names that begin with the specified string (e.g. Sp). (optional)
   * @param modifiedSince Return only characters which have been modified since the specified date. (optional)
   * @param comics Return only characters which appear in the specified comics (accepts a comma-separated list of ids). (optional)
   * @param series Return only characters which appear the specified series (accepts a comma-separated list of ids). (optional)
   * @param events Return only characters which appear comics that took place in the specified events (accepts a comma-separated list of ids). (optional)
   * @param orderBy Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed. (optional)
   * @param limit Limit the result set to the specified number of resources. (optional)
   * @param offset Skip the specified number of resources in the result set. (optional)
   * @return Call&lt;CharacterDataWrapper&gt;
   */
  @GET("v1/public/stories/{storyId}/characters")
  Observable<CharacterDataWrapper> getCreatorCollection_4(
    @retrofit2.http.Path("storyId") Integer storyId, @retrofit2.http.Query("name") String name, @retrofit2.http.Query("nameStartsWith") String nameStartsWith, @retrofit2.http.Query("modifiedSince") LocalDate modifiedSince, @retrofit2.http.Query("comics") CSVParams comics, @retrofit2.http.Query("series") CSVParams series, @retrofit2.http.Query("events") CSVParams events, @retrofit2.http.Query("orderBy") CSVParams orderBy, @retrofit2.http.Query("limit") Integer limit, @retrofit2.http.Query("offset") Integer offset
  );

  /**
   * Fetches lists of creators filtered by a story id.
   * Fetches lists of comic creators whose work appears in a specific story, with optional filters. See notes on individual parameters below.
   * @param storyId The story ID. (required)
   * @param firstName Filter by creator first name (e.g. brian). (optional)
   * @param middleName Filter by creator middle name (e.g. Michael). (optional)
   * @param lastName Filter by creator last name (e.g. Bendis). (optional)
   * @param suffix Filter by suffix or honorific (e.g. Jr., Sr.). (optional)
   * @param nameStartsWith Filter by creator names that match critera (e.g. B, St L). (optional)
   * @param firstNameStartsWith Filter by creator first names that match critera (e.g. B, St L). (optional)
   * @param middleNameStartsWith Filter by creator middle names that match critera (e.g. Mi). (optional)
   * @param lastNameStartsWith Filter by creator last names that match critera (e.g. Ben). (optional)
   * @param modifiedSince Return only creators which have been modified since the specified date. (optional)
   * @param comics Return only creators who worked on in the specified comics (accepts a comma-separated list of ids). (optional)
   * @param series Return only creators who worked on the specified series (accepts a comma-separated list of ids). (optional)
   * @param events Return only creators who worked on comics that took place in the specified events (accepts a comma-separated list of ids). (optional)
   * @param orderBy Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed. (optional)
   * @param limit Limit the result set to the specified number of resources. (optional)
   * @param offset Skip the specified number of resources in the result set. (optional)
   * @return Call&lt;CreatorDataWrapper&gt;
   */
  @GET("v1/public/stories/{storyId}/creators")
  Observable<CreatorDataWrapper> getCreatorCollection_5(
    @retrofit2.http.Path("storyId") Integer storyId, @retrofit2.http.Query("firstName") String firstName, @retrofit2.http.Query("middleName") String middleName, @retrofit2.http.Query("lastName") String lastName, @retrofit2.http.Query("suffix") String suffix, @retrofit2.http.Query("nameStartsWith") String nameStartsWith, @retrofit2.http.Query("firstNameStartsWith") String firstNameStartsWith, @retrofit2.http.Query("middleNameStartsWith") String middleNameStartsWith, @retrofit2.http.Query("lastNameStartsWith") String lastNameStartsWith, @retrofit2.http.Query("modifiedSince") LocalDate modifiedSince, @retrofit2.http.Query("comics") CSVParams comics, @retrofit2.http.Query("series") CSVParams series, @retrofit2.http.Query("events") CSVParams events, @retrofit2.http.Query("orderBy") CSVParams orderBy, @retrofit2.http.Query("limit") Integer limit, @retrofit2.http.Query("offset") Integer offset
  );

  /**
   * Fetches lists of events filtered by a creator id.
   * Fetches lists of events featuring the work of a specific creator with optional filters. See notes on individual parameters below.
   * @param creatorId The creator ID. (required)
   * @param name Filter the event list by name. (optional)
   * @param nameStartsWith Return events with names that begin with the specified string (e.g. Sp). (optional)
   * @param modifiedSince Return only events which have been modified since the specified date. (optional)
   * @param characters Return only events which feature the specified characters (accepts a comma-separated list of ids). (optional)
   * @param series Return only events which are part of the specified series (accepts a comma-separated list of ids). (optional)
   * @param comics Return only events which take place in the specified comics (accepts a comma-separated list of ids). (optional)
   * @param stories Return only events which contain the specified stories (accepts a comma-separated list of ids). (optional)
   * @param orderBy Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed. (optional)
   * @param limit Limit the result set to the specified number of resources. (optional)
   * @param offset Skip the specified number of resources in the result set. (optional)
   * @return Call&lt;EventDataWrapper&gt;
   */
  @GET("v1/public/creators/{creatorId}/events")
  Observable<EventDataWrapper> getCreatorEventsCollection(
    @retrofit2.http.Path("creatorId") Integer creatorId, @retrofit2.http.Query("name") String name, @retrofit2.http.Query("nameStartsWith") String nameStartsWith, @retrofit2.http.Query("modifiedSince") LocalDate modifiedSince, @retrofit2.http.Query("characters") CSVParams characters, @retrofit2.http.Query("series") CSVParams series, @retrofit2.http.Query("comics") CSVParams comics, @retrofit2.http.Query("stories") CSVParams stories, @retrofit2.http.Query("orderBy") CSVParams orderBy, @retrofit2.http.Query("limit") Integer limit, @retrofit2.http.Query("offset") Integer offset
  );

  /**
   * Fetches a single creator by id.
   * This method fetches a single creator resource.  It is the canonical URI for any creator resource provided by the API.
   * @param creatorId A single creator id. (required)
   * @return Call&lt;CreatorDataWrapper&gt;
   */
  @GET("v1/public/creators/{creatorId}")
  Observable<CreatorDataWrapper> getCreatorIndividual(
    @retrofit2.http.Path("creatorId") Integer creatorId
  );

  /**
   * Fetches lists of series filtered by a creator id.
   * Fetches lists of comic series in which a specific creator&#39;s work appears, with optional filters. See notes on individual parameters below.
   * @param creatorId The creator ID. (required)
   * @param title Filter by series title. (optional)
   * @param titleStartsWith Return series with titles that begin with the specified string (e.g. Sp). (optional)
   * @param startYear Return only series matching the specified start year. (optional)
   * @param modifiedSince Return only series which have been modified since the specified date. (optional)
   * @param comics Return only series which contain the specified comics (accepts a comma-separated list of ids). (optional)
   * @param stories Return only series which contain the specified stories (accepts a comma-separated list of ids). (optional)
   * @param events Return only series which have comics that take place during the specified events (accepts a comma-separated list of ids). (optional)
   * @param characters Return only series which feature the specified characters (accepts a comma-separated list of ids). (optional)
   * @param seriesType Filter the series by publication frequency type. (optional)
   * @param contains Return only series containing one or more comics with the specified format. (optional)
   * @param orderBy Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed. (optional)
   * @param limit Limit the result set to the specified number of resources. (optional)
   * @param offset Skip the specified number of resources in the result set. (optional)
   * @return Call&lt;SeriesDataWrapper&gt;
   */
  @GET("v1/public/creators/{creatorId}/series")
  Observable<SeriesDataWrapper> getCreatorSeriesCollection(
    @retrofit2.http.Path("creatorId") Integer creatorId, @retrofit2.http.Query("title") String title, @retrofit2.http.Query("titleStartsWith") String titleStartsWith, @retrofit2.http.Query("startYear") Integer startYear, @retrofit2.http.Query("modifiedSince") LocalDate modifiedSince, @retrofit2.http.Query("comics") CSVParams comics, @retrofit2.http.Query("stories") CSVParams stories, @retrofit2.http.Query("events") CSVParams events, @retrofit2.http.Query("characters") CSVParams characters, @retrofit2.http.Query("seriesType") String seriesType, @retrofit2.http.Query("contains") CSVParams contains, @retrofit2.http.Query("orderBy") CSVParams orderBy, @retrofit2.http.Query("limit") Integer limit, @retrofit2.http.Query("offset") Integer offset
  );

  /**
   * Fetches lists of stories filtered by a creator id.
   * Fetches lists of comic stories by a specific creator with optional filters. See notes on individual parameters below.
   * @param creatorId The ID of the creator. (required)
   * @param modifiedSince Return only stories which have been modified since the specified date. (optional)
   * @param comics Return only stories contained in the specified comics (accepts a comma-separated list of ids). (optional)
   * @param series Return only stories contained the specified series (accepts a comma-separated list of ids). (optional)
   * @param events Return only stories which take place during the specified events (accepts a comma-separated list of ids). (optional)
   * @param characters Return only stories which feature the specified characters (accepts a comma-separated list of ids). (optional)
   * @param orderBy Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed. (optional)
   * @param limit Limit the result set to the specified number of resources. (optional)
   * @param offset Skip the specified number of resources in the result set. (optional)
   * @return Call&lt;StoryDataWrapper&gt;
   */
  @GET("v1/public/creators/{creatorId}/stories")
  Observable<StoryDataWrapper> getCreatorStoryCollection(
    @retrofit2.http.Path("creatorId") Integer creatorId, @retrofit2.http.Query("modifiedSince") LocalDate modifiedSince, @retrofit2.http.Query("comics") CSVParams comics, @retrofit2.http.Query("series") CSVParams series, @retrofit2.http.Query("events") CSVParams events, @retrofit2.http.Query("characters") CSVParams characters, @retrofit2.http.Query("orderBy") CSVParams orderBy, @retrofit2.http.Query("limit") Integer limit, @retrofit2.http.Query("offset") Integer offset
  );

  /**
   * Fetches lists of characters filtered by an event id.
   * Fetches lists of characters which appear in a specific event, with optional filters. See notes on individual parameters below.
   * @param eventId The event ID (required)
   * @param name Return only characters matching the specified full character name (e.g. Spider-Man). (optional)
   * @param nameStartsWith Return characters with names that begin with the specified string (e.g. Sp). (optional)
   * @param modifiedSince Return only characters which have been modified since the specified date. (optional)
   * @param comics Return only characters which appear in the specified comics (accepts a comma-separated list of ids). (optional)
   * @param series Return only characters which appear the specified series (accepts a comma-separated list of ids). (optional)
   * @param stories Return only characters which appear the specified stories (accepts a comma-separated list of ids). (optional)
   * @param orderBy Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed. (optional)
   * @param limit Limit the result set to the specified number of resources. (optional)
   * @param offset Skip the specified number of resources in the result set. (optional)
   * @return Call&lt;CharacterDataWrapper&gt;
   */
  @GET("v1/public/events/{eventId}/characters")
  Observable<CharacterDataWrapper> getEventCharacterCollection(
    @retrofit2.http.Path("eventId") Integer eventId, @retrofit2.http.Query("name") String name, @retrofit2.http.Query("nameStartsWith") String nameStartsWith, @retrofit2.http.Query("modifiedSince") LocalDate modifiedSince, @retrofit2.http.Query("comics") CSVParams comics, @retrofit2.http.Query("series") CSVParams series, @retrofit2.http.Query("stories") CSVParams stories, @retrofit2.http.Query("orderBy") CSVParams orderBy, @retrofit2.http.Query("limit") Integer limit, @retrofit2.http.Query("offset") Integer offset
  );

  /**
   * Fetches a single event by id.
   * This method fetches a single event resource.  It is the canonical URI for any event resource provided by the API.
   * @param eventId A single event. (required)
   * @return Call&lt;EventDataWrapper&gt;
   */
  @GET("v1/public/events/{eventId}")
  Observable<EventDataWrapper> getEventIndividual(
    @retrofit2.http.Path("eventId") Integer eventId
  );

  /**
   * Fetches lists of series filtered by an event id.
   * Fetches lists of comic series in which a specific event takes place, with optional filters. See notes on individual parameters below.
   * @param eventId The event ID. (required)
   * @param title Filter by series title. (optional)
   * @param titleStartsWith Return series with titles that begin with the specified string (e.g. Sp). (optional)
   * @param startYear Return only series matching the specified start year. (optional)
   * @param modifiedSince Return only series which have been modified since the specified date. (optional)
   * @param comics Return only series which contain the specified comics (accepts a comma-separated list of ids). (optional)
   * @param stories Return only series which contain the specified stories (accepts a comma-separated list of ids). (optional)
   * @param creators Return only series which feature work by the specified creators (accepts a comma-separated list of ids). (optional)
   * @param characters Return only series which feature the specified characters (accepts a comma-separated list of ids). (optional)
   * @param seriesType Filter the series by publication frequency type. (optional)
   * @param contains Return only series containing one or more comics with the specified format. (optional)
   * @param orderBy Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed. (optional)
   * @param limit Limit the result set to the specified number of resources. (optional)
   * @param offset Skip the specified number of resources in the result set. (optional)
   * @return Call&lt;SeriesDataWrapper&gt;
   */
  @GET("v1/public/events/{eventId}/series")
  Observable<SeriesDataWrapper> getEventSeriesCollection(
    @retrofit2.http.Path("eventId") Integer eventId, @retrofit2.http.Query("title") String title, @retrofit2.http.Query("titleStartsWith") String titleStartsWith, @retrofit2.http.Query("startYear") Integer startYear, @retrofit2.http.Query("modifiedSince") LocalDate modifiedSince, @retrofit2.http.Query("comics") CSVParams comics, @retrofit2.http.Query("stories") CSVParams stories, @retrofit2.http.Query("creators") CSVParams creators, @retrofit2.http.Query("characters") CSVParams characters, @retrofit2.http.Query("seriesType") String seriesType, @retrofit2.http.Query("contains") CSVParams contains, @retrofit2.http.Query("orderBy") CSVParams orderBy, @retrofit2.http.Query("limit") Integer limit, @retrofit2.http.Query("offset") Integer offset
  );

  /**
   * Fetches lists of stories filtered by an event id.
   * Fetches lists of comic stories from a specific event, with optional filters. See notes on individual parameters below.
   * @param eventId The ID of the event. (required)
   * @param modifiedSince Return only stories which have been modified since the specified date. (optional)
   * @param comics Return only stories contained in the specified (accepts a comma-separated list of ids). (optional)
   * @param series Return only stories contained the specified series (accepts a comma-separated list of ids). (optional)
   * @param creators Return only stories which feature work by the specified creators (accepts a comma-separated list of ids). (optional)
   * @param characters Return only stories which feature the specified characters (accepts a comma-separated list of ids). (optional)
   * @param orderBy Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed. (optional)
   * @param limit Limit the result set to the specified number of resources. (optional)
   * @param offset Skip the specified number of resources in the result set. (optional)
   * @return Call&lt;StoryDataWrapper&gt;
   */
  @GET("v1/public/events/{eventId}/stories")
  Observable<StoryDataWrapper> getEventStoryCollection(
    @retrofit2.http.Path("eventId") Integer eventId, @retrofit2.http.Query("modifiedSince") LocalDate modifiedSince, @retrofit2.http.Query("comics") CSVParams comics, @retrofit2.http.Query("series") CSVParams series, @retrofit2.http.Query("creators") CSVParams creators, @retrofit2.http.Query("characters") CSVParams characters, @retrofit2.http.Query("orderBy") CSVParams orderBy, @retrofit2.http.Query("limit") Integer limit, @retrofit2.http.Query("offset") Integer offset
  );

  /**
   * Fetches lists of events.
   * Fetches lists of events with optional filters. See notes on individual parameters below.
   * @param name Return only events which match the specified name. (optional)
   * @param nameStartsWith Return events with names that begin with the specified string (e.g. Sp). (optional)
   * @param modifiedSince Return only events which have been modified since the specified date. (optional)
   * @param creators Return only events which feature work by the specified creators (accepts a comma-separated list of ids). (optional)
   * @param characters Return only events which feature the specified characters (accepts a comma-separated list of ids). (optional)
   * @param series Return only events which are part of the specified series (accepts a comma-separated list of ids). (optional)
   * @param comics Return only events which take place in the specified comics (accepts a comma-separated list of ids). (optional)
   * @param stories Return only events which take place in the specified stories (accepts a comma-separated list of ids). (optional)
   * @param orderBy Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed. (optional)
   * @param limit Limit the result set to the specified number of resources. (optional)
   * @param offset Skip the specified number of resources in the result set. (optional)
   * @return Call&lt;EventDataWrapper&gt;
   */
  @GET("v1/public/events")
  Observable<EventDataWrapper> getEventsCollection(
    @retrofit2.http.Query("name") String name, @retrofit2.http.Query("nameStartsWith") String nameStartsWith, @retrofit2.http.Query("modifiedSince") LocalDate modifiedSince, @retrofit2.http.Query("creators") CSVParams creators, @retrofit2.http.Query("characters") CSVParams characters, @retrofit2.http.Query("series") CSVParams series, @retrofit2.http.Query("comics") CSVParams comics, @retrofit2.http.Query("stories") CSVParams stories, @retrofit2.http.Query("orderBy") CSVParams orderBy, @retrofit2.http.Query("limit") Integer limit, @retrofit2.http.Query("offset") Integer offset
  );

  /**
   * Fetches lists of events filtered by a series id.
   * Fetches lists of events which occur in a specific series, with optional filters. See notes on individual parameters below.
   * @param seriesId The series ID. (required)
   * @param name Filter the event list by name. (optional)
   * @param nameStartsWith Return events with names that begin with the specified string (e.g. Sp). (optional)
   * @param modifiedSince Return only events which have been modified since the specified date. (optional)
   * @param creators Return only events which feature work by the specified creators (accepts a comma-separated list of ids). (optional)
   * @param characters Return only events which feature the specified characters (accepts a comma-separated list of ids). (optional)
   * @param comics Return only events which take place in the specified comics (accepts a comma-separated list of ids). (optional)
   * @param stories Return only events which contain the specified stories (accepts a comma-separated list of ids). (optional)
   * @param orderBy Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed. (optional)
   * @param limit Limit the result set to the specified number of resources. (optional)
   * @param offset Skip the specified number of resources in the result set. (optional)
   * @return Call&lt;EventDataWrapper&gt;
   */
  @GET("v1/public/series/{seriesId}/events")
  Observable<EventDataWrapper> getEventsCollection_0(
    @retrofit2.http.Path("seriesId") Integer seriesId, @retrofit2.http.Query("name") String name, @retrofit2.http.Query("nameStartsWith") String nameStartsWith, @retrofit2.http.Query("modifiedSince") LocalDate modifiedSince, @retrofit2.http.Query("creators") CSVParams creators, @retrofit2.http.Query("characters") CSVParams characters, @retrofit2.http.Query("comics") CSVParams comics, @retrofit2.http.Query("stories") CSVParams stories, @retrofit2.http.Query("orderBy") CSVParams orderBy, @retrofit2.http.Query("limit") Integer limit, @retrofit2.http.Query("offset") Integer offset
  );

  /**
   * Fetches lists of events filtered by a story id.
   * Fetches lists of events in which a specific story appears, with optional filters. See notes on individual parameters below.
   * @param storyId The story ID. (required)
   * @param name Filter the event list by name. (optional)
   * @param nameStartsWith Return events with names that begin with the specified string (e.g. Sp). (optional)
   * @param modifiedSince Return only events which have been modified since the specified date. (optional)
   * @param creators Return only events which feature work by the specified creators (accepts a comma-separated list of ids). (optional)
   * @param characters Return only events which feature the specified characters (accepts a comma-separated list of ids). (optional)
   * @param series Return only events which are part of the specified series (accepts a comma-separated list of ids). (optional)
   * @param comics Return only events which take place in the specified comics (accepts a comma-separated list of ids). (optional)
   * @param orderBy Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed. (optional)
   * @param limit Limit the result set to the specified number of resources. (optional)
   * @param offset Skip the specified number of resources in the result set. (optional)
   * @return Call&lt;EventDataWrapper&gt;
   */
  @GET("v1/public/stories/{storyId}/events")
  Observable<EventDataWrapper> getEventsCollection_1(
    @retrofit2.http.Path("storyId") Integer storyId, @retrofit2.http.Query("name") String name, @retrofit2.http.Query("nameStartsWith") String nameStartsWith, @retrofit2.http.Query("modifiedSince") LocalDate modifiedSince, @retrofit2.http.Query("creators") CSVParams creators, @retrofit2.http.Query("characters") CSVParams characters, @retrofit2.http.Query("series") CSVParams series, @retrofit2.http.Query("comics") CSVParams comics, @retrofit2.http.Query("orderBy") CSVParams orderBy, @retrofit2.http.Query("limit") Integer limit, @retrofit2.http.Query("offset") Integer offset
  );

  /**
   * Fetches lists of events filtered by a comic id.
   * Fetches lists of events in which a specific comic appears, with optional filters. See notes on individual parameters below.
   * @param comicId The comic ID. (required)
   * @param name Filter the event list by name. (optional)
   * @param nameStartsWith Return events with names that begin with the specified string (e.g. Sp). (optional)
   * @param modifiedSince Return only events which have been modified since the specified date. (optional)
   * @param creators Return only events which feature work by the specified creators (accepts a comma-separated list of ids). (optional)
   * @param characters Return only events which feature the specified characters (accepts a comma-separated list of ids). (optional)
   * @param series Return only events which are part of the specified series (accepts a comma-separated list of ids). (optional)
   * @param stories Return only events which contain the specified stories (accepts a comma-separated list of ids). (optional)
   * @param orderBy Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed. (optional)
   * @param limit Limit the result set to the specified number of resources. (optional)
   * @param offset Skip the specified number of resources in the result set. (optional)
   * @return Call&lt;EventDataWrapper&gt;
   */
  @GET("v1/public/comics/{comicId}/events")
  Observable<EventDataWrapper> getIssueEventsCollection(
    @retrofit2.http.Path("comicId") Integer comicId, @retrofit2.http.Query("name") String name, @retrofit2.http.Query("nameStartsWith") String nameStartsWith, @retrofit2.http.Query("modifiedSince") LocalDate modifiedSince, @retrofit2.http.Query("creators") CSVParams creators, @retrofit2.http.Query("characters") CSVParams characters, @retrofit2.http.Query("series") CSVParams series, @retrofit2.http.Query("stories") CSVParams stories, @retrofit2.http.Query("orderBy") CSVParams orderBy, @retrofit2.http.Query("limit") Integer limit, @retrofit2.http.Query("offset") Integer offset
  );

  /**
   * Fetches lists of characters filtered by a series id.
   * Fetches lists of characters which appear in specific series, with optional filters. See notes on individual parameters below.
   * @param seriesId The series id. (required)
   * @param name Return only characters matching the specified full character name (e.g. Spider-Man). (optional)
   * @param nameStartsWith Return characters with names that begin with the specified string (e.g. Sp). (optional)
   * @param modifiedSince Return only characters which have been modified since the specified date. (optional)
   * @param comics Return only characters which appear in the specified comics (accepts a comma-separated list of ids). (optional)
   * @param events Return only characters which appear comics that took place in the specified events (accepts a comma-separated list of ids). (optional)
   * @param stories Return only characters which appear the specified stories (accepts a comma-separated list of ids). (optional)
   * @param orderBy Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed. (optional)
   * @param limit Limit the result set to the specified number of resources. (optional)
   * @param offset Skip the specified number of resources in the result set. (optional)
   * @return Call&lt;CharacterDataWrapper&gt;
   */
  @GET("v1/public/series/{seriesId}/characters")
  Observable<CharacterDataWrapper> getSeriesCharacterWrapper(
    @retrofit2.http.Path("seriesId") Integer seriesId, @retrofit2.http.Query("name") String name, @retrofit2.http.Query("nameStartsWith") String nameStartsWith, @retrofit2.http.Query("modifiedSince") LocalDate modifiedSince, @retrofit2.http.Query("comics") CSVParams comics, @retrofit2.http.Query("events") CSVParams events, @retrofit2.http.Query("stories") CSVParams stories, @retrofit2.http.Query("orderBy") CSVParams orderBy, @retrofit2.http.Query("limit") Integer limit, @retrofit2.http.Query("offset") Integer offset
  );

  /**
   * Fetches lists of series.
   * Fetches lists of comic series with optional filters. See notes on individual parameters below.
   * @param title Return only series matching the specified title. (optional)
   * @param titleStartsWith Return series with titles that begin with the specified string (e.g. Sp). (optional)
   * @param startYear Return only series matching the specified start year. (optional)
   * @param modifiedSince Return only series which have been modified since the specified date. (optional)
   * @param comics Return only series which contain the specified comics (accepts a comma-separated list of ids). (optional)
   * @param stories Return only series which contain the specified stories (accepts a comma-separated list of ids). (optional)
   * @param events Return only series which have comics that take place during the specified events (accepts a comma-separated list of ids). (optional)
   * @param creators Return only series which feature work by the specified creators (accepts a comma-separated list of ids). (optional)
   * @param characters Return only series which feature the specified characters (accepts a comma-separated list of ids). (optional)
   * @param seriesType Filter the series by publication frequency type. (optional)
   * @param contains Return only series containing one or more comics with the specified format. (optional)
   * @param orderBy Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed. (optional)
   * @param limit Limit the result set to the specified number of resources. (optional)
   * @param offset Skip the specified number of resources in the result set. (optional)
   * @return Call&lt;SeriesDataWrapper&gt;
   */
  @GET("v1/public/series")
  Observable<SeriesDataWrapper> getSeriesCollection(
    @retrofit2.http.Query("title") String title, @retrofit2.http.Query("titleStartsWith") String titleStartsWith, @retrofit2.http.Query("startYear") Integer startYear, @retrofit2.http.Query("modifiedSince") LocalDate modifiedSince, @retrofit2.http.Query("comics") CSVParams comics, @retrofit2.http.Query("stories") CSVParams stories, @retrofit2.http.Query("events") CSVParams events, @retrofit2.http.Query("creators") CSVParams creators, @retrofit2.http.Query("characters") CSVParams characters, @retrofit2.http.Query("seriesType") String seriesType, @retrofit2.http.Query("contains") CSVParams contains, @retrofit2.http.Query("orderBy") CSVParams orderBy, @retrofit2.http.Query("limit") Integer limit, @retrofit2.http.Query("offset") Integer offset
  );

  /**
   * Fetches a single comic series by id.
   * This method fetches a single comic series resource.  It is the canonical URI for any comic series resource provided by the API.
   * @param seriesId Filter by series title. (required)
   * @return Call&lt;SeriesDataWrapper&gt;
   */
  @GET("v1/public/series/{seriesId}")
  Observable<SeriesDataWrapper> getSeriesIndividual(
    @retrofit2.http.Path("seriesId") Integer seriesId
  );

  /**
   * Fetches lists of stories filtered by a series id.
   * Fetches lists of comic stories from a specific series with optional filters. See notes on individual parameters below.
   * @param seriesId The series ID. (required)
   * @param modifiedSince Return only stories which have been modified since the specified date. (optional)
   * @param comics Return only stories contained in the specified (accepts a comma-separated list of ids). (optional)
   * @param events Return only stories which take place during the specified events (accepts a comma-separated list of ids). (optional)
   * @param creators Return only stories which feature work by the specified creators (accepts a comma-separated list of ids). (optional)
   * @param characters Return only stories which feature the specified characters (accepts a comma-separated list of ids). (optional)
   * @param orderBy Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed. (optional)
   * @param limit Limit the result set to the specified number of resources. (optional)
   * @param offset Skip the specified number of resources in the result set. (optional)
   * @return Call&lt;StoryDataWrapper&gt;
   */
  @GET("v1/public/series/{seriesId}/stories")
  Observable<StoryDataWrapper> getSeriesStoryCollection(
    @retrofit2.http.Path("seriesId") Integer seriesId, @retrofit2.http.Query("modifiedSince") LocalDate modifiedSince, @retrofit2.http.Query("comics") CSVParams comics, @retrofit2.http.Query("events") CSVParams events, @retrofit2.http.Query("creators") CSVParams creators, @retrofit2.http.Query("characters") CSVParams characters, @retrofit2.http.Query("orderBy") CSVParams orderBy, @retrofit2.http.Query("limit") Integer limit, @retrofit2.http.Query("offset") Integer offset
  );

  /**
   * Fetches lists of stories.
   * Fetches lists of comic stories with optional filters. See notes on individual parameters below.
   * @param modifiedSince Return only stories which have been modified since the specified date. (optional)
   * @param comics Return only stories contained in the specified (accepts a comma-separated list of ids). (optional)
   * @param series Return only stories contained the specified series (accepts a comma-separated list of ids). (optional)
   * @param events Return only stories which take place during the specified events (accepts a comma-separated list of ids). (optional)
   * @param creators Return only stories which feature work by the specified creators (accepts a comma-separated list of ids). (optional)
   * @param characters Return only stories which feature the specified characters (accepts a comma-separated list of ids). (optional)
   * @param orderBy Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed. (optional)
   * @param limit Limit the result set to the specified number of resources. (optional)
   * @param offset Skip the specified number of resources in the result set. (optional)
   * @return Call&lt;StoryDataWrapper&gt;
   */
  @GET("v1/public/stories")
  Observable<StoryDataWrapper> getStoryCollection(
    @retrofit2.http.Query("modifiedSince") LocalDate modifiedSince, @retrofit2.http.Query("comics") CSVParams comics, @retrofit2.http.Query("series") CSVParams series, @retrofit2.http.Query("events") CSVParams events, @retrofit2.http.Query("creators") CSVParams creators, @retrofit2.http.Query("characters") CSVParams characters, @retrofit2.http.Query("orderBy") CSVParams orderBy, @retrofit2.http.Query("limit") Integer limit, @retrofit2.http.Query("offset") Integer offset
  );

  /**
   * Fetches a single comic story by id.
   * This method fetches a single comic story resource.  It is the canonical URI for any comic story resource provided by the API.
   * @param storyId Filter by story id. (required)
   * @return Call&lt;StoryDataWrapper&gt;
   */
  @GET("v1/public/stories/{storyId}")
  Observable<StoryDataWrapper> getStoryIndividual(
    @retrofit2.http.Path("storyId") Integer storyId
  );

  /**
   * Fetches lists of series filtered by a story id.
   * Fetches lists of comic series in which the specified story takes place. See notes on individual parameters below.
   * @param storyId The story ID. (required)
   * @param events Return only series which have comics that take place during the specified events (accepts a comma-separated list of ids). (optional)
   * @param title Filter by series title. (optional)
   * @param titleStartsWith Return series with titles that begin with the specified string (e.g. Sp). (optional)
   * @param startYear Return only series matching the specified start year. (optional)
   * @param modifiedSince Return only series which have been modified since the specified date. (optional)
   * @param comics Return only series which contain the specified comics (accepts a comma-separated list of ids). (optional)
   * @param creators Return only series which feature work by the specified creators (accepts a comma-separated list of ids). (optional)
   * @param characters Return only series which feature the specified characters (accepts a comma-separated list of ids). (optional)
   * @param seriesType Filter the series by publication frequency type. (optional)
   * @param contains Return only series containing one or more comics with the specified format. (optional)
   * @param orderBy Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed. (optional)
   * @param limit Limit the result set to the specified number of resources. (optional)
   * @param offset Skip the specified number of resources in the result set. (optional)
   * @return Call&lt;SeriesDataWrapper&gt;
   */
  @GET("v1/public/stories/{storyId}/series")
  Observable<SeriesDataWrapper> getStorySeriesCollection(
    @retrofit2.http.Path("storyId") Integer storyId, @retrofit2.http.Query("events") CSVParams events, @retrofit2.http.Query("title") String title, @retrofit2.http.Query("titleStartsWith") String titleStartsWith, @retrofit2.http.Query("startYear") Integer startYear, @retrofit2.http.Query("modifiedSince") LocalDate modifiedSince, @retrofit2.http.Query("comics") CSVParams comics, @retrofit2.http.Query("creators") CSVParams creators, @retrofit2.http.Query("characters") CSVParams characters, @retrofit2.http.Query("seriesType") String seriesType, @retrofit2.http.Query("contains") CSVParams contains, @retrofit2.http.Query("orderBy") CSVParams orderBy, @retrofit2.http.Query("limit") Integer limit, @retrofit2.http.Query("offset") Integer offset
  );

}
