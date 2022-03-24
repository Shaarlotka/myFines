package com.myfines.models;

public class User {
    private String name, email, password;

    public  User() {}

    public  User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setName() {
        this.name = name;
    }

    public void setEmail() {
        this.email = email;
    }

    public void setPassword() {
        this.password = password;
    }
}
