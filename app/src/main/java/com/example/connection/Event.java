package com.example.connection;

//import EventsPage;

public class Event extends EventsPage {

    private String title;
    private String desc;
    private String dateTime;

    public Event(String t, String d, String dT) {
        title = t;
        desc = d;
        dateTime = dT;
    }
    public String toString()
    {
        return title + "\t\t" + dateTime;
    }
}
