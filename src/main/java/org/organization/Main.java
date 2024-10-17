package org.organization;

import java.util.Scanner;
import GlobalVariables.GlobalVariables;
import UserResponse.*;

public class Main {
    public static void main(String[] args) {
        final String split_line = GlobalVariables.resourceBundle.getString("split_line");

        Scanner scanner = new Scanner(System.in);   // Scanner to read user input
        EmployeeDB employeeDB = new EmployeeDB();   // Create a new database

        System.out.println(split_line);
        System.out.println(GlobalVariables.resourceBundle.getString("greeting"));
        System.out.println(split_line);

        while (true) {
            if (employeeDB.getLengthAsFamily() == 0) {
                System.out.println(GlobalVariables.resourceBundle.getString("menu_start"));
                System.out.println(GlobalVariables.resourceBundle.getString("chooseAnOption"));
                int userResponse = Integer.parseInt(UserResponse.getValidNumber(scanner));
                switch (userResponse) {
                    case 0:
                        System.out.println(GlobalVariables.resourceBundle.getString("exiting"));
                        scanner.close();
                        return;
                    case 1:
                        System.out.println("1");
                        employeeDB.addEmployees();
                        break;
                    case 2:
                        System.out.println("2");
                        employeeDB.listEmployees();
                        break;
                    case 3:
                        System.out.println("3");
                        break;
                    default:
                        System.out.println(GlobalVariables.resourceBundle.getString("errorInvalidChoice"));
                }
            } else {
                System.out.println(GlobalVariables.resourceBundle.getString("menu"));
                System.out.println(GlobalVariables.resourceBundle.getString("chooseAnOption"));
                int userResponse = Integer.parseInt(UserResponse.getValidNumber(scanner));
                switch (userResponse) {
                    case 0:
                        System.out.println(GlobalVariables.resourceBundle.getString("exiting"));
                        scanner.close();
                        return;
                    case 1:
                        System.out.println("1");
                        employeeDB.addEmployees();
                        break;
                    default:
                        System.out.println(GlobalVariables.resourceBundle.getString("errorInvalidChoice"));
                }
            }
        }
    }
}