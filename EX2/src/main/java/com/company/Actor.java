package com.company;

public class Actor extends Person {

    private String role;

    public Actor() {
    }

    //Actor constructor
    public Actor(String name, double paid, String role) {
     super(name, paid);
     this.role = role;
    }

    //getter and setter
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}