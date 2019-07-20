package com.example.accepttest.WebService.Response;

import com.example.accepttest.Modls.Profile;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ApiResponse {


    @Expose
    @SerializedName("profile")
    private Profile profile;
    @Expose
    @SerializedName("token")
    private String token;

    public Profile getProfile() {
        return profile;
    }

    public String getToken() {
        return token;
    }
}
