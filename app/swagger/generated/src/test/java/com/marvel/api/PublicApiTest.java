package com.marvel.api;

import com.marvel.ApiClient;
import com.marvel.model.CharacterDataWrapper;
import com.marvel.model.ComicDataWrapper;
import com.marvel.model.CreatorDataWrapper;
import com.marvel.model.EventDataWrapper;
import org.joda.time.LocalDate;
import com.marvel.model.SeriesDataWrapper;
import com.marvel.model.StoryDataWrapper;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PublicApi
 */
public class PublicApiTest {

    private PublicApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(PublicApi.class);
    }

    
    /**
     * Fetches lists of events filtered by a character id.
     *
     * Fetches lists of events in which a specific character appears, with optional filters. See notes on individual parameters below.
     */
    @Test
    public void getCharacterEventsCollectionTest() {
        Integer characterId = null;
        String name = null;
        String nameStartsWith = null;
        LocalDate modifiedSince = null;
        List<Integer> creators = null;
        List<Integer> series = null;
        List<Integer> comics = null;
        List<Integer> stories = null;
        List<String> orderBy = null;
        Integer limit = null;
        Integer offset = null;
        // EventDataWrapper response = api.getCharacterEventsCollection(characterId, name, nameStartsWith, modifiedSince, creators, series, comics, stories, orderBy, limit, offset);

        // TODO: test validations
    }
    
    /**
     * Fetches a single character by id.
     *
     * This method fetches a single character resource.  It is the canonical URI for any character resource provided by the API.
     */
    @Test
    public void getCharacterIndividualTest() {
        Integer characterId = null;
        // CharacterDataWrapper response = api.getCharacterIndividual(characterId);

        // TODO: test validations
    }
    
    /**
     * Fetches lists of series filtered by a character id.
     *
     * Fetches lists of comic series in which a specific character appears, with optional filters. See notes on individual parameters below.
     */
    @Test
    public void getCharacterSeriesCollectionTest() {
        Integer characterId = null;
        String title = null;
        String titleStartsWith = null;
        Integer startYear = null;
        LocalDate modifiedSince = null;
        List<Integer> comics = null;
        List<Integer> stories = null;
        List<Integer> events = null;
        List<Integer> creators = null;
        String seriesType = null;
        List<String> contains = null;
        List<String> orderBy = null;
        Integer limit = null;
        Integer offset = null;
        // SeriesDataWrapper response = api.getCharacterSeriesCollection(characterId, title, titleStartsWith, startYear, modifiedSince, comics, stories, events, creators, seriesType, contains, orderBy, limit, offset);

        // TODO: test validations
    }
    
    /**
     * Fetches lists of stories filtered by a character id.
     *
     * Fetches lists of comic stories  featuring a specific character with optional filters. See notes on individual parameters below.
     */
    @Test
    public void getCharacterStoryCollectionTest() {
        Integer characterId = null;
        LocalDate modifiedSince = null;
        List<Integer> comics = null;
        List<Integer> series = null;
        List<Integer> events = null;
        List<Integer> creators = null;
        List<String> orderBy = null;
        Integer limit = null;
        Integer offset = null;
        // StoryDataWrapper response = api.getCharacterStoryCollection(characterId, modifiedSince, comics, series, events, creators, orderBy, limit, offset);

        // TODO: test validations
    }
    
    /**
     * Fetches lists of characters filtered by a comic id.
     *
     * Fetches lists of characters which appear in a specific comic with optional filters. See notes on individual parameters below.
     */
    @Test
    public void getComicCharacterCollectionTest() {
        Integer comicId = null;
        String name = null;
        String nameStartsWith = null;
        LocalDate modifiedSince = null;
        List<Integer> series = null;
        List<Integer> events = null;
        List<Integer> stories = null;
        List<String> orderBy = null;
        Integer limit = null;
        Integer offset = null;
        // CharacterDataWrapper response = api.getComicCharacterCollection(comicId, name, nameStartsWith, modifiedSince, series, events, stories, orderBy, limit, offset);

        // TODO: test validations
    }
    
    /**
     * Fetches a single comic by id.
     *
     * This method fetches a single comic resource.  It is the canonical URI for any comic resource provided by the API.
     */
    @Test
    public void getComicIndividualTest() {
        Integer comicId = null;
        // ComicDataWrapper response = api.getComicIndividual(comicId);

        // TODO: test validations
    }
    
    /**
     * Fetches lists of stories filtered by a comic id.
     *
     * Fetches lists of comic stories in a specific comic issue, with optional filters. See notes on individual parameters below.
     */
    @Test
    public void getComicStoryCollectionTest() {
        Integer comicId = null;
        LocalDate modifiedSince = null;
        List<Integer> series = null;
        List<Integer> events = null;
        List<Integer> creators = null;
        List<Integer> characters = null;
        List<String> orderBy = null;
        Integer limit = null;
        Integer offset = null;
        // StoryDataWrapper response = api.getComicStoryCollection(comicId, modifiedSince, series, events, creators, characters, orderBy, limit, offset);

        // TODO: test validations
    }
    
    /**
     * Fetches lists of comics filtered by a character id.
     *
     * Fetches lists of comics containing a specific character, with optional filters. See notes on individual parameters below.
     */
    @Test
    public void getComicsCharacterCollectionTest() {
        Integer characterId = null;
        String format = null;
        String formatType = null;
        Boolean noVariants = null;
        String dateDescriptor = null;
        List<Integer> dateRange = null;
        String title = null;
        String titleStartsWith = null;
        Integer startYear = null;
        Integer issueNumber = null;
        String diamondCode = null;
        Integer digitalId = null;
        String upc = null;
        String isbn = null;
        String ean = null;
        String issn = null;
        Boolean hasDigitalIssue = null;
        LocalDate modifiedSince = null;
        List<Integer> creators = null;
        List<Integer> series = null;
        List<Integer> events = null;
        List<Integer> stories = null;
        List<Integer> sharedAppearances = null;
        List<Integer> collaborators = null;
        List<String> orderBy = null;
        Integer limit = null;
        Integer offset = null;
        // ComicDataWrapper response = api.getComicsCharacterCollection(characterId, format, formatType, noVariants, dateDescriptor, dateRange, title, titleStartsWith, startYear, issueNumber, diamondCode, digitalId, upc, isbn, ean, issn, hasDigitalIssue, modifiedSince, creators, series, events, stories, sharedAppearances, collaborators, orderBy, limit, offset);

        // TODO: test validations
    }
    
    /**
     * Fetches lists of comics.
     *
     * Fetches lists of comics with optional filters. See notes on individual parameters below.
     */
    @Test
    public void getComicsCollectionTest() {
        String format = null;
        String formatType = null;
        Boolean noVariants = null;
        String dateDescriptor = null;
        List<Integer> dateRange = null;
        String title = null;
        String titleStartsWith = null;
        Integer startYear = null;
        Integer issueNumber = null;
        String diamondCode = null;
        Integer digitalId = null;
        String upc = null;
        String isbn = null;
        String ean = null;
        String issn = null;
        Boolean hasDigitalIssue = null;
        LocalDate modifiedSince = null;
        List<Integer> creators = null;
        List<Integer> characters = null;
        List<Integer> series = null;
        List<Integer> events = null;
        List<Integer> stories = null;
        List<Integer> sharedAppearances = null;
        List<Integer> collaborators = null;
        List<String> orderBy = null;
        Integer limit = null;
        Integer offset = null;
        // ComicDataWrapper response = api.getComicsCollection(format, formatType, noVariants, dateDescriptor, dateRange, title, titleStartsWith, startYear, issueNumber, diamondCode, digitalId, upc, isbn, ean, issn, hasDigitalIssue, modifiedSince, creators, characters, series, events, stories, sharedAppearances, collaborators, orderBy, limit, offset);

        // TODO: test validations
    }
    
    /**
     * Fetches lists of comics filtered by a creator id.
     *
     * Fetches lists of comics in which the work of a specific creator appears, with optional filters. See notes on individual parameters below.
     */
    @Test
    public void getComicsCollection_0Test() {
        Integer creatorId = null;
        String format = null;
        String formatType = null;
        Boolean noVariants = null;
        String dateDescriptor = null;
        List<Integer> dateRange = null;
        String title = null;
        String titleStartsWith = null;
        Integer startYear = null;
        Integer issueNumber = null;
        String diamondCode = null;
        Integer digitalId = null;
        String upc = null;
        String isbn = null;
        String ean = null;
        String issn = null;
        List<Boolean> hasDigitalIssue = null;
        LocalDate modifiedSince = null;
        List<Integer> characters = null;
        List<Integer> series = null;
        List<Integer> events = null;
        List<Integer> stories = null;
        List<Integer> sharedAppearances = null;
        List<Integer> collaborators = null;
        List<String> orderBy = null;
        Integer limit = null;
        Integer offset = null;
        // ComicDataWrapper response = api.getComicsCollection_0(creatorId, format, formatType, noVariants, dateDescriptor, dateRange, title, titleStartsWith, startYear, issueNumber, diamondCode, digitalId, upc, isbn, ean, issn, hasDigitalIssue, modifiedSince, characters, series, events, stories, sharedAppearances, collaborators, orderBy, limit, offset);

        // TODO: test validations
    }
    
    /**
     * Fetches lists of comics filtered by an event id.
     *
     * Fetches lists of comics which take place during a specific event, with optional filters. See notes on individual parameters below.
     */
    @Test
    public void getComicsCollection_1Test() {
        Integer eventId = null;
        String format = null;
        String formatType = null;
        List<Boolean> noVariants = null;
        List<String> dateDescriptor = null;
        List<Integer> dateRange = null;
        String title = null;
        String titleStartsWith = null;
        Integer startYear = null;
        Integer issueNumber = null;
        String diamondCode = null;
        Integer digitalId = null;
        String upc = null;
        String isbn = null;
        String ean = null;
        String issn = null;
        List<Boolean> hasDigitalIssue = null;
        LocalDate modifiedSince = null;
        List<Integer> creators = null;
        List<Integer> characters = null;
        List<Integer> series = null;
        List<Integer> events = null;
        List<Integer> stories = null;
        List<Integer> sharedAppearances = null;
        List<Integer> collaborators = null;
        List<String> orderBy = null;
        Integer limit = null;
        Integer offset = null;
        // ComicDataWrapper response = api.getComicsCollection_1(eventId, format, formatType, noVariants, dateDescriptor, dateRange, title, titleStartsWith, startYear, issueNumber, diamondCode, digitalId, upc, isbn, ean, issn, hasDigitalIssue, modifiedSince, creators, characters, series, events, stories, sharedAppearances, collaborators, orderBy, limit, offset);

        // TODO: test validations
    }
    
    /**
     * Fetches lists of comics filtered by a series id.
     *
     * Fetches lists of comics which are published as part of a specific series, with optional filters. See notes on individual parameters below.
     */
    @Test
    public void getComicsCollection_2Test() {
        Integer seriesId = null;
        String format = null;
        String formatType = null;
        List<Boolean> noVariants = null;
        List<String> dateDescriptor = null;
        List<Integer> dateRange = null;
        String title = null;
        String titleStartsWith = null;
        Integer startYear = null;
        Integer issueNumber = null;
        String diamondCode = null;
        Integer digitalId = null;
        String upc = null;
        String isbn = null;
        String ean = null;
        String issn = null;
        List<Boolean> hasDigitalIssue = null;
        LocalDate modifiedSince = null;
        List<Integer> creators = null;
        List<Integer> characters = null;
        List<Integer> events = null;
        List<Integer> stories = null;
        List<Integer> sharedAppearances = null;
        List<Integer> collaborators = null;
        List<String> orderBy = null;
        Integer limit = null;
        Integer offset = null;
        // ComicDataWrapper response = api.getComicsCollection_2(seriesId, format, formatType, noVariants, dateDescriptor, dateRange, title, titleStartsWith, startYear, issueNumber, diamondCode, digitalId, upc, isbn, ean, issn, hasDigitalIssue, modifiedSince, creators, characters, events, stories, sharedAppearances, collaborators, orderBy, limit, offset);

        // TODO: test validations
    }
    
    /**
     * Fetches lists of comics filtered by a story id.
     *
     * Fetches lists of comics in which a specific story appears, with optional filters. See notes on individual parameters below.
     */
    @Test
    public void getComicsCollection_3Test() {
        Integer storyId = null;
        String format = null;
        String formatType = null;
        List<Boolean> noVariants = null;
        List<String> dateDescriptor = null;
        List<Integer> dateRange = null;
        String title = null;
        String titleStartsWith = null;
        Integer startYear = null;
        Integer issueNumber = null;
        String diamondCode = null;
        Integer digitalId = null;
        String upc = null;
        String isbn = null;
        String ean = null;
        String issn = null;
        List<Boolean> hasDigitalIssue = null;
        LocalDate modifiedSince = null;
        List<Integer> creators = null;
        List<Integer> characters = null;
        List<Integer> series = null;
        List<Integer> events = null;
        List<Integer> sharedAppearances = null;
        List<Integer> collaborators = null;
        List<String> orderBy = null;
        Integer limit = null;
        Integer offset = null;
        // ComicDataWrapper response = api.getComicsCollection_3(storyId, format, formatType, noVariants, dateDescriptor, dateRange, title, titleStartsWith, startYear, issueNumber, diamondCode, digitalId, upc, isbn, ean, issn, hasDigitalIssue, modifiedSince, creators, characters, series, events, sharedAppearances, collaborators, orderBy, limit, offset);

        // TODO: test validations
    }
    
    /**
     * Fetches lists of characters.
     *
     * Fetches lists of comic characters with optional filters. See notes on individual parameters below.
     */
    @Test
    public void getCreatorCollectionTest() {
        String name = null;
        String nameStartsWith = null;
        LocalDate modifiedSince = null;
        List<Integer> comics = null;
        List<Integer> series = null;
        List<Integer> events = null;
        List<Integer> stories = null;
        List<String> orderBy = null;
        Integer limit = null;
        Integer offset = null;
        // CharacterDataWrapper response = api.getCreatorCollection(name, nameStartsWith, modifiedSince, comics, series, events, stories, orderBy, limit, offset);

        // TODO: test validations
    }
    
    /**
     * Fetches lists of creators filtered by a comic id.
     *
     * Fetches lists of comic creators whose work appears in a specific comic, with optional filters. See notes on individual parameters below.
     */
    @Test
    public void getCreatorCollection_0Test() {
        Integer comicId = null;
        String firstName = null;
        String middleName = null;
        String lastName = null;
        String suffix = null;
        String nameStartsWith = null;
        String firstNameStartsWith = null;
        String middleNameStartsWith = null;
        String lastNameStartsWith = null;
        LocalDate modifiedSince = null;
        List<Integer> comics = null;
        List<Integer> series = null;
        List<Integer> stories = null;
        List<String> orderBy = null;
        Integer limit = null;
        Integer offset = null;
        // CreatorDataWrapper response = api.getCreatorCollection_0(comicId, firstName, middleName, lastName, suffix, nameStartsWith, firstNameStartsWith, middleNameStartsWith, lastNameStartsWith, modifiedSince, comics, series, stories, orderBy, limit, offset);

        // TODO: test validations
    }
    
    /**
     * Fetches lists of creators.
     *
     * Fetches lists of comic creators with optional filters. See notes on individual parameters below.
     */
    @Test
    public void getCreatorCollection_1Test() {
        String firstName = null;
        String middleName = null;
        String lastName = null;
        String suffix = null;
        String nameStartsWith = null;
        String firstNameStartsWith = null;
        String middleNameStartsWith = null;
        String lastNameStartsWith = null;
        LocalDate modifiedSince = null;
        List<Integer> comics = null;
        List<Integer> series = null;
        List<Integer> events = null;
        List<Integer> stories = null;
        List<String> orderBy = null;
        Integer limit = null;
        Integer offset = null;
        // CreatorDataWrapper response = api.getCreatorCollection_1(firstName, middleName, lastName, suffix, nameStartsWith, firstNameStartsWith, middleNameStartsWith, lastNameStartsWith, modifiedSince, comics, series, events, stories, orderBy, limit, offset);

        // TODO: test validations
    }
    
    /**
     * Fetches lists of creators filtered by an event id.
     *
     * Fetches lists of comic creators whose work appears in a specific event, with optional filters. See notes on individual parameters below.
     */
    @Test
    public void getCreatorCollection_2Test() {
        Integer eventId = null;
        String firstName = null;
        String middleName = null;
        String lastName = null;
        String suffix = null;
        String nameStartsWith = null;
        String firstNameStartsWith = null;
        String middleNameStartsWith = null;
        String lastNameStartsWith = null;
        LocalDate modifiedSince = null;
        List<Integer> comics = null;
        List<Integer> series = null;
        List<Integer> stories = null;
        List<String> orderBy = null;
        Integer limit = null;
        Integer offset = null;
        // CreatorDataWrapper response = api.getCreatorCollection_2(eventId, firstName, middleName, lastName, suffix, nameStartsWith, firstNameStartsWith, middleNameStartsWith, lastNameStartsWith, modifiedSince, comics, series, stories, orderBy, limit, offset);

        // TODO: test validations
    }
    
    /**
     * Fetches lists of creators filtered by a series id.
     *
     * Fetches lists of comic creators whose work appears in a specific series, with optional filters. See notes on individual parameters below.
     */
    @Test
    public void getCreatorCollection_3Test() {
        Integer seriesId = null;
        String firstName = null;
        String middleName = null;
        String lastName = null;
        String suffix = null;
        String nameStartsWith = null;
        String firstNameStartsWith = null;
        String middleNameStartsWith = null;
        String lastNameStartsWith = null;
        LocalDate modifiedSince = null;
        List<Integer> comics = null;
        List<Integer> events = null;
        List<Integer> stories = null;
        List<String> orderBy = null;
        Integer limit = null;
        Integer offset = null;
        // CreatorDataWrapper response = api.getCreatorCollection_3(seriesId, firstName, middleName, lastName, suffix, nameStartsWith, firstNameStartsWith, middleNameStartsWith, lastNameStartsWith, modifiedSince, comics, events, stories, orderBy, limit, offset);

        // TODO: test validations
    }
    
    /**
     * Fetches lists of characters filtered by a story id.
     *
     * Fetches lists of comic characters appearing in a single story, with optional filters. See notes on individual parameters below.
     */
    @Test
    public void getCreatorCollection_4Test() {
        Integer storyId = null;
        String name = null;
        String nameStartsWith = null;
        LocalDate modifiedSince = null;
        List<Integer> comics = null;
        List<Integer> series = null;
        List<Integer> events = null;
        List<String> orderBy = null;
        Integer limit = null;
        Integer offset = null;
        // CharacterDataWrapper response = api.getCreatorCollection_4(storyId, name, nameStartsWith, modifiedSince, comics, series, events, orderBy, limit, offset);

        // TODO: test validations
    }
    
    /**
     * Fetches lists of creators filtered by a story id.
     *
     * Fetches lists of comic creators whose work appears in a specific story, with optional filters. See notes on individual parameters below.
     */
    @Test
    public void getCreatorCollection_5Test() {
        Integer storyId = null;
        String firstName = null;
        String middleName = null;
        String lastName = null;
        String suffix = null;
        String nameStartsWith = null;
        String firstNameStartsWith = null;
        String middleNameStartsWith = null;
        String lastNameStartsWith = null;
        LocalDate modifiedSince = null;
        List<Integer> comics = null;
        List<Integer> series = null;
        List<Integer> events = null;
        List<String> orderBy = null;
        Integer limit = null;
        Integer offset = null;
        // CreatorDataWrapper response = api.getCreatorCollection_5(storyId, firstName, middleName, lastName, suffix, nameStartsWith, firstNameStartsWith, middleNameStartsWith, lastNameStartsWith, modifiedSince, comics, series, events, orderBy, limit, offset);

        // TODO: test validations
    }
    
    /**
     * Fetches lists of events filtered by a creator id.
     *
     * Fetches lists of events featuring the work of a specific creator with optional filters. See notes on individual parameters below.
     */
    @Test
    public void getCreatorEventsCollectionTest() {
        Integer creatorId = null;
        String name = null;
        String nameStartsWith = null;
        LocalDate modifiedSince = null;
        List<Integer> characters = null;
        List<Integer> series = null;
        List<Integer> comics = null;
        List<Integer> stories = null;
        List<String> orderBy = null;
        Integer limit = null;
        Integer offset = null;
        // EventDataWrapper response = api.getCreatorEventsCollection(creatorId, name, nameStartsWith, modifiedSince, characters, series, comics, stories, orderBy, limit, offset);

        // TODO: test validations
    }
    
    /**
     * Fetches a single creator by id.
     *
     * This method fetches a single creator resource.  It is the canonical URI for any creator resource provided by the API.
     */
    @Test
    public void getCreatorIndividualTest() {
        Integer creatorId = null;
        // CreatorDataWrapper response = api.getCreatorIndividual(creatorId);

        // TODO: test validations
    }
    
    /**
     * Fetches lists of series filtered by a creator id.
     *
     * Fetches lists of comic series in which a specific creator&#39;s work appears, with optional filters. See notes on individual parameters below.
     */
    @Test
    public void getCreatorSeriesCollectionTest() {
        Integer creatorId = null;
        String title = null;
        String titleStartsWith = null;
        Integer startYear = null;
        LocalDate modifiedSince = null;
        List<Integer> comics = null;
        List<Integer> stories = null;
        List<Integer> events = null;
        List<Integer> characters = null;
        String seriesType = null;
        List<String> contains = null;
        List<String> orderBy = null;
        Integer limit = null;
        Integer offset = null;
        // SeriesDataWrapper response = api.getCreatorSeriesCollection(creatorId, title, titleStartsWith, startYear, modifiedSince, comics, stories, events, characters, seriesType, contains, orderBy, limit, offset);

        // TODO: test validations
    }
    
    /**
     * Fetches lists of stories filtered by a creator id.
     *
     * Fetches lists of comic stories by a specific creator with optional filters. See notes on individual parameters below.
     */
    @Test
    public void getCreatorStoryCollectionTest() {
        Integer creatorId = null;
        LocalDate modifiedSince = null;
        List<Integer> comics = null;
        List<Integer> series = null;
        List<Integer> events = null;
        List<Integer> characters = null;
        List<String> orderBy = null;
        Integer limit = null;
        Integer offset = null;
        // StoryDataWrapper response = api.getCreatorStoryCollection(creatorId, modifiedSince, comics, series, events, characters, orderBy, limit, offset);

        // TODO: test validations
    }
    
    /**
     * Fetches lists of characters filtered by an event id.
     *
     * Fetches lists of characters which appear in a specific event, with optional filters. See notes on individual parameters below.
     */
    @Test
    public void getEventCharacterCollectionTest() {
        Integer eventId = null;
        String name = null;
        String nameStartsWith = null;
        LocalDate modifiedSince = null;
        List<Integer> comics = null;
        List<Integer> series = null;
        List<Integer> stories = null;
        List<String> orderBy = null;
        Integer limit = null;
        Integer offset = null;
        // CharacterDataWrapper response = api.getEventCharacterCollection(eventId, name, nameStartsWith, modifiedSince, comics, series, stories, orderBy, limit, offset);

        // TODO: test validations
    }
    
    /**
     * Fetches a single event by id.
     *
     * This method fetches a single event resource.  It is the canonical URI for any event resource provided by the API.
     */
    @Test
    public void getEventIndividualTest() {
        Integer eventId = null;
        // EventDataWrapper response = api.getEventIndividual(eventId);

        // TODO: test validations
    }
    
    /**
     * Fetches lists of series filtered by an event id.
     *
     * Fetches lists of comic series in which a specific event takes place, with optional filters. See notes on individual parameters below.
     */
    @Test
    public void getEventSeriesCollectionTest() {
        Integer eventId = null;
        String title = null;
        String titleStartsWith = null;
        Integer startYear = null;
        LocalDate modifiedSince = null;
        List<Integer> comics = null;
        List<Integer> stories = null;
        List<Integer> creators = null;
        List<Integer> characters = null;
        String seriesType = null;
        List<String> contains = null;
        List<String> orderBy = null;
        Integer limit = null;
        Integer offset = null;
        // SeriesDataWrapper response = api.getEventSeriesCollection(eventId, title, titleStartsWith, startYear, modifiedSince, comics, stories, creators, characters, seriesType, contains, orderBy, limit, offset);

        // TODO: test validations
    }
    
    /**
     * Fetches lists of stories filtered by an event id.
     *
     * Fetches lists of comic stories from a specific event, with optional filters. See notes on individual parameters below.
     */
    @Test
    public void getEventStoryCollectionTest() {
        Integer eventId = null;
        LocalDate modifiedSince = null;
        List<Integer> comics = null;
        List<Integer> series = null;
        List<Integer> creators = null;
        List<Integer> characters = null;
        List<String> orderBy = null;
        Integer limit = null;
        Integer offset = null;
        // StoryDataWrapper response = api.getEventStoryCollection(eventId, modifiedSince, comics, series, creators, characters, orderBy, limit, offset);

        // TODO: test validations
    }
    
    /**
     * Fetches lists of events.
     *
     * Fetches lists of events with optional filters. See notes on individual parameters below.
     */
    @Test
    public void getEventsCollectionTest() {
        String name = null;
        String nameStartsWith = null;
        LocalDate modifiedSince = null;
        List<Integer> creators = null;
        List<Integer> characters = null;
        List<Integer> series = null;
        List<Integer> comics = null;
        List<Integer> stories = null;
        List<String> orderBy = null;
        Integer limit = null;
        Integer offset = null;
        // EventDataWrapper response = api.getEventsCollection(name, nameStartsWith, modifiedSince, creators, characters, series, comics, stories, orderBy, limit, offset);

        // TODO: test validations
    }
    
    /**
     * Fetches lists of events filtered by a series id.
     *
     * Fetches lists of events which occur in a specific series, with optional filters. See notes on individual parameters below.
     */
    @Test
    public void getEventsCollection_0Test() {
        Integer seriesId = null;
        String name = null;
        String nameStartsWith = null;
        LocalDate modifiedSince = null;
        List<Integer> creators = null;
        List<Integer> characters = null;
        List<Integer> comics = null;
        List<Integer> stories = null;
        List<String> orderBy = null;
        Integer limit = null;
        Integer offset = null;
        // EventDataWrapper response = api.getEventsCollection_0(seriesId, name, nameStartsWith, modifiedSince, creators, characters, comics, stories, orderBy, limit, offset);

        // TODO: test validations
    }
    
    /**
     * Fetches lists of events filtered by a story id.
     *
     * Fetches lists of events in which a specific story appears, with optional filters. See notes on individual parameters below.
     */
    @Test
    public void getEventsCollection_1Test() {
        Integer storyId = null;
        String name = null;
        String nameStartsWith = null;
        LocalDate modifiedSince = null;
        List<Integer> creators = null;
        List<Integer> characters = null;
        List<Integer> series = null;
        List<Integer> comics = null;
        List<String> orderBy = null;
        Integer limit = null;
        Integer offset = null;
        // EventDataWrapper response = api.getEventsCollection_1(storyId, name, nameStartsWith, modifiedSince, creators, characters, series, comics, orderBy, limit, offset);

        // TODO: test validations
    }
    
    /**
     * Fetches lists of events filtered by a comic id.
     *
     * Fetches lists of events in which a specific comic appears, with optional filters. See notes on individual parameters below.
     */
    @Test
    public void getIssueEventsCollectionTest() {
        Integer comicId = null;
        String name = null;
        String nameStartsWith = null;
        LocalDate modifiedSince = null;
        List<Integer> creators = null;
        List<Integer> characters = null;
        List<Integer> series = null;
        List<Integer> stories = null;
        List<String> orderBy = null;
        Integer limit = null;
        Integer offset = null;
        // EventDataWrapper response = api.getIssueEventsCollection(comicId, name, nameStartsWith, modifiedSince, creators, characters, series, stories, orderBy, limit, offset);

        // TODO: test validations
    }
    
    /**
     * Fetches lists of characters filtered by a series id.
     *
     * Fetches lists of characters which appear in specific series, with optional filters. See notes on individual parameters below.
     */
    @Test
    public void getSeriesCharacterWrapperTest() {
        Integer seriesId = null;
        String name = null;
        String nameStartsWith = null;
        LocalDate modifiedSince = null;
        List<Integer> comics = null;
        List<Integer> events = null;
        List<Integer> stories = null;
        List<String> orderBy = null;
        Integer limit = null;
        Integer offset = null;
        // CharacterDataWrapper response = api.getSeriesCharacterWrapper(seriesId, name, nameStartsWith, modifiedSince, comics, events, stories, orderBy, limit, offset);

        // TODO: test validations
    }
    
    /**
     * Fetches lists of series.
     *
     * Fetches lists of comic series with optional filters. See notes on individual parameters below.
     */
    @Test
    public void getSeriesCollectionTest() {
        String title = null;
        String titleStartsWith = null;
        Integer startYear = null;
        LocalDate modifiedSince = null;
        List<Integer> comics = null;
        List<Integer> stories = null;
        List<Integer> events = null;
        List<Integer> creators = null;
        List<Integer> characters = null;
        String seriesType = null;
        List<String> contains = null;
        List<String> orderBy = null;
        Integer limit = null;
        Integer offset = null;
        // SeriesDataWrapper response = api.getSeriesCollection(title, titleStartsWith, startYear, modifiedSince, comics, stories, events, creators, characters, seriesType, contains, orderBy, limit, offset);

        // TODO: test validations
    }
    
    /**
     * Fetches a single comic series by id.
     *
     * This method fetches a single comic series resource.  It is the canonical URI for any comic series resource provided by the API.
     */
    @Test
    public void getSeriesIndividualTest() {
        Integer seriesId = null;
        // SeriesDataWrapper response = api.getSeriesIndividual(seriesId);

        // TODO: test validations
    }
    
    /**
     * Fetches lists of stories filtered by a series id.
     *
     * Fetches lists of comic stories from a specific series with optional filters. See notes on individual parameters below.
     */
    @Test
    public void getSeriesStoryCollectionTest() {
        Integer seriesId = null;
        LocalDate modifiedSince = null;
        List<Integer> comics = null;
        List<Integer> events = null;
        List<Integer> creators = null;
        List<Integer> characters = null;
        List<String> orderBy = null;
        Integer limit = null;
        Integer offset = null;
        // StoryDataWrapper response = api.getSeriesStoryCollection(seriesId, modifiedSince, comics, events, creators, characters, orderBy, limit, offset);

        // TODO: test validations
    }
    
    /**
     * Fetches lists of stories.
     *
     * Fetches lists of comic stories with optional filters. See notes on individual parameters below.
     */
    @Test
    public void getStoryCollectionTest() {
        LocalDate modifiedSince = null;
        List<Integer> comics = null;
        List<Integer> series = null;
        List<Integer> events = null;
        List<Integer> creators = null;
        List<Integer> characters = null;
        List<String> orderBy = null;
        Integer limit = null;
        Integer offset = null;
        // StoryDataWrapper response = api.getStoryCollection(modifiedSince, comics, series, events, creators, characters, orderBy, limit, offset);

        // TODO: test validations
    }
    
    /**
     * Fetches a single comic story by id.
     *
     * This method fetches a single comic story resource.  It is the canonical URI for any comic story resource provided by the API.
     */
    @Test
    public void getStoryIndividualTest() {
        Integer storyId = null;
        // StoryDataWrapper response = api.getStoryIndividual(storyId);

        // TODO: test validations
    }
    
    /**
     * Fetches lists of series filtered by a story id.
     *
     * Fetches lists of comic series in which the specified story takes place. See notes on individual parameters below.
     */
    @Test
    public void getStorySeriesCollectionTest() {
        Integer storyId = null;
        List<Integer> events = null;
        String title = null;
        String titleStartsWith = null;
        Integer startYear = null;
        LocalDate modifiedSince = null;
        List<Integer> comics = null;
        List<Integer> creators = null;
        List<Integer> characters = null;
        String seriesType = null;
        List<String> contains = null;
        List<String> orderBy = null;
        Integer limit = null;
        Integer offset = null;
        // SeriesDataWrapper response = api.getStorySeriesCollection(storyId, events, title, titleStartsWith, startYear, modifiedSince, comics, creators, characters, seriesType, contains, orderBy, limit, offset);

        // TODO: test validations
    }
    
}
