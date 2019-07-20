package com.example.accepttest.Modls;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class User {
    @Expose
    @SerializedName("user_permissions")
    private List<Integer> userPermissions;
    @Expose
    @SerializedName("groups")
    private List<String> groups;
    @Expose
    @SerializedName("is_superuser")
    private boolean isSuperuser;
    @Expose
    @SerializedName("is_staff")
    private boolean isStaff;
    @Expose
    @SerializedName("is_active")
    private boolean isActive;
    @Expose
    @SerializedName("email")
    private String email;
    @Expose
    @SerializedName("date_joined")
    private String dateJoined;
    @Expose
    @SerializedName("last_name")
    private String lastName;
    @Expose
    @SerializedName("first_name")
    private String firstName;
    @Expose
    @SerializedName("username")
    private String username;
    @Expose
    @SerializedName("id")
    private int id;

    public List<Integer> getUserPermissions() {
        return userPermissions;
    }

    public List<String> getGroups() {
        return groups;
    }

    public boolean getIsSuperuser() {
        return isSuperuser;
    }

    public boolean getIsStaff() {
        return isStaff;
    }

    public boolean getIsActive() {
        return isActive;
    }

    public String getEmail() {
        return email;
    }

    public String getDateJoined() {
        return dateJoined;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getUsername() {
        return username;
    }

    public int getId() {
        return id;
    }
}
