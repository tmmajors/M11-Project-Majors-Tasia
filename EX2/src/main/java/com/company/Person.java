package com.company;

public abstract class Person {

    //properties
    private String name;
    private double paid;
    protected double earned;

    public Person() {
    }

    //constructor
    public Person(String name, double paid) {
        this.name = name;
        this.paid = paid;
        this.earned = 0;
    }

    public void addMoneyEarned() {
        this.earned += getPaid();
    }

    //getters and setters
    public String getName() {
        return name; }

    public void setName(String name) {
        this.name = name;
    }

    public double getPaid() {
        return paid;
    }

    public void setPaid(double paid) {
        this.paid = paid;
    }

    public double getEarned() {
        return earned;
    }

    public void setEarned(double earned) {
        this.earned = earned;
    }
}
