package com.example.accepttest.WebService.Requests;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class OrderRequest {


    @Expose
    @SerializedName("items")
    private List<String> items;
    @Expose
    @SerializedName("merchant_order_id")
    private String merchantOrderId;
    @Expose
    @SerializedName("currency")
    private String currency;
    @Expose
    @SerializedName("amount_cents")
    private String amountCents;
    @Expose
    @SerializedName("merchant_id")
    private String merchantId;
    @Expose
    @SerializedName("delivery_needed")
    private String deliveryNeeded;
    @Expose
    @SerializedName("auth_token")
    private String authToken;

    public OrderRequest(List<String> items, String merchantOrderId, String currency, String amountCents, String merchantId, String deliveryNeeded, String authToken) {
        this.items = items;
        this.merchantOrderId = merchantOrderId;
        this.currency = currency;
        this.amountCents = amountCents;
        this.merchantId = merchantId;
        this.deliveryNeeded = deliveryNeeded;
        this.authToken = authToken;
    }

    public List<String> getItems() {
        return items;
    }

    public String getMerchantOrderId() {
        return merchantOrderId;
    }

    public String getCurrency() {
        return currency;
    }

    public String getAmountCents() {
        return amountCents;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public String getDeliveryNeeded() {
        return deliveryNeeded;
    }

    public String getAuthToken() {
        return authToken;
    }
}
