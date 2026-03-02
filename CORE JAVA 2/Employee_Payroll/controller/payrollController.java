package Employee_Payroll.controller;

import Employee_Payroll.exception.InvalidSalaryException;
import Employee_Payroll.exception.UnauthorizedAccessException;
import Employee_Payroll.model.Employee;

public class payrollController {

    private Employee employee;

    public payrollController(Employee employee) {
        this.employee = employee;
    }

    public void updateSalary(double salary) {
        try {
            if (!employee.getRole().equals("HR")) {
                throw new UnauthorizedAccessException("Only HR can update salary");
            }
            employee.setSalary(salary);
            System.out.println("Salary updated successfully.");
        } catch (InvalidSalaryException | UnauthorizedAccessException e) {
            System.out.println(e.getMessage());
        }
    }

    public void showPayroll() {
        System.out.println("Employee ID   : " + employee.getId());
        System.out.println("Name          : " + employee.getName());
        System.out.println("Role          : " + employee.getRole());
        System.out.println("Final Salary  : " + employee.payrollBehaviour());
    }
}

