
# Story

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | The unique ID of the story resource. |  [optional]
**title** | **String** | The story title. |  [optional]
**description** | **String** | A short description of the story. |  [optional]
**resourceURI** | **String** | The canonical URL identifier for this resource.  |  [optional]
**type** | **String** | The story type e.g. interior story, cover, text story. |  [optional]
**modified** | [**LocalDate**](LocalDate.md) | The date the resource was most recently modified. |  [optional]
**thumbnail** | [**Image**](Image.md) | The representative image for this story. |  [optional]
**comics** | [**ComicList**](ComicList.md) | A resource list containing comics in which this story takes place. |  [optional]
**series** | [**SeriesList**](SeriesList.md) | A resource list containing series in which this story appears. |  [optional]
**events** | [**EventList**](EventList.md) | A resource list of the events in which this story appears. |  [optional]
**characters** | [**CharacterList**](CharacterList.md) | A resource list of characters which appear in this story. |  [optional]
**creators** | [**CreatorList**](CreatorList.md) | A resource list of creators who worked on this story. |  [optional]
**originalissue** | [**ComicSummary**](ComicSummary.md) | A summary representation of the issue in which this story was originally published. |  [optional]



