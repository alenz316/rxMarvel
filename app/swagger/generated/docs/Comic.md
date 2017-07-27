
# Comic

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | The unique ID of the comic resource. |  [optional]
**digitalId** | **Integer** | The ID of the digital comic representation of this comic. Will be 0 if the comic is not available digitally. |  [optional]
**title** | **String** | The canonical title of the comic. |  [optional]
**issueNumber** | **Double** | The number of the issue in the series (will generally be 0 for collection formats). |  [optional]
**variantDescription** | **String** | If the issue is a variant (e.g. an alternate cover, second printing, or director’s cut), a text description of the variant. |  [optional]
**description** | **String** | The preferred description of the comic. |  [optional]
**modified** | [**LocalDate**](LocalDate.md) | The date the resource was most recently modified. |  [optional]
**isbn** | **String** | The ISBN for the comic (generally only populated for collection formats). |  [optional]
**upc** | **String** | The UPC barcode number for the comic (generally only populated for periodical formats). |  [optional]
**diamondCode** | **String** | The Diamond code for the comic. |  [optional]
**ean** | **String** | The EAN barcode for the comic. |  [optional]
**issn** | **String** | The ISSN barcode for the comic. |  [optional]
**format** | **String** | The publication format of the comic e.g. comic, hardcover, trade paperback. |  [optional]
**pageCount** | **Integer** | The number of story pages in the comic. |  [optional]
**textObjects** | [**List&lt;TextObject&gt;**](TextObject.md) | A set of descriptive text blurbs for the comic. |  [optional]
**resourceURI** | **String** | The canonical URL identifier for this resource. |  [optional]
**urls** | [**List&lt;Url&gt;**](Url.md) | A set of public web site URLs for the resource. |  [optional]
**series** | [**SeriesSummary**](SeriesSummary.md) | A summary representation of the series to which this comic belongs. |  [optional]
**variants** | [**List&lt;ComicSummary&gt;**](ComicSummary.md) | A list of variant issues for this comic (includes the \&quot;original\&quot; issue if the current issue is a variant). |  [optional]
**collections** | [**List&lt;ComicSummary&gt;**](ComicSummary.md) | A list of collections which include this comic (will generally be empty if the comic&#39;s format is a collection). |  [optional]
**collectedIssues** | [**List&lt;ComicSummary&gt;**](ComicSummary.md) | A list of issues collected in this comic (will generally be empty for periodical formats such as \&quot;comic\&quot; or \&quot;magazine\&quot;). |  [optional]
**dates** | [**List&lt;ComicDate&gt;**](ComicDate.md) | A list of key dates for this comic. |  [optional]
**prices** | [**List&lt;ComicPrice&gt;**](ComicPrice.md) | A list of prices for this comic. |  [optional]
**thumbnail** | [**Image**](Image.md) | The representative image for this comic. |  [optional]
**images** | [**List&lt;Image&gt;**](Image.md) | A list of promotional images associated with this comic. |  [optional]
**creators** | [**CreatorList**](CreatorList.md) | A resource list containing the creators associated with this comic. |  [optional]
**characters** | [**CharacterList**](CharacterList.md) | A resource list containing the characters which appear in this comic. |  [optional]
**stories** | [**StoryList**](StoryList.md) | A resource list containing the stories which appear in this comic. |  [optional]
**events** | [**EventList**](EventList.md) | A resource list containing the events in which this comic appears. |  [optional]



