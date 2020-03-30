package com.example.myapplication.cart;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class CartSellerDetails {

  @Expose
  @SerializedName("targetAmtForFreeDelivery")
  private String targetAmtForFreeDelivery;

  @Expose
  @SerializedName("sellerCartValue")
  private String sellerCartValue;

  @Expose
  @SerializedName("freeDelivery")
  private String freeDelivery;

  @Expose
  @SerializedName("fullFillMentCenterId")
  private String fullFillMentCenterId;

  @Expose
  @SerializedName("minOrder")
  private String minOrder;

  @Expose
  @SerializedName("driverType")
  private String driverType;

  @Expose
  @SerializedName("products")
  private ArrayList<CartProductItemDetails> products;

  @Expose
  @SerializedName("fullfilledBy")
  private String fullfilledBy;


  @Expose
  @SerializedName("phone")
  private String phone;


  @Expose
  @SerializedName("autoDispatch")
  private String autoDispatch;

  @Expose
  @SerializedName("autoAcceptOrders")
  private String autoAcceptOrders;

  @Expose
  @SerializedName("isInventoryCheck")
  private String isInventoryCheck;

  @Expose
  @SerializedName("name")
  private String name;


  public String getTargetAmtForFreeDelivery() {
    return targetAmtForFreeDelivery;
  }

  public void setTargetAmtForFreeDelivery(String targetAmtForFreeDelivery) {
    this.targetAmtForFreeDelivery = targetAmtForFreeDelivery;
  }

  public String getSellerCartValue() {
    return sellerCartValue;
  }

  public void setSellerCartValue(String sellerCartValue) {
    this.sellerCartValue = sellerCartValue;
  }

  public String getFreeDelivery() {
    return freeDelivery;
  }

  public void setFreeDelivery(String freeDelivery) {
    this.freeDelivery = freeDelivery;
  }

  public String getFullFillMentCenterId() {
    return fullFillMentCenterId;
  }

  public void setFullFillMentCenterId(String fullFillMentCenterId) {
    this.fullFillMentCenterId = fullFillMentCenterId;
  }

  public String getMinOrder() {
    return minOrder;
  }

  public void setMinOrder(String minOrder) {
    this.minOrder = minOrder;
  }

  public String getDriverType() {
    return driverType;
  }

  public void setDriverType(String driverType) {
    this.driverType = driverType;
  }

  public ArrayList<CartProductItemDetails> getProducts() {
    return products;
  }

  public void setProducts(
          ArrayList<CartProductItemDetails> products) {
    this.products = products;
  }

  public String getFullfilledBy() {
    return fullfilledBy;
  }

  public void setFullfilledBy(String fullfilledBy) {
    this.fullfilledBy = fullfilledBy;
  }


  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }


  public String getAutoDispatch() {
    return autoDispatch;
  }

  public void setAutoDispatch(String autoDispatch) {
    this.autoDispatch = autoDispatch;
  }

  public String getAutoAcceptOrders() {
    return autoAcceptOrders;
  }

  public void setAutoAcceptOrders(String autoAcceptOrders) {
    this.autoAcceptOrders = autoAcceptOrders;
  }

  public String getIsInventoryCheck() {
    return isInventoryCheck;
  }

  public void setIsInventoryCheck(String isInventoryCheck) {
    this.isInventoryCheck = isInventoryCheck;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

}
