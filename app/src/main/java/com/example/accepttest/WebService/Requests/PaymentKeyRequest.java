package com.example.accepttest.WebService.Requests;

import com.example.accepttest.Modls.BillingData;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public  class PaymentKeyRequest {


    @Expose
    @SerializedName("integration_id")
    private int integrationId;
    @Expose
    @SerializedName("currency")
    private String currency;
    @Expose
    @SerializedName("billing_data")
    private BillingData billingData;
    @Expose
    @SerializedName("order_id")
    private String orderId;
    @Expose
    @SerializedName("expiration")
    private int expiration;
    @Expose
    @SerializedName("amount_cents")
    private String amountCents;

    public PaymentKeyRequest(int integrationId, String currency, BillingData billingData, String orderId, int expiration, String amountCents, String authToken) {
        this.integrationId = integrationId;
        this.currency = currency;
        this.billingData = billingData;
        this.orderId = orderId;
        this.expiration = expiration;
        this.amountCents = amountCents;
        this.authToken = authToken;
    }

    @Expose
    @SerializedName("auth_token")


    private String authToken;

    public int getIntegrationId() {
        return integrationId;
    }

    public String getCurrency() {
        return currency;
    }

    public BillingData getBillingData() {
        return billingData;
    }

    public String getOrderId() {
        return orderId;
    }

    public int getExpiration() {
        return expiration;
    }

    public String getAmountCents() {
        return amountCents;
    }

    public String getAuthToken() {
        return authToken;
    }
}
