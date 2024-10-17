package UserResponse;

import GlobalVariables.GlobalVariables;
import java.util.Scanner;

public class UserResponse {

    /**
     * Method to get a valid number from the user input.
     * Repeatedly prompts the user until a valid number is entered.
     *
     * @param scanner The Scanner object to read user input
     * @return A valid number as a String
     */
    public static String getValidNumber(Scanner scanner) {
        while (true) {
            // Read user input from the console
            String userResponse = scanner.nextLine();
            try {
                Integer.parseInt(userResponse);  // Attempt to parse input as a number
                return userResponse;             // If successful, return the input
            } catch (NumberFormatException ex) {
                // Print an error message if the input is not a valid number
                System.out.println(GlobalVariables.resourceBundle.getString("errorNotNumber"));
            }
        }
    }

    /**
     * Method to collect employee information based on the employee's position (worker or manager).
     * If the employee is a manager, it asks for an additional field (number of subordinates).
     *
     * @param position The position of the employee (1 for worker, otherwise for manager)
     * @param scanner  The Scanner object to read user input
     * @return An array of strings containing the employee's information
     */
    public static String[] getEmployeeInfo(int position, Scanner scanner) {
        int infoSize = (position == 1) ? 4 : 5;  // 4 fields for worker, 5 for manager
        String[] employeeInfo = new String[infoSize];

        // Collect common employee information
        System.out.print("Enter employee first name: ");
        employeeInfo[0] = getName(scanner);
        System.out.print("Enter employee last name: ");
        employeeInfo[1] = getName(scanner);
        employeeInfo[2] = getGender(scanner);
        System.out.print("Enter employee work duration: ");
        employeeInfo[3] = getValidNumber(scanner);

        // If the position is manager, collect the number of subordinates
        if (position != 1) {
            System.out.print("Enter the number of subordinate employees: ");
            employeeInfo[4] = getValidNumber(scanner);
        }
        return employeeInfo;  // Return the collected employee information
    }

    /**
     * Method to validate and return a name.
     * A valid name can contain letters, spaces, and special characters like apostrophes and hyphens.
     *
     * @param scanner The Scanner object to read user input
     * @return A valid name as a String
     */
    public static String getName(Scanner scanner) {
        while (true) {
            String name = scanner.nextLine();
            // Validate that the name contains only letters, spaces, apostrophes, or hyphens
            if (name.matches("[a-zA-Z\\s'-]+")) {
                return name;
            } else {
                System.out.print("Invalid name, please try again: ");
            }
        }
    }

    /**
     * Method to validate and return the gender.
     * A valid gender input is either 'w' for woman or 'm' for man.
     *
     * @param scanner The Scanner object to read user input
     * @return A valid gender ('w' or 'm') as a String
     */
    public static String getGender(Scanner scanner) {
        while (true) {
            System.out.println("Select a gender, please: w - woman, m - man");
            String gender = scanner.nextLine();
            // Validate that the input is either 'w' or 'm'
            if (gender.matches("[wm]")) {
                return gender;
            } else {
                System.out.print("Invalid gender, please try again: ");
            }
        }
    }
}