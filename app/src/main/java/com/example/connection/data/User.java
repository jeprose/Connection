package com.example.connection.data;

import java.io.Serializable;

//@Entity
public class User implements Serializable {
    //@primaryKey
    private String displayName;


    public User(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
