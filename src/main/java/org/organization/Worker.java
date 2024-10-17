package org.organization;

public class Worker extends Employee{

    public Worker(String firstName, String lastName, String gender, int workDuration) {
        super(firstName, lastName, gender, workDuration);
    }

    @Override
    public double calculateSalary() {
        return this.getBaseSalary()+(getWorkDuration()*50);
    }

}