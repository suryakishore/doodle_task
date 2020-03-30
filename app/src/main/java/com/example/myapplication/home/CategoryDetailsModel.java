package com.example.myapplication.home;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class CategoryDetailsModel  {

  @SerializedName("websiteBannerImageUrl")
  @Expose
  private String websiteBannerImageUrl;

  @SerializedName("imageUrl")
  @Expose
  private String imageUrl;

  @SerializedName("catName")
  @Expose
  private String catName;

  @SerializedName("bannerImageUrl")
  @Expose
  private String bannerImageUrl;

  @SerializedName("websiteImageUrl")
  @Expose
  private String websiteImageUrl;

  @SerializedName("id")
  @Expose
  private String id;

  @SerializedName("subCategory")
  @Expose
  private ArrayList<SubCategoryDetails> subCategory;
  @SerializedName("penCount")
  @Expose
  private int penCount;


  public int getPenCount() {
    return penCount;
  }

  public void setPenCount(int penCount) {
    this.penCount = penCount;
  }



  public String getWebsiteBannerImageUrl() {
    return websiteBannerImageUrl;
  }

  public void setWebsiteBannerImageUrl(String websiteBannerImageUrl) {
    this.websiteBannerImageUrl = websiteBannerImageUrl;
  }

  public String getImageUrl() {
    return imageUrl;
  }

  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }

  public String getCatName() {
    return catName;
  }

  public void setCatName(String catName) {
    this.catName = catName;
  }

  public String getBannerImageUrl() {
    return bannerImageUrl;
  }

  public void setBannerImageUrl(String bannerImageUrl) {
    this.bannerImageUrl = bannerImageUrl;
  }

  public String getWebsiteImageUrl() {
    return websiteImageUrl;
  }

  public void setWebsiteImageUrl(String websiteImageUrl) {
    this.websiteImageUrl = websiteImageUrl;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ArrayList<SubCategoryDetails> getSubCategory() {
    return subCategory;
  }

  public void setSubCategory(ArrayList<SubCategoryDetails> subCategory) {
    this.subCategory = subCategory;
  }
}
