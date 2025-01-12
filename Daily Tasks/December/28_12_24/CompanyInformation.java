/*
1. Company Information:
Create a Company class with fields companyName, ceoName, and employeesCount.
Create a CompanyOperations class with methods to check if the company is large (more than 500 employees) or small (less than 50 employees).
*/

class Company{
	private int employeesCount;
	private String companyName, ceoName;
	
	//setter Methods
	void setEmpCount(int employeesCount){
		this.employeesCount = employeesCount;
	}
	
	void setCompName(String companyName){
		this.companyName = companyName;
	}
	
	void setCeoName(String ceoName){
		this.ceoName = ceoName;
	}
	
	//Getter methods
	int getEmpCount(){
		return employeesCount;
	}
	
	String getCompName(){
		return companyName;
	}
	
	String getCeoName(){
		return ceoName;
	}
}

class CompanyOperations{
	void checkCompany(Company ...c){
		
		for(int i=0; i<c.length; i++){
			if(c[i].getEmpCount() > 500){
				System.out.println("Dear "+c[i].getCeoName()+", Your "+c[i].getCompName()+" is a Large Company");
			}
			else if(c[i].getEmpCount() >0 && c[i].getEmpCount()<=50){
				System.out.println("Dear "+c[i].getCeoName()+", Your "+c[i].getCompName()+" is a Small Company");
			}
			else if(c[i].getEmpCount() >50 && c[i].getEmpCount()<=500){
				System.out.println("Dear "+c[i].getCeoName()+", Your "+c[i].getCompName()+" is a Medium Company");
			}else{
				System.out.println("Invalid ");
			}
		}
	}
}

class CompanyInformation{
	public static void main(String args[]){
		Company c = new Company();
		c.setCompName("ACER");
		c.setCeoName("Aditya");
		c.setEmpCount(15689);
		
		Company c1 = new Company();
		c1.setCompName("Dell");
		c1.setCeoName("Umesh");
		c1.setEmpCount(89);
		
		Company c2 = new Company();
		c2.setCompName("Tesla");
		c2.setCeoName("Sanket");
		c2.setEmpCount(455);
		
		Company c3 = new Company();
		c3.setCompName("X");
		c3.setCeoName("Elon Musk");
		c3.setEmpCount(12);
		
		CompanyOperations co = new CompanyOperations();
		co.checkCompany(c,c1,c2,c3);
	}
}