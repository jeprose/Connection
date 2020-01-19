package com.example.connection.data;
import java.io.Serializable;
import java.util.ArrayList;
public class Chats implements Serializable {
    ArrayList<User> users;
    public ArrayList<Message> messages;
    public Chats(ArrayList<User> use, ArrayList<Message> messag){
        users=use;
        messages=messag;
    }
    public String toString(){
        return users.get(1).getDisplayName()+"\n"+messages.get(messages.size()-1).text;
    }
}
