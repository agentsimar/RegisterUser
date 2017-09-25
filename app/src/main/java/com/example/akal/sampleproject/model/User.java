package com.example.akal.sampleproject.model;

/**
 * Created by Akal on 22-09-2017.
 */

public class User {
    int uid;
    String name;
    String email;
    String password;

    public User(){

    }


    public User(int uid, String name, String email, String password) {
        this.uid = uid;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public int getUid() {

        return uid;
    }

    public void setUid(int uid) {

        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getEmail() {

        return email;
    }

    public void setEmail(String email) {

        this.email = email;
    }

    public String getPassword() {

        return password;
    }

    public void setPassword(String password) {

        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

