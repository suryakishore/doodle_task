package com.example.myapplication.home;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class CategoryDetail  {

  @SerializedName("data")
  @Expose
  private ArrayList<CategoryDetailsModel> data;

  @SerializedName("message")
  @Expose
  private String message;

  public ArrayList<CategoryDetailsModel> getData() {
    return data;
  }

  public void setData(ArrayList<CategoryDetailsModel> data) {
    this.data = data;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }


}
