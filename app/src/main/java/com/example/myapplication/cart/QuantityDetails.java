package com.example.myapplication.cart;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class QuantityDetails {

  @Expose
  @SerializedName("unit")
  private String unit;

  @Expose
  @SerializedName("value")
  private String value;

  public QuantityDetails(String unit, String value) {
    this.unit = unit;
    this.value = value;
  }

  public String getUnit() {
    return unit;
  }

  public void setUnit(String unit) {
    this.unit = unit;
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }
}
