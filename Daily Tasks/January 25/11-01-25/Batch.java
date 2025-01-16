import java.util.*;
class Batch{
	Student s[];
	private Batch b;
	Batch(){
		this(5);
   }
	Batch(int size)
	{
		this(size,0);
	}
	Batch(int size,int extendCap)
	{  // create array of student class using size
		s = new Student[size+extendCap];
	}
	
	//Set Students
	public void setStudents(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student Details");
		for(int i=0; i<s.length; i++){
			s[i] = new Student();
			System.out.println("__________________________________");
			System.out.print("Enter ID: ");
			s[i].setId(sc.nextInt());
			sc.nextLine();
			System.out.print("Enter Name: ");
			s[i].setName(sc.nextLine());
			System.out.print("Enter Attendance Per: ");
			s[i].setAttendancePer(sc.nextInt());
			System.out.print("Enter Academic Per: ");
			s[i].setAcademicPer(sc.nextInt());
			sc.nextLine();
			System.out.print("Enter Email: ");
			s[i].setEmail(sc.nextLine());
			System.out.print("Enter Contact: ");
			s[i].setContact(sc.nextInt());
			System.out.println("__________________________________");
		}
	}
	
		public Batch getStudents(){
		return b;
	}
	
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		Batch b1 = new Batch(2);
		
		b1.setStudents();
		
		//get Topper
		System.out.println("\n----------------------Topper---------------------");
		BatchRoutine.getTopper(b1);
		System.out.println("\n-------------------------------------------------");
		
		
		//get Defaulter
		System.out.println("\n---------------Defaulter Students----------------");
		for(Student s1:BatchRoutine.getDebar(b1)){
			System.out.println("Name: "+s1.getName());
			System.out.println("Attendance: "+s1.getAttendancePer());
		}
		System.out.println("\n-------------------------------------------------");
		
		//get getConsistentStudent
		System.out.println("\n----------------Consistent Students--------------");
		for(Student s1:BatchRoutine.getConsistentStudent(b1)){
			System.out.println("Name: "+s1.getName());
			System.out.println("Attendance: "+s1.getAttendancePer());
		}
		System.out.println("\n-------------------------------------------------");
		
		//get getSameMarksStudents
		System.out.println("\n----------------Same Marks Students--------------");
		for(Student s1:BatchRoutine.getSameMarksStudents(b1)){
			System.out.println("Name: "+s1.getName());
			System.out.println("Attendance: "+s1.getAcademicPer());
		}
		System.out.println("\n-------------------------------------------------");
		
		
		
	}
	
}