# PublicApi

All URIs are relative to *http://gateway.marvel.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCharacterEventsCollection**](PublicApi.md#getCharacterEventsCollection) | **GET** v1/public/characters/{characterId}/events | Fetches lists of events filtered by a character id.
[**getCharacterIndividual**](PublicApi.md#getCharacterIndividual) | **GET** v1/public/characters/{characterId} | Fetches a single character by id.
[**getCharacterSeriesCollection**](PublicApi.md#getCharacterSeriesCollection) | **GET** v1/public/characters/{characterId}/series | Fetches lists of series filtered by a character id.
[**getCharacterStoryCollection**](PublicApi.md#getCharacterStoryCollection) | **GET** v1/public/characters/{characterId}/stories | Fetches lists of stories filtered by a character id.
[**getComicCharacterCollection**](PublicApi.md#getComicCharacterCollection) | **GET** v1/public/comics/{comicId}/characters | Fetches lists of characters filtered by a comic id.
[**getComicIndividual**](PublicApi.md#getComicIndividual) | **GET** v1/public/comics/{comicId} | Fetches a single comic by id.
[**getComicStoryCollection**](PublicApi.md#getComicStoryCollection) | **GET** v1/public/comics/{comicId}/stories | Fetches lists of stories filtered by a comic id.
[**getComicsCharacterCollection**](PublicApi.md#getComicsCharacterCollection) | **GET** v1/public/characters/{characterId}/comics | Fetches lists of comics filtered by a character id.
[**getComicsCollection**](PublicApi.md#getComicsCollection) | **GET** v1/public/comics | Fetches lists of comics.
[**getComicsCollection_0**](PublicApi.md#getComicsCollection_0) | **GET** v1/public/creators/{creatorId}/comics | Fetches lists of comics filtered by a creator id.
[**getComicsCollection_1**](PublicApi.md#getComicsCollection_1) | **GET** v1/public/events/{eventId}/comics | Fetches lists of comics filtered by an event id.
[**getComicsCollection_2**](PublicApi.md#getComicsCollection_2) | **GET** v1/public/series/{seriesId}/comics | Fetches lists of comics filtered by a series id.
[**getComicsCollection_3**](PublicApi.md#getComicsCollection_3) | **GET** v1/public/stories/{storyId}/comics | Fetches lists of comics filtered by a story id.
[**getCreatorCollection**](PublicApi.md#getCreatorCollection) | **GET** v1/public/characters | Fetches lists of characters.
[**getCreatorCollection_0**](PublicApi.md#getCreatorCollection_0) | **GET** v1/public/comics/{comicId}/creators | Fetches lists of creators filtered by a comic id.
[**getCreatorCollection_1**](PublicApi.md#getCreatorCollection_1) | **GET** v1/public/creators | Fetches lists of creators.
[**getCreatorCollection_2**](PublicApi.md#getCreatorCollection_2) | **GET** v1/public/events/{eventId}/creators | Fetches lists of creators filtered by an event id.
[**getCreatorCollection_3**](PublicApi.md#getCreatorCollection_3) | **GET** v1/public/series/{seriesId}/creators | Fetches lists of creators filtered by a series id.
[**getCreatorCollection_4**](PublicApi.md#getCreatorCollection_4) | **GET** v1/public/stories/{storyId}/characters | Fetches lists of characters filtered by a story id.
[**getCreatorCollection_5**](PublicApi.md#getCreatorCollection_5) | **GET** v1/public/stories/{storyId}/creators | Fetches lists of creators filtered by a story id.
[**getCreatorEventsCollection**](PublicApi.md#getCreatorEventsCollection) | **GET** v1/public/creators/{creatorId}/events | Fetches lists of events filtered by a creator id.
[**getCreatorIndividual**](PublicApi.md#getCreatorIndividual) | **GET** v1/public/creators/{creatorId} | Fetches a single creator by id.
[**getCreatorSeriesCollection**](PublicApi.md#getCreatorSeriesCollection) | **GET** v1/public/creators/{creatorId}/series | Fetches lists of series filtered by a creator id.
[**getCreatorStoryCollection**](PublicApi.md#getCreatorStoryCollection) | **GET** v1/public/creators/{creatorId}/stories | Fetches lists of stories filtered by a creator id.
[**getEventCharacterCollection**](PublicApi.md#getEventCharacterCollection) | **GET** v1/public/events/{eventId}/characters | Fetches lists of characters filtered by an event id.
[**getEventIndividual**](PublicApi.md#getEventIndividual) | **GET** v1/public/events/{eventId} | Fetches a single event by id.
[**getEventSeriesCollection**](PublicApi.md#getEventSeriesCollection) | **GET** v1/public/events/{eventId}/series | Fetches lists of series filtered by an event id.
[**getEventStoryCollection**](PublicApi.md#getEventStoryCollection) | **GET** v1/public/events/{eventId}/stories | Fetches lists of stories filtered by an event id.
[**getEventsCollection**](PublicApi.md#getEventsCollection) | **GET** v1/public/events | Fetches lists of events.
[**getEventsCollection_0**](PublicApi.md#getEventsCollection_0) | **GET** v1/public/series/{seriesId}/events | Fetches lists of events filtered by a series id.
[**getEventsCollection_1**](PublicApi.md#getEventsCollection_1) | **GET** v1/public/stories/{storyId}/events | Fetches lists of events filtered by a story id.
[**getIssueEventsCollection**](PublicApi.md#getIssueEventsCollection) | **GET** v1/public/comics/{comicId}/events | Fetches lists of events filtered by a comic id.
[**getSeriesCharacterWrapper**](PublicApi.md#getSeriesCharacterWrapper) | **GET** v1/public/series/{seriesId}/characters | Fetches lists of characters filtered by a series id.
[**getSeriesCollection**](PublicApi.md#getSeriesCollection) | **GET** v1/public/series | Fetches lists of series.
[**getSeriesIndividual**](PublicApi.md#getSeriesIndividual) | **GET** v1/public/series/{seriesId} | Fetches a single comic series by id.
[**getSeriesStoryCollection**](PublicApi.md#getSeriesStoryCollection) | **GET** v1/public/series/{seriesId}/stories | Fetches lists of stories filtered by a series id.
[**getStoryCollection**](PublicApi.md#getStoryCollection) | **GET** v1/public/stories | Fetches lists of stories.
[**getStoryIndividual**](PublicApi.md#getStoryIndividual) | **GET** v1/public/stories/{storyId} | Fetches a single comic story by id.
[**getStorySeriesCollection**](PublicApi.md#getStorySeriesCollection) | **GET** v1/public/stories/{storyId}/series | Fetches lists of series filtered by a story id.


<a name="getCharacterEventsCollection"></a>
# **getCharacterEventsCollection**
> EventDataWrapper getCharacterEventsCollection(characterId, name, nameStartsWith, modifiedSince, creators, series, comics, stories, orderBy, limit, offset)

Fetches lists of events filtered by a character id.

Fetches lists of events in which a specific character appears, with optional filters. See notes on individual parameters below.

### Example
```java
// Import classes:
//import com.marvel.ApiException;
//import com.marvel.api.PublicApi;


PublicApi apiInstance = new PublicApi();
Integer characterId = 56; // Integer | The character ID.
String name = "name_example"; // String | Filter the event list by name.
String nameStartsWith = "nameStartsWith_example"; // String | Return events with names that begin with the specified string (e.g. Sp).
LocalDate modifiedSince = new LocalDate(); // LocalDate | Return only events which have been modified since the specified date.
List<Integer> creators = Arrays.asList(56); // List<Integer> | Return only events which feature work by the specified creators (accepts a comma-separated list of ids).
List<Integer> series = Arrays.asList(56); // List<Integer> | Return only events which are part of the specified series (accepts a comma-separated list of ids).
List<Integer> comics = Arrays.asList(56); // List<Integer> | Return only events which take place in the specified comics (accepts a comma-separated list of ids).
List<Integer> stories = Arrays.asList(56); // List<Integer> | Return only events which contain the specified stories (accepts a comma-separated list of ids).
List<String> orderBy = Arrays.asList("orderBy_example"); // List<String> | Order the result set by a field or fields. Add a \"-\" to the value sort in descending order. Multiple values are given priority in the order in which they are passed.
Integer limit = 56; // Integer | Limit the result set to the specified number of resources.
Integer offset = 56; // Integer | Skip the specified number of resources in the result set.
try {
    EventDataWrapper result = apiInstance.getCharacterEventsCollection(characterId, name, nameStartsWith, modifiedSince, creators, series, comics, stories, orderBy, limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApi#getCharacterEventsCollection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **characterId** | **Integer**| The character ID. |
 **name** | **String**| Filter the event list by name. | [optional]
 **nameStartsWith** | **String**| Return events with names that begin with the specified string (e.g. Sp). | [optional]
 **modifiedSince** | **LocalDate**| Return only events which have been modified since the specified date. | [optional]
 **creators** | [**List&lt;Integer&gt;**](Integer.md)| Return only events which feature work by the specified creators (accepts a comma-separated list of ids). | [optional]
 **series** | [**List&lt;Integer&gt;**](Integer.md)| Return only events which are part of the specified series (accepts a comma-separated list of ids). | [optional]
 **comics** | [**List&lt;Integer&gt;**](Integer.md)| Return only events which take place in the specified comics (accepts a comma-separated list of ids). | [optional]
 **stories** | [**List&lt;Integer&gt;**](Integer.md)| Return only events which contain the specified stories (accepts a comma-separated list of ids). | [optional]
 **orderBy** | [**List&lt;String&gt;**](String.md)| Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed. | [optional]
 **limit** | **Integer**| Limit the result set to the specified number of resources. | [optional]
 **offset** | **Integer**| Skip the specified number of resources in the result set. | [optional]

### Return type

[**EventDataWrapper**](EventDataWrapper.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getCharacterIndividual"></a>
# **getCharacterIndividual**
> CharacterDataWrapper getCharacterIndividual(characterId)

Fetches a single character by id.

This method fetches a single character resource.  It is the canonical URI for any character resource provided by the API.

### Example
```java
// Import classes:
//import com.marvel.ApiException;
//import com.marvel.api.PublicApi;


PublicApi apiInstance = new PublicApi();
Integer characterId = 56; // Integer | A single character id.
try {
    CharacterDataWrapper result = apiInstance.getCharacterIndividual(characterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApi#getCharacterIndividual");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **characterId** | **Integer**| A single character id. |

### Return type

[**CharacterDataWrapper**](CharacterDataWrapper.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getCharacterSeriesCollection"></a>
# **getCharacterSeriesCollection**
> SeriesDataWrapper getCharacterSeriesCollection(characterId, title, titleStartsWith, startYear, modifiedSince, comics, stories, events, creators, seriesType, contains, orderBy, limit, offset)

Fetches lists of series filtered by a character id.

Fetches lists of comic series in which a specific character appears, with optional filters. See notes on individual parameters below.

### Example
```java
// Import classes:
//import com.marvel.ApiException;
//import com.marvel.api.PublicApi;


PublicApi apiInstance = new PublicApi();
Integer characterId = 56; // Integer | The character ID
String title = "title_example"; // String | Filter by series title.
String titleStartsWith = "titleStartsWith_example"; // String | Return series with titles that begin with the specified string (e.g. Sp).
Integer startYear = 56; // Integer | Return only series matching the specified start year.
LocalDate modifiedSince = new LocalDate(); // LocalDate | Return only series which have been modified since the specified date.
List<Integer> comics = Arrays.asList(56); // List<Integer> | Return only series which contain the specified comics (accepts a comma-separated list of ids).
List<Integer> stories = Arrays.asList(56); // List<Integer> | Return only series which contain the specified stories (accepts a comma-separated list of ids).
List<Integer> events = Arrays.asList(56); // List<Integer> | Return only series which have comics that take place during the specified events (accepts a comma-separated list of ids).
List<Integer> creators = Arrays.asList(56); // List<Integer> | Return only series which feature work by the specified creators (accepts a comma-separated list of ids).
String seriesType = "seriesType_example"; // String | Filter the series by publication frequency type.
List<String> contains = Arrays.asList("contains_example"); // List<String> | Return only series containing one or more comics with the specified format.
List<String> orderBy = Arrays.asList("orderBy_example"); // List<String> | Order the result set by a field or fields. Add a \"-\" to the value sort in descending order. Multiple values are given priority in the order in which they are passed.
Integer limit = 56; // Integer | Limit the result set to the specified number of resources.
Integer offset = 56; // Integer | Skip the specified number of resources in the result set.
try {
    SeriesDataWrapper result = apiInstance.getCharacterSeriesCollection(characterId, title, titleStartsWith, startYear, modifiedSince, comics, stories, events, creators, seriesType, contains, orderBy, limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApi#getCharacterSeriesCollection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **characterId** | **Integer**| The character ID |
 **title** | **String**| Filter by series title. | [optional]
 **titleStartsWith** | **String**| Return series with titles that begin with the specified string (e.g. Sp). | [optional]
 **startYear** | **Integer**| Return only series matching the specified start year. | [optional]
 **modifiedSince** | **LocalDate**| Return only series which have been modified since the specified date. | [optional]
 **comics** | [**List&lt;Integer&gt;**](Integer.md)| Return only series which contain the specified comics (accepts a comma-separated list of ids). | [optional]
 **stories** | [**List&lt;Integer&gt;**](Integer.md)| Return only series which contain the specified stories (accepts a comma-separated list of ids). | [optional]
 **events** | [**List&lt;Integer&gt;**](Integer.md)| Return only series which have comics that take place during the specified events (accepts a comma-separated list of ids). | [optional]
 **creators** | [**List&lt;Integer&gt;**](Integer.md)| Return only series which feature work by the specified creators (accepts a comma-separated list of ids). | [optional]
 **seriesType** | **String**| Filter the series by publication frequency type. | [optional]
 **contains** | [**List&lt;String&gt;**](String.md)| Return only series containing one or more comics with the specified format. | [optional]
 **orderBy** | [**List&lt;String&gt;**](String.md)| Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed. | [optional]
 **limit** | **Integer**| Limit the result set to the specified number of resources. | [optional]
 **offset** | **Integer**| Skip the specified number of resources in the result set. | [optional]

### Return type

[**SeriesDataWrapper**](SeriesDataWrapper.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getCharacterStoryCollection"></a>
# **getCharacterStoryCollection**
> StoryDataWrapper getCharacterStoryCollection(characterId, modifiedSince, comics, series, events, creators, orderBy, limit, offset)

Fetches lists of stories filtered by a character id.

Fetches lists of comic stories  featuring a specific character with optional filters. See notes on individual parameters below.

### Example
```java
// Import classes:
//import com.marvel.ApiException;
//import com.marvel.api.PublicApi;


PublicApi apiInstance = new PublicApi();
Integer characterId = 56; // Integer | The character ID.
LocalDate modifiedSince = new LocalDate(); // LocalDate | Return only stories which have been modified since the specified date.
List<Integer> comics = Arrays.asList(56); // List<Integer> | Return only stories contained in the specified (accepts a comma-separated list of ids).
List<Integer> series = Arrays.asList(56); // List<Integer> | Return only stories contained the specified series (accepts a comma-separated list of ids).
List<Integer> events = Arrays.asList(56); // List<Integer> | Return only stories which take place during the specified events (accepts a comma-separated list of ids).
List<Integer> creators = Arrays.asList(56); // List<Integer> | Return only stories which feature work by the specified creators (accepts a comma-separated list of ids).
List<String> orderBy = Arrays.asList("orderBy_example"); // List<String> | Order the result set by a field or fields. Add a \"-\" to the value sort in descending order. Multiple values are given priority in the order in which they are passed.
Integer limit = 56; // Integer | Limit the result set to the specified number of resources.
Integer offset = 56; // Integer | Skip the specified number of resources in the result set.
try {
    StoryDataWrapper result = apiInstance.getCharacterStoryCollection(characterId, modifiedSince, comics, series, events, creators, orderBy, limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApi#getCharacterStoryCollection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **characterId** | **Integer**| The character ID. |
 **modifiedSince** | **LocalDate**| Return only stories which have been modified since the specified date. | [optional]
 **comics** | [**List&lt;Integer&gt;**](Integer.md)| Return only stories contained in the specified (accepts a comma-separated list of ids). | [optional]
 **series** | [**List&lt;Integer&gt;**](Integer.md)| Return only stories contained the specified series (accepts a comma-separated list of ids). | [optional]
 **events** | [**List&lt;Integer&gt;**](Integer.md)| Return only stories which take place during the specified events (accepts a comma-separated list of ids). | [optional]
 **creators** | [**List&lt;Integer&gt;**](Integer.md)| Return only stories which feature work by the specified creators (accepts a comma-separated list of ids). | [optional]
 **orderBy** | [**List&lt;String&gt;**](String.md)| Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed. | [optional]
 **limit** | **Integer**| Limit the result set to the specified number of resources. | [optional]
 **offset** | **Integer**| Skip the specified number of resources in the result set. | [optional]

### Return type

[**StoryDataWrapper**](StoryDataWrapper.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getComicCharacterCollection"></a>
# **getComicCharacterCollection**
> CharacterDataWrapper getComicCharacterCollection(comicId, name, nameStartsWith, modifiedSince, series, events, stories, orderBy, limit, offset)

Fetches lists of characters filtered by a comic id.

Fetches lists of characters which appear in a specific comic with optional filters. See notes on individual parameters below.

### Example
```java
// Import classes:
//import com.marvel.ApiException;
//import com.marvel.api.PublicApi;


PublicApi apiInstance = new PublicApi();
Integer comicId = 56; // Integer | The comic id.
String name = "name_example"; // String | Return only characters matching the specified full character name (e.g. Spider-Man).
String nameStartsWith = "nameStartsWith_example"; // String | Return characters with names that begin with the specified string (e.g. Sp).
LocalDate modifiedSince = new LocalDate(); // LocalDate | Return only characters which have been modified since the specified date.
List<Integer> series = Arrays.asList(56); // List<Integer> | Return only characters which appear the specified series (accepts a comma-separated list of ids).
List<Integer> events = Arrays.asList(56); // List<Integer> | Return only characters which appear comics that took place in the specified events (accepts a comma-separated list of ids).
List<Integer> stories = Arrays.asList(56); // List<Integer> | Return only characters which appear the specified stories (accepts a comma-separated list of ids).
List<String> orderBy = Arrays.asList("orderBy_example"); // List<String> | Order the result set by a field or fields. Add a \"-\" to the value sort in descending order. Multiple values are given priority in the order in which they are passed.
Integer limit = 56; // Integer | Limit the result set to the specified number of resources.
Integer offset = 56; // Integer | Skip the specified number of resources in the result set.
try {
    CharacterDataWrapper result = apiInstance.getComicCharacterCollection(comicId, name, nameStartsWith, modifiedSince, series, events, stories, orderBy, limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApi#getComicCharacterCollection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **comicId** | **Integer**| The comic id. |
 **name** | **String**| Return only characters matching the specified full character name (e.g. Spider-Man). | [optional]
 **nameStartsWith** | **String**| Return characters with names that begin with the specified string (e.g. Sp). | [optional]
 **modifiedSince** | **LocalDate**| Return only characters which have been modified since the specified date. | [optional]
 **series** | [**List&lt;Integer&gt;**](Integer.md)| Return only characters which appear the specified series (accepts a comma-separated list of ids). | [optional]
 **events** | [**List&lt;Integer&gt;**](Integer.md)| Return only characters which appear comics that took place in the specified events (accepts a comma-separated list of ids). | [optional]
 **stories** | [**List&lt;Integer&gt;**](Integer.md)| Return only characters which appear the specified stories (accepts a comma-separated list of ids). | [optional]
 **orderBy** | [**List&lt;String&gt;**](String.md)| Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed. | [optional]
 **limit** | **Integer**| Limit the result set to the specified number of resources. | [optional]
 **offset** | **Integer**| Skip the specified number of resources in the result set. | [optional]

### Return type

[**CharacterDataWrapper**](CharacterDataWrapper.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getComicIndividual"></a>
# **getComicIndividual**
> ComicDataWrapper getComicIndividual(comicId)

Fetches a single comic by id.

This method fetches a single comic resource.  It is the canonical URI for any comic resource provided by the API.

### Example
```java
// Import classes:
//import com.marvel.ApiException;
//import com.marvel.api.PublicApi;


PublicApi apiInstance = new PublicApi();
Integer comicId = 56; // Integer | A single comic.
try {
    ComicDataWrapper result = apiInstance.getComicIndividual(comicId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApi#getComicIndividual");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **comicId** | **Integer**| A single comic. |

### Return type

[**ComicDataWrapper**](ComicDataWrapper.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getComicStoryCollection"></a>
# **getComicStoryCollection**
> StoryDataWrapper getComicStoryCollection(comicId, modifiedSince, series, events, creators, characters, orderBy, limit, offset)

Fetches lists of stories filtered by a comic id.

Fetches lists of comic stories in a specific comic issue, with optional filters. See notes on individual parameters below.

### Example
```java
// Import classes:
//import com.marvel.ApiException;
//import com.marvel.api.PublicApi;


PublicApi apiInstance = new PublicApi();
Integer comicId = 56; // Integer | The comic ID.
LocalDate modifiedSince = new LocalDate(); // LocalDate | Return only stories which have been modified since the specified date.
List<Integer> series = Arrays.asList(56); // List<Integer> | Return only stories contained the specified series (accepts a comma-separated list of ids).
List<Integer> events = Arrays.asList(56); // List<Integer> | Return only stories which take place during the specified events (accepts a comma-separated list of ids).
List<Integer> creators = Arrays.asList(56); // List<Integer> | Return only stories which feature work by the specified creators (accepts a comma-separated list of ids).
List<Integer> characters = Arrays.asList(56); // List<Integer> | Return only stories which feature the specified characters (accepts a comma-separated list of ids).
List<String> orderBy = Arrays.asList("orderBy_example"); // List<String> | Order the result set by a field or fields. Add a \"-\" to the value sort in descending order. Multiple values are given priority in the order in which they are passed.
Integer limit = 56; // Integer | Limit the result set to the specified number of resources.
Integer offset = 56; // Integer | Skip the specified number of resources.
try {
    StoryDataWrapper result = apiInstance.getComicStoryCollection(comicId, modifiedSince, series, events, creators, characters, orderBy, limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApi#getComicStoryCollection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **comicId** | **Integer**| The comic ID. |
 **modifiedSince** | **LocalDate**| Return only stories which have been modified since the specified date. | [optional]
 **series** | [**List&lt;Integer&gt;**](Integer.md)| Return only stories contained the specified series (accepts a comma-separated list of ids). | [optional]
 **events** | [**List&lt;Integer&gt;**](Integer.md)| Return only stories which take place during the specified events (accepts a comma-separated list of ids). | [optional]
 **creators** | [**List&lt;Integer&gt;**](Integer.md)| Return only stories which feature work by the specified creators (accepts a comma-separated list of ids). | [optional]
 **characters** | [**List&lt;Integer&gt;**](Integer.md)| Return only stories which feature the specified characters (accepts a comma-separated list of ids). | [optional]
 **orderBy** | [**List&lt;String&gt;**](String.md)| Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed. | [optional]
 **limit** | **Integer**| Limit the result set to the specified number of resources. | [optional]
 **offset** | **Integer**| Skip the specified number of resources. | [optional]

### Return type

[**StoryDataWrapper**](StoryDataWrapper.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getComicsCharacterCollection"></a>
# **getComicsCharacterCollection**
> ComicDataWrapper getComicsCharacterCollection(characterId, format, formatType, noVariants, dateDescriptor, dateRange, title, titleStartsWith, startYear, issueNumber, diamondCode, digitalId, upc, isbn, ean, issn, hasDigitalIssue, modifiedSince, creators, series, events, stories, sharedAppearances, collaborators, orderBy, limit, offset)

Fetches lists of comics filtered by a character id.

Fetches lists of comics containing a specific character, with optional filters. See notes on individual parameters below.

### Example
```java
// Import classes:
//import com.marvel.ApiException;
//import com.marvel.api.PublicApi;


PublicApi apiInstance = new PublicApi();
Integer characterId = 56; // Integer | The character id.
String format = "format_example"; // String | Filter by the issue format (e.g. comic, digital comic, hardcover).
String formatType = "formatType_example"; // String | Filter by the issue format type (comic or collection).
Boolean noVariants = true; // Boolean | Exclude variant comics from the result set.
String dateDescriptor = "dateDescriptor_example"; // String | Return comics within a predefined date range.
List<Integer> dateRange = Arrays.asList(56); // List<Integer> | Return comics within a predefined date range.  Dates must be specified as date1,date2 (e.g. 2013-01-01,2013-01-02).  Dates are preferably formatted as YYYY-MM-DD but may be sent as any common date format.
String title = "title_example"; // String | Return only issues in series whose title matches the input.
String titleStartsWith = "titleStartsWith_example"; // String | Return only issues in series whose title starts with the input.
Integer startYear = 56; // Integer | Return only issues in series whose start year matches the input.
Integer issueNumber = 56; // Integer | Return only issues in series whose issue number matches the input.
String diamondCode = "diamondCode_example"; // String | Filter by diamond code.
Integer digitalId = 56; // Integer | Filter by digital comic id.
String upc = "upc_example"; // String | Filter by UPC.
String isbn = "isbn_example"; // String | Filter by ISBN.
String ean = "ean_example"; // String | Filter by EAN.
String issn = "issn_example"; // String | Filter by ISSN.
Boolean hasDigitalIssue = true; // Boolean | Include only results which are available digitally.
LocalDate modifiedSince = new LocalDate(); // LocalDate | Return only comics which have been modified since the specified date.
List<Integer> creators = Arrays.asList(56); // List<Integer> | Return only comics which feature work by the specified creators (accepts a comma-separated list of ids).
List<Integer> series = Arrays.asList(56); // List<Integer> | Return only comics which are part of the specified series (accepts a comma-separated list of ids).
List<Integer> events = Arrays.asList(56); // List<Integer> | Return only comics which take place in the specified events (accepts a comma-separated list of ids).
List<Integer> stories = Arrays.asList(56); // List<Integer> | Return only comics which contain the specified stories (accepts a comma-separated list of ids).
List<Integer> sharedAppearances = Arrays.asList(56); // List<Integer> | Return only comics in which the specified characters appear together (for example in which BOTH Spider-Man and Wolverine appear).
List<Integer> collaborators = Arrays.asList(56); // List<Integer> | Return only comics in which the specified creators worked together (for example in which BOTH Stan Lee and Jack Kirby did work).
List<String> orderBy = Arrays.asList("orderBy_example"); // List<String> | Order the result set by a field or fields. Add a \"-\" to the value sort in descending order. Multiple values are given priority in the order in which they are passed.
Integer limit = 56; // Integer | Limit the result set to the specified number of resources.
Integer offset = 56; // Integer | Skip the specified number of resources in the result set.
try {
    ComicDataWrapper result = apiInstance.getComicsCharacterCollection(characterId, format, formatType, noVariants, dateDescriptor, dateRange, title, titleStartsWith, startYear, issueNumber, diamondCode, digitalId, upc, isbn, ean, issn, hasDigitalIssue, modifiedSince, creators, series, events, stories, sharedAppearances, collaborators, orderBy, limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApi#getComicsCharacterCollection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **characterId** | **Integer**| The character id. |
 **format** | **String**| Filter by the issue format (e.g. comic, digital comic, hardcover). | [optional]
 **formatType** | **String**| Filter by the issue format type (comic or collection). | [optional]
 **noVariants** | **Boolean**| Exclude variant comics from the result set. | [optional]
 **dateDescriptor** | **String**| Return comics within a predefined date range. | [optional]
 **dateRange** | [**List&lt;Integer&gt;**](Integer.md)| Return comics within a predefined date range.  Dates must be specified as date1,date2 (e.g. 2013-01-01,2013-01-02).  Dates are preferably formatted as YYYY-MM-DD but may be sent as any common date format. | [optional]
 **title** | **String**| Return only issues in series whose title matches the input. | [optional]
 **titleStartsWith** | **String**| Return only issues in series whose title starts with the input. | [optional]
 **startYear** | **Integer**| Return only issues in series whose start year matches the input. | [optional]
 **issueNumber** | **Integer**| Return only issues in series whose issue number matches the input. | [optional]
 **diamondCode** | **String**| Filter by diamond code. | [optional]
 **digitalId** | **Integer**| Filter by digital comic id. | [optional]
 **upc** | **String**| Filter by UPC. | [optional]
 **isbn** | **String**| Filter by ISBN. | [optional]
 **ean** | **String**| Filter by EAN. | [optional]
 **issn** | **String**| Filter by ISSN. | [optional]
 **hasDigitalIssue** | **Boolean**| Include only results which are available digitally. | [optional]
 **modifiedSince** | **LocalDate**| Return only comics which have been modified since the specified date. | [optional]
 **creators** | [**List&lt;Integer&gt;**](Integer.md)| Return only comics which feature work by the specified creators (accepts a comma-separated list of ids). | [optional]
 **series** | [**List&lt;Integer&gt;**](Integer.md)| Return only comics which are part of the specified series (accepts a comma-separated list of ids). | [optional]
 **events** | [**List&lt;Integer&gt;**](Integer.md)| Return only comics which take place in the specified events (accepts a comma-separated list of ids). | [optional]
 **stories** | [**List&lt;Integer&gt;**](Integer.md)| Return only comics which contain the specified stories (accepts a comma-separated list of ids). | [optional]
 **sharedAppearances** | [**List&lt;Integer&gt;**](Integer.md)| Return only comics in which the specified characters appear together (for example in which BOTH Spider-Man and Wolverine appear). | [optional]
 **collaborators** | [**List&lt;Integer&gt;**](Integer.md)| Return only comics in which the specified creators worked together (for example in which BOTH Stan Lee and Jack Kirby did work). | [optional]
 **orderBy** | [**List&lt;String&gt;**](String.md)| Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed. | [optional]
 **limit** | **Integer**| Limit the result set to the specified number of resources. | [optional]
 **offset** | **Integer**| Skip the specified number of resources in the result set. | [optional]

### Return type

[**ComicDataWrapper**](ComicDataWrapper.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getComicsCollection"></a>
# **getComicsCollection**
> ComicDataWrapper getComicsCollection(format, formatType, noVariants, dateDescriptor, dateRange, title, titleStartsWith, startYear, issueNumber, diamondCode, digitalId, upc, isbn, ean, issn, hasDigitalIssue, modifiedSince, creators, characters, series, events, stories, sharedAppearances, collaborators, orderBy, limit, offset)

Fetches lists of comics.

Fetches lists of comics with optional filters. See notes on individual parameters below.

### Example
```java
// Import classes:
//import com.marvel.ApiException;
//import com.marvel.api.PublicApi;


PublicApi apiInstance = new PublicApi();
String format = "format_example"; // String | Filter by the issue format (e.g. comic, digital comic, hardcover).
String formatType = "formatType_example"; // String | Filter by the issue format type (comic or collection).
Boolean noVariants = true; // Boolean | Exclude variants (alternate covers, secondary printings, director's cuts, etc.) from the result set.
String dateDescriptor = "dateDescriptor_example"; // String | Return comics within a predefined date range.
List<Integer> dateRange = Arrays.asList(56); // List<Integer> | Return comics within a predefined date range.  Dates must be specified as date1,date2 (e.g. 2013-01-01,2013-01-02).  Dates are preferably formatted as YYYY-MM-DD but may be sent as any common date format.
String title = "title_example"; // String | Return only issues in series whose title matches the input.
String titleStartsWith = "titleStartsWith_example"; // String | Return only issues in series whose title starts with the input.
Integer startYear = 56; // Integer | Return only issues in series whose start year matches the input.
Integer issueNumber = 56; // Integer | Return only issues in series whose issue number matches the input.
String diamondCode = "diamondCode_example"; // String | Filter by diamond code.
Integer digitalId = 56; // Integer | Filter by digital comic id.
String upc = "upc_example"; // String | Filter by UPC.
String isbn = "isbn_example"; // String | Filter by ISBN.
String ean = "ean_example"; // String | Filter by EAN.
String issn = "issn_example"; // String | Filter by ISSN.
Boolean hasDigitalIssue = true; // Boolean | Include only results which are available digitally.
LocalDate modifiedSince = new LocalDate(); // LocalDate | Return only comics which have been modified since the specified date.
List<Integer> creators = Arrays.asList(56); // List<Integer> | Return only comics which feature work by the specified creators (accepts a comma-separated list of ids).
List<Integer> characters = Arrays.asList(56); // List<Integer> | Return only comics which feature the specified characters (accepts a comma-separated list of ids).
List<Integer> series = Arrays.asList(56); // List<Integer> | Return only comics which are part of the specified series (accepts a comma-separated list of ids).
List<Integer> events = Arrays.asList(56); // List<Integer> | Return only comics which take place in the specified events (accepts a comma-separated list of ids).
List<Integer> stories = Arrays.asList(56); // List<Integer> | Return only comics which contain the specified stories (accepts a comma-separated list of ids).
List<Integer> sharedAppearances = Arrays.asList(56); // List<Integer> | Return only comics in which the specified characters appear together (for example in which BOTH Spider-Man and Wolverine appear). Accepts a comma-separated list of ids.
List<Integer> collaborators = Arrays.asList(56); // List<Integer> | Return only comics in which the specified creators worked together (for example in which BOTH Stan Lee and Jack Kirby did work). Accepts a comma-separated list of ids.
List<String> orderBy = Arrays.asList("orderBy_example"); // List<String> | Order the result set by a field or fields. Add a \"-\" to the value sort in descending order. Multiple values are given priority in the order in which they are passed.
Integer limit = 56; // Integer | Limit the result set to the specified number of resources.
Integer offset = 56; // Integer | Skip the specified number of resources in the result set.
try {
    ComicDataWrapper result = apiInstance.getComicsCollection(format, formatType, noVariants, dateDescriptor, dateRange, title, titleStartsWith, startYear, issueNumber, diamondCode, digitalId, upc, isbn, ean, issn, hasDigitalIssue, modifiedSince, creators, characters, series, events, stories, sharedAppearances, collaborators, orderBy, limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApi#getComicsCollection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **String**| Filter by the issue format (e.g. comic, digital comic, hardcover). | [optional]
 **formatType** | **String**| Filter by the issue format type (comic or collection). | [optional]
 **noVariants** | **Boolean**| Exclude variants (alternate covers, secondary printings, director&#39;s cuts, etc.) from the result set. | [optional]
 **dateDescriptor** | **String**| Return comics within a predefined date range. | [optional]
 **dateRange** | [**List&lt;Integer&gt;**](Integer.md)| Return comics within a predefined date range.  Dates must be specified as date1,date2 (e.g. 2013-01-01,2013-01-02).  Dates are preferably formatted as YYYY-MM-DD but may be sent as any common date format. | [optional]
 **title** | **String**| Return only issues in series whose title matches the input. | [optional]
 **titleStartsWith** | **String**| Return only issues in series whose title starts with the input. | [optional]
 **startYear** | **Integer**| Return only issues in series whose start year matches the input. | [optional]
 **issueNumber** | **Integer**| Return only issues in series whose issue number matches the input. | [optional]
 **diamondCode** | **String**| Filter by diamond code. | [optional]
 **digitalId** | **Integer**| Filter by digital comic id. | [optional]
 **upc** | **String**| Filter by UPC. | [optional]
 **isbn** | **String**| Filter by ISBN. | [optional]
 **ean** | **String**| Filter by EAN. | [optional]
 **issn** | **String**| Filter by ISSN. | [optional]
 **hasDigitalIssue** | **Boolean**| Include only results which are available digitally. | [optional]
 **modifiedSince** | **LocalDate**| Return only comics which have been modified since the specified date. | [optional]
 **creators** | [**List&lt;Integer&gt;**](Integer.md)| Return only comics which feature work by the specified creators (accepts a comma-separated list of ids). | [optional]
 **characters** | [**List&lt;Integer&gt;**](Integer.md)| Return only comics which feature the specified characters (accepts a comma-separated list of ids). | [optional]
 **series** | [**List&lt;Integer&gt;**](Integer.md)| Return only comics which are part of the specified series (accepts a comma-separated list of ids). | [optional]
 **events** | [**List&lt;Integer&gt;**](Integer.md)| Return only comics which take place in the specified events (accepts a comma-separated list of ids). | [optional]
 **stories** | [**List&lt;Integer&gt;**](Integer.md)| Return only comics which contain the specified stories (accepts a comma-separated list of ids). | [optional]
 **sharedAppearances** | [**List&lt;Integer&gt;**](Integer.md)| Return only comics in which the specified characters appear together (for example in which BOTH Spider-Man and Wolverine appear). Accepts a comma-separated list of ids. | [optional]
 **collaborators** | [**List&lt;Integer&gt;**](Integer.md)| Return only comics in which the specified creators worked together (for example in which BOTH Stan Lee and Jack Kirby did work). Accepts a comma-separated list of ids. | [optional]
 **orderBy** | [**List&lt;String&gt;**](String.md)| Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed. | [optional]
 **limit** | **Integer**| Limit the result set to the specified number of resources. | [optional]
 **offset** | **Integer**| Skip the specified number of resources in the result set. | [optional]

### Return type

[**ComicDataWrapper**](ComicDataWrapper.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getComicsCollection_0"></a>
# **getComicsCollection_0**
> ComicDataWrapper getComicsCollection_0(creatorId, format, formatType, noVariants, dateDescriptor, dateRange, title, titleStartsWith, startYear, issueNumber, diamondCode, digitalId, upc, isbn, ean, issn, hasDigitalIssue, modifiedSince, characters, series, events, stories, sharedAppearances, collaborators, orderBy, limit, offset)

Fetches lists of comics filtered by a creator id.

Fetches lists of comics in which the work of a specific creator appears, with optional filters. See notes on individual parameters below.

### Example
```java
// Import classes:
//import com.marvel.ApiException;
//import com.marvel.api.PublicApi;


PublicApi apiInstance = new PublicApi();
Integer creatorId = 56; // Integer | The creator ID.
String format = "format_example"; // String | Filter by the issue format (e.g. comic, digital comic, hardcover).
String formatType = "formatType_example"; // String | Filter by the issue format type (comic or collection).
Boolean noVariants = true; // Boolean | Exclude variant comics from the result set.
String dateDescriptor = "dateDescriptor_example"; // String | Return comics within a predefined date range.
List<Integer> dateRange = Arrays.asList(56); // List<Integer> | Return comics within a predefined date range.  Dates must be specified as date1,date2 (e.g. 2013-01-01,2013-01-02).  Dates are preferably formatted as YYYY-MM-DD but may be sent as any common date format.
String title = "title_example"; // String | Return only issues in series whose title matches the input.
String titleStartsWith = "titleStartsWith_example"; // String | Return only issues in series whose title starts with the input.
Integer startYear = 56; // Integer | Return only issues in series whose start year matches the input.
Integer issueNumber = 56; // Integer | Return only issues in series whose issue number matches the input.
String diamondCode = "diamondCode_example"; // String | Filter by diamond code.
Integer digitalId = 56; // Integer | Filter by digital comic id.
String upc = "upc_example"; // String | Filter by UPC.
String isbn = "isbn_example"; // String | Filter by ISBN.
String ean = "ean_example"; // String | Filter by EAN.
String issn = "issn_example"; // String | Filter by ISSN.
List<Boolean> hasDigitalIssue = Arrays.asList(true); // List<Boolean> | Include only results which are available digitally.
LocalDate modifiedSince = new LocalDate(); // LocalDate | Return only comics which have been modified since the specified date.
List<Integer> characters = Arrays.asList(56); // List<Integer> | Return only comics which feature the specified characters (accepts a comma-separated list of ids).
List<Integer> series = Arrays.asList(56); // List<Integer> | Return only comics which are part of the specified series (accepts a comma-separated list of ids).
List<Integer> events = Arrays.asList(56); // List<Integer> | Return only comics which take place in the specified events (accepts a comma-separated list of ids).
List<Integer> stories = Arrays.asList(56); // List<Integer> | Return only comics which contain the specified stories (accepts a comma-separated list of ids).
List<Integer> sharedAppearances = Arrays.asList(56); // List<Integer> | Return only comics in which the specified characters appear together (for example in which BOTH Spider-Man and Wolverine appear).
List<Integer> collaborators = Arrays.asList(56); // List<Integer> | Return only comics in which the specified creators worked together (for example in which BOTH Stan Lee and Jack Kirby did work).
List<String> orderBy = Arrays.asList("orderBy_example"); // List<String> | Order the result set by a field or fields. Add a \"-\" to the value sort in descending order. Multiple values are given priority in the order in which they are passed.
Integer limit = 56; // Integer | Limit the result set to the specified number of resources.
Integer offset = 56; // Integer | Skip the specified number of resources in the result set.
try {
    ComicDataWrapper result = apiInstance.getComicsCollection_0(creatorId, format, formatType, noVariants, dateDescriptor, dateRange, title, titleStartsWith, startYear, issueNumber, diamondCode, digitalId, upc, isbn, ean, issn, hasDigitalIssue, modifiedSince, characters, series, events, stories, sharedAppearances, collaborators, orderBy, limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApi#getComicsCollection_0");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **creatorId** | **Integer**| The creator ID. |
 **format** | **String**| Filter by the issue format (e.g. comic, digital comic, hardcover). | [optional]
 **formatType** | **String**| Filter by the issue format type (comic or collection). | [optional]
 **noVariants** | **Boolean**| Exclude variant comics from the result set. | [optional]
 **dateDescriptor** | **String**| Return comics within a predefined date range. | [optional]
 **dateRange** | [**List&lt;Integer&gt;**](Integer.md)| Return comics within a predefined date range.  Dates must be specified as date1,date2 (e.g. 2013-01-01,2013-01-02).  Dates are preferably formatted as YYYY-MM-DD but may be sent as any common date format. | [optional]
 **title** | **String**| Return only issues in series whose title matches the input. | [optional]
 **titleStartsWith** | **String**| Return only issues in series whose title starts with the input. | [optional]
 **startYear** | **Integer**| Return only issues in series whose start year matches the input. | [optional]
 **issueNumber** | **Integer**| Return only issues in series whose issue number matches the input. | [optional]
 **diamondCode** | **String**| Filter by diamond code. | [optional]
 **digitalId** | **Integer**| Filter by digital comic id. | [optional]
 **upc** | **String**| Filter by UPC. | [optional]
 **isbn** | **String**| Filter by ISBN. | [optional]
 **ean** | **String**| Filter by EAN. | [optional]
 **issn** | **String**| Filter by ISSN. | [optional]
 **hasDigitalIssue** | [**List&lt;Boolean&gt;**](Boolean.md)| Include only results which are available digitally. | [optional]
 **modifiedSince** | **LocalDate**| Return only comics which have been modified since the specified date. | [optional]
 **characters** | [**List&lt;Integer&gt;**](Integer.md)| Return only comics which feature the specified characters (accepts a comma-separated list of ids). | [optional]
 **series** | [**List&lt;Integer&gt;**](Integer.md)| Return only comics which are part of the specified series (accepts a comma-separated list of ids). | [optional]
 **events** | [**List&lt;Integer&gt;**](Integer.md)| Return only comics which take place in the specified events (accepts a comma-separated list of ids). | [optional]
 **stories** | [**List&lt;Integer&gt;**](Integer.md)| Return only comics which contain the specified stories (accepts a comma-separated list of ids). | [optional]
 **sharedAppearances** | [**List&lt;Integer&gt;**](Integer.md)| Return only comics in which the specified characters appear together (for example in which BOTH Spider-Man and Wolverine appear). | [optional]
 **collaborators** | [**List&lt;Integer&gt;**](Integer.md)| Return only comics in which the specified creators worked together (for example in which BOTH Stan Lee and Jack Kirby did work). | [optional]
 **orderBy** | [**List&lt;String&gt;**](String.md)| Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed. | [optional]
 **limit** | **Integer**| Limit the result set to the specified number of resources. | [optional]
 **offset** | **Integer**| Skip the specified number of resources in the result set. | [optional]

### Return type

[**ComicDataWrapper**](ComicDataWrapper.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getComicsCollection_1"></a>
# **getComicsCollection_1**
> ComicDataWrapper getComicsCollection_1(eventId, format, formatType, noVariants, dateDescriptor, dateRange, title, titleStartsWith, startYear, issueNumber, diamondCode, digitalId, upc, isbn, ean, issn, hasDigitalIssue, modifiedSince, creators, characters, series, events, stories, sharedAppearances, collaborators, orderBy, limit, offset)

Fetches lists of comics filtered by an event id.

Fetches lists of comics which take place during a specific event, with optional filters. See notes on individual parameters below.

### Example
```java
// Import classes:
//import com.marvel.ApiException;
//import com.marvel.api.PublicApi;


PublicApi apiInstance = new PublicApi();
Integer eventId = 56; // Integer | The event id.
String format = "format_example"; // String | Filter by the issue format (e.g. comic, digital comic, hardcover).
String formatType = "formatType_example"; // String | Filter by the issue format type (comic or collection).
List<Boolean> noVariants = Arrays.asList(true); // List<Boolean> | Exclude variant comics from the result set.
List<String> dateDescriptor = Arrays.asList("dateDescriptor_example"); // List<String> | Return comics within a predefined date range.
List<Integer> dateRange = Arrays.asList(56); // List<Integer> | Return comics within a predefined date range.  Dates must be specified as date1,date2 (e.g. 2013-01-01,2013-01-02).  Dates are preferably formatted as YYYY-MM-DD but may be sent as any common date format.
String title = "title_example"; // String | Return only issues in series whose title matches the input.
String titleStartsWith = "titleStartsWith_example"; // String | Return only issues in series whose title starts with the input.
Integer startYear = 56; // Integer | Return only issues in series whose start year matches the input.
Integer issueNumber = 56; // Integer | Return only issues in series whose issue number matches the input.
String diamondCode = "diamondCode_example"; // String | Filter by diamond code.
Integer digitalId = 56; // Integer | Filter by digital comic id.
String upc = "upc_example"; // String | Filter by UPC.
String isbn = "isbn_example"; // String | Filter by ISBN.
String ean = "ean_example"; // String | Filter by EAN.
String issn = "issn_example"; // String | Filter by ISSN.
List<Boolean> hasDigitalIssue = Arrays.asList(true); // List<Boolean> | Include only results which are available digitally.
LocalDate modifiedSince = new LocalDate(); // LocalDate | Return only comics which have been modified since the specified date.
List<Integer> creators = Arrays.asList(56); // List<Integer> | Return only comics which feature work by the specified creators (accepts a comma-separated list of ids).
List<Integer> characters = Arrays.asList(56); // List<Integer> | Return only comics which feature the specified characters (accepts a comma-separated list of ids).
List<Integer> series = Arrays.asList(56); // List<Integer> | Return only comics which are part of the specified series (accepts a comma-separated list of ids).
List<Integer> events = Arrays.asList(56); // List<Integer> | Return only comics which take place in the specified events (accepts a comma-separated list of ids).
List<Integer> stories = Arrays.asList(56); // List<Integer> | Return only comics which contain the specified stories (accepts a comma-separated list of ids).
List<Integer> sharedAppearances = Arrays.asList(56); // List<Integer> | Return only comics in which the specified characters appear together (for example in which BOTH Spider-Man and Wolverine appear).
List<Integer> collaborators = Arrays.asList(56); // List<Integer> | Return only comics in which the specified creators worked together (for example in which BOTH Stan Lee and Jack Kirby did work).
List<String> orderBy = Arrays.asList("orderBy_example"); // List<String> | Order the result set by a field or fields. Add a \"-\" to the value sort in descending order. Multiple values are given priority in the order in which they are passed.
Integer limit = 56; // Integer | Limit the result set to the specified number of resources.
Integer offset = 56; // Integer | Skip the specified number of resources in the result set.
try {
    ComicDataWrapper result = apiInstance.getComicsCollection_1(eventId, format, formatType, noVariants, dateDescriptor, dateRange, title, titleStartsWith, startYear, issueNumber, diamondCode, digitalId, upc, isbn, ean, issn, hasDigitalIssue, modifiedSince, creators, characters, series, events, stories, sharedAppearances, collaborators, orderBy, limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApi#getComicsCollection_1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventId** | **Integer**| The event id. |
 **format** | **String**| Filter by the issue format (e.g. comic, digital comic, hardcover). | [optional]
 **formatType** | **String**| Filter by the issue format type (comic or collection). | [optional]
 **noVariants** | [**List&lt;Boolean&gt;**](Boolean.md)| Exclude variant comics from the result set. | [optional]
 **dateDescriptor** | [**List&lt;String&gt;**](String.md)| Return comics within a predefined date range. | [optional]
 **dateRange** | [**List&lt;Integer&gt;**](Integer.md)| Return comics within a predefined date range.  Dates must be specified as date1,date2 (e.g. 2013-01-01,2013-01-02).  Dates are preferably formatted as YYYY-MM-DD but may be sent as any common date format. | [optional]
 **title** | **String**| Return only issues in series whose title matches the input. | [optional]
 **titleStartsWith** | **String**| Return only issues in series whose title starts with the input. | [optional]
 **startYear** | **Integer**| Return only issues in series whose start year matches the input. | [optional]
 **issueNumber** | **Integer**| Return only issues in series whose issue number matches the input. | [optional]
 **diamondCode** | **String**| Filter by diamond code. | [optional]
 **digitalId** | **Integer**| Filter by digital comic id. | [optional]
 **upc** | **String**| Filter by UPC. | [optional]
 **isbn** | **String**| Filter by ISBN. | [optional]
 **ean** | **String**| Filter by EAN. | [optional]
 **issn** | **String**| Filter by ISSN. | [optional]
 **hasDigitalIssue** | [**List&lt;Boolean&gt;**](Boolean.md)| Include only results which are available digitally. | [optional]
 **modifiedSince** | **LocalDate**| Return only comics which have been modified since the specified date. | [optional]
 **creators** | [**List&lt;Integer&gt;**](Integer.md)| Return only comics which feature work by the specified creators (accepts a comma-separated list of ids). | [optional]
 **characters** | [**List&lt;Integer&gt;**](Integer.md)| Return only comics which feature the specified characters (accepts a comma-separated list of ids). | [optional]
 **series** | [**List&lt;Integer&gt;**](Integer.md)| Return only comics which are part of the specified series (accepts a comma-separated list of ids). | [optional]
 **events** | [**List&lt;Integer&gt;**](Integer.md)| Return only comics which take place in the specified events (accepts a comma-separated list of ids). | [optional]
 **stories** | [**List&lt;Integer&gt;**](Integer.md)| Return only comics which contain the specified stories (accepts a comma-separated list of ids). | [optional]
 **sharedAppearances** | [**List&lt;Integer&gt;**](Integer.md)| Return only comics in which the specified characters appear together (for example in which BOTH Spider-Man and Wolverine appear). | [optional]
 **collaborators** | [**List&lt;Integer&gt;**](Integer.md)| Return only comics in which the specified creators worked together (for example in which BOTH Stan Lee and Jack Kirby did work). | [optional]
 **orderBy** | [**List&lt;String&gt;**](String.md)| Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed. | [optional]
 **limit** | **Integer**| Limit the result set to the specified number of resources. | [optional]
 **offset** | **Integer**| Skip the specified number of resources in the result set. | [optional]

### Return type

[**ComicDataWrapper**](ComicDataWrapper.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getComicsCollection_2"></a>
# **getComicsCollection_2**
> ComicDataWrapper getComicsCollection_2(seriesId, format, formatType, noVariants, dateDescriptor, dateRange, title, titleStartsWith, startYear, issueNumber, diamondCode, digitalId, upc, isbn, ean, issn, hasDigitalIssue, modifiedSince, creators, characters, events, stories, sharedAppearances, collaborators, orderBy, limit, offset)

Fetches lists of comics filtered by a series id.

Fetches lists of comics which are published as part of a specific series, with optional filters. See notes on individual parameters below.

### Example
```java
// Import classes:
//import com.marvel.ApiException;
//import com.marvel.api.PublicApi;


PublicApi apiInstance = new PublicApi();
Integer seriesId = 56; // Integer | The series ID.
String format = "format_example"; // String | Filter by the issue format (e.g. comic, digital comic, hardcover).
String formatType = "formatType_example"; // String | Filter by the issue format type (comic or collection).
List<Boolean> noVariants = Arrays.asList(true); // List<Boolean> | Exclude variant comics from the result set.
List<String> dateDescriptor = Arrays.asList("dateDescriptor_example"); // List<String> | Return comics within a predefined date range.
List<Integer> dateRange = Arrays.asList(56); // List<Integer> | Return comics within a predefined date range.  Dates must be specified as date1,date2 (e.g. 2013-01-01,2013-01-02).  Dates are preferably formatted as YYYY-MM-DD but may be sent as any common date format.
String title = "title_example"; // String | Return only issues in series whose title matches the input.
String titleStartsWith = "titleStartsWith_example"; // String | Return only issues in series whose title starts with the input.
Integer startYear = 56; // Integer | Return only issues in series whose start year matches the input.
Integer issueNumber = 56; // Integer | Return only issues in series whose issue number matches the input.
String diamondCode = "diamondCode_example"; // String | Filter by diamond code.
Integer digitalId = 56; // Integer | Filter by digital comic id.
String upc = "upc_example"; // String | Filter by UPC.
String isbn = "isbn_example"; // String | Filter by ISBN.
String ean = "ean_example"; // String | Filter by EAN.
String issn = "issn_example"; // String | Filter by ISSN.
List<Boolean> hasDigitalIssue = Arrays.asList(true); // List<Boolean> | Include only results which are available digitally.
LocalDate modifiedSince = new LocalDate(); // LocalDate | Return only comics which have been modified since the specified date.
List<Integer> creators = Arrays.asList(56); // List<Integer> | Return only comics which feature work by the specified creators (accepts a comma-separated list of ids).
List<Integer> characters = Arrays.asList(56); // List<Integer> | Return only comics which feature the specified characters (accepts a comma-separated list of ids).
List<Integer> events = Arrays.asList(56); // List<Integer> | Return only comics which take place in the specified events (accepts a comma-separated list of ids).
List<Integer> stories = Arrays.asList(56); // List<Integer> | Return only comics which contain the specified stories (accepts a comma-separated list of ids).
List<Integer> sharedAppearances = Arrays.asList(56); // List<Integer> | Return only comics in which the specified characters appear together (for example in which BOTH Spider-Man and Wolverine appear).
List<Integer> collaborators = Arrays.asList(56); // List<Integer> | Return only comics in which the specified creators worked together (for example in which BOTH Stan Lee and Jack Kirby did work).
List<String> orderBy = Arrays.asList("orderBy_example"); // List<String> | Order the result set by a field or fields. Add a \"-\" to the value sort in descending order. Multiple values are given priority in the order in which they are passed.
Integer limit = 56; // Integer | Limit the result set to the specified number of resources.
Integer offset = 56; // Integer | Skip the specified number of resources in the result set.
try {
    ComicDataWrapper result = apiInstance.getComicsCollection_2(seriesId, format, formatType, noVariants, dateDescriptor, dateRange, title, titleStartsWith, startYear, issueNumber, diamondCode, digitalId, upc, isbn, ean, issn, hasDigitalIssue, modifiedSince, creators, characters, events, stories, sharedAppearances, collaborators, orderBy, limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApi#getComicsCollection_2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **seriesId** | **Integer**| The series ID. |
 **format** | **String**| Filter by the issue format (e.g. comic, digital comic, hardcover). | [optional]
 **formatType** | **String**| Filter by the issue format type (comic or collection). | [optional]
 **noVariants** | [**List&lt;Boolean&gt;**](Boolean.md)| Exclude variant comics from the result set. | [optional]
 **dateDescriptor** | [**List&lt;String&gt;**](String.md)| Return comics within a predefined date range. | [optional]
 **dateRange** | [**List&lt;Integer&gt;**](Integer.md)| Return comics within a predefined date range.  Dates must be specified as date1,date2 (e.g. 2013-01-01,2013-01-02).  Dates are preferably formatted as YYYY-MM-DD but may be sent as any common date format. | [optional]
 **title** | **String**| Return only issues in series whose title matches the input. | [optional]
 **titleStartsWith** | **String**| Return only issues in series whose title starts with the input. | [optional]
 **startYear** | **Integer**| Return only issues in series whose start year matches the input. | [optional]
 **issueNumber** | **Integer**| Return only issues in series whose issue number matches the input. | [optional]
 **diamondCode** | **String**| Filter by diamond code. | [optional]
 **digitalId** | **Integer**| Filter by digital comic id. | [optional]
 **upc** | **String**| Filter by UPC. | [optional]
 **isbn** | **String**| Filter by ISBN. | [optional]
 **ean** | **String**| Filter by EAN. | [optional]
 **issn** | **String**| Filter by ISSN. | [optional]
 **hasDigitalIssue** | [**List&lt;Boolean&gt;**](Boolean.md)| Include only results which are available digitally. | [optional]
 **modifiedSince** | **LocalDate**| Return only comics which have been modified since the specified date. | [optional]
 **creators** | [**List&lt;Integer&gt;**](Integer.md)| Return only comics which feature work by the specified creators (accepts a comma-separated list of ids). | [optional]
 **characters** | [**List&lt;Integer&gt;**](Integer.md)| Return only comics which feature the specified characters (accepts a comma-separated list of ids). | [optional]
 **events** | [**List&lt;Integer&gt;**](Integer.md)| Return only comics which take place in the specified events (accepts a comma-separated list of ids). | [optional]
 **stories** | [**List&lt;Integer&gt;**](Integer.md)| Return only comics which contain the specified stories (accepts a comma-separated list of ids). | [optional]
 **sharedAppearances** | [**List&lt;Integer&gt;**](Integer.md)| Return only comics in which the specified characters appear together (for example in which BOTH Spider-Man and Wolverine appear). | [optional]
 **collaborators** | [**List&lt;Integer&gt;**](Integer.md)| Return only comics in which the specified creators worked together (for example in which BOTH Stan Lee and Jack Kirby did work). | [optional]
 **orderBy** | [**List&lt;String&gt;**](String.md)| Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed. | [optional]
 **limit** | **Integer**| Limit the result set to the specified number of resources. | [optional]
 **offset** | **Integer**| Skip the specified number of resources in the result set. | [optional]

### Return type

[**ComicDataWrapper**](ComicDataWrapper.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getComicsCollection_3"></a>
# **getComicsCollection_3**
> ComicDataWrapper getComicsCollection_3(storyId, format, formatType, noVariants, dateDescriptor, dateRange, title, titleStartsWith, startYear, issueNumber, diamondCode, digitalId, upc, isbn, ean, issn, hasDigitalIssue, modifiedSince, creators, characters, series, events, sharedAppearances, collaborators, orderBy, limit, offset)

Fetches lists of comics filtered by a story id.

Fetches lists of comics in which a specific story appears, with optional filters. See notes on individual parameters below.

### Example
```java
// Import classes:
//import com.marvel.ApiException;
//import com.marvel.api.PublicApi;


PublicApi apiInstance = new PublicApi();
Integer storyId = 56; // Integer | The story ID.
String format = "format_example"; // String | Filter by the issue format (e.g. comic, digital comic, hardcover).
String formatType = "formatType_example"; // String | Filter by the issue format type (comic or collection).
List<Boolean> noVariants = Arrays.asList(true); // List<Boolean> | Exclude variant comics from the result set.
List<String> dateDescriptor = Arrays.asList("dateDescriptor_example"); // List<String> | Return comics within a predefined date range.
List<Integer> dateRange = Arrays.asList(56); // List<Integer> | Return comics within a predefined date range.  Dates must be specified as date1,date2 (e.g. 2013-01-01,2013-01-02).  Dates are preferably formatted as YYYY-MM-DD but may be sent as any common date format.
String title = "title_example"; // String | Return only issues in series whose title matches the input.
String titleStartsWith = "titleStartsWith_example"; // String | Return only issues in series whose title starts with the input.
Integer startYear = 56; // Integer | Return only issues in series whose start year matches the input.
Integer issueNumber = 56; // Integer | Return only issues in series whose issue number matches the input.
String diamondCode = "diamondCode_example"; // String | Filter by diamond code.
Integer digitalId = 56; // Integer | Filter by digital comic id.
String upc = "upc_example"; // String | Filter by UPC.
String isbn = "isbn_example"; // String | Filter by ISBN.
String ean = "ean_example"; // String | Filter by EAN.
String issn = "issn_example"; // String | Filter by ISSN.
List<Boolean> hasDigitalIssue = Arrays.asList(true); // List<Boolean> | Include only results which are available digitally.
LocalDate modifiedSince = new LocalDate(); // LocalDate | Return only comics which have been modified since the specified date.
List<Integer> creators = Arrays.asList(56); // List<Integer> | Return only comics which feature work by the specified creators (accepts a comma-separated list of ids).
List<Integer> characters = Arrays.asList(56); // List<Integer> | Return only comics which feature the specified characters (accepts a comma-separated list of ids).
List<Integer> series = Arrays.asList(56); // List<Integer> | Return only comics which are part of the specified series (accepts a comma-separated list of ids).
List<Integer> events = Arrays.asList(56); // List<Integer> | Return only comics which take place in the specified events (accepts a comma-separated list of ids).
List<Integer> sharedAppearances = Arrays.asList(56); // List<Integer> | Return only comics in which the specified characters appear together (for example in which BOTH Spider-Man and Wolverine appear).
List<Integer> collaborators = Arrays.asList(56); // List<Integer> | Return only comics in which the specified creators worked together (for example in which BOTH Stan Lee and Jack Kirby did work).
List<String> orderBy = Arrays.asList("orderBy_example"); // List<String> | Order the result set by a field or fields. Add a \"-\" to the value sort in descending order. Multiple values are given priority in the order in which they are passed.
Integer limit = 56; // Integer | Limit the result set to the specified number of resources.
Integer offset = 56; // Integer | Skip the specified number of resources in the result set.
try {
    ComicDataWrapper result = apiInstance.getComicsCollection_3(storyId, format, formatType, noVariants, dateDescriptor, dateRange, title, titleStartsWith, startYear, issueNumber, diamondCode, digitalId, upc, isbn, ean, issn, hasDigitalIssue, modifiedSince, creators, characters, series, events, sharedAppearances, collaborators, orderBy, limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApi#getComicsCollection_3");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storyId** | **Integer**| The story ID. |
 **format** | **String**| Filter by the issue format (e.g. comic, digital comic, hardcover). | [optional]
 **formatType** | **String**| Filter by the issue format type (comic or collection). | [optional]
 **noVariants** | [**List&lt;Boolean&gt;**](Boolean.md)| Exclude variant comics from the result set. | [optional]
 **dateDescriptor** | [**List&lt;String&gt;**](String.md)| Return comics within a predefined date range. | [optional]
 **dateRange** | [**List&lt;Integer&gt;**](Integer.md)| Return comics within a predefined date range.  Dates must be specified as date1,date2 (e.g. 2013-01-01,2013-01-02).  Dates are preferably formatted as YYYY-MM-DD but may be sent as any common date format. | [optional]
 **title** | **String**| Return only issues in series whose title matches the input. | [optional]
 **titleStartsWith** | **String**| Return only issues in series whose title starts with the input. | [optional]
 **startYear** | **Integer**| Return only issues in series whose start year matches the input. | [optional]
 **issueNumber** | **Integer**| Return only issues in series whose issue number matches the input. | [optional]
 **diamondCode** | **String**| Filter by diamond code. | [optional]
 **digitalId** | **Integer**| Filter by digital comic id. | [optional]
 **upc** | **String**| Filter by UPC. | [optional]
 **isbn** | **String**| Filter by ISBN. | [optional]
 **ean** | **String**| Filter by EAN. | [optional]
 **issn** | **String**| Filter by ISSN. | [optional]
 **hasDigitalIssue** | [**List&lt;Boolean&gt;**](Boolean.md)| Include only results which are available digitally. | [optional]
 **modifiedSince** | **LocalDate**| Return only comics which have been modified since the specified date. | [optional]
 **creators** | [**List&lt;Integer&gt;**](Integer.md)| Return only comics which feature work by the specified creators (accepts a comma-separated list of ids). | [optional]
 **characters** | [**List&lt;Integer&gt;**](Integer.md)| Return only comics which feature the specified characters (accepts a comma-separated list of ids). | [optional]
 **series** | [**List&lt;Integer&gt;**](Integer.md)| Return only comics which are part of the specified series (accepts a comma-separated list of ids). | [optional]
 **events** | [**List&lt;Integer&gt;**](Integer.md)| Return only comics which take place in the specified events (accepts a comma-separated list of ids). | [optional]
 **sharedAppearances** | [**List&lt;Integer&gt;**](Integer.md)| Return only comics in which the specified characters appear together (for example in which BOTH Spider-Man and Wolverine appear). | [optional]
 **collaborators** | [**List&lt;Integer&gt;**](Integer.md)| Return only comics in which the specified creators worked together (for example in which BOTH Stan Lee and Jack Kirby did work). | [optional]
 **orderBy** | [**List&lt;String&gt;**](String.md)| Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed. | [optional]
 **limit** | **Integer**| Limit the result set to the specified number of resources. | [optional]
 **offset** | **Integer**| Skip the specified number of resources in the result set. | [optional]

### Return type

[**ComicDataWrapper**](ComicDataWrapper.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getCreatorCollection"></a>
# **getCreatorCollection**
> CharacterDataWrapper getCreatorCollection(name, nameStartsWith, modifiedSince, comics, series, events, stories, orderBy, limit, offset)

Fetches lists of characters.

Fetches lists of comic characters with optional filters. See notes on individual parameters below.

### Example
```java
// Import classes:
//import com.marvel.ApiException;
//import com.marvel.api.PublicApi;


PublicApi apiInstance = new PublicApi();
String name = "name_example"; // String | Return only characters matching the specified full character name (e.g. Spider-Man).
String nameStartsWith = "nameStartsWith_example"; // String | Return characters with names that begin with the specified string (e.g. Sp).
LocalDate modifiedSince = new LocalDate(); // LocalDate | Return only characters which have been modified since the specified date.
List<Integer> comics = Arrays.asList(56); // List<Integer> | Return only characters which appear in the specified comics (accepts a comma-separated list of ids).
List<Integer> series = Arrays.asList(56); // List<Integer> | Return only characters which appear the specified series (accepts a comma-separated list of ids).
List<Integer> events = Arrays.asList(56); // List<Integer> | Return only characters which appear in the specified events (accepts a comma-separated list of ids).
List<Integer> stories = Arrays.asList(56); // List<Integer> | Return only characters which appear the specified stories (accepts a comma-separated list of ids).
List<String> orderBy = Arrays.asList("orderBy_example"); // List<String> | Order the result set by a field or fields. Add a \"-\" to the value sort in descending order. Multiple values are given priority in the order in which they are passed.
Integer limit = 56; // Integer | Limit the result set to the specified number of resources.
Integer offset = 56; // Integer | Skip the specified number of resources in the result set.
try {
    CharacterDataWrapper result = apiInstance.getCreatorCollection(name, nameStartsWith, modifiedSince, comics, series, events, stories, orderBy, limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApi#getCreatorCollection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Return only characters matching the specified full character name (e.g. Spider-Man). | [optional]
 **nameStartsWith** | **String**| Return characters with names that begin with the specified string (e.g. Sp). | [optional]
 **modifiedSince** | **LocalDate**| Return only characters which have been modified since the specified date. | [optional]
 **comics** | [**List&lt;Integer&gt;**](Integer.md)| Return only characters which appear in the specified comics (accepts a comma-separated list of ids). | [optional]
 **series** | [**List&lt;Integer&gt;**](Integer.md)| Return only characters which appear the specified series (accepts a comma-separated list of ids). | [optional]
 **events** | [**List&lt;Integer&gt;**](Integer.md)| Return only characters which appear in the specified events (accepts a comma-separated list of ids). | [optional]
 **stories** | [**List&lt;Integer&gt;**](Integer.md)| Return only characters which appear the specified stories (accepts a comma-separated list of ids). | [optional]
 **orderBy** | [**List&lt;String&gt;**](String.md)| Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed. | [optional]
 **limit** | **Integer**| Limit the result set to the specified number of resources. | [optional]
 **offset** | **Integer**| Skip the specified number of resources in the result set. | [optional]

### Return type

[**CharacterDataWrapper**](CharacterDataWrapper.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getCreatorCollection_0"></a>
# **getCreatorCollection_0**
> CreatorDataWrapper getCreatorCollection_0(comicId, firstName, middleName, lastName, suffix, nameStartsWith, firstNameStartsWith, middleNameStartsWith, lastNameStartsWith, modifiedSince, comics, series, stories, orderBy, limit, offset)

Fetches lists of creators filtered by a comic id.

Fetches lists of comic creators whose work appears in a specific comic, with optional filters. See notes on individual parameters below.

### Example
```java
// Import classes:
//import com.marvel.ApiException;
//import com.marvel.api.PublicApi;


PublicApi apiInstance = new PublicApi();
Integer comicId = 56; // Integer | The comic id.
String firstName = "firstName_example"; // String | Filter by creator first name (e.g. brian).
String middleName = "middleName_example"; // String | Filter by creator middle name (e.g. Michael).
String lastName = "lastName_example"; // String | Filter by creator last name (e.g. Bendis).
String suffix = "suffix_example"; // String | Filter by suffix or honorific (e.g. Jr., Sr.).
String nameStartsWith = "nameStartsWith_example"; // String | Filter by creator names that match critera (e.g. B, St L).
String firstNameStartsWith = "firstNameStartsWith_example"; // String | Filter by creator first names that match critera (e.g. B, St L).
String middleNameStartsWith = "middleNameStartsWith_example"; // String | Filter by creator middle names that match critera (e.g. Mi).
String lastNameStartsWith = "lastNameStartsWith_example"; // String | Filter by creator last names that match critera (e.g. Ben).
LocalDate modifiedSince = new LocalDate(); // LocalDate | Return only creators which have been modified since the specified date.
List<Integer> comics = Arrays.asList(56); // List<Integer> | Return only creators who worked on in the specified comics (accepts a comma-separated list of ids).
List<Integer> series = Arrays.asList(56); // List<Integer> | Return only creators who worked on the specified series (accepts a comma-separated list of ids).
List<Integer> stories = Arrays.asList(56); // List<Integer> | Return only creators who worked on the specified stories (accepts a comma-separated list of ids).
List<String> orderBy = Arrays.asList("orderBy_example"); // List<String> | Order the result set by a field or fields. Add a \"-\" to the value sort in descending order. Multiple values are given priority in the order in which they are passed.
Integer limit = 56; // Integer | Limit the result set to the specified number of resources.
Integer offset = 56; // Integer | Skip the specified number of resources in the result set.
try {
    CreatorDataWrapper result = apiInstance.getCreatorCollection_0(comicId, firstName, middleName, lastName, suffix, nameStartsWith, firstNameStartsWith, middleNameStartsWith, lastNameStartsWith, modifiedSince, comics, series, stories, orderBy, limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApi#getCreatorCollection_0");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **comicId** | **Integer**| The comic id. |
 **firstName** | **String**| Filter by creator first name (e.g. brian). | [optional]
 **middleName** | **String**| Filter by creator middle name (e.g. Michael). | [optional]
 **lastName** | **String**| Filter by creator last name (e.g. Bendis). | [optional]
 **suffix** | **String**| Filter by suffix or honorific (e.g. Jr., Sr.). | [optional]
 **nameStartsWith** | **String**| Filter by creator names that match critera (e.g. B, St L). | [optional]
 **firstNameStartsWith** | **String**| Filter by creator first names that match critera (e.g. B, St L). | [optional]
 **middleNameStartsWith** | **String**| Filter by creator middle names that match critera (e.g. Mi). | [optional]
 **lastNameStartsWith** | **String**| Filter by creator last names that match critera (e.g. Ben). | [optional]
 **modifiedSince** | **LocalDate**| Return only creators which have been modified since the specified date. | [optional]
 **comics** | [**List&lt;Integer&gt;**](Integer.md)| Return only creators who worked on in the specified comics (accepts a comma-separated list of ids). | [optional]
 **series** | [**List&lt;Integer&gt;**](Integer.md)| Return only creators who worked on the specified series (accepts a comma-separated list of ids). | [optional]
 **stories** | [**List&lt;Integer&gt;**](Integer.md)| Return only creators who worked on the specified stories (accepts a comma-separated list of ids). | [optional]
 **orderBy** | [**List&lt;String&gt;**](String.md)| Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed. | [optional]
 **limit** | **Integer**| Limit the result set to the specified number of resources. | [optional]
 **offset** | **Integer**| Skip the specified number of resources in the result set. | [optional]

### Return type

[**CreatorDataWrapper**](CreatorDataWrapper.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getCreatorCollection_1"></a>
# **getCreatorCollection_1**
> CreatorDataWrapper getCreatorCollection_1(firstName, middleName, lastName, suffix, nameStartsWith, firstNameStartsWith, middleNameStartsWith, lastNameStartsWith, modifiedSince, comics, series, events, stories, orderBy, limit, offset)

Fetches lists of creators.

Fetches lists of comic creators with optional filters. See notes on individual parameters below.

### Example
```java
// Import classes:
//import com.marvel.ApiException;
//import com.marvel.api.PublicApi;


PublicApi apiInstance = new PublicApi();
String firstName = "firstName_example"; // String | Filter by creator first name (e.g. Brian).
String middleName = "middleName_example"; // String | Filter by creator middle name (e.g. Michael).
String lastName = "lastName_example"; // String | Filter by creator last name (e.g. Bendis).
String suffix = "suffix_example"; // String | Filter by suffix or honorific (e.g. Jr., Sr.).
String nameStartsWith = "nameStartsWith_example"; // String | Filter by creator names that match critera (e.g. B, St L).
String firstNameStartsWith = "firstNameStartsWith_example"; // String | Filter by creator first names that match critera (e.g. B, St L).
String middleNameStartsWith = "middleNameStartsWith_example"; // String | Filter by creator middle names that match critera (e.g. Mi).
String lastNameStartsWith = "lastNameStartsWith_example"; // String | Filter by creator last names that match critera (e.g. Ben).
LocalDate modifiedSince = new LocalDate(); // LocalDate | Return only creators which have been modified since the specified date.
List<Integer> comics = Arrays.asList(56); // List<Integer> | Return only creators who worked on in the specified comics (accepts a comma-separated list of ids).
List<Integer> series = Arrays.asList(56); // List<Integer> | Return only creators who worked on the specified series (accepts a comma-separated list of ids).
List<Integer> events = Arrays.asList(56); // List<Integer> | Return only creators who worked on comics that took place in the specified events (accepts a comma-separated list of ids).
List<Integer> stories = Arrays.asList(56); // List<Integer> | Return only creators who worked on the specified stories (accepts a comma-separated list of ids).
List<String> orderBy = Arrays.asList("orderBy_example"); // List<String> | Order the result set by a field or fields. Add a \"-\" to the value sort in descending order. Multiple values are given priority in the order in which they are passed.
Integer limit = 56; // Integer | Limit the result set to the specified number of resources.
Integer offset = 56; // Integer | Skip the specified number of resources in the result set.
try {
    CreatorDataWrapper result = apiInstance.getCreatorCollection_1(firstName, middleName, lastName, suffix, nameStartsWith, firstNameStartsWith, middleNameStartsWith, lastNameStartsWith, modifiedSince, comics, series, events, stories, orderBy, limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApi#getCreatorCollection_1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **firstName** | **String**| Filter by creator first name (e.g. Brian). | [optional]
 **middleName** | **String**| Filter by creator middle name (e.g. Michael). | [optional]
 **lastName** | **String**| Filter by creator last name (e.g. Bendis). | [optional]
 **suffix** | **String**| Filter by suffix or honorific (e.g. Jr., Sr.). | [optional]
 **nameStartsWith** | **String**| Filter by creator names that match critera (e.g. B, St L). | [optional]
 **firstNameStartsWith** | **String**| Filter by creator first names that match critera (e.g. B, St L). | [optional]
 **middleNameStartsWith** | **String**| Filter by creator middle names that match critera (e.g. Mi). | [optional]
 **lastNameStartsWith** | **String**| Filter by creator last names that match critera (e.g. Ben). | [optional]
 **modifiedSince** | **LocalDate**| Return only creators which have been modified since the specified date. | [optional]
 **comics** | [**List&lt;Integer&gt;**](Integer.md)| Return only creators who worked on in the specified comics (accepts a comma-separated list of ids). | [optional]
 **series** | [**List&lt;Integer&gt;**](Integer.md)| Return only creators who worked on the specified series (accepts a comma-separated list of ids). | [optional]
 **events** | [**List&lt;Integer&gt;**](Integer.md)| Return only creators who worked on comics that took place in the specified events (accepts a comma-separated list of ids). | [optional]
 **stories** | [**List&lt;Integer&gt;**](Integer.md)| Return only creators who worked on the specified stories (accepts a comma-separated list of ids). | [optional]
 **orderBy** | [**List&lt;String&gt;**](String.md)| Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed. | [optional]
 **limit** | **Integer**| Limit the result set to the specified number of resources. | [optional]
 **offset** | **Integer**| Skip the specified number of resources in the result set. | [optional]

### Return type

[**CreatorDataWrapper**](CreatorDataWrapper.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getCreatorCollection_2"></a>
# **getCreatorCollection_2**
> CreatorDataWrapper getCreatorCollection_2(eventId, firstName, middleName, lastName, suffix, nameStartsWith, firstNameStartsWith, middleNameStartsWith, lastNameStartsWith, modifiedSince, comics, series, stories, orderBy, limit, offset)

Fetches lists of creators filtered by an event id.

Fetches lists of comic creators whose work appears in a specific event, with optional filters. See notes on individual parameters below.

### Example
```java
// Import classes:
//import com.marvel.ApiException;
//import com.marvel.api.PublicApi;


PublicApi apiInstance = new PublicApi();
Integer eventId = 56; // Integer | The event ID.
String firstName = "firstName_example"; // String | Filter by creator first name (e.g. brian).
String middleName = "middleName_example"; // String | Filter by creator middle name (e.g. Michael).
String lastName = "lastName_example"; // String | Filter by creator last name (e.g. Bendis).
String suffix = "suffix_example"; // String | Filter by suffix or honorific (e.g. Jr., Sr.).
String nameStartsWith = "nameStartsWith_example"; // String | Filter by creator names that match critera (e.g. B, St L).
String firstNameStartsWith = "firstNameStartsWith_example"; // String | Filter by creator first names that match critera (e.g. B, St L).
String middleNameStartsWith = "middleNameStartsWith_example"; // String | Filter by creator middle names that match critera (e.g. Mi).
String lastNameStartsWith = "lastNameStartsWith_example"; // String | Filter by creator last names that match critera (e.g. Ben).
LocalDate modifiedSince = new LocalDate(); // LocalDate | Return only creators which have been modified since the specified date.
List<Integer> comics = Arrays.asList(56); // List<Integer> | Return only creators who worked on in the specified comics (accepts a comma-separated list of ids).
List<Integer> series = Arrays.asList(56); // List<Integer> | Return only creators who worked on the specified series (accepts a comma-separated list of ids).
List<Integer> stories = Arrays.asList(56); // List<Integer> | Return only creators who worked on the specified stories (accepts a comma-separated list of ids).
List<String> orderBy = Arrays.asList("orderBy_example"); // List<String> | Order the result set by a field or fields. Add a \"-\" to the value sort in descending order. Multiple values are given priority in the order in which they are passed.
Integer limit = 56; // Integer | Limit the result set to the specified number of resources.
Integer offset = 56; // Integer | Skip the specified number of resources in the result set.
try {
    CreatorDataWrapper result = apiInstance.getCreatorCollection_2(eventId, firstName, middleName, lastName, suffix, nameStartsWith, firstNameStartsWith, middleNameStartsWith, lastNameStartsWith, modifiedSince, comics, series, stories, orderBy, limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApi#getCreatorCollection_2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventId** | **Integer**| The event ID. |
 **firstName** | **String**| Filter by creator first name (e.g. brian). | [optional]
 **middleName** | **String**| Filter by creator middle name (e.g. Michael). | [optional]
 **lastName** | **String**| Filter by creator last name (e.g. Bendis). | [optional]
 **suffix** | **String**| Filter by suffix or honorific (e.g. Jr., Sr.). | [optional]
 **nameStartsWith** | **String**| Filter by creator names that match critera (e.g. B, St L). | [optional]
 **firstNameStartsWith** | **String**| Filter by creator first names that match critera (e.g. B, St L). | [optional]
 **middleNameStartsWith** | **String**| Filter by creator middle names that match critera (e.g. Mi). | [optional]
 **lastNameStartsWith** | **String**| Filter by creator last names that match critera (e.g. Ben). | [optional]
 **modifiedSince** | **LocalDate**| Return only creators which have been modified since the specified date. | [optional]
 **comics** | [**List&lt;Integer&gt;**](Integer.md)| Return only creators who worked on in the specified comics (accepts a comma-separated list of ids). | [optional]
 **series** | [**List&lt;Integer&gt;**](Integer.md)| Return only creators who worked on the specified series (accepts a comma-separated list of ids). | [optional]
 **stories** | [**List&lt;Integer&gt;**](Integer.md)| Return only creators who worked on the specified stories (accepts a comma-separated list of ids). | [optional]
 **orderBy** | [**List&lt;String&gt;**](String.md)| Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed. | [optional]
 **limit** | **Integer**| Limit the result set to the specified number of resources. | [optional]
 **offset** | **Integer**| Skip the specified number of resources in the result set. | [optional]

### Return type

[**CreatorDataWrapper**](CreatorDataWrapper.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getCreatorCollection_3"></a>
# **getCreatorCollection_3**
> CreatorDataWrapper getCreatorCollection_3(seriesId, firstName, middleName, lastName, suffix, nameStartsWith, firstNameStartsWith, middleNameStartsWith, lastNameStartsWith, modifiedSince, comics, events, stories, orderBy, limit, offset)

Fetches lists of creators filtered by a series id.

Fetches lists of comic creators whose work appears in a specific series, with optional filters. See notes on individual parameters below.

### Example
```java
// Import classes:
//import com.marvel.ApiException;
//import com.marvel.api.PublicApi;


PublicApi apiInstance = new PublicApi();
Integer seriesId = 56; // Integer | The series ID.
String firstName = "firstName_example"; // String | Filter by creator first name (e.g. brian).
String middleName = "middleName_example"; // String | Filter by creator middle name (e.g. Michael).
String lastName = "lastName_example"; // String | Filter by creator last name (e.g. Bendis).
String suffix = "suffix_example"; // String | Filter by suffix or honorific (e.g. Jr., Sr.).
String nameStartsWith = "nameStartsWith_example"; // String | Filter by creator names that match critera (e.g. B, St L).
String firstNameStartsWith = "firstNameStartsWith_example"; // String | Filter by creator first names that match critera (e.g. B, St L).
String middleNameStartsWith = "middleNameStartsWith_example"; // String | Filter by creator middle names that match critera (e.g. Mi).
String lastNameStartsWith = "lastNameStartsWith_example"; // String | Filter by creator last names that match critera (e.g. Ben).
LocalDate modifiedSince = new LocalDate(); // LocalDate | Return only creators which have been modified since the specified date.
List<Integer> comics = Arrays.asList(56); // List<Integer> | Return only creators who worked on in the specified comics (accepts a comma-separated list of ids).
List<Integer> events = Arrays.asList(56); // List<Integer> | Return only creators who worked on comics that took place in the specified events (accepts a comma-separated list of ids).
List<Integer> stories = Arrays.asList(56); // List<Integer> | Return only creators who worked on the specified stories (accepts a comma-separated list of ids).
List<String> orderBy = Arrays.asList("orderBy_example"); // List<String> | Order the result set by a field or fields. Add a \"-\" to the value sort in descending order. Multiple values are given priority in the order in which they are passed.
Integer limit = 56; // Integer | Limit the result set to the specified number of resources.
Integer offset = 56; // Integer | Skip the specified number of resources in the result set.
try {
    CreatorDataWrapper result = apiInstance.getCreatorCollection_3(seriesId, firstName, middleName, lastName, suffix, nameStartsWith, firstNameStartsWith, middleNameStartsWith, lastNameStartsWith, modifiedSince, comics, events, stories, orderBy, limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApi#getCreatorCollection_3");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **seriesId** | **Integer**| The series ID. |
 **firstName** | **String**| Filter by creator first name (e.g. brian). | [optional]
 **middleName** | **String**| Filter by creator middle name (e.g. Michael). | [optional]
 **lastName** | **String**| Filter by creator last name (e.g. Bendis). | [optional]
 **suffix** | **String**| Filter by suffix or honorific (e.g. Jr., Sr.). | [optional]
 **nameStartsWith** | **String**| Filter by creator names that match critera (e.g. B, St L). | [optional]
 **firstNameStartsWith** | **String**| Filter by creator first names that match critera (e.g. B, St L). | [optional]
 **middleNameStartsWith** | **String**| Filter by creator middle names that match critera (e.g. Mi). | [optional]
 **lastNameStartsWith** | **String**| Filter by creator last names that match critera (e.g. Ben). | [optional]
 **modifiedSince** | **LocalDate**| Return only creators which have been modified since the specified date. | [optional]
 **comics** | [**List&lt;Integer&gt;**](Integer.md)| Return only creators who worked on in the specified comics (accepts a comma-separated list of ids). | [optional]
 **events** | [**List&lt;Integer&gt;**](Integer.md)| Return only creators who worked on comics that took place in the specified events (accepts a comma-separated list of ids). | [optional]
 **stories** | [**List&lt;Integer&gt;**](Integer.md)| Return only creators who worked on the specified stories (accepts a comma-separated list of ids). | [optional]
 **orderBy** | [**List&lt;String&gt;**](String.md)| Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed. | [optional]
 **limit** | **Integer**| Limit the result set to the specified number of resources. | [optional]
 **offset** | **Integer**| Skip the specified number of resources in the result set. | [optional]

### Return type

[**CreatorDataWrapper**](CreatorDataWrapper.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getCreatorCollection_4"></a>
# **getCreatorCollection_4**
> CharacterDataWrapper getCreatorCollection_4(storyId, name, nameStartsWith, modifiedSince, comics, series, events, orderBy, limit, offset)

Fetches lists of characters filtered by a story id.

Fetches lists of comic characters appearing in a single story, with optional filters. See notes on individual parameters below.

### Example
```java
// Import classes:
//import com.marvel.ApiException;
//import com.marvel.api.PublicApi;


PublicApi apiInstance = new PublicApi();
Integer storyId = 56; // Integer | The story ID.
String name = "name_example"; // String | Return only characters matching the specified full character name (e.g. Spider-Man).
String nameStartsWith = "nameStartsWith_example"; // String | Return characters with names that begin with the specified string (e.g. Sp).
LocalDate modifiedSince = new LocalDate(); // LocalDate | Return only characters which have been modified since the specified date.
List<Integer> comics = Arrays.asList(56); // List<Integer> | Return only characters which appear in the specified comics (accepts a comma-separated list of ids).
List<Integer> series = Arrays.asList(56); // List<Integer> | Return only characters which appear the specified series (accepts a comma-separated list of ids).
List<Integer> events = Arrays.asList(56); // List<Integer> | Return only characters which appear comics that took place in the specified events (accepts a comma-separated list of ids).
List<String> orderBy = Arrays.asList("orderBy_example"); // List<String> | Order the result set by a field or fields. Add a \"-\" to the value sort in descending order. Multiple values are given priority in the order in which they are passed.
Integer limit = 56; // Integer | Limit the result set to the specified number of resources.
Integer offset = 56; // Integer | Skip the specified number of resources in the result set.
try {
    CharacterDataWrapper result = apiInstance.getCreatorCollection_4(storyId, name, nameStartsWith, modifiedSince, comics, series, events, orderBy, limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApi#getCreatorCollection_4");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storyId** | **Integer**| The story ID. |
 **name** | **String**| Return only characters matching the specified full character name (e.g. Spider-Man). | [optional]
 **nameStartsWith** | **String**| Return characters with names that begin with the specified string (e.g. Sp). | [optional]
 **modifiedSince** | **LocalDate**| Return only characters which have been modified since the specified date. | [optional]
 **comics** | [**List&lt;Integer&gt;**](Integer.md)| Return only characters which appear in the specified comics (accepts a comma-separated list of ids). | [optional]
 **series** | [**List&lt;Integer&gt;**](Integer.md)| Return only characters which appear the specified series (accepts a comma-separated list of ids). | [optional]
 **events** | [**List&lt;Integer&gt;**](Integer.md)| Return only characters which appear comics that took place in the specified events (accepts a comma-separated list of ids). | [optional]
 **orderBy** | [**List&lt;String&gt;**](String.md)| Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed. | [optional]
 **limit** | **Integer**| Limit the result set to the specified number of resources. | [optional]
 **offset** | **Integer**| Skip the specified number of resources in the result set. | [optional]

### Return type

[**CharacterDataWrapper**](CharacterDataWrapper.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getCreatorCollection_5"></a>
# **getCreatorCollection_5**
> CreatorDataWrapper getCreatorCollection_5(storyId, firstName, middleName, lastName, suffix, nameStartsWith, firstNameStartsWith, middleNameStartsWith, lastNameStartsWith, modifiedSince, comics, series, events, orderBy, limit, offset)

Fetches lists of creators filtered by a story id.

Fetches lists of comic creators whose work appears in a specific story, with optional filters. See notes on individual parameters below.

### Example
```java
// Import classes:
//import com.marvel.ApiException;
//import com.marvel.api.PublicApi;


PublicApi apiInstance = new PublicApi();
Integer storyId = 56; // Integer | The story ID.
String firstName = "firstName_example"; // String | Filter by creator first name (e.g. brian).
String middleName = "middleName_example"; // String | Filter by creator middle name (e.g. Michael).
String lastName = "lastName_example"; // String | Filter by creator last name (e.g. Bendis).
String suffix = "suffix_example"; // String | Filter by suffix or honorific (e.g. Jr., Sr.).
String nameStartsWith = "nameStartsWith_example"; // String | Filter by creator names that match critera (e.g. B, St L).
String firstNameStartsWith = "firstNameStartsWith_example"; // String | Filter by creator first names that match critera (e.g. B, St L).
String middleNameStartsWith = "middleNameStartsWith_example"; // String | Filter by creator middle names that match critera (e.g. Mi).
String lastNameStartsWith = "lastNameStartsWith_example"; // String | Filter by creator last names that match critera (e.g. Ben).
LocalDate modifiedSince = new LocalDate(); // LocalDate | Return only creators which have been modified since the specified date.
List<Integer> comics = Arrays.asList(56); // List<Integer> | Return only creators who worked on in the specified comics (accepts a comma-separated list of ids).
List<Integer> series = Arrays.asList(56); // List<Integer> | Return only creators who worked on the specified series (accepts a comma-separated list of ids).
List<Integer> events = Arrays.asList(56); // List<Integer> | Return only creators who worked on comics that took place in the specified events (accepts a comma-separated list of ids).
List<String> orderBy = Arrays.asList("orderBy_example"); // List<String> | Order the result set by a field or fields. Add a \"-\" to the value sort in descending order. Multiple values are given priority in the order in which they are passed.
Integer limit = 56; // Integer | Limit the result set to the specified number of resources.
Integer offset = 56; // Integer | Skip the specified number of resources in the result set.
try {
    CreatorDataWrapper result = apiInstance.getCreatorCollection_5(storyId, firstName, middleName, lastName, suffix, nameStartsWith, firstNameStartsWith, middleNameStartsWith, lastNameStartsWith, modifiedSince, comics, series, events, orderBy, limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApi#getCreatorCollection_5");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storyId** | **Integer**| The story ID. |
 **firstName** | **String**| Filter by creator first name (e.g. brian). | [optional]
 **middleName** | **String**| Filter by creator middle name (e.g. Michael). | [optional]
 **lastName** | **String**| Filter by creator last name (e.g. Bendis). | [optional]
 **suffix** | **String**| Filter by suffix or honorific (e.g. Jr., Sr.). | [optional]
 **nameStartsWith** | **String**| Filter by creator names that match critera (e.g. B, St L). | [optional]
 **firstNameStartsWith** | **String**| Filter by creator first names that match critera (e.g. B, St L). | [optional]
 **middleNameStartsWith** | **String**| Filter by creator middle names that match critera (e.g. Mi). | [optional]
 **lastNameStartsWith** | **String**| Filter by creator last names that match critera (e.g. Ben). | [optional]
 **modifiedSince** | **LocalDate**| Return only creators which have been modified since the specified date. | [optional]
 **comics** | [**List&lt;Integer&gt;**](Integer.md)| Return only creators who worked on in the specified comics (accepts a comma-separated list of ids). | [optional]
 **series** | [**List&lt;Integer&gt;**](Integer.md)| Return only creators who worked on the specified series (accepts a comma-separated list of ids). | [optional]
 **events** | [**List&lt;Integer&gt;**](Integer.md)| Return only creators who worked on comics that took place in the specified events (accepts a comma-separated list of ids). | [optional]
 **orderBy** | [**List&lt;String&gt;**](String.md)| Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed. | [optional]
 **limit** | **Integer**| Limit the result set to the specified number of resources. | [optional]
 **offset** | **Integer**| Skip the specified number of resources in the result set. | [optional]

### Return type

[**CreatorDataWrapper**](CreatorDataWrapper.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getCreatorEventsCollection"></a>
# **getCreatorEventsCollection**
> EventDataWrapper getCreatorEventsCollection(creatorId, name, nameStartsWith, modifiedSince, characters, series, comics, stories, orderBy, limit, offset)

Fetches lists of events filtered by a creator id.

Fetches lists of events featuring the work of a specific creator with optional filters. See notes on individual parameters below.

### Example
```java
// Import classes:
//import com.marvel.ApiException;
//import com.marvel.api.PublicApi;


PublicApi apiInstance = new PublicApi();
Integer creatorId = 56; // Integer | The creator ID.
String name = "name_example"; // String | Filter the event list by name.
String nameStartsWith = "nameStartsWith_example"; // String | Return events with names that begin with the specified string (e.g. Sp).
LocalDate modifiedSince = new LocalDate(); // LocalDate | Return only events which have been modified since the specified date.
List<Integer> characters = Arrays.asList(56); // List<Integer> | Return only events which feature the specified characters (accepts a comma-separated list of ids).
List<Integer> series = Arrays.asList(56); // List<Integer> | Return only events which are part of the specified series (accepts a comma-separated list of ids).
List<Integer> comics = Arrays.asList(56); // List<Integer> | Return only events which take place in the specified comics (accepts a comma-separated list of ids).
List<Integer> stories = Arrays.asList(56); // List<Integer> | Return only events which contain the specified stories (accepts a comma-separated list of ids).
List<String> orderBy = Arrays.asList("orderBy_example"); // List<String> | Order the result set by a field or fields. Add a \"-\" to the value sort in descending order. Multiple values are given priority in the order in which they are passed.
Integer limit = 56; // Integer | Limit the result set to the specified number of resources.
Integer offset = 56; // Integer | Skip the specified number of resources in the result set.
try {
    EventDataWrapper result = apiInstance.getCreatorEventsCollection(creatorId, name, nameStartsWith, modifiedSince, characters, series, comics, stories, orderBy, limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApi#getCreatorEventsCollection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **creatorId** | **Integer**| The creator ID. |
 **name** | **String**| Filter the event list by name. | [optional]
 **nameStartsWith** | **String**| Return events with names that begin with the specified string (e.g. Sp). | [optional]
 **modifiedSince** | **LocalDate**| Return only events which have been modified since the specified date. | [optional]
 **characters** | [**List&lt;Integer&gt;**](Integer.md)| Return only events which feature the specified characters (accepts a comma-separated list of ids). | [optional]
 **series** | [**List&lt;Integer&gt;**](Integer.md)| Return only events which are part of the specified series (accepts a comma-separated list of ids). | [optional]
 **comics** | [**List&lt;Integer&gt;**](Integer.md)| Return only events which take place in the specified comics (accepts a comma-separated list of ids). | [optional]
 **stories** | [**List&lt;Integer&gt;**](Integer.md)| Return only events which contain the specified stories (accepts a comma-separated list of ids). | [optional]
 **orderBy** | [**List&lt;String&gt;**](String.md)| Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed. | [optional]
 **limit** | **Integer**| Limit the result set to the specified number of resources. | [optional]
 **offset** | **Integer**| Skip the specified number of resources in the result set. | [optional]

### Return type

[**EventDataWrapper**](EventDataWrapper.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getCreatorIndividual"></a>
# **getCreatorIndividual**
> CreatorDataWrapper getCreatorIndividual(creatorId)

Fetches a single creator by id.

This method fetches a single creator resource.  It is the canonical URI for any creator resource provided by the API.

### Example
```java
// Import classes:
//import com.marvel.ApiException;
//import com.marvel.api.PublicApi;


PublicApi apiInstance = new PublicApi();
Integer creatorId = 56; // Integer | A single creator id.
try {
    CreatorDataWrapper result = apiInstance.getCreatorIndividual(creatorId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApi#getCreatorIndividual");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **creatorId** | **Integer**| A single creator id. |

### Return type

[**CreatorDataWrapper**](CreatorDataWrapper.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getCreatorSeriesCollection"></a>
# **getCreatorSeriesCollection**
> SeriesDataWrapper getCreatorSeriesCollection(creatorId, title, titleStartsWith, startYear, modifiedSince, comics, stories, events, characters, seriesType, contains, orderBy, limit, offset)

Fetches lists of series filtered by a creator id.

Fetches lists of comic series in which a specific creator&#39;s work appears, with optional filters. See notes on individual parameters below.

### Example
```java
// Import classes:
//import com.marvel.ApiException;
//import com.marvel.api.PublicApi;


PublicApi apiInstance = new PublicApi();
Integer creatorId = 56; // Integer | The creator ID.
String title = "title_example"; // String | Filter by series title.
String titleStartsWith = "titleStartsWith_example"; // String | Return series with titles that begin with the specified string (e.g. Sp).
Integer startYear = 56; // Integer | Return only series matching the specified start year.
LocalDate modifiedSince = new LocalDate(); // LocalDate | Return only series which have been modified since the specified date.
List<Integer> comics = Arrays.asList(56); // List<Integer> | Return only series which contain the specified comics (accepts a comma-separated list of ids).
List<Integer> stories = Arrays.asList(56); // List<Integer> | Return only series which contain the specified stories (accepts a comma-separated list of ids).
List<Integer> events = Arrays.asList(56); // List<Integer> | Return only series which have comics that take place during the specified events (accepts a comma-separated list of ids).
List<Integer> characters = Arrays.asList(56); // List<Integer> | Return only series which feature the specified characters (accepts a comma-separated list of ids).
String seriesType = "seriesType_example"; // String | Filter the series by publication frequency type.
List<String> contains = Arrays.asList("contains_example"); // List<String> | Return only series containing one or more comics with the specified format.
List<String> orderBy = Arrays.asList("orderBy_example"); // List<String> | Order the result set by a field or fields. Add a \"-\" to the value sort in descending order. Multiple values are given priority in the order in which they are passed.
Integer limit = 56; // Integer | Limit the result set to the specified number of resources.
Integer offset = 56; // Integer | Skip the specified number of resources in the result set.
try {
    SeriesDataWrapper result = apiInstance.getCreatorSeriesCollection(creatorId, title, titleStartsWith, startYear, modifiedSince, comics, stories, events, characters, seriesType, contains, orderBy, limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApi#getCreatorSeriesCollection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **creatorId** | **Integer**| The creator ID. |
 **title** | **String**| Filter by series title. | [optional]
 **titleStartsWith** | **String**| Return series with titles that begin with the specified string (e.g. Sp). | [optional]
 **startYear** | **Integer**| Return only series matching the specified start year. | [optional]
 **modifiedSince** | **LocalDate**| Return only series which have been modified since the specified date. | [optional]
 **comics** | [**List&lt;Integer&gt;**](Integer.md)| Return only series which contain the specified comics (accepts a comma-separated list of ids). | [optional]
 **stories** | [**List&lt;Integer&gt;**](Integer.md)| Return only series which contain the specified stories (accepts a comma-separated list of ids). | [optional]
 **events** | [**List&lt;Integer&gt;**](Integer.md)| Return only series which have comics that take place during the specified events (accepts a comma-separated list of ids). | [optional]
 **characters** | [**List&lt;Integer&gt;**](Integer.md)| Return only series which feature the specified characters (accepts a comma-separated list of ids). | [optional]
 **seriesType** | **String**| Filter the series by publication frequency type. | [optional]
 **contains** | [**List&lt;String&gt;**](String.md)| Return only series containing one or more comics with the specified format. | [optional]
 **orderBy** | [**List&lt;String&gt;**](String.md)| Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed. | [optional]
 **limit** | **Integer**| Limit the result set to the specified number of resources. | [optional]
 **offset** | **Integer**| Skip the specified number of resources in the result set. | [optional]

### Return type

[**SeriesDataWrapper**](SeriesDataWrapper.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getCreatorStoryCollection"></a>
# **getCreatorStoryCollection**
> StoryDataWrapper getCreatorStoryCollection(creatorId, modifiedSince, comics, series, events, characters, orderBy, limit, offset)

Fetches lists of stories filtered by a creator id.

Fetches lists of comic stories by a specific creator with optional filters. See notes on individual parameters below.

### Example
```java
// Import classes:
//import com.marvel.ApiException;
//import com.marvel.api.PublicApi;


PublicApi apiInstance = new PublicApi();
Integer creatorId = 56; // Integer | The ID of the creator.
LocalDate modifiedSince = new LocalDate(); // LocalDate | Return only stories which have been modified since the specified date.
List<Integer> comics = Arrays.asList(56); // List<Integer> | Return only stories contained in the specified comics (accepts a comma-separated list of ids).
List<Integer> series = Arrays.asList(56); // List<Integer> | Return only stories contained the specified series (accepts a comma-separated list of ids).
List<Integer> events = Arrays.asList(56); // List<Integer> | Return only stories which take place during the specified events (accepts a comma-separated list of ids).
List<Integer> characters = Arrays.asList(56); // List<Integer> | Return only stories which feature the specified characters (accepts a comma-separated list of ids).
List<String> orderBy = Arrays.asList("orderBy_example"); // List<String> | Order the result set by a field or fields. Add a \"-\" to the value sort in descending order. Multiple values are given priority in the order in which they are passed.
Integer limit = 56; // Integer | Limit the result set to the specified number of resources.
Integer offset = 56; // Integer | Skip the specified number of resources in the result set.
try {
    StoryDataWrapper result = apiInstance.getCreatorStoryCollection(creatorId, modifiedSince, comics, series, events, characters, orderBy, limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApi#getCreatorStoryCollection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **creatorId** | **Integer**| The ID of the creator. |
 **modifiedSince** | **LocalDate**| Return only stories which have been modified since the specified date. | [optional]
 **comics** | [**List&lt;Integer&gt;**](Integer.md)| Return only stories contained in the specified comics (accepts a comma-separated list of ids). | [optional]
 **series** | [**List&lt;Integer&gt;**](Integer.md)| Return only stories contained the specified series (accepts a comma-separated list of ids). | [optional]
 **events** | [**List&lt;Integer&gt;**](Integer.md)| Return only stories which take place during the specified events (accepts a comma-separated list of ids). | [optional]
 **characters** | [**List&lt;Integer&gt;**](Integer.md)| Return only stories which feature the specified characters (accepts a comma-separated list of ids). | [optional]
 **orderBy** | [**List&lt;String&gt;**](String.md)| Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed. | [optional]
 **limit** | **Integer**| Limit the result set to the specified number of resources. | [optional]
 **offset** | **Integer**| Skip the specified number of resources in the result set. | [optional]

### Return type

[**StoryDataWrapper**](StoryDataWrapper.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getEventCharacterCollection"></a>
# **getEventCharacterCollection**
> CharacterDataWrapper getEventCharacterCollection(eventId, name, nameStartsWith, modifiedSince, comics, series, stories, orderBy, limit, offset)

Fetches lists of characters filtered by an event id.

Fetches lists of characters which appear in a specific event, with optional filters. See notes on individual parameters below.

### Example
```java
// Import classes:
//import com.marvel.ApiException;
//import com.marvel.api.PublicApi;


PublicApi apiInstance = new PublicApi();
Integer eventId = 56; // Integer | The event ID
String name = "name_example"; // String | Return only characters matching the specified full character name (e.g. Spider-Man).
String nameStartsWith = "nameStartsWith_example"; // String | Return characters with names that begin with the specified string (e.g. Sp).
LocalDate modifiedSince = new LocalDate(); // LocalDate | Return only characters which have been modified since the specified date.
List<Integer> comics = Arrays.asList(56); // List<Integer> | Return only characters which appear in the specified comics (accepts a comma-separated list of ids).
List<Integer> series = Arrays.asList(56); // List<Integer> | Return only characters which appear the specified series (accepts a comma-separated list of ids).
List<Integer> stories = Arrays.asList(56); // List<Integer> | Return only characters which appear the specified stories (accepts a comma-separated list of ids).
List<String> orderBy = Arrays.asList("orderBy_example"); // List<String> | Order the result set by a field or fields. Add a \"-\" to the value sort in descending order. Multiple values are given priority in the order in which they are passed.
Integer limit = 56; // Integer | Limit the result set to the specified number of resources.
Integer offset = 56; // Integer | Skip the specified number of resources in the result set.
try {
    CharacterDataWrapper result = apiInstance.getEventCharacterCollection(eventId, name, nameStartsWith, modifiedSince, comics, series, stories, orderBy, limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApi#getEventCharacterCollection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventId** | **Integer**| The event ID |
 **name** | **String**| Return only characters matching the specified full character name (e.g. Spider-Man). | [optional]
 **nameStartsWith** | **String**| Return characters with names that begin with the specified string (e.g. Sp). | [optional]
 **modifiedSince** | **LocalDate**| Return only characters which have been modified since the specified date. | [optional]
 **comics** | [**List&lt;Integer&gt;**](Integer.md)| Return only characters which appear in the specified comics (accepts a comma-separated list of ids). | [optional]
 **series** | [**List&lt;Integer&gt;**](Integer.md)| Return only characters which appear the specified series (accepts a comma-separated list of ids). | [optional]
 **stories** | [**List&lt;Integer&gt;**](Integer.md)| Return only characters which appear the specified stories (accepts a comma-separated list of ids). | [optional]
 **orderBy** | [**List&lt;String&gt;**](String.md)| Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed. | [optional]
 **limit** | **Integer**| Limit the result set to the specified number of resources. | [optional]
 **offset** | **Integer**| Skip the specified number of resources in the result set. | [optional]

### Return type

[**CharacterDataWrapper**](CharacterDataWrapper.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getEventIndividual"></a>
# **getEventIndividual**
> EventDataWrapper getEventIndividual(eventId)

Fetches a single event by id.

This method fetches a single event resource.  It is the canonical URI for any event resource provided by the API.

### Example
```java
// Import classes:
//import com.marvel.ApiException;
//import com.marvel.api.PublicApi;


PublicApi apiInstance = new PublicApi();
Integer eventId = 56; // Integer | A single event.
try {
    EventDataWrapper result = apiInstance.getEventIndividual(eventId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApi#getEventIndividual");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventId** | **Integer**| A single event. |

### Return type

[**EventDataWrapper**](EventDataWrapper.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getEventSeriesCollection"></a>
# **getEventSeriesCollection**
> SeriesDataWrapper getEventSeriesCollection(eventId, title, titleStartsWith, startYear, modifiedSince, comics, stories, creators, characters, seriesType, contains, orderBy, limit, offset)

Fetches lists of series filtered by an event id.

Fetches lists of comic series in which a specific event takes place, with optional filters. See notes on individual parameters below.

### Example
```java
// Import classes:
//import com.marvel.ApiException;
//import com.marvel.api.PublicApi;


PublicApi apiInstance = new PublicApi();
Integer eventId = 56; // Integer | The event ID.
String title = "title_example"; // String | Filter by series title.
String titleStartsWith = "titleStartsWith_example"; // String | Return series with titles that begin with the specified string (e.g. Sp).
Integer startYear = 56; // Integer | Return only series matching the specified start year.
LocalDate modifiedSince = new LocalDate(); // LocalDate | Return only series which have been modified since the specified date.
List<Integer> comics = Arrays.asList(56); // List<Integer> | Return only series which contain the specified comics (accepts a comma-separated list of ids).
List<Integer> stories = Arrays.asList(56); // List<Integer> | Return only series which contain the specified stories (accepts a comma-separated list of ids).
List<Integer> creators = Arrays.asList(56); // List<Integer> | Return only series which feature work by the specified creators (accepts a comma-separated list of ids).
List<Integer> characters = Arrays.asList(56); // List<Integer> | Return only series which feature the specified characters (accepts a comma-separated list of ids).
String seriesType = "seriesType_example"; // String | Filter the series by publication frequency type.
List<String> contains = Arrays.asList("contains_example"); // List<String> | Return only series containing one or more comics with the specified format.
List<String> orderBy = Arrays.asList("orderBy_example"); // List<String> | Order the result set by a field or fields. Add a \"-\" to the value sort in descending order. Multiple values are given priority in the order in which they are passed.
Integer limit = 56; // Integer | Limit the result set to the specified number of resources.
Integer offset = 56; // Integer | Skip the specified number of resources in the result set.
try {
    SeriesDataWrapper result = apiInstance.getEventSeriesCollection(eventId, title, titleStartsWith, startYear, modifiedSince, comics, stories, creators, characters, seriesType, contains, orderBy, limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApi#getEventSeriesCollection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventId** | **Integer**| The event ID. |
 **title** | **String**| Filter by series title. | [optional]
 **titleStartsWith** | **String**| Return series with titles that begin with the specified string (e.g. Sp). | [optional]
 **startYear** | **Integer**| Return only series matching the specified start year. | [optional]
 **modifiedSince** | **LocalDate**| Return only series which have been modified since the specified date. | [optional]
 **comics** | [**List&lt;Integer&gt;**](Integer.md)| Return only series which contain the specified comics (accepts a comma-separated list of ids). | [optional]
 **stories** | [**List&lt;Integer&gt;**](Integer.md)| Return only series which contain the specified stories (accepts a comma-separated list of ids). | [optional]
 **creators** | [**List&lt;Integer&gt;**](Integer.md)| Return only series which feature work by the specified creators (accepts a comma-separated list of ids). | [optional]
 **characters** | [**List&lt;Integer&gt;**](Integer.md)| Return only series which feature the specified characters (accepts a comma-separated list of ids). | [optional]
 **seriesType** | **String**| Filter the series by publication frequency type. | [optional]
 **contains** | [**List&lt;String&gt;**](String.md)| Return only series containing one or more comics with the specified format. | [optional]
 **orderBy** | [**List&lt;String&gt;**](String.md)| Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed. | [optional]
 **limit** | **Integer**| Limit the result set to the specified number of resources. | [optional]
 **offset** | **Integer**| Skip the specified number of resources in the result set. | [optional]

### Return type

[**SeriesDataWrapper**](SeriesDataWrapper.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getEventStoryCollection"></a>
# **getEventStoryCollection**
> StoryDataWrapper getEventStoryCollection(eventId, modifiedSince, comics, series, creators, characters, orderBy, limit, offset)

Fetches lists of stories filtered by an event id.

Fetches lists of comic stories from a specific event, with optional filters. See notes on individual parameters below.

### Example
```java
// Import classes:
//import com.marvel.ApiException;
//import com.marvel.api.PublicApi;


PublicApi apiInstance = new PublicApi();
Integer eventId = 56; // Integer | The ID of the event.
LocalDate modifiedSince = new LocalDate(); // LocalDate | Return only stories which have been modified since the specified date.
List<Integer> comics = Arrays.asList(56); // List<Integer> | Return only stories contained in the specified (accepts a comma-separated list of ids).
List<Integer> series = Arrays.asList(56); // List<Integer> | Return only stories contained the specified series (accepts a comma-separated list of ids).
List<Integer> creators = Arrays.asList(56); // List<Integer> | Return only stories which feature work by the specified creators (accepts a comma-separated list of ids).
List<Integer> characters = Arrays.asList(56); // List<Integer> | Return only stories which feature the specified characters (accepts a comma-separated list of ids).
List<String> orderBy = Arrays.asList("orderBy_example"); // List<String> | Order the result set by a field or fields. Add a \"-\" to the value sort in descending order. Multiple values are given priority in the order in which they are passed.
Integer limit = 56; // Integer | Limit the result set to the specified number of resources.
Integer offset = 56; // Integer | Skip the specified number of resources in the result set.
try {
    StoryDataWrapper result = apiInstance.getEventStoryCollection(eventId, modifiedSince, comics, series, creators, characters, orderBy, limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApi#getEventStoryCollection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventId** | **Integer**| The ID of the event. |
 **modifiedSince** | **LocalDate**| Return only stories which have been modified since the specified date. | [optional]
 **comics** | [**List&lt;Integer&gt;**](Integer.md)| Return only stories contained in the specified (accepts a comma-separated list of ids). | [optional]
 **series** | [**List&lt;Integer&gt;**](Integer.md)| Return only stories contained the specified series (accepts a comma-separated list of ids). | [optional]
 **creators** | [**List&lt;Integer&gt;**](Integer.md)| Return only stories which feature work by the specified creators (accepts a comma-separated list of ids). | [optional]
 **characters** | [**List&lt;Integer&gt;**](Integer.md)| Return only stories which feature the specified characters (accepts a comma-separated list of ids). | [optional]
 **orderBy** | [**List&lt;String&gt;**](String.md)| Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed. | [optional]
 **limit** | **Integer**| Limit the result set to the specified number of resources. | [optional]
 **offset** | **Integer**| Skip the specified number of resources in the result set. | [optional]

### Return type

[**StoryDataWrapper**](StoryDataWrapper.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getEventsCollection"></a>
# **getEventsCollection**
> EventDataWrapper getEventsCollection(name, nameStartsWith, modifiedSince, creators, characters, series, comics, stories, orderBy, limit, offset)

Fetches lists of events.

Fetches lists of events with optional filters. See notes on individual parameters below.

### Example
```java
// Import classes:
//import com.marvel.ApiException;
//import com.marvel.api.PublicApi;


PublicApi apiInstance = new PublicApi();
String name = "name_example"; // String | Return only events which match the specified name.
String nameStartsWith = "nameStartsWith_example"; // String | Return events with names that begin with the specified string (e.g. Sp).
LocalDate modifiedSince = new LocalDate(); // LocalDate | Return only events which have been modified since the specified date.
List<Integer> creators = Arrays.asList(56); // List<Integer> | Return only events which feature work by the specified creators (accepts a comma-separated list of ids).
List<Integer> characters = Arrays.asList(56); // List<Integer> | Return only events which feature the specified characters (accepts a comma-separated list of ids).
List<Integer> series = Arrays.asList(56); // List<Integer> | Return only events which are part of the specified series (accepts a comma-separated list of ids).
List<Integer> comics = Arrays.asList(56); // List<Integer> | Return only events which take place in the specified comics (accepts a comma-separated list of ids).
List<Integer> stories = Arrays.asList(56); // List<Integer> | Return only events which take place in the specified stories (accepts a comma-separated list of ids).
List<String> orderBy = Arrays.asList("orderBy_example"); // List<String> | Order the result set by a field or fields. Add a \"-\" to the value sort in descending order. Multiple values are given priority in the order in which they are passed.
Integer limit = 56; // Integer | Limit the result set to the specified number of resources.
Integer offset = 56; // Integer | Skip the specified number of resources in the result set.
try {
    EventDataWrapper result = apiInstance.getEventsCollection(name, nameStartsWith, modifiedSince, creators, characters, series, comics, stories, orderBy, limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApi#getEventsCollection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Return only events which match the specified name. | [optional]
 **nameStartsWith** | **String**| Return events with names that begin with the specified string (e.g. Sp). | [optional]
 **modifiedSince** | **LocalDate**| Return only events which have been modified since the specified date. | [optional]
 **creators** | [**List&lt;Integer&gt;**](Integer.md)| Return only events which feature work by the specified creators (accepts a comma-separated list of ids). | [optional]
 **characters** | [**List&lt;Integer&gt;**](Integer.md)| Return only events which feature the specified characters (accepts a comma-separated list of ids). | [optional]
 **series** | [**List&lt;Integer&gt;**](Integer.md)| Return only events which are part of the specified series (accepts a comma-separated list of ids). | [optional]
 **comics** | [**List&lt;Integer&gt;**](Integer.md)| Return only events which take place in the specified comics (accepts a comma-separated list of ids). | [optional]
 **stories** | [**List&lt;Integer&gt;**](Integer.md)| Return only events which take place in the specified stories (accepts a comma-separated list of ids). | [optional]
 **orderBy** | [**List&lt;String&gt;**](String.md)| Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed. | [optional]
 **limit** | **Integer**| Limit the result set to the specified number of resources. | [optional]
 **offset** | **Integer**| Skip the specified number of resources in the result set. | [optional]

### Return type

[**EventDataWrapper**](EventDataWrapper.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getEventsCollection_0"></a>
# **getEventsCollection_0**
> EventDataWrapper getEventsCollection_0(seriesId, name, nameStartsWith, modifiedSince, creators, characters, comics, stories, orderBy, limit, offset)

Fetches lists of events filtered by a series id.

Fetches lists of events which occur in a specific series, with optional filters. See notes on individual parameters below.

### Example
```java
// Import classes:
//import com.marvel.ApiException;
//import com.marvel.api.PublicApi;


PublicApi apiInstance = new PublicApi();
Integer seriesId = 56; // Integer | The series ID.
String name = "name_example"; // String | Filter the event list by name.
String nameStartsWith = "nameStartsWith_example"; // String | Return events with names that begin with the specified string (e.g. Sp).
LocalDate modifiedSince = new LocalDate(); // LocalDate | Return only events which have been modified since the specified date.
List<Integer> creators = Arrays.asList(56); // List<Integer> | Return only events which feature work by the specified creators (accepts a comma-separated list of ids).
List<Integer> characters = Arrays.asList(56); // List<Integer> | Return only events which feature the specified characters (accepts a comma-separated list of ids).
List<Integer> comics = Arrays.asList(56); // List<Integer> | Return only events which take place in the specified comics (accepts a comma-separated list of ids).
List<Integer> stories = Arrays.asList(56); // List<Integer> | Return only events which contain the specified stories (accepts a comma-separated list of ids).
List<String> orderBy = Arrays.asList("orderBy_example"); // List<String> | Order the result set by a field or fields. Add a \"-\" to the value sort in descending order. Multiple values are given priority in the order in which they are passed.
Integer limit = 56; // Integer | Limit the result set to the specified number of resources.
Integer offset = 56; // Integer | Skip the specified number of resources in the result set.
try {
    EventDataWrapper result = apiInstance.getEventsCollection_0(seriesId, name, nameStartsWith, modifiedSince, creators, characters, comics, stories, orderBy, limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApi#getEventsCollection_0");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **seriesId** | **Integer**| The series ID. |
 **name** | **String**| Filter the event list by name. | [optional]
 **nameStartsWith** | **String**| Return events with names that begin with the specified string (e.g. Sp). | [optional]
 **modifiedSince** | **LocalDate**| Return only events which have been modified since the specified date. | [optional]
 **creators** | [**List&lt;Integer&gt;**](Integer.md)| Return only events which feature work by the specified creators (accepts a comma-separated list of ids). | [optional]
 **characters** | [**List&lt;Integer&gt;**](Integer.md)| Return only events which feature the specified characters (accepts a comma-separated list of ids). | [optional]
 **comics** | [**List&lt;Integer&gt;**](Integer.md)| Return only events which take place in the specified comics (accepts a comma-separated list of ids). | [optional]
 **stories** | [**List&lt;Integer&gt;**](Integer.md)| Return only events which contain the specified stories (accepts a comma-separated list of ids). | [optional]
 **orderBy** | [**List&lt;String&gt;**](String.md)| Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed. | [optional]
 **limit** | **Integer**| Limit the result set to the specified number of resources. | [optional]
 **offset** | **Integer**| Skip the specified number of resources in the result set. | [optional]

### Return type

[**EventDataWrapper**](EventDataWrapper.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getEventsCollection_1"></a>
# **getEventsCollection_1**
> EventDataWrapper getEventsCollection_1(storyId, name, nameStartsWith, modifiedSince, creators, characters, series, comics, orderBy, limit, offset)

Fetches lists of events filtered by a story id.

Fetches lists of events in which a specific story appears, with optional filters. See notes on individual parameters below.

### Example
```java
// Import classes:
//import com.marvel.ApiException;
//import com.marvel.api.PublicApi;


PublicApi apiInstance = new PublicApi();
Integer storyId = 56; // Integer | The story ID.
String name = "name_example"; // String | Filter the event list by name.
String nameStartsWith = "nameStartsWith_example"; // String | Return events with names that begin with the specified string (e.g. Sp).
LocalDate modifiedSince = new LocalDate(); // LocalDate | Return only events which have been modified since the specified date.
List<Integer> creators = Arrays.asList(56); // List<Integer> | Return only events which feature work by the specified creators (accepts a comma-separated list of ids).
List<Integer> characters = Arrays.asList(56); // List<Integer> | Return only events which feature the specified characters (accepts a comma-separated list of ids).
List<Integer> series = Arrays.asList(56); // List<Integer> | Return only events which are part of the specified series (accepts a comma-separated list of ids).
List<Integer> comics = Arrays.asList(56); // List<Integer> | Return only events which take place in the specified comics (accepts a comma-separated list of ids).
List<String> orderBy = Arrays.asList("orderBy_example"); // List<String> | Order the result set by a field or fields. Add a \"-\" to the value sort in descending order. Multiple values are given priority in the order in which they are passed.
Integer limit = 56; // Integer | Limit the result set to the specified number of resources.
Integer offset = 56; // Integer | Skip the specified number of resources in the result set.
try {
    EventDataWrapper result = apiInstance.getEventsCollection_1(storyId, name, nameStartsWith, modifiedSince, creators, characters, series, comics, orderBy, limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApi#getEventsCollection_1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storyId** | **Integer**| The story ID. |
 **name** | **String**| Filter the event list by name. | [optional]
 **nameStartsWith** | **String**| Return events with names that begin with the specified string (e.g. Sp). | [optional]
 **modifiedSince** | **LocalDate**| Return only events which have been modified since the specified date. | [optional]
 **creators** | [**List&lt;Integer&gt;**](Integer.md)| Return only events which feature work by the specified creators (accepts a comma-separated list of ids). | [optional]
 **characters** | [**List&lt;Integer&gt;**](Integer.md)| Return only events which feature the specified characters (accepts a comma-separated list of ids). | [optional]
 **series** | [**List&lt;Integer&gt;**](Integer.md)| Return only events which are part of the specified series (accepts a comma-separated list of ids). | [optional]
 **comics** | [**List&lt;Integer&gt;**](Integer.md)| Return only events which take place in the specified comics (accepts a comma-separated list of ids). | [optional]
 **orderBy** | [**List&lt;String&gt;**](String.md)| Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed. | [optional]
 **limit** | **Integer**| Limit the result set to the specified number of resources. | [optional]
 **offset** | **Integer**| Skip the specified number of resources in the result set. | [optional]

### Return type

[**EventDataWrapper**](EventDataWrapper.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getIssueEventsCollection"></a>
# **getIssueEventsCollection**
> EventDataWrapper getIssueEventsCollection(comicId, name, nameStartsWith, modifiedSince, creators, characters, series, stories, orderBy, limit, offset)

Fetches lists of events filtered by a comic id.

Fetches lists of events in which a specific comic appears, with optional filters. See notes on individual parameters below.

### Example
```java
// Import classes:
//import com.marvel.ApiException;
//import com.marvel.api.PublicApi;


PublicApi apiInstance = new PublicApi();
Integer comicId = 56; // Integer | The comic ID.
String name = "name_example"; // String | Filter the event list by name.
String nameStartsWith = "nameStartsWith_example"; // String | Return events with names that begin with the specified string (e.g. Sp).
LocalDate modifiedSince = new LocalDate(); // LocalDate | Return only events which have been modified since the specified date.
List<Integer> creators = Arrays.asList(56); // List<Integer> | Return only events which feature work by the specified creators (accepts a comma-separated list of ids).
List<Integer> characters = Arrays.asList(56); // List<Integer> | Return only events which feature the specified characters (accepts a comma-separated list of ids).
List<Integer> series = Arrays.asList(56); // List<Integer> | Return only events which are part of the specified series (accepts a comma-separated list of ids).
List<Integer> stories = Arrays.asList(56); // List<Integer> | Return only events which contain the specified stories (accepts a comma-separated list of ids).
List<String> orderBy = Arrays.asList("orderBy_example"); // List<String> | Order the result set by a field or fields. Add a \"-\" to the value sort in descending order. Multiple values are given priority in the order in which they are passed.
Integer limit = 56; // Integer | Limit the result set to the specified number of resources.
Integer offset = 56; // Integer | Skip the specified number of resources in the result set.
try {
    EventDataWrapper result = apiInstance.getIssueEventsCollection(comicId, name, nameStartsWith, modifiedSince, creators, characters, series, stories, orderBy, limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApi#getIssueEventsCollection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **comicId** | **Integer**| The comic ID. |
 **name** | **String**| Filter the event list by name. | [optional]
 **nameStartsWith** | **String**| Return events with names that begin with the specified string (e.g. Sp). | [optional]
 **modifiedSince** | **LocalDate**| Return only events which have been modified since the specified date. | [optional]
 **creators** | [**List&lt;Integer&gt;**](Integer.md)| Return only events which feature work by the specified creators (accepts a comma-separated list of ids). | [optional]
 **characters** | [**List&lt;Integer&gt;**](Integer.md)| Return only events which feature the specified characters (accepts a comma-separated list of ids). | [optional]
 **series** | [**List&lt;Integer&gt;**](Integer.md)| Return only events which are part of the specified series (accepts a comma-separated list of ids). | [optional]
 **stories** | [**List&lt;Integer&gt;**](Integer.md)| Return only events which contain the specified stories (accepts a comma-separated list of ids). | [optional]
 **orderBy** | [**List&lt;String&gt;**](String.md)| Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed. | [optional]
 **limit** | **Integer**| Limit the result set to the specified number of resources. | [optional]
 **offset** | **Integer**| Skip the specified number of resources in the result set. | [optional]

### Return type

[**EventDataWrapper**](EventDataWrapper.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getSeriesCharacterWrapper"></a>
# **getSeriesCharacterWrapper**
> CharacterDataWrapper getSeriesCharacterWrapper(seriesId, name, nameStartsWith, modifiedSince, comics, events, stories, orderBy, limit, offset)

Fetches lists of characters filtered by a series id.

Fetches lists of characters which appear in specific series, with optional filters. See notes on individual parameters below.

### Example
```java
// Import classes:
//import com.marvel.ApiException;
//import com.marvel.api.PublicApi;


PublicApi apiInstance = new PublicApi();
Integer seriesId = 56; // Integer | The series id.
String name = "name_example"; // String | Return only characters matching the specified full character name (e.g. Spider-Man).
String nameStartsWith = "nameStartsWith_example"; // String | Return characters with names that begin with the specified string (e.g. Sp).
LocalDate modifiedSince = new LocalDate(); // LocalDate | Return only characters which have been modified since the specified date.
List<Integer> comics = Arrays.asList(56); // List<Integer> | Return only characters which appear in the specified comics (accepts a comma-separated list of ids).
List<Integer> events = Arrays.asList(56); // List<Integer> | Return only characters which appear comics that took place in the specified events (accepts a comma-separated list of ids).
List<Integer> stories = Arrays.asList(56); // List<Integer> | Return only characters which appear the specified stories (accepts a comma-separated list of ids).
List<String> orderBy = Arrays.asList("orderBy_example"); // List<String> | Order the result set by a field or fields. Add a \"-\" to the value sort in descending order. Multiple values are given priority in the order in which they are passed.
Integer limit = 56; // Integer | Limit the result set to the specified number of resources.
Integer offset = 56; // Integer | Skip the specified number of resources in the result set.
try {
    CharacterDataWrapper result = apiInstance.getSeriesCharacterWrapper(seriesId, name, nameStartsWith, modifiedSince, comics, events, stories, orderBy, limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApi#getSeriesCharacterWrapper");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **seriesId** | **Integer**| The series id. |
 **name** | **String**| Return only characters matching the specified full character name (e.g. Spider-Man). | [optional]
 **nameStartsWith** | **String**| Return characters with names that begin with the specified string (e.g. Sp). | [optional]
 **modifiedSince** | **LocalDate**| Return only characters which have been modified since the specified date. | [optional]
 **comics** | [**List&lt;Integer&gt;**](Integer.md)| Return only characters which appear in the specified comics (accepts a comma-separated list of ids). | [optional]
 **events** | [**List&lt;Integer&gt;**](Integer.md)| Return only characters which appear comics that took place in the specified events (accepts a comma-separated list of ids). | [optional]
 **stories** | [**List&lt;Integer&gt;**](Integer.md)| Return only characters which appear the specified stories (accepts a comma-separated list of ids). | [optional]
 **orderBy** | [**List&lt;String&gt;**](String.md)| Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed. | [optional]
 **limit** | **Integer**| Limit the result set to the specified number of resources. | [optional]
 **offset** | **Integer**| Skip the specified number of resources in the result set. | [optional]

### Return type

[**CharacterDataWrapper**](CharacterDataWrapper.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getSeriesCollection"></a>
# **getSeriesCollection**
> SeriesDataWrapper getSeriesCollection(title, titleStartsWith, startYear, modifiedSince, comics, stories, events, creators, characters, seriesType, contains, orderBy, limit, offset)

Fetches lists of series.

Fetches lists of comic series with optional filters. See notes on individual parameters below.

### Example
```java
// Import classes:
//import com.marvel.ApiException;
//import com.marvel.api.PublicApi;


PublicApi apiInstance = new PublicApi();
String title = "title_example"; // String | Return only series matching the specified title.
String titleStartsWith = "titleStartsWith_example"; // String | Return series with titles that begin with the specified string (e.g. Sp).
Integer startYear = 56; // Integer | Return only series matching the specified start year.
LocalDate modifiedSince = new LocalDate(); // LocalDate | Return only series which have been modified since the specified date.
List<Integer> comics = Arrays.asList(56); // List<Integer> | Return only series which contain the specified comics (accepts a comma-separated list of ids).
List<Integer> stories = Arrays.asList(56); // List<Integer> | Return only series which contain the specified stories (accepts a comma-separated list of ids).
List<Integer> events = Arrays.asList(56); // List<Integer> | Return only series which have comics that take place during the specified events (accepts a comma-separated list of ids).
List<Integer> creators = Arrays.asList(56); // List<Integer> | Return only series which feature work by the specified creators (accepts a comma-separated list of ids).
List<Integer> characters = Arrays.asList(56); // List<Integer> | Return only series which feature the specified characters (accepts a comma-separated list of ids).
String seriesType = "seriesType_example"; // String | Filter the series by publication frequency type.
List<String> contains = Arrays.asList("contains_example"); // List<String> | Return only series containing one or more comics with the specified format.
List<String> orderBy = Arrays.asList("orderBy_example"); // List<String> | Order the result set by a field or fields. Add a \"-\" to the value sort in descending order. Multiple values are given priority in the order in which they are passed.
Integer limit = 56; // Integer | Limit the result set to the specified number of resources.
Integer offset = 56; // Integer | Skip the specified number of resources in the result set.
try {
    SeriesDataWrapper result = apiInstance.getSeriesCollection(title, titleStartsWith, startYear, modifiedSince, comics, stories, events, creators, characters, seriesType, contains, orderBy, limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApi#getSeriesCollection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **title** | **String**| Return only series matching the specified title. | [optional]
 **titleStartsWith** | **String**| Return series with titles that begin with the specified string (e.g. Sp). | [optional]
 **startYear** | **Integer**| Return only series matching the specified start year. | [optional]
 **modifiedSince** | **LocalDate**| Return only series which have been modified since the specified date. | [optional]
 **comics** | [**List&lt;Integer&gt;**](Integer.md)| Return only series which contain the specified comics (accepts a comma-separated list of ids). | [optional]
 **stories** | [**List&lt;Integer&gt;**](Integer.md)| Return only series which contain the specified stories (accepts a comma-separated list of ids). | [optional]
 **events** | [**List&lt;Integer&gt;**](Integer.md)| Return only series which have comics that take place during the specified events (accepts a comma-separated list of ids). | [optional]
 **creators** | [**List&lt;Integer&gt;**](Integer.md)| Return only series which feature work by the specified creators (accepts a comma-separated list of ids). | [optional]
 **characters** | [**List&lt;Integer&gt;**](Integer.md)| Return only series which feature the specified characters (accepts a comma-separated list of ids). | [optional]
 **seriesType** | **String**| Filter the series by publication frequency type. | [optional]
 **contains** | [**List&lt;String&gt;**](String.md)| Return only series containing one or more comics with the specified format. | [optional]
 **orderBy** | [**List&lt;String&gt;**](String.md)| Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed. | [optional]
 **limit** | **Integer**| Limit the result set to the specified number of resources. | [optional]
 **offset** | **Integer**| Skip the specified number of resources in the result set. | [optional]

### Return type

[**SeriesDataWrapper**](SeriesDataWrapper.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getSeriesIndividual"></a>
# **getSeriesIndividual**
> SeriesDataWrapper getSeriesIndividual(seriesId)

Fetches a single comic series by id.

This method fetches a single comic series resource.  It is the canonical URI for any comic series resource provided by the API.

### Example
```java
// Import classes:
//import com.marvel.ApiException;
//import com.marvel.api.PublicApi;


PublicApi apiInstance = new PublicApi();
Integer seriesId = 56; // Integer | Filter by series title.
try {
    SeriesDataWrapper result = apiInstance.getSeriesIndividual(seriesId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApi#getSeriesIndividual");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **seriesId** | **Integer**| Filter by series title. |

### Return type

[**SeriesDataWrapper**](SeriesDataWrapper.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getSeriesStoryCollection"></a>
# **getSeriesStoryCollection**
> StoryDataWrapper getSeriesStoryCollection(seriesId, modifiedSince, comics, events, creators, characters, orderBy, limit, offset)

Fetches lists of stories filtered by a series id.

Fetches lists of comic stories from a specific series with optional filters. See notes on individual parameters below.

### Example
```java
// Import classes:
//import com.marvel.ApiException;
//import com.marvel.api.PublicApi;


PublicApi apiInstance = new PublicApi();
Integer seriesId = 56; // Integer | The series ID.
LocalDate modifiedSince = new LocalDate(); // LocalDate | Return only stories which have been modified since the specified date.
List<Integer> comics = Arrays.asList(56); // List<Integer> | Return only stories contained in the specified (accepts a comma-separated list of ids).
List<Integer> events = Arrays.asList(56); // List<Integer> | Return only stories which take place during the specified events (accepts a comma-separated list of ids).
List<Integer> creators = Arrays.asList(56); // List<Integer> | Return only stories which feature work by the specified creators (accepts a comma-separated list of ids).
List<Integer> characters = Arrays.asList(56); // List<Integer> | Return only stories which feature the specified characters (accepts a comma-separated list of ids).
List<String> orderBy = Arrays.asList("orderBy_example"); // List<String> | Order the result set by a field or fields. Add a \"-\" to the value sort in descending order. Multiple values are given priority in the order in which they are passed.
Integer limit = 56; // Integer | Limit the result set to the specified number of resources.
Integer offset = 56; // Integer | Skip the specified number of resources in the result set.
try {
    StoryDataWrapper result = apiInstance.getSeriesStoryCollection(seriesId, modifiedSince, comics, events, creators, characters, orderBy, limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApi#getSeriesStoryCollection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **seriesId** | **Integer**| The series ID. |
 **modifiedSince** | **LocalDate**| Return only stories which have been modified since the specified date. | [optional]
 **comics** | [**List&lt;Integer&gt;**](Integer.md)| Return only stories contained in the specified (accepts a comma-separated list of ids). | [optional]
 **events** | [**List&lt;Integer&gt;**](Integer.md)| Return only stories which take place during the specified events (accepts a comma-separated list of ids). | [optional]
 **creators** | [**List&lt;Integer&gt;**](Integer.md)| Return only stories which feature work by the specified creators (accepts a comma-separated list of ids). | [optional]
 **characters** | [**List&lt;Integer&gt;**](Integer.md)| Return only stories which feature the specified characters (accepts a comma-separated list of ids). | [optional]
 **orderBy** | [**List&lt;String&gt;**](String.md)| Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed. | [optional]
 **limit** | **Integer**| Limit the result set to the specified number of resources. | [optional]
 **offset** | **Integer**| Skip the specified number of resources in the result set. | [optional]

### Return type

[**StoryDataWrapper**](StoryDataWrapper.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getStoryCollection"></a>
# **getStoryCollection**
> StoryDataWrapper getStoryCollection(modifiedSince, comics, series, events, creators, characters, orderBy, limit, offset)

Fetches lists of stories.

Fetches lists of comic stories with optional filters. See notes on individual parameters below.

### Example
```java
// Import classes:
//import com.marvel.ApiException;
//import com.marvel.api.PublicApi;


PublicApi apiInstance = new PublicApi();
LocalDate modifiedSince = new LocalDate(); // LocalDate | Return only stories which have been modified since the specified date.
List<Integer> comics = Arrays.asList(56); // List<Integer> | Return only stories contained in the specified (accepts a comma-separated list of ids).
List<Integer> series = Arrays.asList(56); // List<Integer> | Return only stories contained the specified series (accepts a comma-separated list of ids).
List<Integer> events = Arrays.asList(56); // List<Integer> | Return only stories which take place during the specified events (accepts a comma-separated list of ids).
List<Integer> creators = Arrays.asList(56); // List<Integer> | Return only stories which feature work by the specified creators (accepts a comma-separated list of ids).
List<Integer> characters = Arrays.asList(56); // List<Integer> | Return only stories which feature the specified characters (accepts a comma-separated list of ids).
List<String> orderBy = Arrays.asList("orderBy_example"); // List<String> | Order the result set by a field or fields. Add a \"-\" to the value sort in descending order. Multiple values are given priority in the order in which they are passed.
Integer limit = 56; // Integer | Limit the result set to the specified number of resources.
Integer offset = 56; // Integer | Skip the specified number of resources in the result set.
try {
    StoryDataWrapper result = apiInstance.getStoryCollection(modifiedSince, comics, series, events, creators, characters, orderBy, limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApi#getStoryCollection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modifiedSince** | **LocalDate**| Return only stories which have been modified since the specified date. | [optional]
 **comics** | [**List&lt;Integer&gt;**](Integer.md)| Return only stories contained in the specified (accepts a comma-separated list of ids). | [optional]
 **series** | [**List&lt;Integer&gt;**](Integer.md)| Return only stories contained the specified series (accepts a comma-separated list of ids). | [optional]
 **events** | [**List&lt;Integer&gt;**](Integer.md)| Return only stories which take place during the specified events (accepts a comma-separated list of ids). | [optional]
 **creators** | [**List&lt;Integer&gt;**](Integer.md)| Return only stories which feature work by the specified creators (accepts a comma-separated list of ids). | [optional]
 **characters** | [**List&lt;Integer&gt;**](Integer.md)| Return only stories which feature the specified characters (accepts a comma-separated list of ids). | [optional]
 **orderBy** | [**List&lt;String&gt;**](String.md)| Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed. | [optional]
 **limit** | **Integer**| Limit the result set to the specified number of resources. | [optional]
 **offset** | **Integer**| Skip the specified number of resources in the result set. | [optional]

### Return type

[**StoryDataWrapper**](StoryDataWrapper.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getStoryIndividual"></a>
# **getStoryIndividual**
> StoryDataWrapper getStoryIndividual(storyId)

Fetches a single comic story by id.

This method fetches a single comic story resource.  It is the canonical URI for any comic story resource provided by the API.

### Example
```java
// Import classes:
//import com.marvel.ApiException;
//import com.marvel.api.PublicApi;


PublicApi apiInstance = new PublicApi();
Integer storyId = 56; // Integer | Filter by story id.
try {
    StoryDataWrapper result = apiInstance.getStoryIndividual(storyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApi#getStoryIndividual");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storyId** | **Integer**| Filter by story id. |

### Return type

[**StoryDataWrapper**](StoryDataWrapper.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getStorySeriesCollection"></a>
# **getStorySeriesCollection**
> SeriesDataWrapper getStorySeriesCollection(storyId, events, title, titleStartsWith, startYear, modifiedSince, comics, creators, characters, seriesType, contains, orderBy, limit, offset)

Fetches lists of series filtered by a story id.

Fetches lists of comic series in which the specified story takes place. See notes on individual parameters below.

### Example
```java
// Import classes:
//import com.marvel.ApiException;
//import com.marvel.api.PublicApi;


PublicApi apiInstance = new PublicApi();
Integer storyId = 56; // Integer | The story ID.
List<Integer> events = Arrays.asList(56); // List<Integer> | Return only series which have comics that take place during the specified events (accepts a comma-separated list of ids).
String title = "title_example"; // String | Filter by series title.
String titleStartsWith = "titleStartsWith_example"; // String | Return series with titles that begin with the specified string (e.g. Sp).
Integer startYear = 56; // Integer | Return only series matching the specified start year.
LocalDate modifiedSince = new LocalDate(); // LocalDate | Return only series which have been modified since the specified date.
List<Integer> comics = Arrays.asList(56); // List<Integer> | Return only series which contain the specified comics (accepts a comma-separated list of ids).
List<Integer> creators = Arrays.asList(56); // List<Integer> | Return only series which feature work by the specified creators (accepts a comma-separated list of ids).
List<Integer> characters = Arrays.asList(56); // List<Integer> | Return only series which feature the specified characters (accepts a comma-separated list of ids).
String seriesType = "seriesType_example"; // String | Filter the series by publication frequency type.
List<String> contains = Arrays.asList("contains_example"); // List<String> | Return only series containing one or more comics with the specified format.
List<String> orderBy = Arrays.asList("orderBy_example"); // List<String> | Order the result set by a field or fields. Add a \"-\" to the value sort in descending order. Multiple values are given priority in the order in which they are passed.
Integer limit = 56; // Integer | Limit the result set to the specified number of resources.
Integer offset = 56; // Integer | Skip the specified number of resources in the result set.
try {
    SeriesDataWrapper result = apiInstance.getStorySeriesCollection(storyId, events, title, titleStartsWith, startYear, modifiedSince, comics, creators, characters, seriesType, contains, orderBy, limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApi#getStorySeriesCollection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storyId** | **Integer**| The story ID. |
 **events** | [**List&lt;Integer&gt;**](Integer.md)| Return only series which have comics that take place during the specified events (accepts a comma-separated list of ids). | [optional]
 **title** | **String**| Filter by series title. | [optional]
 **titleStartsWith** | **String**| Return series with titles that begin with the specified string (e.g. Sp). | [optional]
 **startYear** | **Integer**| Return only series matching the specified start year. | [optional]
 **modifiedSince** | **LocalDate**| Return only series which have been modified since the specified date. | [optional]
 **comics** | [**List&lt;Integer&gt;**](Integer.md)| Return only series which contain the specified comics (accepts a comma-separated list of ids). | [optional]
 **creators** | [**List&lt;Integer&gt;**](Integer.md)| Return only series which feature work by the specified creators (accepts a comma-separated list of ids). | [optional]
 **characters** | [**List&lt;Integer&gt;**](Integer.md)| Return only series which feature the specified characters (accepts a comma-separated list of ids). | [optional]
 **seriesType** | **String**| Filter the series by publication frequency type. | [optional]
 **contains** | [**List&lt;String&gt;**](String.md)| Return only series containing one or more comics with the specified format. | [optional]
 **orderBy** | [**List&lt;String&gt;**](String.md)| Order the result set by a field or fields. Add a \&quot;-\&quot; to the value sort in descending order. Multiple values are given priority in the order in which they are passed. | [optional]
 **limit** | **Integer**| Limit the result set to the specified number of resources. | [optional]
 **offset** | **Integer**| Skip the specified number of resources in the result set. | [optional]

### Return type

[**SeriesDataWrapper**](SeriesDataWrapper.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

