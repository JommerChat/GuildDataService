package com.parlantos.guild.models;

public class CreateGuildRequest {

  private String name;

  private String description;

  private String image;

  private Boolean publicFlag;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }

  public Boolean getPublicFlag() {
    return this.publicFlag;
  }

  public void setPublicFlag(Boolean publicFlag) {
    this.publicFlag = publicFlag;
  }
}
