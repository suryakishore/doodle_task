package com.example.myapplication.cart;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CartData {
    @Expose
    @SerializedName("data")
    private CartDetails data;
    @Expose
    @SerializedName("message")
    private String message;

    public CartDetails getData ()
    {
        return data;
    }

    public void setData (CartDetails data)
    {
        this.data = data;
    }

    public String getMessage ()
    {
        return message;
    }

    public void setMessage (String message)
    {
        this.message = message;
    }
}
