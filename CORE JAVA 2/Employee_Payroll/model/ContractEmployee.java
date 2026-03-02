package Employee_Payroll.model;

import Employee_Payroll.exception.InvalidSalaryException;

public class ContractEmployee extends Employee{

	public ContractEmployee(int employeeID, String name, String role, double salary) throws InvalidSalaryException {
		super(employeeID, name, role, salary);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double payrollBehaviour() {
		return getSalary();
		
	}

}
