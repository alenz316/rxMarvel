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
 * CreatorSummary
 */

public class CreatorSummary {
  @SerializedName("resourceURI")
  private String resourceURI = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("role")
  private String role = null;

  public CreatorSummary resourceURI(String resourceURI) {
    this.resourceURI = resourceURI;
    return this;
  }

   /**
   * The path to the individual creator resource.
   * @return resourceURI
  **/
  @ApiModelProperty(value = "The path to the individual creator resource.")
  public String getResourceURI() {
    return resourceURI;
  }

  public void setResourceURI(String resourceURI) {
    this.resourceURI = resourceURI;
  }

  public CreatorSummary name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The full name of the creator.
   * @return name
  **/
  @ApiModelProperty(value = "The full name of the creator.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CreatorSummary role(String role) {
    this.role = role;
    return this;
  }

   /**
   * The role of the creator in the parent entity.
   * @return role
  **/
  @ApiModelProperty(value = "The role of the creator in the parent entity.")
  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    CreatorSummary creatorSummary = (CreatorSummary) o;
    return ObjectUtils.equals(this.resourceURI, creatorSummary.resourceURI) &&
    ObjectUtils.equals(this.name, creatorSummary.name) &&
    ObjectUtils.equals(this.role, creatorSummary.role);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(resourceURI, name, role);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreatorSummary {\n");
    
    sb.append("    resourceURI: ").append(toIndentedString(resourceURI)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
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

