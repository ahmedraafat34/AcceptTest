package com.example.accepttest.Modls;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Merchant {
    @Expose
    @SerializedName("street")
    private String street;
    @Expose
    @SerializedName("postal_code")
    private String postalCode;
    @Expose
    @SerializedName("city")
    private String city;
    @Expose
    @SerializedName("country")
    private String country;
    @Expose
    @SerializedName("state")
    private String state;
    @Expose
    @SerializedName("company_name")
    private String companyName;
    @Expose
    @SerializedName("company_emails")
    private List<String> companyEmails;
    @Expose
    @SerializedName("phones")
    private List<String> phones;
    @Expose
    @SerializedName("created_at")
    private String createdAt;
    @Expose
    @SerializedName("id")
    private int id;

    public String getStreet() {
        return street;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public String getState() {
        return state;
    }

    public String getCompanyName() {
        return companyName;
    }

    public List<String> getCompanyEmails() {
        return companyEmails;
    }

    public List<String> getPhones() {
        return phones;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public int getId() {
        return id;
    }
}
