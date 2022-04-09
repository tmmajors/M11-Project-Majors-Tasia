package com.company;

public class Director extends Crew {

    private double royalties;

    //Director constructor
    public Director(String name, double paid, String department) {
        super(name, paid, department);
        this.royalties = 0;
    }

    //method to calculate royalties
    public void calculateRoyalties() {
        royalties = Movie.getProfit() * 0.01;
        addMoneyEarned(royalties);
    }

    public void addMoneyEarned(double royalties) {
        this.earned += royalties;
    }

    //getter
    public double getRoyalties() {
        return royalties;
    }
}
