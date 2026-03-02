package Employee_Payroll.model;

import Employee_Payroll.exception.InvalidSalaryException;

public class FullTimeEmployee extends Employee{

	public FullTimeEmployee(int employeeID, String name, String role, double salary) throws InvalidSalaryException {
		super(employeeID, name, role, salary);
	}
    double bonus=1000;
	@Override
	public double payrollBehaviour() {
		return getSalary()+bonus;
	}
	



}
