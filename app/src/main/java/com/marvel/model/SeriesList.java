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
import com.marvel.model.SeriesSummary;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * SeriesList
 */

public class SeriesList {
  @SerializedName("available")
  private Integer available = null;

  @SerializedName("returned")
  private Integer returned = null;

  @SerializedName("collectionURI")
  private String collectionURI = null;

  @SerializedName("items")
  private List<SeriesSummary> items = null;

  public SeriesList available(Integer available) {
    this.available = available;
    return this;
  }

   /**
   * The number of total available series in this list. Will always be greater than or equal to the \"returned\" value.
   * @return available
  **/
  @ApiModelProperty(value = "The number of total available series in this list. Will always be greater than or equal to the \"returned\" value.")
  public Integer getAvailable() {
    return available;
  }

  public void setAvailable(Integer available) {
    this.available = available;
  }

  public SeriesList returned(Integer returned) {
    this.returned = returned;
    return this;
  }

   /**
   * The number of series returned in this collection (up to 20).
   * @return returned
  **/
  @ApiModelProperty(value = "The number of series returned in this collection (up to 20).")
  public Integer getReturned() {
    return returned;
  }

  public void setReturned(Integer returned) {
    this.returned = returned;
  }

  public SeriesList collectionURI(String collectionURI) {
    this.collectionURI = collectionURI;
    return this;
  }

   /**
   * The path to the full list of series in this collection.
   * @return collectionURI
  **/
  @ApiModelProperty(value = "The path to the full list of series in this collection.")
  public String getCollectionURI() {
    return collectionURI;
  }

  public void setCollectionURI(String collectionURI) {
    this.collectionURI = collectionURI;
  }

  public SeriesList items(List<SeriesSummary> items) {
    this.items = items;
    return this;
  }

  public SeriesList addItemsItem(SeriesSummary itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<SeriesSummary>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * The list of returned series in this collection.
   * @return items
  **/
  @ApiModelProperty(value = "The list of returned series in this collection.")
  public List<SeriesSummary> getItems() {
    return items;
  }

  public void setItems(List<SeriesSummary> items) {
    this.items = items;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    SeriesList seriesList = (SeriesList) o;
    return ObjectUtils.equals(this.available, seriesList.available) &&
    ObjectUtils.equals(this.returned, seriesList.returned) &&
    ObjectUtils.equals(this.collectionURI, seriesList.collectionURI) &&
    ObjectUtils.equals(this.items, seriesList.items);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(available, returned, collectionURI, items);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SeriesList {\n");
    
    sb.append("    available: ").append(toIndentedString(available)).append("\n");
    sb.append("    returned: ").append(toIndentedString(returned)).append("\n");
    sb.append("    collectionURI: ").append(toIndentedString(collectionURI)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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

