package com.example.connection.data.model;
import com.example.connection.data.Chats;
import com.example.connection.data.User;
import com.example.connection.data.Interests;
import java.util.ArrayList;
/**
 * Data class that captures user information for logged in users retrieved from LoginRepository
 */
public class LoggedInUser extends User {
    private ArrayList<Chats> chats;
    private ArrayList<Interests> interests;
    public LoggedInUser(String userId, String displayNameArrayList){
        super(userId,displayNameArrayList);
        chats=new ArrayList<Chats>();
        interests=new ArrayList<Interests>();
    }
}
