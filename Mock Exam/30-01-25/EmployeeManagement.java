/*
Q5. Write a java program to create a class name as Employee using pojo class to accept
id, name, email, sal and create method name as getFunction() to implement the logic.
Note : - Display Second Highest Salary Employee Record.
*/
import java.util.*;
class Employee{
	private int id, sal;
	private String name, email;
	//private Employee[] employee;
	
	
	//setter methods
	public void setId(int id){
		this.id = id;
	}
	public void setSal(int sal){
		this.sal = sal;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setEmail(String email){
		this.email = email;
	}
	
	//getter methods
	public int getId(){
		return id;
	}
	public int getSalary(){
		return sal;
	}
	public String getName(){
		return name;
	}
	public String getEmail(){
		return email;
	}
	
	//getFunction method to implement the secHighSal logic
	public Employee getFunction(Employee[] employees){
		 int firstMax = Integer.MIN_VALUE, secondMax = Integer.MIN_VALUE;
		Employee secondHighest = null;

        for (Employee emp : employees) {
            if (emp.getSalary() > firstMax) {
                secondMax = firstMax;
                firstMax = emp.getSalary();
            } else if (emp.getSalary() > secondMax && emp.getSalary() < firstMax) {
                secondMax = emp.getSalary();
            }
        }

        for (Employee emp : employees) {
            if (emp.getSalary() == secondMax) {
                secondHighest = emp;
                break;
            }
        }
		return secondHighest;
	}
	
	public void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Email: " + email + ", Salary: " + sal);
    }
	
}

public class EmployeeManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee[] employees = new Employee[5];

        // Accept employee details
        for (int i = 0; i < 5; i++) {
			employees[i] = new Employee();
            System.out.println("Enter details for Employee " + (i + 1) + ":");
            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine(); // Consume newline
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Salary: ");
            int salary = sc.nextInt();
            employees[i].setId(id);
            employees[i].setName(name);
            employees[i].setEmail(email);
            employees[i].setSal(salary);
        }

        // Find second highest salary employee
        Employee secondHighest = employees[0].getFunction(employees);
        
        System.out.println("\nSecond Highest Salary Employee Record:");
        if (secondHighest != null) {
            secondHighest.display();
        } else {
            System.out.println("Not enough employees to determine second highest salary.");
        }

        sc.close();
    }
}