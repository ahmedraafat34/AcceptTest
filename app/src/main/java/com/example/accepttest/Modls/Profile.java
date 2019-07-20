package com.example.accepttest.Modls;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Profile {
    @Expose
    @SerializedName("sales_owner")
    private int salesOwner;
    @Expose
    @SerializedName("is_new_standalone_url")
    private boolean isNewStandaloneUrl;
    @Expose
    @SerializedName("is_live")
    private boolean isLive;
    @Expose
    @SerializedName("delivery_status_callback")
    private String deliveryStatusCallback;
    @Expose
    @SerializedName("custom_export_columns")
    private List<String> customExportColumns;
    @Expose
    @SerializedName("failed_attempts")
    private int failedAttempts;
    @Expose
    @SerializedName("email_notification")
    private boolean emailNotification;
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
    @SerializedName("profile_type")
    private String profileType;
    @Expose
    @SerializedName("active")
    private boolean active;
    @Expose
    @SerializedName("created_at")
    private String createdAt;
    @Expose
    @SerializedName("user")
    private User user;
    @Expose
    @SerializedName("id")
    private int id;

    public int getSalesOwner() {
        return salesOwner;
    }

    public boolean getIsNewStandaloneUrl() {
        return isNewStandaloneUrl;
    }

    public boolean getIsLive() {
        return isLive;
    }

    public String getDeliveryStatusCallback() {
        return deliveryStatusCallback;
    }

    public List<String> getCustomExportColumns() {
        return customExportColumns;
    }

    public int getFailedAttempts() {
        return failedAttempts;
    }

    public boolean getEmailNotification() {
        return emailNotification;
    }

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

    public String getProfileType() {
        return profileType;
    }

    public boolean getActive() {
        return active;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public User getUser() {
        return user;
    }

    public int getId() {
        return id;
    }
}
