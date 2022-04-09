package com.company;

public class PA extends Crew {

    private int hoursWorked;

    //PA Constructor
    public PA(String name, double paid, String department) {
        super(name, paid, department);
        this.hoursWorked = 120;
    }

    public double calculatePay() {
        earned = getPaid() * hoursWorked;
        return earned;
    }

    //getter
    public double getHoursWorked() {
        return hoursWorked;
    }

    //method to calculate pay based on hours worked
    public void hoursWorked(int hoursWorked) {
        this.hoursWorked += hoursWorked;
    }


}
