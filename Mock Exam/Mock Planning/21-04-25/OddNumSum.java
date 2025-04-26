/*
17. Sum of First N Odd Numbers
Description: Write a program to calculate the sum of the first n odd numbers.
Input: n = 4
Output: 16
*/
public class OddNumSum{
    public static void main(String args[]){
        int num = 4, sum=0,counter=0,i=1;

        while(counter<4){
            if(i%2!=0){
                sum += i;
                counter++;
            }
            i++;
        }

        System.out.println(sum);
    }
}