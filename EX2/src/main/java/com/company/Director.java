package com.company;

public class Director extends Crew {

    private double royalties;

    public Director(String name, double paid, String department) {
        super(name, paid, department);
        this.royalties = 0;
    }

    public void calculateRoyalties() {
        royalties = Movie.getProfit() * 0.01;
        addMoneyEarned(royalties);
    }

    public void addMoneyEarned(double royalties) {
        this.earned += royalties;
    }

    public double getRoyalties() {
        return royalties;
    }
}
