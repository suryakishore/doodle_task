package com.example.myapplication.cart;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class CartProductItemDetails {
  @Expose
  @SerializedName("upcNumber")
  private String upcNumber;
  @Expose
  @SerializedName("color")
  private String color;
  @Expose
  @SerializedName("originalPrice")
  private String originalPrice;
  @Expose
  @SerializedName("noofunits")
  private String noofunits;
  @Expose
  @SerializedName("availableQuantity")
  private int availableQuantity;

  @Expose
  @SerializedName("discount")
  private String discount;
  @Expose
  @SerializedName("finalPrice")
  private String finalPrice;
  @Expose
  @SerializedName("aisle")
  private String aisle;
  @Expose
  @SerializedName("packageType")
  private String packageType;
  @Expose
  @SerializedName("centralProductId")
  private String centralProductId;
  @Expose
  @SerializedName("offerType")
  private String offerType;

  @Expose
  @SerializedName("unitId")
  private String unitId;
  @Expose
  @SerializedName("storeName")
  private String storeName;
  @Expose
  @SerializedName("inStock")
  private String inStock;

  /* @Expose
   @SerializedName("mouData")
  private String mouData;*/
  @Expose
  @SerializedName("offerTitle")
  private String offerTitle;
  @Expose
  @SerializedName("images")
  private ImagesDetails images;
  @Expose
  @SerializedName("brandName")
  private String brandName;
  @Expose
  @SerializedName("quantity")
  private QuantityDetails quantity;
  @Expose
  @SerializedName("originalPriceTotal")
  private String originalPriceTotal;
  @Expose
  @SerializedName("addOns")
  private ArrayList<String> addOns;
  @Expose
  @SerializedName("currencySymbol")
  private String currencySymbol;
  @Expose
  @SerializedName("accounting")
  private CartAccountingDetails accounting;


  @Expose
  @SerializedName("storeId")
  private String storeId;

  @Expose
  @SerializedName("shelf")
  private String shelf;
  @Expose
  @SerializedName("offerDiscount")
  private String offerDiscount;
  @Expose
  @SerializedName("isCentral")
  private String isCentral;
  @Expose
  @SerializedName("totalAppliedTaxOnProduct")
  private String totalAppliedTaxOnProduct;
  @Expose
  @SerializedName("discountedPrice")
  private String discountedPrice;
  @Expose
  @SerializedName("directions")
  private String directions;
  @Expose
  @SerializedName("name")
  private String name;
  @Expose
  @SerializedName("offerId")
  private String offerId;
  @Expose
  @SerializedName("offerValue")
  private String offerValue;

  @Expose
  @SerializedName("_id")
  private String _id;
  @Expose
  @SerializedName("currencyCode")
  private String currencyCode;



  public String getUpcNumber() {
    return upcNumber;
  }

  public void setUpcNumber(String upcNumber) {
    this.upcNumber = upcNumber;
  }


  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String getOriginalPrice() {
    return originalPrice;
  }

  public void setOriginalPrice(String originalPrice) {
    this.originalPrice = originalPrice;
  }

  public String getOfferValue() {
    return offerValue;
  }

  public void setOfferValue(String offerValue) {
    this.offerValue = offerValue;
  }

  public String getNoofunits() {
    return noofunits;
  }

  public void setNoofunits(String noofunits) {
    this.noofunits = noofunits;
  }

  public String getDiscount() {
    return discount;
  }

  public void setDiscount(String discount) {
    this.discount = discount;
  }

  public String getFinalPrice() {
    return finalPrice;
  }

  public void setFinalPrice(String finalPrice) {
    this.finalPrice = finalPrice;
  }

  public Integer getAvailableQuantity() {
    return availableQuantity;
  }

  public void setAvailableQuantity(Integer availableQuantity) {
    this.availableQuantity = availableQuantity;
  }

  public String getAisle() {
    return aisle;
  }

  public void setAisle(String aisle) {
    this.aisle = aisle;
  }

  public String getPackageType() {
    return packageType;
  }

  public void setPackageType(String packageType) {
    this.packageType = packageType;
  }

  public String getCentralProductId() {
    return centralProductId;
  }

  public void setCentralProductId(String centralProductId) {
    this.centralProductId = centralProductId;
  }

  public String getOfferType() {
    return offerType;
  }

  public void setOfferType(String offerType) {
    this.offerType = offerType;
  }


  public String getUnitId() {
    return unitId;
  }

  public void setUnitId(String unitId) {
    this.unitId = unitId;
  }

  public String getStoreName() {
    return storeName;
  }

  public void setStoreName(String storeName) {
    this.storeName = storeName;
  }

  public String getInStock() {
    return inStock;
  }

  public void setInStock(String inStock) {
    this.inStock = inStock;
  }



  public String getOfferTitle() {
    return offerTitle;
  }

  public void setOfferTitle(String offerTitle) {
    this.offerTitle = offerTitle;
  }

  public ImagesDetails getImages() {
    return images;
  }

  public void setImages(ImagesDetails images) {
    this.images = images;
  }

  public String getBrandName() {
    return brandName;
  }

  public void setBrandName(String brandName) {
    this.brandName = brandName;
  }


  public String getOriginalPriceTotal() {
    return originalPriceTotal;
  }

  public void setOriginalPriceTotal(String originalPriceTotal) {
    this.originalPriceTotal = originalPriceTotal;
  }

  public ArrayList<String> getAddOns() {
    return addOns;
  }

  public void setAddOns(ArrayList<String> addOns) {
    this.addOns = addOns;
  }

  public String getCurrencySymbol() {
    return currencySymbol;
  }

  public void setCurrencySymbol(String currencySymbol) {
    this.currencySymbol = currencySymbol;
  }





  public String getStoreId() {
    return storeId;
  }

  public void setStoreId(String storeId) {
    this.storeId = storeId;
  }



  public String getShelf() {
    return shelf;
  }

  public void setShelf(String shelf) {
    this.shelf = shelf;
  }

  public String getOfferDiscount() {
    return offerDiscount;
  }

  public void setOfferDiscount(String offerDiscount) {
    this.offerDiscount = offerDiscount;
  }

  public String getIsCentral() {
    return isCentral;
  }

  public void setIsCentral(String isCentral) {
    this.isCentral = isCentral;
  }

  public String getTotalAppliedTaxOnProduct() {
    return totalAppliedTaxOnProduct;
  }

  public void setTotalAppliedTaxOnProduct(String totalAppliedTaxOnProduct) {
    this.totalAppliedTaxOnProduct = totalAppliedTaxOnProduct;
  }

  public String getDiscountedPrice() {
    return discountedPrice;
  }

  public void setDiscountedPrice(String discountedPrice) {
    this.discountedPrice = discountedPrice;
  }

  public String getDirections() {
    return directions;
  }

  public void setDirections(String directions) {
    this.directions = directions;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getOfferId() {
    return offerId;
  }

  public void setOfferId(String offerId) {
    this.offerId = offerId;
  }



  public String get_id() {
    return _id;
  }

  public void set_id(String _id) {
    this._id = _id;
  }

  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public void setAvailableQuantity(int availableQuantity) {
    this.availableQuantity = availableQuantity;
  }

  public QuantityDetails getQuantity() {
    return quantity;
  }

  public void setQuantity(QuantityDetails quantity) {
    this.quantity = quantity;
  }

  public CartAccountingDetails getAccounting() {
    return accounting;
  }

  public void setAccounting(CartAccountingDetails accounting) {
    this.accounting = accounting;
  }
}
