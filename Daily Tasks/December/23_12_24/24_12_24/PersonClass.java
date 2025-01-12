/*
2. Person Age Verification
Task:
 Create a Person class with fields: name and age.
 In the main method:
Create a Person object.
Check if the person is eligible to vote (age >= 18) and print the result.
Explanation:
 This demonstrates condition checking using instance variables.
*/

class Person{
	private int age;
	private String name;
	
	void setAge(int age){
		this.age = age;
	}
	void setName(String name){
		this.name = name;
	}
	
	int getAge(){
		return age;
	}
	String getName(){
		return name;
	}
}

public class PersonClass{
	public static void main(String args[]){
		
		Person p = new Person();
	p.setName("Aditya");
	p.setAge(17);
	
	if(p.getAge()>=18){
		System.out.println(p.getName()+" you are eligible to vote!");
	}else{
		System.out.println(p.getName()+" you are not eligible to vote!");
	}
	}
}