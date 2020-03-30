package com.example.myapplication.cart;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class CartDetails {
  @Expose
  @SerializedName("notes")
  private String notes;
  @Expose
  @SerializedName("cartTotalTax")
  private String cartTotalTax;
  @Expose
  @SerializedName("storeTypeId")
  private String storeTypeId;
  @Expose
  @SerializedName("subTotal")
  private String subTotal;

  @Expose
  @SerializedName("cartType")
  private String cartType;
  @Expose
  @SerializedName("seqId")
  private String seqId;

  @Expose
  @SerializedName("storeType")
  private String storeType;
  @Expose
  @SerializedName("grandTotal")
  private String grandTotal;
  @Expose
  @SerializedName("currencySymbol")
  private String currencySymbol;
  @Expose
  @SerializedName("storeCategory")
  private String storeCategory;

  @Expose
  @SerializedName("deliveryFee")
  private String deliveryFee;
  @Expose
  @SerializedName("userTypeMsg")
  private String userTypeMsg;
  @Expose
  @SerializedName("storeCategoryId")
  private String storeCategoryId;
  @Expose
  @SerializedName("subtotal")
  private String subtotal;
  @Expose
  @SerializedName("totalCartquantity")
  private String totalCartquantity;
  @Expose
  @SerializedName("cartTypeInTxt")
  private String cartTypeInTxt;
  @Expose
  @SerializedName("totalDiscount")
  private String totalDiscount;
  @Expose
  @SerializedName("_id")
  private String _id;
  @Expose
  @SerializedName("userType")
  private String userType;
  @Expose
  @SerializedName("totalAppliedTaxOnCart")
  private String totalAppliedTaxOnCart;

  @Expose
  @SerializedName("currencyCode")
  private String currencyCode;
  @Expose
  @SerializedName("accounting")
  private CartAccountingDetails accounting;
  @Expose
  @SerializedName("sellers")
  private ArrayList<CartSellerDetails> sellers;



  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }

  public CartAccountingDetails getAccounting() {
    return accounting;
  }

  public void setAccounting(
      CartAccountingDetails accounting) {
    this.accounting = accounting;
  }

  public String getCartTotalTax() {
    return cartTotalTax;
  }

  public void setCartTotalTax(String cartTotalTax) {
    this.cartTotalTax = cartTotalTax;
  }

  public String getStoreTypeId() {
    return storeTypeId;
  }

  public void setStoreTypeId(String storeTypeId) {
    this.storeTypeId = storeTypeId;
  }

  public String getSubTotal() {
    return subTotal;
  }

  public void setSubTotal(String subTotal) {
    this.subTotal = subTotal;
  }



  public String getCartType() {
    return cartType;
  }

  public void setCartType(String cartType) {
    this.cartType = cartType;
  }

  public String getSeqId() {
    return seqId;
  }

  public void setSeqId(String seqId) {
    this.seqId = seqId;
  }



  public String getStoreType() {
    return storeType;
  }

  public void setStoreType(String storeType) {
    this.storeType = storeType;
  }

  public String getGrandTotal() {
    return grandTotal;
  }

  public void setGrandTotal(String grandTotal) {
    this.grandTotal = grandTotal;
  }

  public String getCurrencySymbol() {
    return currencySymbol;
  }

  public void setCurrencySymbol(String currencySymbol) {
    this.currencySymbol = currencySymbol;
  }

  public String getStoreCategory() {
    return storeCategory;
  }

  public void setStoreCategory(String storeCategory) {
    this.storeCategory = storeCategory;
  }


  public String getDeliveryFee() {
    return deliveryFee;
  }

  public void setDeliveryFee(String deliveryFee) {
    this.deliveryFee = deliveryFee;
  }

  public String getUserTypeMsg() {
    return userTypeMsg;
  }

  public void setUserTypeMsg(String userTypeMsg) {
    this.userTypeMsg = userTypeMsg;
  }

  public String getStoreCategoryId() {
    return storeCategoryId;
  }

  public void setStoreCategoryId(String storeCategoryId) {
    this.storeCategoryId = storeCategoryId;
  }

  public String getSubtotal() {
    return subtotal;
  }

  public void setSubtotal(String subtotal) {
    this.subtotal = subtotal;
  }

  public String getTotalCartquantity() {
    return totalCartquantity;
  }

  public void setTotalCartquantity(String totalCartquantity) {
    this.totalCartquantity = totalCartquantity;
  }

  public String getCartTypeInTxt() {
    return cartTypeInTxt;
  }

  public void setCartTypeInTxt(String cartTypeInTxt) {
    this.cartTypeInTxt = cartTypeInTxt;
  }

  public String getTotalDiscount() {
    return totalDiscount;
  }

  public void setTotalDiscount(String totalDiscount) {
    this.totalDiscount = totalDiscount;
  }

  public String get_id() {
    return _id;
  }

  public void set_id(String _id) {
    this._id = _id;
  }

  public String getUserType() {
    return userType;
  }

  public void setUserType(String userType) {
    this.userType = userType;
  }

  public String getTotalAppliedTaxOnCart() {
    return totalAppliedTaxOnCart;
  }

  public void setTotalAppliedTaxOnCart(String totalAppliedTaxOnCart) {
    this.totalAppliedTaxOnCart = totalAppliedTaxOnCart;
  }



  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public ArrayList<CartSellerDetails> getSellers() {
    return sellers;
  }

  public void setSellers(
      ArrayList<CartSellerDetails> sellers) {
    this.sellers = sellers;
  }
}
