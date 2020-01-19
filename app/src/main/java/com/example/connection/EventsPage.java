package com.example.connection;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import android.view.View;
import java.util.ArrayList;

public class EventsPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events_page);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ListView  listView = (ListView)findViewById(R.id.listview);

        ArrayList<Event> eventList = new ArrayList<>();
        eventList.add(new Event("Test Event 1", "Livermore", "This is a test event.", "3:00PM 2/1/20"));
        eventList.add(new Event("Test Event 2", "Livermore", "This is a test event.", "3:00PM 2/1/20"));
        eventList.add(new Event("Test Event 3", "Livermore", "This is a test event.", "3:00PM 2/1/20"));

        ArrayAdapter eventAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, eventList);

        listView.setAdapter(eventAdapter);
    }
}
