package com.vti.entity;

public class User {
    private int ID;
    private String email;
    private String fullName;
    private String password;

    public User() {
    }

    public User(int ID, String email, String fullName, String password) {
        this.ID = ID;
        this.email = email;
        this.fullName = fullName;
        this.password = password;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return  "ID=" + ID +
                ", email='" + email + '\'' +
                ", fullName='" + fullName ;
    }
}
