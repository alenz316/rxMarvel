/*
 * gateway.marvel.com
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: Cable
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.marvel.model;

import org.apache.commons.lang3.ObjectUtils;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.marvel.model.Series;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * SeriesDataContainer
 */

public class SeriesDataContainer {
  @SerializedName("offset")
  private Integer offset = null;

  @SerializedName("limit")
  private Integer limit = null;

  @SerializedName("total")
  private Integer total = null;

  @SerializedName("count")
  private Integer count = null;

  @SerializedName("results")
  private List<Series> results = null;

  public SeriesDataContainer offset(Integer offset) {
    this.offset = offset;
    return this;
  }

   /**
   * The requested offset (number of skipped results) of the call.
   * @return offset
  **/
  @ApiModelProperty(value = "The requested offset (number of skipped results) of the call.")
  public Integer getOffset() {
    return offset;
  }

  public void setOffset(Integer offset) {
    this.offset = offset;
  }

  public SeriesDataContainer limit(Integer limit) {
    this.limit = limit;
    return this;
  }

   /**
   * The requested result limit.
   * @return limit
  **/
  @ApiModelProperty(value = "The requested result limit.")
  public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }

  public SeriesDataContainer total(Integer total) {
    this.total = total;
    return this;
  }

   /**
   * The total number of resources available given the current filter set.
   * @return total
  **/
  @ApiModelProperty(value = "The total number of resources available given the current filter set.")
  public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }

  public SeriesDataContainer count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * The total number of results returned by this call.
   * @return count
  **/
  @ApiModelProperty(value = "The total number of results returned by this call.")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public SeriesDataContainer results(List<Series> results) {
    this.results = results;
    return this;
  }

  public SeriesDataContainer addResultsItem(Series resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<Series>();
    }
    this.results.add(resultsItem);
    return this;
  }

   /**
   * The list of series returned by the call
   * @return results
  **/
  @ApiModelProperty(value = "The list of series returned by the call")
  public List<Series> getResults() {
    return results;
  }

  public void setResults(List<Series> results) {
    this.results = results;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    SeriesDataContainer seriesDataContainer = (SeriesDataContainer) o;
    return ObjectUtils.equals(this.offset, seriesDataContainer.offset) &&
    ObjectUtils.equals(this.limit, seriesDataContainer.limit) &&
    ObjectUtils.equals(this.total, seriesDataContainer.total) &&
    ObjectUtils.equals(this.count, seriesDataContainer.count) &&
    ObjectUtils.equals(this.results, seriesDataContainer.results);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(offset, limit, total, count, results);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SeriesDataContainer {\n");
    
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

