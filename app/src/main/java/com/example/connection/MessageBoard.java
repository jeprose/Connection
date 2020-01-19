package com.example.connection;

import android.os.Bundle;

import com.example.connection.data.Chats;
import com.example.connection.data.Message;
import com.example.connection.data.User;
import com.example.connection.data.model.LoggedInUser;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.ListAdapter;

import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MessageBoard extends AppCompatActivity {
    private ListView listView;
    private ListAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message_board);
        ArrayList<Chats> chatList = new ArrayList<Chats>();
        ArrayList<User> users= new ArrayList<User>();
        LoggedInUser loged= LoggedInUser.loggedin;
        User user1= new User("Santhoshi Ramanathan");
        User user2= new User("Ryan Stear");
        ArrayList<User> set1= new ArrayList<User>();
        set1.add(loged);
        set1.add(user1);
        loged.addChat(new Chats(set1,new ArrayList<Message>()));
        loged.getChat(0).messages.add(new Message(user1,"yo."));
        loged.getChat(0).messages.add(new Message(loged,"sup bro"));
        ArrayList<User> set2=new ArrayList<User>();
        set2.add(loged);
        set2.add(user2);
        loged.addChat(new Chats(set2,new ArrayList<Message>()));
        loged.getChat(1).messages.add(new Message(user2,"my homie."));
        loged.getChat(1).messages.add(new Message(loged,"sup bitchie."));
        TextView name1= findViewById(R.id.textViewName1);
        name1.setText(loged.getChat(0).users.get(1).getDisplayName());
        TextView chat1= findViewById(R.id.textViewChat1);
        chat1.setText(loged.getChat(0).messages.get(loged.getChat(0).messages.size()-1).text);
        TextView name2= findViewById(R.id.textViewName2);
        name2.setText(loged.getChat(1).users.get(1).getDisplayName());
        TextView chat2= findViewById(R.id.textViewChat2);
        chat1.setText(loged.getChat(1).messages.get(loged.getChat(1).messages.size()-1).text);
        // specify an adapter (see also next example)
    }

}
