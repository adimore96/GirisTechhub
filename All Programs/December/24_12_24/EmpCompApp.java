/*  empId, empName, empAddr, empAge, : Employee, Company,EmpCompApp as a Class. */

class Employee{
	private int empId,empAge;
	private String empName, empAddr;
	
	void setEmpId(int empId){
		this.empId = empId;
	}
	void setEmpAge(int empAge){
		this.empAge = empAge;
	}
	
	void setEmpName(String empName){
		this.empName = empName;
	}	
	void setEmpAddr(String empAddr){
		this.empAddr = empAddr;
	}
	
	int getEmpId(){
		return empId;
	}
	int getEmpAge(){
		return empAge;
	}
	String getEmpName(){
		return empName;
	}
	String getEmpAddr(){
		return empAddr;
	}
}

class Company{
	Employee emp;
	
	void setEmployee(Employee emp){
		this.emp = emp;
	}
	
	void getEmployee(){
		System.out.println("Emp ID:      "+emp.getEmpId());
		System.out.println("Emp Name:    "+emp.getEmpName());
		System.out.println("Emp Age:     "+emp.getEmpAge());
		System.out.println("Emp Address: "+emp.getEmpAddr());
	}
}

public class EmpCompApp{
	public static void main(String args[]){
		Employee e = new Employee();
		e.setEmpId(1);
		e.setEmpName("Aditya");
		e.setEmpAge(21);
		e.setEmpAddr("A/P Pune");
		
		Company c = new Company();
		c.setEmployee(e);
		c.getEmployee();
	}
}