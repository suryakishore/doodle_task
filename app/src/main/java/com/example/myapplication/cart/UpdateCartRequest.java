package com.example.myapplication.cart;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UpdateCartRequest {

  @SerializedName("userType")
  @Expose
  private int userType;

  @SerializedName("centralProductId")
  @Expose
  private String centralProductId;
  @SerializedName("productId")
  @Expose
  private String productId;
  @SerializedName("unitId")
  @Expose
  private String unitId;
  @SerializedName("storeId")
  @Expose
  private String storeId;
  @SerializedName("storeTypeId")
  @Expose
  private int storeTypeId;
  @SerializedName("productName")
  @Expose
  private String productName;
  @SerializedName("estimatedProductPrice")
  @Expose
  private String estimatedProductPrice;
  @SerializedName("extraNotes")
  @Expose
  private String extraNotes;
  @SerializedName("newQuantity")
  @Expose
  private int newQuantity;
  @SerializedName("oldQuantity")
  @Expose
  private int oldQuantity;
  @SerializedName("action")
  @Expose
  private int action;

  public UpdateCartRequest(int userType, String centralProductId,
                           String productId, String unitId, String storeId, int storeTypeId, String productName,
                           String estimatedProductPrice, String extraNotes, int newQuantity, int oldQuantity,
                           int action) {
    this.userType = userType;
    this.centralProductId = centralProductId;
    this.productId = productId;
    this.unitId = unitId;
    this.storeId = storeId;
    this.storeTypeId = storeTypeId;
    this.productName = productName;
    this.estimatedProductPrice = estimatedProductPrice;
    this.extraNotes = extraNotes;
    this.newQuantity = newQuantity;
    this.oldQuantity = oldQuantity;
    this.action = action;
  }

  public int getUserType() {
    return userType;
  }

  public void setUserType(int userType) {
    this.userType = userType;
  }



  public String getCentralProductId() {
    return centralProductId;
  }

  public void setCentralProductId(String centralProductId) {
    this.centralProductId = centralProductId;
  }

  public String getProductId() {
    return productId;
  }

  public void setProductId(String productId) {
    this.productId = productId;
  }

  public String getUnitId() {
    return unitId;
  }

  public void setUnitId(String unitId) {
    this.unitId = unitId;
  }

  public String getStoreId() {
    return storeId;
  }

  public void setStoreId(String storeId) {
    this.storeId = storeId;
  }

  public int getStoreTypeId() {
    return storeTypeId;
  }

  public void setStoreTypeId(int storeTypeId) {
    this.storeTypeId = storeTypeId;
  }

  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }

  public String getEstimatedProductPrice() {
    return estimatedProductPrice;
  }

  public void setEstimatedProductPrice(String estimatedProductPrice) {
    this.estimatedProductPrice = estimatedProductPrice;
  }

  public String getExtraNotes() {
    return extraNotes;
  }

  public void setExtraNotes(String extraNotes) {
    this.extraNotes = extraNotes;
  }

  public int getNewQuantity() {
    return newQuantity;
  }

  public void setNewQuantity(int newQuantity) {
    this.newQuantity = newQuantity;
  }

  public int getOldQuantity() {
    return oldQuantity;
  }

  public void setOldQuantity(int oldQuantity) {
    this.oldQuantity = oldQuantity;
  }

  public int getAction() {
    return action;
  }

  public void setAction(int action) {
    this.action = action;
  }
}
