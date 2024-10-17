package org.organization;

import GlobalVariables.GlobalVariables;
import UserResponse.UserResponse;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class EmployeeDB {

    private ArrayList<Employee> asFamily = new ArrayList<>();
    private LinkedList<Employee> tempAsFamily = new LinkedList<>(asFamily);

    // Method to list all employees
    public void listEmployees() {
        if (asFamily.isEmpty()) {
            System.out.println(GlobalVariables.resourceBundle.getString("databaseIsEmpty"));
        } else {
            System.out.printf("В базе %d сотрудников\n", asFamily.size());
            System.out.println(
                    GlobalVariables.bold + GlobalVariables.green+ "|| Номер || Имя || Должность || Базовая ставка || Текущая зарплата ||\n"+ GlobalVariables.resetText+ GlobalVariables.resetColor
            );
            for (Employee emp : tempAsFamily) {
                System.out.println(emp);
            }
        }
    }
    public int getLengthAsFamily(){
        return asFamily.size();
    }

    public void addEmployees(Scanner input) {
        while (true) {
            System.out.println(GlobalVariables.resourceBundle.getString("createdEmployeeMenu"));
            int userResponse = Integer.parseInt(UserResponse.getValidNumber(input));
            switch (userResponse){
                case 0:
                    System.out.println(GlobalVariables.resourceBundle.getString("exiting"));
                    return;
                case 1:
                    String[] infoWorker = UserResponse.getEmployeeInfo(userResponse, input);
                    addWorker(new Worker(infoWorker[0], infoWorker[1], infoWorker[2], Integer.parseInt(infoWorker[3])));
                    break;
                case 2:
                    String[] infoManager = UserResponse.getEmployeeInfo(userResponse, input);
                    addManager(new Manager(infoManager[0], infoManager[1], infoManager[2], Integer.parseInt(infoManager[3]), Integer.parseInt(infoManager[4])));
                    break;
                case 3:
                    String[] infoDirector = UserResponse.getEmployeeInfo(userResponse, input);
                    addDirector(new Director(infoDirector[0], infoDirector[1], infoDirector[2], Integer.parseInt(infoDirector[3]), Integer.parseInt(infoDirector[4])));
                    break;
                default:
                    System.out.println(GlobalVariables.resourceBundle.getString("errorInvalidChoice"));
            }
        }
    }

    private void addDirector(Director director) {
        tempAsFamily.add(director);
        System.out.println("Worker added: " + director);
        asFamily = new ArrayList<>(tempAsFamily);
    }

    private void addManager(Manager manager) {
        tempAsFamily.add(manager);
        System.out.println("Worker added: " + manager);
        asFamily = new ArrayList<>(tempAsFamily);
    }

    public void addWorker(Employee worker) {
        tempAsFamily.add(worker);
        System.out.println("Worker added: " + worker.getFirstName());
        asFamily = new ArrayList<>(tempAsFamily);
    }
}