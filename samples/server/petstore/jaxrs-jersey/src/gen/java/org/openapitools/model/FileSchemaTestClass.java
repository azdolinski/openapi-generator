/*
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ModelFile;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * FileSchemaTestClass
 */
@JsonPropertyOrder({
  FileSchemaTestClass.JSON_PROPERTY_FILE,
  FileSchemaTestClass.JSON_PROPERTY_FILES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", comments = "Generator version: 7.5.0-SNAPSHOT")
public class FileSchemaTestClass   {
  public static final String JSON_PROPERTY_FILE = "file";
  @JsonProperty(JSON_PROPERTY_FILE)
  private ModelFile _file;

  public static final String JSON_PROPERTY_FILES = "files";
  @JsonProperty(JSON_PROPERTY_FILES)
  private List<@Valid ModelFile> files;

  public FileSchemaTestClass _file(ModelFile _file) {
    this._file = _file;
    return this;
  }

  /**
   * Get _file
   * @return _file
   **/
  @JsonProperty(value = "file")
  @ApiModelProperty(value = "")
  @Valid 
  public ModelFile getFile() {
    return _file;
  }

  public void setFile(ModelFile _file) {
    this._file = _file;
  }

  public FileSchemaTestClass files(List<@Valid ModelFile> files) {
    this.files = files;
    return this;
  }

  public FileSchemaTestClass addFilesItem(ModelFile filesItem) {
    if (this.files == null) {
      this.files = new ArrayList<>();
    }
    this.files.add(filesItem);
    return this;
  }

  /**
   * Get files
   * @return files
   **/
  @JsonProperty(value = "files")
  @ApiModelProperty(value = "")
  @Valid 
  public List<@Valid ModelFile> getFiles() {
    return files;
  }

  public void setFiles(List<@Valid ModelFile> files) {
    this.files = files;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileSchemaTestClass fileSchemaTestClass = (FileSchemaTestClass) o;
    return Objects.equals(this._file, fileSchemaTestClass._file) &&
        Objects.equals(this.files, fileSchemaTestClass.files);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_file, files);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileSchemaTestClass {\n");
    
    sb.append("    _file: ").append(toIndentedString(_file)).append("\n");
    sb.append("    files: ").append(toIndentedString(files)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

