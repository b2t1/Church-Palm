package com.b2t1.churchpalm.entities;

import java.util.ArrayList;
import java.util.Date;

public class Event {
    private String name;
    private ArrayList<Date> dates;
    private String description;
    private String start;
    private String end;
    private Address address;

    public Event(String name, ArrayList<Date> dates, String description, String start, String end,
                 Address address) {
        this.name = name;
        this.dates = dates;
        this.description = description;
        this.start = start;
        this.end = end;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Date> getDates() {
        return dates;
    }

    public void setDates(ArrayList<Date> dates) {
        this.dates = dates;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
