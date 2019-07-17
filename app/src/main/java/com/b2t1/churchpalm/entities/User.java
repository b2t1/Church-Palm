package com.b2t1.churchpalm.entities;

import java.util.ArrayList;
import java.util.Date;

public class User {
    private String name;
    private int phone;
    private String email;
    private Date birth;
    private char genre;
    private String password;
    private String bio;
    private SG sg;
    private ArrayList<Team> team;

    public User(String name, int phone, String email, Date birth, char genre, String password, String bio,
                SG sg, ArrayList<Team> team) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.birth = birth;
        this.genre = genre;
        this.password = password;
        this.bio = bio;
        this.sg = sg;
        this.team = team;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public char getGenre() {
        return genre;
    }

    public void setGenre(char genre) {
        this.genre = genre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public SG getSg() {
        return sg;
    }

    public void setSg(SG sg) {
        this.sg = sg;
    }

    public ArrayList<Team> getTeam() {
        return team;
    }

    public void setTeam(ArrayList<Team> team) {
        this.team = team;
    }
}