/*
3. Student Grade Evaluation
Task:
 Create a Student class with fields: name, marks, and subject.
 In the main method:
Create a Student object.
Check if the student has passed or failed the subject (passing marks >= 40) and print the result.
Explanation:
 This task involves condition checking and field manipulation.
*/

class Student{
	private int marks;
	private String name, subject;
	
	void setMarks(int marks){
		this.marks = marks;
	}
	void setName(String name){
		this.name = name;
	}
	void setSubject(String subject){
		this.subject = subject;
	}
	
	int getMarks(){
		return marks;
	}
	String getName(){
		return name;
	}
	String getSubject(){
		return subject;
	}
}

public class StudentPOJO{
	public static void main(String args[]){
		Student s = new Student();
		s.setMarks(99);
		s.setName("Aditya");
		s.setSubject("JavaScript");
		
		if(s.getMarks()>=40){
			System.out.print(s.getName()+" has passed the "+s.getSubject()+" subject.");
		}else{
			System.out.print(s.getName()+" has passed not the "+s.getSubject()+" subject.");
		}
	}
}