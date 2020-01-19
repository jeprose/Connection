package com.example.connection.data;
import java.util.ArrayList;
public class Chats {
    ArrayList<User> users;
    ArrayList<Message> messages;
    public Chats(ArrayList<User> use, ArrayList<Message> messag){
        users=use;
        messages=messag;
    }
    public String toString(){
        return users.get(1).getDisplayName()+"\n";
    }
}
