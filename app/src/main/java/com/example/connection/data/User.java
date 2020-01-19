package com.example.connection.data;
//@Entity
public class User {
    //@primaryKey
    private String displayName;


    public User(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
