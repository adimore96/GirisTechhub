// WAP to calculate the marks and display the grades according to the percentage

import java.util.*;
public class GradeCalculator{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter marks of Physics: ");
		int physics = sc.nextInt();
		System.out.print("Enter marks of Chemistry: ");
		int chemistry = sc.nextInt();
		System.out.print("Enter marks of Biology: ");
		int bio = sc.nextInt();
		System.out.print("Enter marks of Mahts: ");
		int maths = sc.nextInt();
		System.out.print("Enter marks of Computer: ");
		int computer = sc.nextInt();
		
		float percentage = (physics+chemistry+bio+maths+computer)/5;
		
		System.out.println("Your percentage is: "+percentage);
		
		String result = (percentage>=90 &&percentage<=100)?"Grade A": (percentage>=80 && percentage<90)? "Grade B" : (percentage>=70 && percentage<80) ?"Grade C": (percentage>=60 && percentage<70)? "Grade D" : (percentage>=40 && percentage<60)? "Grade E": "Grade F";
		
		System.out.println(result);
	}

}