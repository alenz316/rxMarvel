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
import com.marvel.model.StoryDataContainer;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * StoryDataWrapper
 */

public class StoryDataWrapper {
  @SerializedName("code")
  private Integer code = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("copyright")
  private String copyright = null;

  @SerializedName("attributionText")
  private String attributionText = null;

  @SerializedName("attributionHTML")
  private String attributionHTML = null;

  @SerializedName("data")
  private StoryDataContainer data = null;

  @SerializedName("etag")
  private String etag = null;

  public StoryDataWrapper code(Integer code) {
    this.code = code;
    return this;
  }

   /**
   * The HTTP status code of the returned result.
   * @return code
  **/
  @ApiModelProperty(value = "The HTTP status code of the returned result.")
  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  public StoryDataWrapper status(String status) {
    this.status = status;
    return this;
  }

   /**
   * A string description of the call status.
   * @return status
  **/
  @ApiModelProperty(value = "A string description of the call status.")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public StoryDataWrapper copyright(String copyright) {
    this.copyright = copyright;
    return this;
  }

   /**
   * The copyright notice for the returned result.
   * @return copyright
  **/
  @ApiModelProperty(value = "The copyright notice for the returned result.")
  public String getCopyright() {
    return copyright;
  }

  public void setCopyright(String copyright) {
    this.copyright = copyright;
  }

  public StoryDataWrapper attributionText(String attributionText) {
    this.attributionText = attributionText;
    return this;
  }

   /**
   * The attribution notice for this result.  Please display either this notice or the contents of the attributionHTML field on all screens which contain data from the Marvel Comics API.
   * @return attributionText
  **/
  @ApiModelProperty(value = "The attribution notice for this result.  Please display either this notice or the contents of the attributionHTML field on all screens which contain data from the Marvel Comics API.")
  public String getAttributionText() {
    return attributionText;
  }

  public void setAttributionText(String attributionText) {
    this.attributionText = attributionText;
  }

  public StoryDataWrapper attributionHTML(String attributionHTML) {
    this.attributionHTML = attributionHTML;
    return this;
  }

   /**
   * An HTML representation of the attribution notice for this result.  Please display either this notice or the contents of the attributionText field on all screens which contain data from the Marvel Comics API.
   * @return attributionHTML
  **/
  @ApiModelProperty(value = "An HTML representation of the attribution notice for this result.  Please display either this notice or the contents of the attributionText field on all screens which contain data from the Marvel Comics API.")
  public String getAttributionHTML() {
    return attributionHTML;
  }

  public void setAttributionHTML(String attributionHTML) {
    this.attributionHTML = attributionHTML;
  }

  public StoryDataWrapper data(StoryDataContainer data) {
    this.data = data;
    return this;
  }

   /**
   * The results returned by the call.
   * @return data
  **/
  @ApiModelProperty(value = "The results returned by the call.")
  public StoryDataContainer getData() {
    return data;
  }

  public void setData(StoryDataContainer data) {
    this.data = data;
  }

  public StoryDataWrapper etag(String etag) {
    this.etag = etag;
    return this;
  }

   /**
   * A digest value of the content returned by the call.
   * @return etag
  **/
  @ApiModelProperty(value = "A digest value of the content returned by the call.")
  public String getEtag() {
    return etag;
  }

  public void setEtag(String etag) {
    this.etag = etag;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    StoryDataWrapper storyDataWrapper = (StoryDataWrapper) o;
    return ObjectUtils.equals(this.code, storyDataWrapper.code) &&
    ObjectUtils.equals(this.status, storyDataWrapper.status) &&
    ObjectUtils.equals(this.copyright, storyDataWrapper.copyright) &&
    ObjectUtils.equals(this.attributionText, storyDataWrapper.attributionText) &&
    ObjectUtils.equals(this.attributionHTML, storyDataWrapper.attributionHTML) &&
    ObjectUtils.equals(this.data, storyDataWrapper.data) &&
    ObjectUtils.equals(this.etag, storyDataWrapper.etag);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(code, status, copyright, attributionText, attributionHTML, data, etag);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StoryDataWrapper {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    copyright: ").append(toIndentedString(copyright)).append("\n");
    sb.append("    attributionText: ").append(toIndentedString(attributionText)).append("\n");
    sb.append("    attributionHTML: ").append(toIndentedString(attributionHTML)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    etag: ").append(toIndentedString(etag)).append("\n");
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

