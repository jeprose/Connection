package com.example.connection;

import android.os.Bundle;

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
        ArrayList<Message> messageList = new ArrayList<Message>();

        messageList.add(new Message("To Nick:\n Jaden sucks lol"));
        messageList.add(new Message("To Ryan:\n I know haha fucking weeb "));

        ArrayAdapter messageAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, messageList);

        listView.setAdapter(messageAdapter);
    }

}
