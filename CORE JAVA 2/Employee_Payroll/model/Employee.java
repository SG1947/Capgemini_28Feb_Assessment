package Employee_Payroll.model;

import Employee_Payroll.exception.InvalidSalaryException;
import Employee_Payroll.exception.UnauthorizedAccessException;

public abstract class Employee implements payroll{
    
	
	private int employeeID;
	private String name;
	private String role;
	private double salary;
	public Employee(int employeeID, String name, String role, double salary) throws InvalidSalaryException {
		this.employeeID = employeeID;
		this.name = name;
		this.role = role;
		this.salary = salary;
	}
	 public int getId() {
	       return employeeID;
	    }

	 public String getName() {
	        return name;
	    }

	 public String getRole() {
	        return role;
	    }
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) throws InvalidSalaryException {
	    if (salary <= 5000) {
	        throw new InvalidSalaryException("Minimum salary must be 5000");
	    }
	    this.salary = salary;
	}

	
}
