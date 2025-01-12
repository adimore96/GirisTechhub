/*
1. Employee Salary Increment
Task:
 Create an Employee class with fields: name, salary, and department.
 In the main method:
Create an Employee object.
Increase the employee's salary by 10% and print the updated salary.
Explanation:
 This introduces instance variable manipulation and basic arithmetic operations.
*/

class Employee{
	private int salary;
	private String name, department;
	
	void setSalary(int salary){
		this.salary = salary;
	}
	void setName(String name){
		this.name = name;
	}
	void setDept(String department){
		this.department = department;
	}
	
	int getSalary(){
		return ((10/salary)*100)+salary;
	}
	String getName(){
		return name;
	}
	String getDept(){
		return department;
	}
}

public class EmployeePOJO{
	public static void main(String args[]){
		Employee e = new Employee();
		e.setSalary(45000);
		e.setDept("Comp");
		e.setName("Aditya");
		
		System.out.println(e.getName());
		System.out.println(e.getDept());
		System.out.println(e.getSalary());
	}
}