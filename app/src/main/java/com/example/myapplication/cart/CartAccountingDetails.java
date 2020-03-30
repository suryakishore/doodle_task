package com.example.myapplication.cart;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CartAccountingDetails {
    @Expose
    @SerializedName("unitPrice")
    private String unitPrice;
    @Expose
    @SerializedName("offerDiscount")
    private String offerDiscount;
    @Expose
    @SerializedName("taxableAmount")
    private String taxableAmount;
    @Expose
    @SerializedName("deliveryFee")
    private String deliveryFee;
    @Expose
    @SerializedName("finalUnitPrice")
    private String finalUnitPrice;
    @Expose
    @SerializedName("addOnsAmount")
    private String addOnsAmount;

    @Expose
    @SerializedName("subTotal")
    private String subTotal;
    @Expose
    @SerializedName("taxAmount")
    private String taxAmount;
    @Expose
    @SerializedName("promoDiscount")
    private String promoDiscount;
    @Expose
    @SerializedName("finalTotal")
    private String finalTotal;


    public String getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(String unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getOfferDiscount() {
        return offerDiscount;
    }

    public void setOfferDiscount(String offerDiscount) {
        this.offerDiscount = offerDiscount;
    }

    public String getTaxableAmount() {
        return taxableAmount;
    }

    public void setTaxableAmount(String taxableAmount) {
        this.taxableAmount = taxableAmount;
    }

    public String getDeliveryFee() {
        return deliveryFee;
    }

    public void setDeliveryFee(String deliveryFee) {
        this.deliveryFee = deliveryFee;
    }

    public String getFinalUnitPrice() {
        return finalUnitPrice;
    }

    public void setFinalUnitPrice(String finalUnitPrice) {
        this.finalUnitPrice = finalUnitPrice;
    }

    public String getAddOnsAmount() {
        return addOnsAmount;
    }

    public void setAddOnsAmount(String addOnsAmount) {
        this.addOnsAmount = addOnsAmount;
    }


    public String getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(String subTotal) {
        this.subTotal = subTotal;
    }

    public String getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(String taxAmount) {
        this.taxAmount = taxAmount;
    }

    public String getPromoDiscount() {
        return promoDiscount;
    }

    public void setPromoDiscount(String promoDiscount) {
        this.promoDiscount = promoDiscount;
    }

    public String getFinalTotal() {
        return finalTotal;
    }

    public void setFinalTotal(String finalTotal) {
        this.finalTotal = finalTotal;
    }
}
