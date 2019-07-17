package com.b2t1.churchpalm.entities;

import java.util.ArrayList;

public class SG {
    private String name;
    private ArrayList<User> leadrs;
    private Address address;
    private String day;
    private String frequency;
    private String hour;

    public SG(String name, ArrayList<User> leadrs, Address address, String day, String frequency,
              String hour) {
        this.name = name;
        this.leadrs = leadrs;
        this.address = address;
        this.day = day;
        this.frequency = frequency;
        this.hour = hour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<User> getLeadrs() {
        return leadrs;
    }

    public void setLeadrs(ArrayList<User> leadrs) {
        this.leadrs = leadrs;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }
}
