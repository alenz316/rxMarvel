
# Event

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | The unique ID of the event resource. |  [optional]
**title** | **String** | The title of the event. |  [optional]
**description** | **String** | A description of the event. |  [optional]
**resourceURI** | **String** | The canonical URL identifier for this resource. |  [optional]
**urls** | [**List&lt;Url&gt;**](Url.md) | A set of public web site URLs for the event. |  [optional]
**modified** | [**LocalDate**](LocalDate.md) | The date the resource was most recently modified. |  [optional]
**start** | [**LocalDate**](LocalDate.md) | The date of publication of the first issue in this event. |  [optional]
**end** | [**LocalDate**](LocalDate.md) | The date of publication of the last issue in this event. |  [optional]
**thumbnail** | [**Image**](Image.md) | The representative image for this event. |  [optional]
**comics** | [**ComicList**](ComicList.md) | A resource list containing the comics in this event. |  [optional]
**stories** | [**StoryList**](StoryList.md) | A resource list containing the stories in this event. |  [optional]
**series** | [**SeriesList**](SeriesList.md) | A resource list containing the series in this event. |  [optional]
**characters** | [**CharacterList**](CharacterList.md) | A resource list containing the characters which appear in this event. |  [optional]
**creators** | [**CreatorList**](CreatorList.md) | A resource list containing creators whose work appears in this event. |  [optional]
**next** | [**EventSummary**](EventSummary.md) | A summary representation of the event which follows this event. |  [optional]
**previous** | [**EventSummary**](EventSummary.md) | A summary representation of the event which preceded this event. |  [optional]



