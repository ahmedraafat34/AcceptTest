package com.example.accepttest.Modls;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BillingData {
    @Expose
    @SerializedName("state")
    private String state;
    @Expose
    @SerializedName("last_name")
    private String lastName;
    @Expose
    @SerializedName("country")
    private String country;
    @Expose
    @SerializedName("city")
    private String city;
    @Expose
    @SerializedName("postal_code")
    private String postalCode;
    @Expose
    @SerializedName("shipping_method")
    private String shippingMethod;
    @Expose
    @SerializedName("phone_number")
    private String phoneNumber;
    @Expose
    @SerializedName("building")
    private String building;
    @Expose
    @SerializedName("street")
    private String street;
    @Expose
    @SerializedName("first_name")
    private String firstName;
    @Expose
    @SerializedName("floor")
    private String floor;
    @Expose
    @SerializedName("email")
    private String email;
    @Expose
    @SerializedName("apartment")
    private String apartment;

    public BillingData(String state, String lastName, String country, String city, String postalCode, String shippingMethod, String phoneNumber, String building, String street, String firstName, String floor, String email, String apartment) {
        this.state = state;
        this.lastName = lastName;
        this.country = country;
        this.city = city;
        this.postalCode = postalCode;
        this.shippingMethod = shippingMethod;
        this.phoneNumber = phoneNumber;
        this.building = building;
        this.street = street;
        this.firstName = firstName;
        this.floor = floor;
        this.email = email;
        this.apartment = apartment;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public void setShippingMethod(String shippingMethod) {
        this.shippingMethod = shippingMethod;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public void setApartment(String apartment) {
        this.apartment = apartment;
    }

    public String getState() {
        return state;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getShippingMethod() {
        return shippingMethod;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getBuilding() {
        return building;
    }

    public String getStreet() {
        return street;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getFloor() {
        return floor;
    }

    public String getEmail() {
        return email;
    }

    public String getApartment() {
        return apartment;
    }
}
