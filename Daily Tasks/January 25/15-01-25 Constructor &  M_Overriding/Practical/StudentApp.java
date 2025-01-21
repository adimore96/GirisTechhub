/*
2. Student Marks Management
Create a Student class with the following requirements:
Define a constructor that takes the studentName, rollNumber, and 5 subject marks.
Calculate the total marks and average marks for the student.
Display the student’s name, roll number, total marks, and average marks.
*/
import java.util.*;
class Student{
    private int rollNumber, marks[] = new int[5];
    private String studentName;
    Scanner sc = new Scanner(System.in);
    Student(){
        System.out.print("Enter rollNo: ");
        rollNumber = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        studentName = sc.nextLine();
        System.out.println("Enter marks of 5 subjects");
        for(int i=0; i<marks.length; i++){
            System.out.print("S"+(i+1)+": ");
            marks[i] = sc.nextInt();
        }
    }

    //Display student data
    public void displayStud(){
        System.out.println("Roll.No: "+rollNumber);
        System.out.println("Name: "+studentName);
        int totalMarks = 0;
        for(int i=0; i<marks.length; i++){
            totalMarks += marks[i];
        }

        System.out.println("Total Marks: "+totalMarks);
        System.out.println("Average Marks: "+(totalMarks/marks.length));

    }
}

public class StudentApp{
    public static void main(String args[]){
        Student s1 = new Student();
        s1.displayStud();
    }
}