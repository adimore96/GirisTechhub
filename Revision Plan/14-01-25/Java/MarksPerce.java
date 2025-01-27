import java.util.*;
public class MarksPerce{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int marks[] = new int[5];
        System.out.println("Enter the marks of 5 subs:");

        for(int i=0; i<marks.length; i++){
            marks[i] = sc.nextInt();
        }

        //calculating total marks
        int totalMarks = 0;
        for(int mark:marks){
            totalMarks += mark;
        }

        System.out.println("Total Marks: "+totalMarks);

        //percentage calculator
        System.out.println("Percentage: "+totalMarks/marks.length);
    }
}