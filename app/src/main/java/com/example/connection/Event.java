package com.example.connection;

//import EventsPage;

public class Event extends EventsPage {

    private String title;
    private String location;
    private String desc;
    private String dateTime;

    public Event(String t, String l, String d, String dT) {
        title = t;
        location = l;
        desc = d;
        dateTime = dT;
    }
    public String toString()
    {
        return title + "\t\t" + dateTime;
    }
}
