package com.example.connection.data.model;
import com.example.connection.data.Chats;
import com.example.connection.data.User;

import java.util.ArrayList;
/**
 * Data class that captures user information for logged in users retrieved from LoginRepository
 */
public class LoggedInUser extends User {
    public static LoggedInUser loggedin;
    private ArrayList<Chats> chats;
    private ArrayList<String> interests;
    public LoggedInUser(String displayNameArrayList){
        super(displayNameArrayList);
        chats=new ArrayList<Chats>();
        interests=new ArrayList<String>();
        loggedin=this;
    }
    public LoggedInUser getLoggedinUser(){
        return loggedin;
    }
    public Chats getChat(int i){
        return chats.get(i);
    }
    public ArrayList<Chats> getChats(){
        return chats;
    }
    public void addChat(Chats i){
        chats.add(i);
    }
}
