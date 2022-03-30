package com.company;

public class PA extends Crew {

    private int hoursWorked;

    public PA(String name, double paid, String department) {
        super(name, paid, department);
        this.hoursWorked = 0;
    }

    public void calculatePay() {
        earned = getPaid() * hoursWorked;
        hoursWorked = 0;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void hoursWorked(int hoursWorked) {
        this.hoursWorked += hoursWorked;
    }
}
