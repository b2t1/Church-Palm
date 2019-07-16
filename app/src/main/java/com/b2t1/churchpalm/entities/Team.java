package com.b2t1.churchpalm.entities;

import java.util.ArrayList;

public class Team {
    private String name;
    private ArrayList<User> leadrs;
    private String description;

    public Team(String name, ArrayList<User> leadrs, String description) {
        this.name = name;
        this.leadrs = leadrs;
        this.description = description;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
