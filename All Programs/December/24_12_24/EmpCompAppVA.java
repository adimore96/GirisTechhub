/*  empId, empName, empAddr, empAge, : Employee, Company,EmpCompApp as a Class. */

class EmployeeVA{
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

class CompanyVA{
	EmployeeVA emp[];
	
	void setEmployee(EmployeeVA ...emp){
		this.emp = emp;
	}
	
	void getEmployee(){
		for(int i=0; i<emp.length; i++){
			System.out.println("Emp ID:      "+emp[i].getEmpId());
			System.out.println("Emp Name:    "+emp[i].getEmpName());
			System.out.println("Emp Age:     "+emp[i].getEmpAge());
			System.out.println("Emp Address: "+emp[i].getEmpAddr());
		}
		
	}
}

public class EmpCompAppVA{
	public static void main(String args[]){
		EmployeeVA e = new EmployeeVA();
		e.setEmpId(1);
		e.setEmpName("Aditya");
		e.setEmpAge(21);
		e.setEmpAddr("A/P Pune");
		
		EmployeeVA e2 = new EmployeeVA();
		e2.setEmpId(2);
		e2.setEmpName("ACER");
		e2.setEmpAge(29);
		e2.setEmpAddr("A/P Pune");
		
		CompanyVA c = new CompanyVA();
		c.setEmployee(e,e2);
		c.getEmployee();
	}
}