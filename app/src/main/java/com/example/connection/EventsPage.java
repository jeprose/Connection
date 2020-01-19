package com.example.connection;

import android.os.Bundle;

import com.example.connection.data.Chats;
import com.example.connection.data.model.LoggedInUser;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView;
import android.content.Intent;
import android.util.Log;

import android.view.View;

import java.lang.reflect.Array;
import java.util.ArrayList;
import com.example.connection.data.User;
import com.example.connection.data.Message;
public class EventsPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events_page);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ListView  listView = findViewById(R.id.listview);

        ArrayList<Chats> chatList = new ArrayList<Chats>();
        ArrayList<User> users= new ArrayList<User>();
        LoggedInUser loged= LoggedInUser.loggedin;
        User user1= new User("Santhoshi Ramanathan");
        User user2= new User("Ryan Stear");
        ArrayList<User> set1= new ArrayList<User>();
        set1.add(loged);
        set1.add(user1);
        loged.addChat(new Chats(set1,new ArrayList<Message>()));
        ArrayList<User> set2=new ArrayList<User>();
        set2.add(loged);
        set2.add(user2);
        loged.addChat(new Chats(set2,new ArrayList<Message>()));

        ArrayAdapter eventAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, loged.getChats());

        listView.setAdapter(eventAdapter);
    }

    /*public void onItemClick(AdapterView<?> l, View v, int position, long id) {
        Log.i("HelloListView", "You clicked Item: " + id + " at position:" + position);
        Intent intent = new Intent();
        intent.setClass(this, EventsPage.class);
        intent.putExtra("position", position);
        // Or / And
        intent.putExtra("id", id);
        startActivity(intent);
    }*/
}
