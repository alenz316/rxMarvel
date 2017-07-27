
# Series

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | The unique ID of the series resource. |  [optional]
**title** | **String** | The canonical title of the series. |  [optional]
**description** | **String** | A description of the series. |  [optional]
**resourceURI** | **String** | The canonical URL identifier for this resource. |  [optional]
**urls** | [**List&lt;Url&gt;**](Url.md) | A set of public web site URLs for the resource. |  [optional]
**startYear** | **Integer** | The first year of publication for the series. |  [optional]
**endYear** | **Integer** | The last year of publication for the series (conventionally, 2099 for ongoing series) . |  [optional]
**rating** | **String** | The age-appropriateness rating for the series. |  [optional]
**modified** | [**LocalDate**](LocalDate.md) | The date the resource was most recently modified. |  [optional]
**thumbnail** | [**Image**](Image.md) | The representative image for this series. |  [optional]
**comics** | [**ComicList**](ComicList.md) | A resource list containing comics in this series. |  [optional]
**stories** | [**StoryList**](StoryList.md) | A resource list containing stories which occur in comics in this series. |  [optional]
**events** | [**EventList**](EventList.md) | A resource list containing events which take place in comics in this series. |  [optional]
**characters** | [**CharacterList**](CharacterList.md) | A resource list containing characters which appear in comics in this series. |  [optional]
**creators** | [**CreatorList**](CreatorList.md) | A resource list of creators whose work appears in comics in this series. |  [optional]
**next** | [**SeriesSummary**](SeriesSummary.md) | A summary representation of the series which follows this series. |  [optional]
**previous** | [**SeriesSummary**](SeriesSummary.md) | A summary representation of the series which preceded this series. |  [optional]



