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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Url
 */

public class Url {
  @SerializedName("type")
  private String type = null;

  @SerializedName("url")
  private String url = null;

  public Url type(String type) {
    this.type = type;
    return this;
  }

   /**
   * A text identifier for the URL.
   * @return type
  **/
  @ApiModelProperty(value = "A text identifier for the URL.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Url url(String url) {
    this.url = url;
    return this;
  }

   /**
   * A full URL (including scheme, domain, and path).
   * @return url
  **/
  @ApiModelProperty(value = "A full URL (including scheme, domain, and path).")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    Url url = (Url) o;
    return ObjectUtils.equals(this.type, url.type) &&
    ObjectUtils.equals(this.url, url.url);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(type, url);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Url {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

