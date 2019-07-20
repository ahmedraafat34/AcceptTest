package com.example.accepttest.WebService.Requests;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class  ApiRequest {


    @Expose
    @SerializedName("api_key")
    private String apiKey;

    public ApiRequest(String apiKey) {
        this.apiKey = apiKey;
    }

}
