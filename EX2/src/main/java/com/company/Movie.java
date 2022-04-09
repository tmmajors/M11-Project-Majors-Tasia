package com.company;

import java.util.List;

public class Movie {

    //properties
    private String genre;
    private Director director;
    private List<Actor> actors;
    private List<Crew> crew;
    private static double profit;
    private double budget;
    private double moneyEarned;
    private double moneySpent;

    //movie constructor
    public Movie(String genre, Director director, List<Actor> actors, List<Crew> crew, double budget) {
        this.genre = genre;
        this.director = director;
        this.actors = actors;
        this.crew = crew;
        this.budget = budget;
        this.moneyEarned = 0;
        this.moneySpent = 0;
        this.profit = 400000;
    }

    //Payday method
    public void payDay() {

        director.addMoneyEarned(director.getPaid());
        updateMoneySpent(director.getPaid());

        for(Actor actor : actors) {
            actor.addMoneyEarned();
            updateMoneySpent(actor.getPaid());
        }

        for(Crew crew : crew) {
            crew.addMoneyEarned();
            updateMoneySpent(crew.getPaid());
        }
        System.out.println("The movie spent " + this.moneySpent + " out of " + this.budget);
    }

    //calculate profit method
    public void calculateProfit(double moneyEarned) {
        profit = (this.budget - this.moneySpent) + moneyEarned;
        System.out.println("This movie made " + profit);
    }

    // update money spent
    public void updateMoneySpent(double moneySpent) {
        this.moneySpent += moneySpent;
    }

    //update money earned
    public static double getProfit() {
        return profit;
    }

    //update movie overall budget
    public void updateMoneyEarned(double money) {
        this.moneyEarned += money;
        calculateProfit(money);
    }

    //getters and setters
    public String getGenre() { return genre; }

    public void setGenre(String genre) { this.genre = genre; }

    public Director getDirector() {return director; }

    public void setDirector(Director director) { this.director = director; }

    public List<Actor> getActors() { return actors; }

    public void setActors(List<Actor> actors) { this.actors = actors; }

    public List<Crew> getCrew() { return crew; }

    public void setCrew(List<Crew> crew) { this.crew = crew; }

    public static void setProfit(double profit) { Movie.profit = profit; }

    public double getBudget() { return budget; }

    public void setBudget(double budget) { this.budget = budget; }

    public double getMoneyEarned() { return moneyEarned; }

    public void setMoneyEarned(double moneyEarned) { this.moneyEarned = moneyEarned; }

    public double getMoneySpent() { return moneySpent; }

    public void setMoneySpent(double moneySpent) { this.moneySpent = moneySpent; }

}
