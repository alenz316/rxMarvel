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
 * Image
 */

public class Image {
  @SerializedName("path")
  private String path = null;

  @SerializedName("extension")
  private String extension = null;

  public Image path(String path) {
    this.path = path;
    return this;
  }

   /**
   * The directory path of to the image.
   * @return path
  **/
  @ApiModelProperty(value = "The directory path of to the image.")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public Image extension(String extension) {
    this.extension = extension;
    return this;
  }

   /**
   * The file extension for the image.
   * @return extension
  **/
  @ApiModelProperty(value = "The file extension for the image.")
  public String getExtension() {
    return extension;
  }

  public void setExtension(String extension) {
    this.extension = extension;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    Image image = (Image) o;
    return ObjectUtils.equals(this.path, image.path) &&
    ObjectUtils.equals(this.extension, image.extension);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(path, extension);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Image {\n");
    
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
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

