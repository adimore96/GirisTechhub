/*
Q4. WAP to create class name as Person with field id,name,age and address and input data and display it
*/

class Person{
	private int id,age;
	private String name,address;
	
	void setId(int id){
		this.id = id;
	}
	void setAge(int age){
		this.age = age;
	}
	void setName(String name){
		this.name = name;
	}
	void setAddress(String address){
		this.address = address;
	}
	
		
	int getId(){
		return id;
	}
	
	String getName(){
		return name;
	}
	String getAddress(){
		return address;
	}
	
	int getAge(){
		return age;
	}
}
	


public class PersonPOJO{
	public static void main(String args[]){
		Person p = new Person();
		p.setId(1);
		p.setName("ACER");
		
		p.setAge(16);
		p.setAddress("26/11 House No.126, Pune");
		
		System.out.println("Calling setter method");
		System.out.println("ID: "+p.getId());
		System.out.println("Name: "+p.getName());
		System.out.println("Age: "+p.getAge());
		System.out.println("Address: "+p.getAddress());
	}
}