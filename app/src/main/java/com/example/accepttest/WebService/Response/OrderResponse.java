package com.example.accepttest.WebService.Response;

import com.example.accepttest.Modls.Merchant;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class OrderResponse {


    @Expose
    @SerializedName("merchant")
    private Merchant merchant;
    @Expose
    @SerializedName("delivery_needed")
    private boolean deliveryNeeded;
    @Expose
    @SerializedName("created_at")
    private String createdAt;
    @Expose
    @SerializedName("id")
    private int id;

    public Merchant getMerchant() {
        return merchant;
    }

    public boolean isDeliveryNeeded() {
        return deliveryNeeded;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public int getId() {
        return id;
    }
}
