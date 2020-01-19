package com.example.connection.data;

import java.io.Serializable;

public class Message implements Serializable {
    public User thisuser;
    public String text;
    public Message(User usert, String textt){
        thisuser=usert;
        text=textt;
    }

}
