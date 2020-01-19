package com.example.connection;

public class Message extends MessageBoard {

    private String title;

    public Message(String t) {
        title = t;
    }

    public String toString(){
        return title;
    }
}
