package com.example.springMongo.models;

import java.util.List;

public class UserModel {
    private String id;
    private String userName;
    private String password;
    private String email;
    private String firstName;
    private String lastName;
    private List<UserModel> followers;

    public UserModel() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<UserModel> getFollowers() {
        return followers;
    }

    public void setFollowers(List<UserModel> followers) {
        this.followers = followers;
    }

}
