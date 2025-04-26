/*
24. Check Leap Year
Description: Write a program to check if a given year is a leap year.
Input: year = 2020
Output: Leap Year
*/
public class LeapYearCheck{

    public static void main(String args[]){
        int year = 2020;

        if(year%4==0&&year%100!=0 || year%400==0){
            System.out.println(year+" is a Leap year.!");
        }else{
            System.out.println(year+" is not a Leap year.!");
        }
    }
}