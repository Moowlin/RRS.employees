package org.organization;

public class Director extends Employee{
    int numberOfSubordinates;

    public Director(String firstName, String lastName, String gender, int workDuration, int numberOfSubordinates) {
        super(firstName, lastName, gender, workDuration);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    // setting the number of subordinates method
    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }

    // getting the number of subordinates method
    public int getNumberOfSubordinates() {
        return this.numberOfSubordinates;
    }

    @Override
    public double calculateSalary() {
        if (numberOfSubordinates > 0) {
            return this.getBaseSalary()+(getWorkDuration()*(80+this.numberOfSubordinates*3));
        } else {
            return this.getBaseSalary()+(getWorkDuration()*75);
        }
    }
}