package DSA.corejava;

//Q7_EmployeePayroll.java

interface SalaryService {
 void calculateSalary() throws InvalidSalaryException;
}

abstract class Employee implements SalaryService {
 private String empId;
 private String empName;
 private double salary;

 protected Employee(String id, String name) {
     this.empId = id;
     this.empName = name;
 }

 protected void setSalary(double sal) {
     salary = sal;
 }

 protected double getSalary() {
     return salary;
 }
}

class FullTimeEmployee extends Employee {
 public FullTimeEmployee(String id, String name) {
     super(id, name);
 }

 public void calculateSalary() throws InvalidSalaryException {
     double base = 50000;
     if (base < 0) throw new InvalidSalaryException("Invalid salary");
     setSalary(base + 10000); // bonus
 }

 public void calculateSalary(double bonus)
         throws InvalidSalaryException {
     setSalary(50000 + bonus);
 }
}

class ContractEmployee extends Employee {
 public ContractEmployee(String id, String name) {
     super(id, name);
 }

 public void calculateSalary() throws InvalidSalaryException {
     setSalary(30000);
 }
}

class InvalidSalaryException extends Exception {
 public InvalidSalaryException(String msg) {
     super(msg);
 }
}

class UnauthorizedAccessException extends RuntimeException {
 public UnauthorizedAccessException(String msg) {
     super(msg);
 }
}

public class Q7_EmployeePayroll {
 public static void main(String[] args) throws InvalidSalaryException {
     Employee e = new FullTimeEmployee("E1", "Anita");
     e.calculateSalary();
 }
}
