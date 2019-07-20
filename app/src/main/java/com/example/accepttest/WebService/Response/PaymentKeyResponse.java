package com.example.accepttest.WebService.Response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public abstract class PaymentKeyResponse {


    @Expose
    @SerializedName("token")
    private String token;

    public String getToken() {
        return token;
    }
}
