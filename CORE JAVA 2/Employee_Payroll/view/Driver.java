package Employee_Payroll.view;

import java.util.Scanner;

import Employee_Payroll.controller.payrollController;
import Employee_Payroll.exception.InvalidSalaryException;
import Employee_Payroll.model.ContractEmployee;
import Employee_Payroll.model.Employee;
import Employee_Payroll.model.FullTimeEmployee;

public class Driver {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int mainChoice = -1;

        while (mainChoice != 0) {

            System.out.println("\n===== EMPLOYEE CREATION MENU =====");
            System.out.println("1. Create Employee");
            System.out.println("0. Exit Application");
            System.out.print("Enter choice: ");

            mainChoice = sc.nextInt();

            if (mainChoice == 0) {
                System.out.println("Application terminated.");
                break;
            }

            if (mainChoice != 1) {
                System.out.println("Invalid choice!");
                continue;
            }

            Employee employee = null;

            try {
                System.out.print("Enter Employee ID: ");
                int id = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter Employee Name: ");
                String name = sc.nextLine();

                System.out.print("Enter Employee Role (HR / EMPLOYEE): ");
                String employeeRole = sc.nextLine();

                System.out.println("Select Employee Type:");
                System.out.println("1. Full Time Employee");
                System.out.println("2. Contract Employee");
                System.out.print("Enter choice: ");
                int type = sc.nextInt();

                System.out.print("Enter Base Salary: ");
                double salary = sc.nextDouble();

                if (type == 1) {
                    employee = new FullTimeEmployee(id, name, employeeRole, salary);
                } else if (type == 2) {
                    employee = new ContractEmployee(id, name, employeeRole, salary);
                } else {
                    System.out.println("Invalid Employee Type");
                    continue;
                }

            } catch (InvalidSalaryException e) {
                System.out.println(e.getMessage());
                continue;
            }

            payrollController controller =
                    new payrollController(employee);

            int payrollChoice = -1;

            while (payrollChoice != 0) {

                System.out.println("\n===== PAYROLL MENU =====");
                System.out.println("1. Update Salary");
                System.out.println("2. View Payroll");
                System.out.println("0. Exit Payroll Menu");
                System.out.print("Enter choice: ");

                payrollChoice = sc.nextInt();

                switch (payrollChoice) {

                    case 1:
                        System.out.print("Enter new salary: ");
                        double newSalary = sc.nextDouble();
                        controller.updateSalary(newSalary);
                        break;

                    case 2:
                        controller.showPayroll();
                        break;

                    case 0:
                        System.out.println("Exiting Payroll Menu");
                        break;

                    default:
                        System.out.println("Invalid choice!");
                }
            }
        }

        sc.close();
    }
}

