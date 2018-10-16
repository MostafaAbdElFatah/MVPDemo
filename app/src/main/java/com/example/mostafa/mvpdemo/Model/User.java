package com.example.mostafa.mvpdemo.Model;

import android.support.annotation.NonNull;

public class User {

    private String name = "", email = "";

    public User() {
    }

    public User(String fullName, String email) {
        this.name = fullName;
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    @NonNull
    @Override
    public String toString() {
        return "Email : " + email + "\nFullName : " + name;
    }
}
