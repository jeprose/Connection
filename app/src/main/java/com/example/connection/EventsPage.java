package com.example.connection;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.example.connection.data.Chats;
import com.example.connection.data.model.LoggedInUser;

import androidx.recyclerview.widget.RecyclerView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import java.util.ArrayList;
import com.example.connection.data.User;
import com.example.connection.data.Message;

public class EventsPage extends AppCompatActivity{
    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events_page);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

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
    }

    /*public void onItemClick(AdapterView<?> l, View v, int position, long id) {
        Log.i("HelloListView", "You clicked Item: " + id + " at position:" + position);
        Intent intent = new Intent();
        intent.setClass(this, Chat.class);
        intent.putExtra("position", position);
        // Or / And
        intent.putExtra("id", id);
        startActivity(intent);
    }*/
}
