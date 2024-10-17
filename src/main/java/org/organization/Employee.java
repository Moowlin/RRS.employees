package org.organization;

public abstract class Employee {
    private int workDuration;
    private String firstName;
    private String lastName;
    private String gender;
    private final double baseSalary = 100.0;
    //static String employeeHeader = "------------------= Employee =------------------"; //Статическая переменная принадлежащая классу, константа

    public Employee(String firstName, String lastName, String gender, int workDuration) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.workDuration = workDuration;
    }

    public abstract double calculateSalary();

    public void displayInfoEmployee() {
        if (gender.equals("w")){
            System.out.printf("Name: mrs. %s %s\nBase Salary: %.2f\n", firstName, lastName, baseSalary);
        }
        else if (gender.equals("m")) {
            System.out.printf("Name: mr. %s %s\nBase Salary: %.2f\n", firstName, lastName, baseSalary);
        }
        else {
            System.out.printf("Error: Invalid gender specified.");
        }
    }

    // set first name method
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // get first name method
    public String getFirstName() {
        return this.firstName;
    }

    // set last name method
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // get last name method
    public String getLastName() {
        return this.lastName;
    }

    // get base salary method
    public double getBaseSalary() {
        return this.baseSalary;
    }

    // get salary method
    public double getSalary() {
        return this.baseSalary;
    }

    // setting work duration method
    public void setWorkDuration(int workDuration) {
        this.workDuration = workDuration;
    }

    // getting work duration method
    public int getWorkDuration() {
        return this.workDuration;
    }
}