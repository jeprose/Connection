package com.example.connection;

import android.os.Bundle;

import com.example.connection.data.Chats;
import com.example.connection.data.Message;
import com.example.connection.data.User;
import com.example.connection.data.model.LoggedInUser;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.widget.ListView;
import android.widget.ArrayAdapter;

import android.view.View;
import java.util.ArrayList;
public class MessageBoard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message_board);
        ListView listView = (ListView) findViewById(R.id.listview);

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

        ArrayAdapter messageAdapter = new ArrayAdapter(this, R.layout.listitem, loged.getChats());

        listView.setAdapter(messageAdapter);
    }

}
