package com.company;

import java.util.ArrayList;
import java.util.List;


public class Main {


    //instantiate objects
    public static void main(String[] args) {


        Director director = new Director("John D", 250000, "Production");

        Actor makini = new Actor("Makini J", 50000, "Lead Actor");
        Actor tasia = new Actor("Tasia", 45000, "Supporting Actor");
        List<Actor> actors = new ArrayList<>();
        actors.add(makini);
        actors.add(tasia);

        Crew jerry = new Crew("Jerry", 25000,"EFX");
        Crew mary = new Crew("Mary", 25000, "Makeup");
        PA bob = new PA("Bob", 7200, "Production");
        List<Crew> crew = new ArrayList<>();
        crew.add(jerry);
        crew.add(mary);
        crew.add(bob);

        //make movie object
        Movie movie = new Movie("Thriller", director, actors, crew, 750000);


        //add hours for PA and calculate PA pay
        bob.getHoursWorked();
        System.out.println("Bob worked " + (bob.getHoursWorked()) + " hours and earned $" + (bob.getPaid()) + " per hour.");


        //call payday method of movie class
        new Movie("Thriller", director, actors, crew, 750000).payDay();


        //movie profits
        Movie.getProfit();
        System.out.println("This movie profits equaled " + Movie.getProfit());

        //director pay including royalties
        director.calculateRoyalties();
        System.out.println("John D made " + (director.getRoyalties() + " in royalties."));




    }


}
